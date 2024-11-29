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

public class MClientes extends ConexionBD {

    public ResultSet rs;
    public String Cod_Cargo = "";
    public String filtro = "";

    /**
     * Constructor de clase
     */
    public MClientes() {
    }

    /**
     * Obtiene registros de la tabla PRODUCTO y los devuelve en un DefaultTableModel
     */
 
    public DefaultTableModel getTablaBusqueda() {
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        String[] columNames = {"Codigo", "Nombre-Razon Social","CI-RUC","Telefono","Direccion","Email"," Id Barrio","Barrio","Ciudad"};
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as total FROM vclientes  WHERE nombre_RS LIKE '%" + filtro + "%' ");
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
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM vclientes  WHERE nombre_RS LIKE '%" + filtro + "%' ORDER BY idCliente");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("idCliente");
                data[i][1] = res.getString("nombre_RS");
                data[i][2] = res.getString("CI_RUC");
                data[i][3] = res.getString("telefono");
                data[i][4] = res.getString("Direccion");
                data[i][5] = res.getString("Email");
                data[i][6] = res.getString("idBarrio");
                data[i][7] = res.getString("Descripcion");
                data[i][8] = res.getString("Ciudad");
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
    public boolean Nuevo(String barrio,String nu,String ho,String sp,String jg, String ciudad) {

            //Se arma la consulta
            String q = " INSERT INTO Clientes ( idCliente , nombre_RS,CI_RUC,telefono,Direccion,Email,idBarrio) "
                    + "VALUES ( '" + Cod_Cargo + "','" + barrio+ "','" + nu+ "','" + ho+ "','" + sp+ "','" + jg+ "','" + ciudad+ "'  ) ";
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

    public boolean Actualizar(String id, String nombre,String nu,String ho,String sp,String jg, String ciudad) {
        String q = "UPDATE Clientes SET nombre_RS='" + nombre +  "' ,  CI_RUC='" + nu + "',  telefono='" + ho + "',  Direccion='" + sp + "',  Email='" + jg + "',  idBarrio='" + ciudad + "'  WHERE idCliente ='" + id + "' ";
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
        String q = " DELETE FROM Clientes WHERE idCliente='" + id + "' ";
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
            PreparedStatement pstm2 = this.getConnection().prepareStatement("select MAX(idCliente) + 1 as id from Clientes");
            rs = pstm2.executeQuery();
            rs.next();
            if (rs.getString("id") == null) {
                Cod_Cargo= "1";
            } else {
                Cod_Cargo= rs.getString("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void Reportes(String archivo) {
        try {
            PreparedStatement psta = this.getConnection().prepareStatement("select * FROM Clientes order by idCliente");
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
            Logger.getLogger(MClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
