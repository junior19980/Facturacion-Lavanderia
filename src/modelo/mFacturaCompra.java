package modelo;
import controlador.cCuentaPagar;
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

public class mFacturaCompra extends ConexionBD {
    public ResultSet rs;
  //  vRecepcion Vista;
    public int totales3 = 0;
    public int iva = 0;
    public String Nro_Factura = "";
    
//Factura Ventas Tabla Principal

    public boolean RegistrarVenta( String Codigo,String nro_factura, String idTipoFactura, String idProveedor, String fecha, String idUsuario, String idOrdenCompra,String total, String iva, String mes, String FechaDocumento, String Timbrado  ) {
        try {
            String q =  " insert into facturascompras(idFacturaCompra,nro_factura,idTipoFactura, idProveedor,Fecha, idUsuario,idOrdenCompra,Total,IVA, Mes, FechaDocumento, Timbrado)"
                    + "values('" + Codigo + "', '" + nro_factura + "', '" + idTipoFactura + "', '" + idProveedor + "','" + fecha +"','" + idUsuario +"','" + idOrdenCompra +"','" + total +"','" + iva +"','" + mes +"','" + FechaDocumento +"','" + Timbrado +"')";

            Integer.parseInt(idOrdenCompra);
            if(Integer.parseInt(idOrdenCompra)==1){
            }
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

    public boolean RegistrarDetalleVenta(String Codigo, String idaccesorio, String idInsumo,String cantidad ) {
        try {
            String q2 =" insert into detallesfacturascompras(idFacturaCompra,idInsumo,Precio,Cantidad)"
                   + "values('" + Codigo + "','" + idaccesorio + "','" + idInsumo + "','" + cantidad + "' )";
            PreparedStatement pstm2 = this.getConnection().prepareStatement(q2);
            pstm2.execute();
            pstm2.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }  
    public void generar_codigo() {
        try {
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idFacturaCompra) + 1 as nro from facturascompras");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("nro") == null) {
                Nro_Factura = "1";
            } else {
                Nro_Factura = rs.getString("nro");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mFacturaCompra.class.getName()).log(Level.SEVERE, null, ex);
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
//Combo 1 Tipo Factura
    public DefaultComboBoxModel getListaTipoFacturas() {
     DefaultComboBoxModel model = new DefaultComboBoxModel();
     try {
     PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM tiposfacturas");
     rs = pstm.executeQuery();
     while (rs.next()) {
     model.addElement(rs.getString(1) + " - " + rs.getString(2));
     }
     rs.close();
     } catch (SQLException e) {
     System.err.println(e.getMessage());
     }
     return model;
     }
  /*  public void descontarstock(String codpro,String can)
    {
       int sum = Integer.parseInt(can); //cantidad vendida del item en esta factura
       String cap="";  //cantidad de productos existente en la bd
       int desfinal; //stock actual descontando lo q se vedio ahora
       try{
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM insumos WHERE  idInsumo='"+codpro+"'");
         ResultSet res = pstm.executeQuery();
         while(res.next()){
                  cap= rs.getString(1);  //cantidad de productos existente en la bd
         }
         res.close();
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        desfinal=Integer.parseInt(cap)+sum;
     
          String modi="UPDATE insumos SET Cantidad='"+desfinal+"' WHERE idInsumo = '"+codpro+"'";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(modi);
            pstm.execute();
            pstm.close();
           
        } catch (SQLException e) {
            
        }
   
    }*/
//Carga datos//
    
         public boolean cargarDatos(String codigo, String servicio,String Precio,String cantidad, JTable tabla, String totales) {
       
        //Para darle tamaÃ±o a las columnas de la tabla..
        String c = tabla.getColumnName(0);
        TableColumn tc = tabla.getColumn(c);
        tc.setPreferredWidth(50);
        String d = tabla.getColumnName(1);
        TableColumn td = tabla.getColumn(d);
        td.setPreferredWidth(300);
        //captura el formato de la tabla seteada
        javax.swing.table.DefaultTableModel tableModel = (javax.swing.table.DefaultTableModel) tabla.getModel();

        String total = "";
        int total2 = 0;

        int precio2 = Integer.parseInt(Precio);
        int cantidad2 = Integer.parseInt(cantidad);
        total2 = precio2 * cantidad2;
        total = String.valueOf(total2);

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
        tableModel.addRow(new Object[]{codigo, servicio, Precio, cantidad, total});
        int totales2 = Integer.parseInt(totales);
        totales3 = total2 + totales2;
        iva=totales3 / 11;
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
            parametros.put("IVA", Total);
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
            Logger.getLogger(mFacturaCompra.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

}
