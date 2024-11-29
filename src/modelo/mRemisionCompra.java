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

public class mRemisionCompra extends ConexionBD {
    public ResultSet rs;
    vResepcion vista;
    public int totales3 = 0;
    public String Nro_Factura = "";
//Factura Ventas Tabla Principal

    public boolean RegistrarVenta( String Codigo,String Fecha, String idUsuarios, String idEquipo, String idCliente, String dlskfja, String dsiufño, String ospaiduf,String ñlsd) {
        try {
            String q =  " insert into remisionescompra(idNotaRemision,DireccionPartida,DireccionLlegada,Fecha, Motivo,Estado,idSucursal,idFacturaCompras,idProveedores)"
                    + "values('" + Nro_Factura + "', '" + Fecha + "', '" + idUsuarios + "', '" + idEquipo + "','" + idCliente +"', '" + dlskfja + "', '" + dsiufño + "','" + ospaiduf +"','" + ñlsd +"')";
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
//Detalle tabla secundario/
    public void generar_codigo() {
        try {
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idNotaRemision) + 1 as nro from remisionescompra");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("nro") == null) {
                Nro_Factura = "1";
            } else {
                Nro_Factura = rs.getString("nro");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mRemisionCompra.class.getName()).log(Level.SEVERE, null, ex);
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

    //Reporte
    public void Reportes(String archivo, String Nro, String Fecha, String Nombrefun , String Apellidofun,String Total,String fdsasd, String erdg, String asdfx, String fdfe , String rdfg,String fgdz,String fgsdf) {
        try {
               
            //pasmos parmetro al reporte Jasper

            //ResultSet rs = pstm.executeQuery();
            //pasamos parametro de resporte jasper
            //JRResultSetDataSource jRs = new JRResultSetDataSource(rs);
            Map parametros = new HashMap();
            parametros.put("rs", rs);
            parametros.put("cod", Nro);
            parametros.put("idUsu", Fecha);
            parametros.put("nomUsu", Nombrefun);
            parametros.put("idSucu",Apellidofun);
            parametros.put("nomSucu", Total);
            parametros.put("direPar", fdsasd);
            parametros.put("direLle", erdg);
            parametros.put("moti", asdfx);
            parametros.put("idFac", fdfe);
            parametros.put("desFac",rdfg );
            parametros.put("idProv", fgdz);
            parametros.put("nomProv", fgsdf);
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
            Logger.getLogger(mRemisionCompra.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

}
