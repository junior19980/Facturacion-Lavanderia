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

public class mPromociones extends ConexionBD {
    public ResultSet rs;
    vResepcion Vista;
    public int totales3 = 0;
    public String Nro_Factura = "";
//Factura Ventas Tabla Principal

    public boolean Registrar( String Codigo,String Fecha, String idUsuarios, String idEquipo, String idCliente) {
        try {
            String q =  " insert into Promociones(idPromocion,fechaInicio, fechaFinal,Descripcion,idUsuario)"
                    + "values('" + Nro_Factura + "', '" + Fecha + "', '" + idUsuarios + "', '" + idEquipo + "','" + idCliente +"')";
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
//Detalle tabla secundario//

    public boolean RegistrarDetalle(String idaccesorio,String Descri, String Precio, String Cantidad, String Promo, String PrecioPromo ) {
             try {
            String q2 =" insert into DetallesPromociones(idPromocion, idServicio, Descripcion, Precio, Porciento, Promo, PrecioPromo)"
                   + "values('" + Nro_Factura + "','" + idaccesorio + "', '" + Descri + "', '" + Precio + "', '" + Cantidad + "', '" + Promo + "', '" + PrecioPromo + "' )";
            
           String q3 =" UPDATE CatalogosServicios SET servicio='" + Descri +  "', Precio='" + PrecioPromo +  "' WHERE idServicio ='" + idaccesorio + "' ";
      
           PreparedStatement pstm2 = this.getConnection().prepareStatement(q2);
            pstm2.execute();
            pstm2.close();
            
            
           PreparedStatement pstm3 = this.getConnection().prepareStatement(q3);
           pstm3.execute();
           pstm3.close();
            
           return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }  
    public void generar_codigo() {
        try {
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idPromocion) + 1 as nro from Promociones");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("nro") == null) {
                Nro_Factura = "1";
            } else {
                Nro_Factura = rs.getString("nro");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mPromociones.class.getName()).log(Level.SEVERE, null, ex);
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
     public boolean cargarDatos(String codigo, String servicio,String Precio,String cantidad, JTable tabla) {
         //Para darle tamaÃ±o a las columnas de la tabla..
        String c = tabla.getColumnName(0);
        TableColumn tc = tabla.getColumn(c);
        tc.setPreferredWidth(50);
        String d = tabla.getColumnName(1);
        TableColumn td = tabla.getColumn(d);
        td.setPreferredWidth(300);
        //captura el formato de la tabla seteada
        javax.swing.table.DefaultTableModel tableModel = (javax.swing.table.DefaultTableModel) tabla.getModel();
        String tot="";
        String tot1="";
        int total2  ;
        int total3;
         int precio2 = Integer.parseInt(Precio);
      int cantidad2 = Integer.parseInt(cantidad);
       total2 = (precio2 * cantidad2) /100;
       total3= precio2-total2;
      tot = String.valueOf(total2);
      tot1= String.valueOf(total3);
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
        tableModel.addRow(new Object[]{codigo, servicio,Precio,cantidad, tot, tot1});
    int totales2 = Integer.parseInt(tot);
     int totales3 = Integer.parseInt(tot1);
 //    totales3 = totales3 + totales2;
//     iva=totales3/11;
        return true;
    }
       

    //Reporte
    public void Reportes(String archivo, JTable tabla, String Nro, String Fecha, String Nombrefun , String Apellidofun,String Total) {
        try {
            javax.swing.table.DefaultTableModel dtml
                    = (javax.swing.table.DefaultTableModel) tabla.getModel();
            JRTableModelDataSource jrtmd = new JRTableModelDataSource(dtml);
            //pasmos parmetro al reporte Jasper

            //ResultSet rs = pstm.executeQuery();
            //pasamos parametro de resporte jasper
            //JRResultSetDataSource jRs = new JRResultSetDataSource(rs);
            Map parametros = new HashMap();
            parametros.put("rs", rs);
            parametros.put("CODIGO", Nro);
            parametros.put("FECHA", Fecha);
            parametros.put("NOMBREFUN",Nombrefun );
            parametros.put("APELLIDOFUN", Apellidofun);
            parametros.put("Total", Total);
            //preparacion del reporte
            String dir = System.getProperty("user.dir") + "\\Reporte\\";
            JasperFillManager.fillReportToFile(dir + archivo
                    + ".jasper", parametros, jrtmd);
            //Se muestra la pantalla reporte generado
            JasperViewer ventana = new JasperViewer(dir + archivo
                    + ".jrprint", false, false);
            ventana.setTitle("Vista previa");
            ventana.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(mPromociones.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

}
