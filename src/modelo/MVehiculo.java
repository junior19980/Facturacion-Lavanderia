package modelo;


import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;

public class MVehiculo extends ConexionBD {

    public ResultSet rs;
    public String Cod_Cargo = "";
    public String filtro = "";

    /**
     * Constructor de clase
     */
    public MVehiculo() {
    }

    /**
     * Obtiene registros de la tabla PRODUCTO y los devuelve en un DefaultTableModel
     */
 
    public DefaultTableModel getTablaBusqueda() {
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        String[] columNames = {"Codigo", "Descripcion","Id Categoria","Categoria","Id Marca","Marca","Id Tipo","Tipo ","Id Color","Color","Id Modelo","Modelo","Id Cliente","Cliente", "CI"};
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as total FROM vequipo  WHERE Descripcion LIKE '%" + filtro + "%' ");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][15];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM vequipo  WHERE Descripcion LIKE '%" + filtro + "%' ORDER BY idEquipo");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("idEquipo");
                data[i][1] = res.getString("Descripcion");
                data[i][2] = res.getString("idCategoria");
                data[i][3] = res.getString("Categoria");
                 data[i][4] = res.getString("idMarcaEquipo");
                data[i][5] = res.getString("MarcaEquipo");
                data[i][6] = res.getString("idTipoEquipo");
                data[i][7] = res.getString("TipoEquipo");
                 data[i][8] = res.getString("idTamañoEquipo");
                data[i][9] = res.getString("TamañoEquipo");
                data[i][10] = res.getString("idModeloEquipo");
                data[i][11] = res.getString("ModeloEquipo");
                data[i][12] = res.getString("idCliente");
                data[i][13] = res.getString("nombre_RS");
                data[i][14] = res.getString("CI_RUC");
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
    public boolean Nuevo(String barrio,String m,String f,String g, String r,String s,String n) {

            //Se arma la consulta
            String q = " INSERT INTO Equipos ( idEquipo , Descripcion ,idCategoria,idMarcaEquipo,idTipoEquipo,idTamañoEquipo,idModeloEquipo,idCliente) "
                    + "VALUES ( '" + Cod_Cargo + "','" + barrio+ "','" + m+ "','" + f+ "','" + g+ "','" + r+ "','" + s+ "','" + n+ "' ) ";
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

    public boolean Actualizar(String id, String nombre,String m,String f,String g, String r,String s,String n) {
        String q = "UPDATE  Equipos SET Descripcion='" + nombre +  "',  idCategoria='" + m + "' ,  idMarcaEquipo='" + f + "',  idTipoEquipo='" + g + "',  idTamañoEquipo='" + r + "',  idModeloEquipo='" + s + "',  idCliente='" + n + "' WHERE idCliente ='" + id + "' ";
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
        String q = " DELETE FROM Equipos WHERE idEquipo='" + id + "' ";
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
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idEquipo) + 1 as id from Equipos");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("id") == null) {
                Cod_Cargo= "1";
            } else {
                Cod_Cargo= rs.getString("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            Logger.getLogger(MVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MVehiculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
