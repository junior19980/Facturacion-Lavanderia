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
public class MFuncionario extends ConexionBD {
    public ResultSet rs;
    public String Cod_Cargo = "";
    public String filtro = "";
    /**
     * Constructor de clase
     */
    public MFuncionario() {
    }

    /**
     * Obtiene registros de la tabla PRODUCTO y los devuelve en un DefaultTableModel
     */
    public DefaultTableModel getTablaBusqueda() {
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        String[] columNames = {"Codigo", "Nombre","Apellido","CI","Telefono","Direccion","Email","Salario","Id Cargo","Cargo","Id Barrio","Barrio","idUsuario","Usuario"};
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as total FROM vfuncionario  WHERE nomfuncionario LIKE '%" + filtro + "%' ");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][14];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM vfuncionario  WHERE nomFuncionario LIKE '%" + filtro + "%' ORDER BY idFuncionario");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("idFuncionario");
                data[i][1] = res.getString("nomFuncionario");
                data[i][2] = res.getString("apeFuncionario");
                data[i][3] = res.getString("CI");
                 data[i][4] = res.getString("telefono");
                data[i][5] = res.getString("direccion");
                data[i][6] = res.getString("email");
                data[i][7] = res.getString("salario");
                 data[i][8] = res.getString("idCargo");
                data[i][9] = res.getString("Cargo");
                data[i][10] = res.getString("idBarrio");
                data[i][11] = res.getString("Barrio");
                data[i][12] = res.getString("idUsuario");
                data[i][13] = res.getString("usuario");
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
   public boolean Nuevo(String barrio,String m,String f,String g,String r,String s,String n,String p,String w,String usuario) {

            //Se arma la consulta
            String q = " INSERT INTO Funcionarios ( idFuncionario , nomFuncionario ,apeFuncionario,CI,telefono,direccion,email,salario,idCargo,idBarrio,idUsuario) "
                    + "VALUES ( '" + Cod_Cargo + "','" + barrio+ "','" + m+ "','" + f+ "','" + g+ "','" + r+ "','" + s+ "','" + n+"','" + p+ "','" + w+ "' ,'" + usuario+ "' ) ";
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

    public boolean Actualizar(String id, String nombre,String m,String f,String g, String r,String s,String n,String p,String w,String usuario) {
        String q = "UPDATE  Funcionarios SET nomFuncionario='" + nombre +  "',  apeFuncionario='" + m + "' ,  CI='" + f + "',  telefono='" + g + "',  direccion='" + r + "',  email='" + s + "',  salario='" + n + "',  idCargo='" + p + "',  idUsuario='" + usuario + "' ,  idBarrio='" + w + "'WHERE idFuncionario ='" + id + "' ";
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
        String q = " DELETE FROM Funcionarios WHERE idFuncionario='" + id + "' ";
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
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idFuncionario) + 1 as id from Funcionarios");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("id") == null) {
                Cod_Cargo= "1";
            } else {
                Cod_Cargo= rs.getString("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void Reportes(String archivo) {
        try {
            PreparedStatement psta = this.getConnection().prepareStatement("select * FROM Funcionarios order by idFuncionario");
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
            Logger.getLogger(MFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
