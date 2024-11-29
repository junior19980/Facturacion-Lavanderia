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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class mAjusteExistencia extends ConexionBD {
    public ResultSet rs;
    vResepcion Vista;
    public int totales3 = 0;
    public String Nro_Factura = "";
//Factura Ventas Tabla Principal

    public boolean RegistrarVenta( String Codigo,String Fecha, String cantidad, String idEquipo, String idCliente, String dlskfja, String dsiufño) {
        try {
            String  m="select cantidad from insumos WHERE idInsumo ='" + dsiufño + "'";
            PreparedStatement pstm3 = this.getConnection().prepareStatement(m);
             rs = pstm3.executeQuery();
             rs.next();
              if (Integer.parseInt(rs.getString("cantidad")) < Integer.parseInt(cantidad)) {
                  JOptionPane.showMessageDialog(null, "La cantidad de insumo insufiente en el stock");
            } else {
                String q =  " insert into AjustesExistencias(idAjusteExistencia,fecha,cantidad, idUsuario, idTipoAjuste,idMotivoAjuste,idInsumo)"
                    + "values('" + Nro_Factura + "', '" + Fecha + "', '" + cantidad + "', '" + idEquipo + "','" + idCliente +"', '" + dlskfja + "', '" + dsiufño + "')";
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            }
            
            
            int in=Integer.parseInt(dsiufño);
            String s="";
            if(in==2){
                s="  UPDATE Insumos SET Cantidad =(Cantidad-'"+cantidad+"') WHERE idInsumo ='" + dsiufño + "'";
                
            }else{
                s="  UPDATE Insumos SET Cantidad =(Cantidad+'"+cantidad+"') WHERE idInsumo ='" + dsiufño + "'";
            }
            PreparedStatement pstm1 = this.getConnection().prepareStatement(s);
            pstm1.execute();
            pstm1.close();
            return true;
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
//Detalle tabla secundario/
    public void generar_codigo() {
        try {
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idAjusteExistencia) + 1 as nro from AjustesExistencias");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("nro") == null) {
                Nro_Factura = "1";
            } else {
                Nro_Factura = rs.getString("nro");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mAjusteExistencia.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(mAjusteExistencia.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

}
