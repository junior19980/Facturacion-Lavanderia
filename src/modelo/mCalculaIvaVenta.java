package modelo;
import controlador.*;
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
public class mCalculaIvaVenta extends ConexionBD {
    public ResultSet rs,r,s;
    public int iva=0;
    vResepcion Vista;
    public static String ivaVenta="",ivaCredito="",ivaDebito="",totaliva1="";
    public static int totales3 =0,totaliva=0;
    public String Nro_Factura = "",Nro="",id="",usua,nro;
     Double tot1=0.0;
//Factura Ventas Tabla Principal

    public boolean RegistrarVenta( String Codigo) {
        try {
            String q = "SELECT SUM(f.iva)'IVA' FROM FacturasServicios f WHERE f.mes='"+Codigo+"'";
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            rs = pstm.executeQuery();
            rs.next();
            if(rs.getString("iva")==null){
                ivaVenta=("0");
            }else{
                ivaVenta=rs.getString("iva");}
           String w = "SELECT SUM(f.iva)'IVA' FROM NotasCreditosServicios f WHERE f.mes='"+Codigo+"'";
            PreparedStatement ps = this.getConnection().prepareStatement(w);
            r = ps.executeQuery();
            r.next();
            if(r.getString("iva")==null){
                ivaCredito=("0");
            }else{
                ivaCredito=r.getString("iva");}
           String e = "SELECT SUM(f.iva)'IVA' FROM NotasDebitosServicios f WHERE f.mes='"+Codigo+"'";
            PreparedStatement pst = this.getConnection().prepareStatement(e);
            s = pst.executeQuery();
            s.next();
            if(s.getString("iva")==null){
                ivaDebito=("0");
            }else{
                ivaDebito=s.getString("iva");}
             totaliva=Integer.parseInt(ivaVenta)+Integer.parseInt(ivaDebito);
             totaliva1=String.valueOf(totaliva-Integer.parseInt(ivaCredito));
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
//Detalle tabla secundario//

     
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
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idFacturaServicio) + 1 as nro from FacturasServicios");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("nro") == null) {
                Nro_Factura = "1";
            } else {
                Nro_Factura = rs.getString("nro");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mCalculaIvaVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	
	 public void generar_caja() {
		 try {
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select nroFacturaInicio as n,idTimbrado as id from Timbrados");
            rs = pstm2.executeQuery();
            rs.next();
	   PreparedStatement pstm3 = this.getConnection().prepareStatement("select MAX(Factura) + 1 as nro from FacturasServicios");
            r = pstm3.executeQuery();
            r.next();
            if (r.getString("nro") == null) {
                Nro = rs.getString("n");
            } else {    
                Nro = r.getString("nro");
            }
        } catch (SQLException ex) {
            Logger.getLogger(mCalculaIvaVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//Combo 1 Cliente
    public DefaultComboBoxModel getListaTipoFacturas() {
     DefaultComboBoxModel model = new DefaultComboBoxModel();
	String usua=cFacturaVenta.usu;
     try {
     PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM FormatosPagos");
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
//Combo 1 Tipo Factura
    public DefaultComboBoxModel getListaTipoFactura() {
     DefaultComboBoxModel model = new DefaultComboBoxModel();
     try {
     PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM Meses");
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
//Combo 2 Formato Pago
  /*  public DefaultComboBoxModel getListaTipoFactura() {
     DefaultComboBoxModel model = new DefaultComboBoxModel();
     try {
     PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM formascobro");
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
        int total2  ;
         int precio2 = Integer.parseInt(Precio);
      int cantidad2 = Integer.parseInt(cantidad);
       total2 = precio2 * cantidad2;
      tot = String.valueOf(total2);
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
        tableModel.addRow(new Object[]{codigo, servicio,Precio,cantidad,tot});
     int totales2 = Integer.parseInt(tot);
     totales3 = totales3 + totales2;
     iva=totales3/11;
        return true;
    }

    //Reporte
    public void Reportes(String archivo, JTable tabla, String Nro, String Fecha, String Nombrefun , String Apellidofun,String Total, String kjhjkl , String lkhflkl,String kjdhrfkl,String saldkf) {
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
            parametros.put("idUsu", Fecha);
            parametros.put("nomUsu",Nombrefun );
            parametros.put("idCli", Apellidofun);
            parametros.put("nomCli", Total);
            parametros.put("rucCli",kjhjkl );
            parametros.put("tipFac", lkhflkl);
            parametros.put("forPago", kjdhrfkl);
            parametros.put("total", saldkf);
            //preparacion del reporte
            String dir = System.getProperty("user.dir") + "\\Reportes\\";
            JasperFillManager.fillReportToFile(dir + archivo+ ".jasper", parametros, jrtmd);
            //Se muestra la pantalla reporte generado
            JasperViewer ventana = new JasperViewer(dir + archivo
                    + ".jrprint", false, false);
            ventana.setTitle("Vista previa");
            ventana.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(mCalculaIvaVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}