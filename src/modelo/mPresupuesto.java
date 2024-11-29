package modelo;

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
public class mPresupuesto extends ConexionBD {
    public ResultSet rs,r;
//    public int iva=0;
  //  vResepcion Vista;
    public int totales3 =0;
    public String Nro_Factura = "",Nro="",id="",usua,nro;
     int tot1=0;
//Factura Ventas Tabla Principal

    public boolean RegistrarVenta(  String Codigo,String nro_factura, String idProveedor, String fecha,String Total) {
        try {
            String q =  " insert into presupuestosservicios(idPresupuestoServicio,idUsuario,Fecha,idSolicitudCliente, total)"
                    + "values('" + Codigo + "', '" + nro_factura + "', '" + idProveedor + "','" + fecha +"','" + Total +"')";
            Integer.parseInt(Codigo);
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

    public boolean RegistrarDetalleVenta(String Codigo, String idaccesorio, String dia,String asdfklj,String des ) {
        try {
            String q2 =" insert into detallespresupuestosclientes(idPresupuestoServicio,idServicio,Cantidad ,Precio, Descuento)"
                   + "values('" + Codigo + "','" + idaccesorio + "','" + dia + "','" + asdfklj + "','" + des + "' )";
            PreparedStatement pstm2 = this.getConnection().prepareStatement(q2);
            pstm2.execute();
            pstm2.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }  
	  /*public boolean RegistrarFormatoPago(String idaccesorio, String dia,String asdfklj) {
        try {
            String q2 =" insert into DetallesCobransas(idFacturaServicio,idFormatoPago,monto)"
                   + "values('" + idaccesorio + "','" + dia + "','" + asdfklj + "')";
            PreparedStatement pstm2 = this.getConnection().prepareStatement(q2);
            pstm2.execute();
            pstm2.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }  */
    public void generar_codigo() {
        try {
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idPresupuestoServicio) + 1 as nro from presupuestosservicios");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("nro") == null) {
                Nro_Factura = "1";
            } else {
                Nro_Factura = rs.getString("nro");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mPresupuesto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	
   
    public boolean cargarDatos(String codigo, String servicio,String Precio,String cantidad, String descuento,JTable tabla) {
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
         int desc;
        int total3;
         int precio2 = Integer.parseInt(Precio);
      int cantidad2 = Integer.parseInt(cantidad);
       int Descuento2 = Integer.parseInt(descuento);
       total2 = precio2 * cantidad2;
       desc= (total2 * Descuento2) / 100;
       total3= total2-desc;
      tot = String.valueOf(desc);
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
        tableModel.addRow(new Object[]{codigo, servicio,Precio,cantidad,descuento,tot,tot1});
     int totales2 = Integer.parseInt(tot1);
     totales3 = totales3 + totales2;
   //  iva=totales3/11;
        return true;
    }

    //Reporte
     public void Reportes(String archivo, JTable tabla, String Nro, String USU, String Apellidofun,String CI,String Total) {
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
              parametros.put("nomUsu", USU);
            parametros.put("CLIENTE", Apellidofun);
            parametros.put("CI", CI);
            parametros.put("total", Total);
            //preparacion del reporte
            String dir = System.getProperty("user.dir") + "\\Reportes\\";
            JasperFillManager.fillReportToFile(dir + archivo
                    + ".jasper", parametros, jrtmd);
            //Se muestra la pantalla reporte generado
            JasperViewer ventana = new JasperViewer(dir + archivo
                    + ".jrprint", false, false);
            ventana.setTitle("Vista previa");
            ventana.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(mPresupuesto.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}