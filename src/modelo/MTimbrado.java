package modelo;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;
public class MTimbrado extends ConexionBD {
   public ResultSet rs;
    public String Cod_Cargo = "";
    public String filtro = "";
    /**
     * Constructor de clase
     */
    public MTimbrado() {
    }
    /**
     * Obtiene registros de la tabla PRODUCTO y los devuelve en un DefaultTableModel
     */
    public DefaultTableModel getTablaBusqueda() {
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        String[] columNames = {"Codigo", "Nro de Timbrado","Nro Factura Inicio","Fecha Inicio","Fecha Vencimiendo","Nro Factura Final","Punto Espedicion","Empresa","Tipo Documento",};
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as total FROM vtimbrado  WHERE idTimbrado LIKE '%" + filtro + "%' ");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][9];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM vtimbrado  WHERE idTimbrado LIKE '%" + filtro + "%' ORDER BY idTimbrado");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("idTimbrado");
                data[i][1] = res.getString("nroTimbrado");
                data[i][2] = res.getString("nroFacturaInicio");
                data[i][3] = res.getString("fechaInicio");
                 data[i][4] = res.getString("fechaVencimiento");
                data[i][5] = res.getString("nroFacturaFinal");
                  data[i][6] = res.getString( "idPuntoEspedicion" )+" - "+res.getString( "PuntoEspedicion" );
                  data[i][7] = res.getString( "idEmpresa" )+" - "+res.getString( "razonSocial" );
                  data[i][8] = res.getString( "idTipoDocumento" )+" - "+res.getString( "TipoDocumento" );
                i++;
            }
            res.close();
            //se añade la matriz de datos en el DefaultTableModel
            tablemodel.setDataVector(data, columNames);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }

    /**
     * Registra un nuevo categoria
     */
    public boolean Nuevo(String barrio,String m,String f,String g, String r,String s,String n,String d) {

            //Se arma la consulta
            String q = " INSERT INTO Timbrados ( idTimbrado , nroTimbrado ,nroFacturaInicio,fechaInicio,fechaVencimiento,nroFacturaFinal,idPuntoEspedicion,idEmpresa,idTipoDocumento) "
                    + "VALUES ( '" + Cod_Cargo + "','" + barrio+ "','" + m+ "','" + f+ "','" + g+ "','" + r+ "','" + s+ "','" + n+ "','" + d+ "' ) ";
            //se ejecuta la consulta
            try {
                PreparedStatement pstm = this.getConnection().prepareStatement(q);
                pstm.execute();
                pstm.close();
                return true;
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
            return false;
    }

    public boolean Actualizar(String id, String nombre,String m,String f,String g, String r,String s,String n,String d) {
        String q = "UPDATE  Timbrados SET nroTimbrado='" + nombre +  "',  nroFacturaInicio='" + m + "' ,  fechaInicio='" + f + "',  fechaVencimiento='" + g + "',  nroFacturaFinal='" + r + "',  idPuntoEspedicion='" + s + "',  idEmpresa='" + n + "',  idTipoDocumento='" + d + "' WHERE idTimbrado ='" + id + "' ";
        //se ejecuta la consulta111111
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    /**
     * Elimina un registro dado su ID -> Llave primaria
     */
    public boolean Eliminar(String id) {
        boolean res = false;
        //se arma la consulta
        String q = " DELETE FROM Timbrados WHERE idTimbrado='" + id + "' ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return res;
    }

    public void generar_codigo() {
        try {
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idTimbrado) + 1 as id from Timbrados");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("id") == null) {
                Cod_Cargo= "1";
            } else {
                Cod_Cargo= rs.getString("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MTimbrado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 public DefaultComboBoxModel getListaCaja(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
         try{
         PreparedStatement pstm5 = this.getConnection().prepareStatement("SELECT * FROM PuntosEspediciones  order by idPuntoEspedicion");
           try (ResultSet res5 = pstm5.executeQuery()) { 
                while(res5.next()){
                    model.addElement( res5.getString( "idPuntoEspedicion" ) + " - " + res5.getString( "PuntoEspedicion" ));
                }  }
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return model;
    }
  public DefaultComboBoxModel getListaCajas(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
         try{
         PreparedStatement pstm5 = this.getConnection().prepareStatement("SELECT * FROM Empresas order by idEmpresa");
           try (ResultSet res5 = pstm5.executeQuery()) { 
                while(res5.next()){
                    model.addElement( res5.getString( "idEmpresa" ) + " - " + res5.getString( "razonSocial" ));
                }  }
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return model;
    }
 public DefaultComboBoxModel getLista(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
         try{
         PreparedStatement pstm5 = this.getConnection().prepareStatement("SELECT * FROM TiposDocumentos  order by idTipoDocumento");
           try (ResultSet res5 = pstm5.executeQuery()) { 
                while(res5.next()){
                    model.addElement( res5.getString( "idTipoDocumento" ) + " - " + res5.getString( "TipoDocumento" ));
                }  }
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return model;
    }
    public void Reportes(String archivo) {
        try {
            PreparedStatement psta = this.getConnection().prepareStatement("select * FROM Equipos order by idEquipo");
            ResultSet rss = psta.executeQuery();
            //Pasamos parametros para el Jasper
            JRResultSetDataSource jRs = new JRResultSetDataSource(rss);
            Map parametros = new HashMap();

            parametros.put("rs", rss);

            //Preparaciòn del trabajo
            String dir = System.getProperty("user.dir") + "\\Reportes\\";
            JasperFillManager.fillReportToFile(dir + archivo + ".jasper", parametros, jRs);

            JasperViewer ventana = new JasperViewer(dir + archivo + ".jrprint", false, false);
            ventana.setTitle("Vista previa");
            ventana.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(MTimbrado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MTimbrado.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
