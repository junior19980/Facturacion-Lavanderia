package modelo;
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
/**import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;
*/
public class mApertura extends ConexionBD{
     public ResultSet rs;
	 public String id="", nrotim="";
	   public ResultSet r;
     public static String Cod_Apertura = "",Nro="";
     public String Cod_Arqueo = "";
	 String punto="";
     public String nombreusuarios="";
     public String filtro ="";
    /** Constructor de clase */
    public mApertura (){}
    /** Obtiene registros de la tabla PRODUCTO y los devuelve en un DefaultTableModel*/
  
     /** Registra un nuevo aperturas_cajas */
          public boolean NuevaApertura(String codigo, String Fecha, String Hora, String MontoApertura, String idPuntoExpedicion, String idEstado, String Usu_cod)
    {
          if( valida_datos(codigo, MontoApertura) )
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
public void generar() {
        try {
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select nroFacturaInicio as n,idTimbrado as id,nroTimbrado from Timbrados");
            rs = pstm2.executeQuery();
            rs.next();
	   PreparedStatement pstm3 = this.getConnection().prepareStatement("select MAX(idFacturaServicio) + 1 as nro from FacturasServicios");
            r = pstm3.executeQuery();
            r.next();
            if (r.getString("nro") == null) {
                Nro = rs.getString("n");
            } else {
                Nro = r.getString("nro");		
            }
        } catch (SQLException ex) {
            Logger.getLogger(mFacturaVenta.class.getName()).log(Level.SEVERE, null, ex);
        }}
    /** Elimina un registro dado su ID -> Llave primaria */
       public void generar_codigoApertura() {
        try {
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idAperturaCaja)+1 as id from AperturasCajas");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("id") == null) {
                Cod_Apertura = "1";
            } else {
                Cod_Apertura = rs.getString("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mApertura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /** Metodo privado para validar datos */
    private boolean valida_datos(String codigo, String monto)
    {
        if( codigo.equals("  ") )
            return false;
        else if( monto.length() > 0 )
        {
            return true;
        }
        else return false;
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
                String dir = System.getProperty("user.dir") + "\\Reportes\\";
               JasperFillManager.fillReportToFile(dir + archivo+".jasper", parametros);
               //se muestra por pantalla el reporte generado
               JasperViewer ventana = new JasperViewer(dir + archivo + ".jrprint", false, false);
               ventana.setTitle("Vista previa");
                ventana.setVisible(true); 

            } catch (JRException ex) {
               Logger.getLogger(mApertura.class.getName()).log(Level.SEVERE, null, ex);       
           }
   }
}



