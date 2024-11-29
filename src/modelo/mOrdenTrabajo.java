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

public class mOrdenTrabajo extends ConexionBD {
    public ResultSet rs;
  //  vRecepcion Vista;
    public int totales3 = 0;
    public int iva = 0;
    public String Nro_Factura = "";
    
//Factura Ventas Tabla Principal

    public boolean RegistrarVenta( String Codigo,String nro_factura, String Funcionario, String idProveedor, String fecha  ) {
        try {
            String q =  " insert into ordenestrabajos(idOrdenTrabajo,idUsuario,idFuncionario, Fecha,idSolicitudServicio)"
                    + "values('" + Codigo + "', '" + nro_factura + "', '" + Funcionario + "', '" + idProveedor + "','" + fecha +"')";
            Integer.parseInt(Codigo);
            if(Integer.parseInt(Codigo)==1){
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

    public boolean RegistrarDetalleVenta(String Codigo, String idaccesorio, String dia) {
        try {
            String q2 =" insert into detallesordenestrabajos(idOrdenTrabajo,idServicio,Cantidad )"
                   + "values('" + Codigo + "','" + idaccesorio + "','" + dia + "')";
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
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idOrdenTrabajo) + 1 as nro from ordenestrabajos");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("nro") == null) {
                Nro_Factura = "1";
            } else {
                Nro_Factura = rs.getString("nro");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);
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
   /* public DefaultComboBoxModel getListaTipoFacturas() {
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
     }*/
//Carga datos//
    
         public boolean cargarDatos(String codigo, String servicio,String cantidad, JTable tabla) {
       
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

       // int precio2 = Integer.parseInt(Precio);
        int cantidad2 = Integer.parseInt(cantidad);
       // total2 = precio2 * cantidad2;
       // total = String.valueOf(total2);

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
        tableModel.addRow(new Object[]{codigo, servicio, cantidad});
        //int totales2 = Integer.parseInt(totales);
       // totales3 = total2 + totales2;
       // iva=totales3 / 11;
        return true;
    }

    //Reporte
    public void Reportes(String archivo, JTable tabla, String Nro, String USU, String Apellidofun,String CI,String Nombrefuncionario,String Apellidofuncionario) {
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
            parametros.put("Nombrefun",Nombrefuncionario );
            parametros.put("Apellidofun", Apellidofuncionario);
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
            Logger.getLogger(mOrdenTrabajo.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

}
