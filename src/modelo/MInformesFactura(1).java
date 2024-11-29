package modelo;

import modelo.ConexionBD;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;

public class MInformesFactura extends ConexionBD{
     public ResultSet rs;
     public String idBarrios = "";
      public String filtro = "";
    /** Constructor de clase */
    public MInformesFactura (){}

    // PARA LA BUSQUEDA EL FILTRO
 
     public void Reportespc(String archivo) throws SQLException {
        try {
            PreparedStatement psta = this.getConnection().prepareStatement("select * FROM facturasservicios");
            ResultSet rss = psta.executeQuery();
            //Pasamos parametros para el Jasper
            JRResultSetDataSource jRs = new JRResultSetDataSource(rss);
            Map parametros = new HashMap();
           
            parametros.put("rs", rss);
             
            //Preparaciòn del trabajo
            String dir = System.getProperty("user.dir") + "\\Reportes\\";
            JasperFillManager.fillReportToFile(dir + archivo+".Jasper", parametros, jRs);

            JasperViewer ventana = new JasperViewer(dir + archivo + ".jrprint", false, false);
            ventana.setTitle("Vista previa");
            ventana.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(MInformesFactura.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }

  
 public void Reportesoc(String archivo) throws SQLException {
        try {
            PreparedStatement psta = this.getConnection().prepareStatement("select * FROM aperturascajas");
            ResultSet rss = psta.executeQuery();
            //Pasamos parametros para el Jasper
            JRResultSetDataSource jRs = new JRResultSetDataSource(rss);
            Map parametros = new HashMap();
           
            parametros.put("rs", rss);
             
            //Preparaciòn del trabajo
            String dir = System.getProperty("user.dir") + "\\Reportes\\";
            JasperFillManager.fillReportToFile(dir + archivo+".Jasper", parametros, jRs);

            JasperViewer ventana = new JasperViewer(dir + archivo + ".jrprint", false, false);
            ventana.setTitle("Vista previa");
            ventana.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(MInformesFactura.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }
   public void Reportesoc1(String archivo) throws SQLException {
        try {
            PreparedStatement psta = this.getConnection().prepareStatement("select * FROM cierrescajas");
            ResultSet rss = psta.executeQuery();
            //Pasamos parametros para el Jasper
            JRResultSetDataSource jRs = new JRResultSetDataSource(rss);
            Map parametros = new HashMap();
           
            parametros.put("rs", rss);
             
            //Preparaciòn del trabajo
            String dir = System.getProperty("user.dir") + "\\Reportes\\";
            JasperFillManager.fillReportToFile(dir + archivo+".Jasper", parametros, jRs);

            JasperViewer ventana = new JasperViewer(dir + archivo + ".jrprint", false, false);
            ventana.setTitle("Vista previa");
            ventana.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(MInformesFactura.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }
     
  public void Reportesfc(String archivo) throws SQLException {
        try {
            PreparedStatement psta = this.getConnection().prepareStatement("select * FROM notasdebitosservicios");
            ResultSet rss = psta.executeQuery();
            //Pasamos parametros para el Jasper
            JRResultSetDataSource jRs = new JRResultSetDataSource(rss);
            Map parametros = new HashMap();
           
            parametros.put("rs", rss);
             
            //Preparaciòn del trabajo
            String dir = System.getProperty("user.dir") + "\\Reportes\\";
            JasperFillManager.fillReportToFile(dir + archivo+".Jasper", parametros, jRs);

            JasperViewer ventana = new JasperViewer(dir + archivo + ".jrprint", false, false);
            ventana.setTitle("Vista previa");
            ventana.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(MInformesFactura.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }
  public void Reportesnc(String archivo) throws SQLException {
        try {
            PreparedStatement psta = this.getConnection().prepareStatement("select * FROM NotasCreditosServicios");
            ResultSet rss = psta.executeQuery();
            //Pasamos parametros para el Jasper
            JRResultSetDataSource jRs = new JRResultSetDataSource(rss);
            Map parametros = new HashMap();
           
            parametros.put("rs", rss);
             
            //Preparaciòn del trabajo
            String dir = System.getProperty("user.dir") + "\\Reportes\\";
            JasperFillManager.fillReportToFile(dir + archivo+".Jasper", parametros, jRs);

            JasperViewer ventana = new JasperViewer(dir + archivo + ".jrprint", false, false);
            ventana.setTitle("Vista previa");
            ventana.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(MInformesFactura.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }
  public void Reportesnd(String archivo) throws SQLException {
        try {
            PreparedStatement psta = this.getConnection().prepareStatement("select * FROM recaudaciones");
            ResultSet rss = psta.executeQuery();
            //Pasamos parametros para el Jasper
            JRResultSetDataSource jRs = new JRResultSetDataSource(rss);
            Map parametros = new HashMap();
           
            parametros.put("rs", rss);
             
            //Preparaciòn del trabajo
            String dir = System.getProperty("user.dir") + "\\Reportes\\";
            JasperFillManager.fillReportToFile(dir + archivo+".Jasper", parametros, jRs);

            JasperViewer ventana = new JasperViewer(dir + archivo + ".jrprint", false, false);
            ventana.setTitle("Vista previa");
            ventana.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(MInformesFactura.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }
  }