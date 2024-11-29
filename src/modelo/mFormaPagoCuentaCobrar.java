package modelo;
import vista.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;
public class mFormaPagoCuentaCobrar extends ConexionBD {
    public ResultSet rs,a;
    vResepcion Vista;
    public int totales3 = 0;
    public String Nro_Factura = "";
//Factura Ventas Tabla Principal

    public boolean RegistrarVenta( String Codigo,String Fecha, String idUsuarios, String idEquipo, String idCliente, String fdasf,String sldf,String kfd) {
        try {
	
			String q =  " insert into Cobros(idCobro,fecha,Descripcion, idAperturaCaja,idUsuario,monto,idCuentaCobrar)"
			+ "values('" + Nro_Factura + "', '" + Fecha + "', '" + idUsuarios + "', '" + idEquipo + "','" + idCliente +"', '" + sldf + "', '" + kfd + "')";
			PreparedStatement pstm = this.getConnection().prepareStatement(q);
			pstm.execute();
			pstm.close();
				String a=" UPDATE CuentasCobrar SET contador =contador+'"+1+"' WHERE idCuentaCobrar ='" + kfd + "'";
				PreparedStatement pstms = this.getConnection().prepareStatement(a);
				pstms.execute();
				pstms.close();
				return true;
				} catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
	//Detalle 
	 public boolean RegistrarDetalle(String idaccesorio,String Canti,String monto) {
        try {
            String q2 =" insert into DetallesCobros(idCobro,idFormatoPago,monto)"
                   + "values('" + idaccesorio + "','" + Canti + "','" + monto + "')";
            PreparedStatement pstm2 = this.getConnection().prepareStatement(q2);
            pstm2.execute();
            pstm2.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }  
//Detalle tabla secundario/
    public void generar_codigo() {
        try {
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idCobro) + 1 as nro from Cobros");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("nro") == null) {
                Nro_Factura = "1";
            } else {
                Nro_Factura = rs.getString("nro");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mFormaPagoCuentaCobrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//Combo 1 Cliente
  /*  public DefaultComboBoxModel getListaTipoFacturas() {
     DefaultComboBoxModel model = new DefaultComboBoxModel();
     try {
     PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM recepcionprenda");
     rs = pstm.executeQuery();
     while (rs.next()) {
     model.addElement(rs.getString(1) + " - " + rs.getString(2));
     }
     rs.close();
     } catch (SQLException e) {
     System.err.println(e.getMessage());
     }
     return model;
     }*/
//Carga datos//
    public boolean cargarDatos(String codigo, String servicio,String servicio1,String cantidad, JTable tabla) {
        //Para darle tamaÃ±o a las columnas de la tabla..
        String c = tabla.getColumnName(0);
        TableColumn tc = tabla.getColumn(c);
        tc.setPreferredWidth(50);
        String d = tabla.getColumnName(1);
        TableColumn td = tabla.getColumn(d);
        td.setPreferredWidth(300);
        //captura el formato de la tabla seteada
        javax.swing.table.DefaultTableModel tableModel = (javax.swing.table.DefaultTableModel) tabla.getModel();

       // String total = "";
     //   int total2 = 0;

    //  String total = "";
    //    int total2 = 0;
  //      int precio2 = Integer.parseInt(precio);
  // //     int cantidad2 = Integer.parseInt(cantidad);
      //  total2 = precio2 * cantidad2;
    //    total = String.valueOf(total2);
        int nro_fila = tableModel.getRowCount();
        if (nro_fila > 0) {
            for (int i = 0; i < nro_fila; i++) {
                String cod = (tableModel.getValueAt(i, 0).toString());
                if (cod.equals(codigo)) {
                    return false;
                }
            }
        }
        //agrega a las filas los valores de las variables al JTable
        tableModel.addRow(new Object[]{codigo, servicio,servicio1,cantidad});
  //      int totales2 = Integer.parseInt(totales);
   //     totales3 = total2 + totales2;
        return true;
    }
  public DefaultComboBoxModel getCaja(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
         try{
         PreparedStatement pstm2 = this.getConnection().prepareStatement("SELECT * FROM vcaja order by idAperturaCaja");
           try (ResultSet res2 = pstm2.executeQuery()) { 
                while(res2.next()){
                    model.addElement( res2.getString( "idAperturaCaja" ) + " - " + res2.getString( "Descripcion" )+ "  ");
                }  }
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return model;
    } 
  public DefaultComboBoxModel getForamaCobro(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
         try{
         PreparedStatement pstm3 = this.getConnection().prepareStatement("SELECT * FROM FormatosPagos order by idFormatoPago");
           try (ResultSet res3 = pstm3.executeQuery()) { 
                while(res3.next()){
                    model.addElement( res3.getString( "idFormatoPago" ) + " - " + res3.getString( "formaPago" )+ "  ");
                }  }
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return model;
    }
    //Reporte
    public void Reportes(String archivo, String Nro, String Fecha, String Nombrefun , String Apellidofun,String Total,String sdfa,String jasñldkf) {
        try {
            Map parametros = new HashMap();
            parametros.put("rs", rs);
            parametros.put("CODIGO", Nro);
            parametros.put("monto", Fecha);
            parametros.put("desc",Nombrefun );
            parametros.put("caja", Apellidofun);
            parametros.put("idFac", Total);
             parametros.put("desFac", sdfa);
            parametros.put("forCob", jasñldkf);
            //preparacion del reporte
            String dir = System.getProperty("user.dir") + "\\Reportes\\";
            JasperFillManager.fillReportToFile(dir + archivo
                    + ".jasper", parametros);
            //Se muestra la pantalla reporte generado
            JasperViewer ventana = new JasperViewer(dir + archivo
                    + ".jrprint", false, false);
            ventana.setTitle("Vista previa");
            ventana.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(mFormaPagoCuentaCobrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}