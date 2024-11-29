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
public class MInsumo extends ConexionBD {
    public ResultSet rs;
    public String Cod_Cargo = "";
    public String filtro = "";
    /**
     * Constructor de clase
     */
    public MInsumo() {
    }
    /**
     * Obtiene registros de la tabla PRODUCTO y los devuelve en un DefaultTableModel
     */

    public DefaultTableModel getTablaBusqueda() {
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        String[] columNames = {"Codigo", "Descripcion","Precio","Cantidad Stock","Codigo","Medida","Codigo","Categoria ","Codigo","Marca","Iva"};
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as total FROM vinsumo  WHERE Descripcion LIKE '%" + filtro + "%' ");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][10];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM vinsumo  WHERE Descripcion LIKE '%" + filtro + "%' ORDER BY idInsumo");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("idInsumo");
                data[i][1] = res.getString("Descripcion");
                data[i][2] = res.getString("Precio");
                data[i][3] = res.getString("Cantidad");
                 data[i][4] = res.getString("idMedidaInsumo");
		data[i][5] = res.getString("medida");
		data[i][6] = res.getString("idCategoriaInsumo");
		data[i][7] = res.getString("categoria");
		data[i][8] = res.getString("idmarcaInsumo");
		data[i][9] = res.getString("marca");
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
    public boolean Nuevo(String barrio,String m,String f,String g, String r,String s) {

            //Se arma la consulta
            String q = " INSERT INTO Insumos ( idInsumo , Descripcion ,Precio,Cantidad,idMedidaInsumo,idCategoriaInsumo,idmarcaInsumo) "
                    + "VALUES ( '" + Cod_Cargo + "','" + barrio+ "','" + m+ "','" + f+ "','" + g+ "','" + r+ "','" + s+ "' ) ";
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
    public boolean Actualizar(String id, String nombre,String m,String f,String g, String r,String s) {
        String q = "UPDATE  Insumos SET Descripcion='" + nombre +  "',  Precio='" + m + "' ,  Cantidad='" + f + "',  idMedidaInsumo='" + g + "',  idCategoriaInsumo='" + r + "',  idmarcaInsumo='" + s + "' WHERE idInsumo ='" + id + "' ";
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
        String q = " DELETE FROM Insumos WHERE idInsumo='" + id + "' ";
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
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idInsumo) + 1 as id from Insumos");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("id") == null) {
                Cod_Cargo= "1";
            } else {
                Cod_Cargo= rs.getString("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MInsumo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void Reportes(String archivo) {
        try {
            PreparedStatement psta = this.getConnection().prepareStatement("select * FROM Insumos order by idInsumo");
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
            Logger.getLogger(MInsumo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MInsumo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
