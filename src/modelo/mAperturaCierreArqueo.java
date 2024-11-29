package modelo;
import controlador.cAperturaCierreArqueo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;
import vista.vAperturaCierreArqueo;
/**import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;
*/
public class mAperturaCierreArqueo extends ConexionBD{
     public ResultSet rs,as,adf,sd,dfs,ase,fdx,ss;
	   public ResultSet r;
	   vAperturaCierreArqueo vss;
	   public static String montoefe,montocheque,montotargetacre,montotargetadebi,Nro="",id,nro,ap="";
	   cAperturaCierreArqueo asdf;
     public static String Cod_Apertura = "",Cod="",resu;
     public String Cod_Arqueo = "",total="",to="",tot="",tut="",gol="",total1="0.0",total2="0.0";
	 String punto="";
     public String nombreusuarios="";
     public String filtro ="";
    /** Constructor de clase */
    public mAperturaCierreArqueo (){}
	vAperturaCierreArqueo viss;
    /** Obtiene registros de la tabla PRODUCTO y los devuelve en un DefaultTableModel*/
    public DefaultTableModel getTabla()
    {
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0;
      String[] columNames = {"Codigo","Hora Apertura","Fecha Apertura","Monto Apertura","Nro Factura Inicial","Punto Espedicion","Usuario","Estado"};
                                                                                                
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConnection().prepareStatement( "SELECT count(*) as total FROM AperturasCajas where idEstado=1");
        ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
        
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }
    //se crea una matriz con tantas filas y columnas que necesite
    Object[][] data = new String[registros][8];
      try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM vapertura ORDER BY idAperturaCaja");
           ResultSet res = pstm.executeQuery();
              int i=0;
              while(res.next()){
                  data[i][0] = res.getString( "idAperturaCaja" ) ;
                  data[i][1] = res.getString( "horaApertura" );
                  data[i][2] = res.getString( "fechaApertura" );
                  data[i][3] = res.getString( "montoInicial"  );
                  data[i][4] = res.getString( "nroFacturaInicial"  );
                  data[i][5] = res.getString( "idPuntoEspedicion" )+" - "+res.getString( "PuntoEspedicion" );
                  data[i][6] = res.getString( "idUsuario" )+" - "+res.getString( "nombre" );
                 i++;
              }
         //se añade la matriz de datos en el DefaultTableModel
         tablemodel.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return tablemodel;
    }
 public DefaultTableModel getBuscaTabla()    {
      DefaultTableModel table = new DefaultTableModel();
      int registros = 0;
      String[] columNames = {"Codigo","Hora Apertura","Fecha Apertura","Monto Cierre","Hora Cierre","Fecha Cierre","Punto Espedicion"};
                                                                                                
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConnection().prepareStatement( "SELECT count(*) as total FROM vcierre");
        ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
        
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }
    //se crea una matriz con tantas filas y columnas que necesite
    Object[][] data = new String[registros][7];
      try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm1 = this.getConnection().prepareStatement("SELECT * FROM vcierre ORDER BY idAperturaCaja");
           ResultSet res1 = pstm1.executeQuery();
              int i=0;
              while(res1.next()){
                  data[i][0] = res1.getString( "idAperturaCaja" ) ;
                  data[i][1] = res1.getString( "horaApertura" );
                  data[i][2] = res1.getString( "FechaApertura" );
                  data[i][3] = res1.getString( "montoCierre"  );
                  data[i][4] = res1.getString( "hora" );
                  data[i][5] = res1.getString( "fecha" );
                  data[i][6] = res1.getString( "idPuntoEspedicion" );
                  i++;
              }
         //se añade la matriz de datos en el DefaultTableModel
         table.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return table;
    }
 public DefaultTableModel getBuscaTablaArqueo()    {
      DefaultTableModel table = new DefaultTableModel();
      int registros = 0;
      String[] columNames = {"Codigo","Fecha Arqueo","Hora Arqueo","Monto Efectivo","Monto Cheque Dia","Monto T. Credito","Monto T, Debito","Monto Cheque Diferido"};
                                                                                                
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConnection().prepareStatement( "SELECT count(*) as total FROM ArqueosCajas where idEstado=1 ");
        ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("total");
         res.close();
        
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }
    //se crea una matriz con tantas filas y columnas que necesite
    Object[][] data = new String[registros][8];
      try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm1 = this.getConnection().prepareStatement("SELECT * FROM ArqueosCajas where idEstado=1 ORDER BY idArqueoCaja");
           ResultSet res1 = pstm1.executeQuery();
              int i=0;
              while(res1.next()){
                  data[i][0] = res1.getString( "idArqueoCaja" ) ;
                  data[i][1] = res1.getString( "fecha" );
                  data[i][2] = res1.getString( "hora" );
                  data[i][3] = res1.getString( "montoEfectivo"  );
                  data[i][4] = res1.getString( "montoChequeDia" );
                  data[i][5] = res1.getString( "montoTargetaCredito" );
                  data[i][6] = res1.getString( "montoTargetaDebito" );
                  data[i][7] = res1.getString( "montoChequeDiferido" );
                  i++;
              }
         //se añade la matriz de datos en el DefaultTableModel
         table.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return table;
    }
    /** Registra un nuevo aperturas_cajas */
          public boolean NuevaApertura(String codigo, String Fecha, String Hora, String MontoApertura, String idPuntoExpedicion, String idEstado, String Usu_cod){
   
        if( valida_datos(codigo) )
        {
            String q=" INSERT INTO AperturasCajas (idAperturaCaja,idUsuario, horaApertura, fechaApertura,montoInicial,nroFacturaInicial,idPuntoEspedicion) "
                      + "VALUES ( '" + codigo + "','"  +Fecha + "','" + Hora + "','" + MontoApertura + "','" + idPuntoExpedicion + "','" + idEstado + "','" + Usu_cod + "') ";
                         String s="  UPDATE PuntosEspediciones SET idEstado ='"+3+"' WHERE idPuntoEspedicion ='" + Usu_cod + "'";
            //se ejecuta la consulta
               try {
                            PreparedStatement pstm = this.getConnection().prepareStatement(q);
                            pstm.execute();
                            pstm.close();
                            PreparedStatement pstm1 = this.getConnection().prepareStatement(s);
                            pstm1.execute();
                            pstm1.close();
                    return true;
                }catch(SQLException e){
                    System.err.println( e.getMessage() );
                }
                return false;
            }
        else
         return false;
    }
             public boolean NuevoCierre(String idAperturasCaja, String Fecha,String hora,String MontoApertura,String usuario)
    {
        if( valida_datos(idAperturasCaja) )
        {
           //Se arma la consulta
            String q=" INSERT INTO CierresCajas (idAperturaCaja,fecha, hora,montoCierre,idUsuario) "
                      + "VALUES ( '" + idAperturasCaja + "','"  +Fecha + "','" + hora + "','" + MontoApertura + "','" + usuario + "') ";
			String s="  UPDATE AperturasCajas SET idEstado ='"+4+"' WHERE idAperturaCaja ='" + idAperturasCaja + "'";
              //se ejecuta la consulta
                 try {
                        PreparedStatement pstm = this.getConnection().prepareStatement(q);
                        pstm.execute();
                       pstm.close();
			PreparedStatement pstm1 = this.getConnection().prepareStatement(s);
                            pstm1.execute();
                            pstm1.close();
                return true;
            }catch(SQLException e){
                System.err.println( e.getMessage() );
            }
            return false;
        }
        else
         return false;
    }
       public void generar() {
        try {
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select nroFacturaInicio as n,idTimbrado as id,nroTimbrado from Timbrados");
            rs = pstm2.executeQuery();
            rs.next();
	   PreparedStatement pstm3 = this.getConnection().prepareStatement("select MAX(idFacturaServicio) + 1 as nro from FacturasServicios");
            r = pstm3.executeQuery();
            r.next();
            if (r.getString("nro") == null) {
                ap = rs.getString("n");
            } else {
                ap = r.getString("nro");		
            }
        } catch (SQLException ex) {
            Logger.getLogger(mFacturaVenta.class.getName()).log(Level.SEVERE, null, ex);
        }}   
          public boolean Recaudacion(String codigo, String Fecha, String monto, String idUsuario, String idArqueo){
   
        if( valida_datos(codigo) )
        {
            
            String q=" INSERT INTO Recaudaciones (idRecaudacion,fecha,monto, idUsuario,idArqueoCaja) "
                      + "VALUES ( '" + codigo + "','"  +Fecha + "','" + monto + "','" + idUsuario + "','" + idArqueo + "') ";
                         String s="  UPDATE ArqueosCajas SET idEstado ='"+4+"' WHERE idArqueoCaja ='" + idArqueo + "'";
            //se ejecuta la consulta
               try {
                            PreparedStatement pstm = this.getConnection().prepareStatement(q);
                            pstm.execute();
                            pstm.close();
                            PreparedStatement pstm1 = this.getConnection().prepareStatement(s);
                            pstm1.execute();
                            pstm1.close();
                    return true;
                }catch(SQLException e){
                    System.err.println( e.getMessage() );
                }
                return false;
            }
        else
         return false;
    }
          public boolean GuardarArqueo(String idArqueoCaja, String monto, String Fecha,String idAperturas_Cajas,String idArquefoCaja, String monsdto, String Fechdfa,String idApfeerturas_Cajas,String idApertueras_Cajas,String idPunto,String difer)
    {
           //Se arma la consulta
            String q=" INSERT INTO ArqueosCajas (idArqueoCaja, idAperturaCaja, fecha,hora,montoEfectivo,montoChequeDia,montoTargetaCredito,montoTargetaDebito,idUsuario,montoChequeDiferido) "
                      + "VALUES ( '" + idArqueoCaja + "','" + monto + "','" +Fecha + "','" + idAperturas_Cajas + "','" + idArquefoCaja + "','" + monsdto + "','" + Fechdfa + "','" + idApfeerturas_Cajas + "','" + idApertueras_Cajas + "','" + difer + "') ";
           String s="  UPDATE AperturasCajas SET idEstado ='"+5+"' WHERE idAperturaCaja ='" + monto + "'";
		   String o="UPDATE CierresCajas SET idEstado ='"+5+"' WHERE idAperturaCaja ='" + monto + "'";
		    String t="UPDATE PuntosEspediciones SET idEstado ='"+1+"' WHERE idPuntoEspedicion ='" + idPunto + "'" ;
                 try {
                        PreparedStatement pstm = this.getConnection().prepareStatement(q);
                        pstm.execute();
                        pstm.close();
                          PreparedStatement pstm1 = this.getConnection().prepareStatement(s);
                        pstm1.execute();
                        pstm1.close();
			PreparedStatement pstm2 = this.getConnection().prepareStatement(o);
                        pstm2.execute();
                        pstm2.close();
			PreparedStatement pstm3 = this.getConnection().prepareStatement(t);
                    pstm3.execute();
                        pstm3.close();
                return true;
            }catch(SQLException e){
                System.err.println( e.getMessage() );
            }
            return false;   
    }
	
	 public void generar_timbrado() {
        try {
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select nroFacturaInicio as n,idTimbrado as id,nroTimbrado from Timbrados");
            rs = pstm2.executeQuery();
            rs.next();
	   PreparedStatement pstm3 = this.getConnection().prepareStatement("select MAX(numeroFactura) + 1 as nro from FacturasServicios");
            r = pstm3.executeQuery();
            r.next();
            if (r.getString("nro") == null) {
                Nro = rs.getString("n");
		id=rs.getString("id");
		nro=rs.getString("nroTimbrado");
            } else {
                Nro = r.getString("nro");		
		id=rs.getString("id");
		nro=rs.getString("nroTimbrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mFacturaVenta1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /** Elimina un registro dado su ID -> Llave primaria */
    public boolean EliminarApertura( String codigo ){
         boolean res=false;
        //se arma la consulta
        String q = " DELETE FROM aperturas_cajas WHERE idAperturas_Cajas='" + codigo + "' " ;
        //se ejecuta la consulta
         try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return res;
    }
    public void generar_codigoApertura() {
        try {
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idAperturaCaja) + 1 as id from AperturasCajas");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("id") == null) {
                Cod_Apertura = "1";
            } else {
                Cod_Apertura = rs.getString("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mAperturaCierreArqueo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void generar_codigoRecaudacion() {
        try {
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idRecaudacion) + 1 as id from Recaudaciones");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("id") == null) {
                Cod = "1";
            } else {
              Cod= rs.getString("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mAperturaCierreArqueo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generar_codigoArqueo() {
        try {
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idArqueoCaja) + 1 as id from ArqueosCajas");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("id") == null) {
                Cod_Arqueo = "1";
            } else {
                Cod_Arqueo = rs.getString("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mAperturaCierreArqueo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	 public void calcula() {
		String c=asdf.idAperturaCaja;
        try {
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select sum(d.monto)as id from Cobros c,DetallesCobros d where c.idCobro=d.idCobro and d.idFormatoPago=1 and c.idAperturaCaja='"+c+"'");
            PreparedStatement pstm3 = this.getConnection().prepareStatement("select sum(d.monto)as a from Cobros c,DetallesCobros d where c.idCobro=d.idCobro and d.idFormatoPago=2 and c.idAperturaCaja='"+c+"'");
            PreparedStatement pstm4 = this.getConnection().prepareStatement("select sum(d.monto)as b from Cobros c,DetallesCobros d where c.idCobro=d.idCobro and d.idFormatoPago=3 and c.idAperturaCaja='"+c+"'");
            PreparedStatement pstm5 = this.getConnection().prepareStatement("select sum(d.monto)as c from Cobros c,DetallesCobros d where c.idCobro=d.idCobro and d.idFormatoPago=4 and c.idAperturaCaja='"+c+"'");
           PreparedStatement pstm6 = this.getConnection().prepareStatement("select sum(d.monto)as cc from Cobros c,DetallesCobros d where c.idCobro=d.idCobro and d.idFormatoPago=5 and c.idAperturaCaja='"+c+"'");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("id") == null) {
                total = "0";
            } else {
                total = rs.getString("id");
            }
            as = pstm3.executeQuery();
            as.next();
            if (as.getString("a") == null) {
                to = "0";
            } else {
                to = as.getString("a");
            }
            adf = pstm4.executeQuery();
            adf.next();
            if (adf.getString("b") == null) {
                tot = "0";
            } else {
                tot = adf.getString("b");
            }
            sd = pstm5.executeQuery();
            sd.next();
            if (sd.getString("c") == null) {
                tut = "0";
            } else {
                tut = sd.getString("c");
            }
             ss = pstm6.executeQuery();
            ss.next();
            if (ss.getString("cc") == null) {
                gol = "0";
            } else {
                gol = ss.getString("cc");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mAperturaCierreArqueo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	public boolean total(String idAperturaCaja) {
		System.out.println(idAperturaCaja);
        try {
           // JOptionPane.showMessageDialog(null,(idAperturaCaja));
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select SUM(monto) as id from montocobro, Cobros where Cobros.idAperturaCaja='"+idAperturaCaja+"'");
            rs = pstm2.executeQuery();
            rs.next();
            resu = rs.getString("id");
            
                          // JOptionPane.showMessageDialog(null,rs.getString("id"));
                    } catch (SQLException ex) {
            Logger.getLogger(mAperturaCierreArqueo.class.getName()).log(Level.SEVERE, null, ex);
            return true;
        }
         return false;
    }
	
    /** Metodo privado para validar datos */
    private boolean valida_datos(String codigo)
    {
        if( codigo.equals("  ") )
            return false;
        else
        {
            return true;
        }
    }
    
 
  public DefaultComboBoxModel getListaCaja(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
         try{
         PreparedStatement pstm5 = this.getConnection().prepareStatement("SELECT * FROM PuntosEspediciones WHERE idEstado='"+1+"' order by idPuntoEspedicion");
           try (ResultSet res5 = pstm5.executeQuery()) { 
                while(res5.next()){
                    model.addElement( res5.getString( "idPuntoEspedicion" ) + " - " + res5.getString( "PuntoEspedicion" ));
                }  }
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return model;
    }
 public DefaultComboBoxModel getListaCajaCierre()
    {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
         try{
         PreparedStatement pstm6 = this.getConnection().prepareStatement("SELECT * FROM PuntosEspediciones WHERE idEstado='"+3+"' order by idPuntoEspedicion");
            try (ResultSet res6 = pstm6.executeQuery()) {
                while(res6.next()){
                    model.addElement( res6.getString( "idPuntoEspedicion" ) + " - " + res6.getString( "PuntoEspedicion" ));
                }  }
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return model;
    }
 
 
   public void Reportes(String archivo, String codigo,  String fecha, String hora, String monto) {
     try {
          
              Map parametros = new HashMap();
                parametros.put("rs", rs);
                parametros.put("CodigoApertura", codigo);
             parametros.put("FechaApertura", fecha);
                parametros.put("HoraApertura", hora);
                parametros.put("MontoApertura", monto);
                
                //Preparaciòn del reporte
                String dir = System.getProperty("user.dir") + "\\Reporte\\";
               JasperFillManager.fillReportToFile(dir + archivo+".jasper", parametros);
               //se muestra por pantalla el reporte generado
               JasperViewer ventana = new JasperViewer(dir + archivo + ".jrprint", false, false);
               ventana.setTitle("Vista previa");
                ventana.setVisible(true); 

            } catch (JRException ex) {
               Logger.getLogger(mAperturaCierreArqueo.class.getName()).log(Level.SEVERE, null, ex);       
           }
   }
}



