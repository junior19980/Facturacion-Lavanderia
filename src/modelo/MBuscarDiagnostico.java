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

public class MBuscarDiagnostico extends ConexionBD {

    public ResultSet rs;
    public String CodDiagnostico = "";
    public String filtro = "";


    /**
     * Constructor de clase
     */
    public MBuscarDiagnostico() {
    }

    /**
     * Obtiene registros de la tabla PRODUCTO y los devuelve en un DefaultTableModel
     */
 
    public DefaultTableModel getTablaBusqueda() {
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        String[] columNames = {"Nro", "Fecha", "Decripcion","Fecha","CodItems","Items","Cantidad","Precio"};
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
        //para formar la matriz de datos
        try {
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as total FROM diagnostico WHERE Fecha LIKE '%" + filtro + "%'  ");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][6];
        try {
            //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
            PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM diagnostico  WHERE Fecha LIKE '%" + filtro + "%' ORDER BY idDiagnostico");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                data[i][0] = res.getString("idDiagnostico");
                data[i][1] = res.getString("Diagnostico");
                 data[i][2] = res.getString("Fecha");
                 data[i][3] = res.getString("precio");
                 data[i][4] = res.getString("Cantidad");
                 data[i][5] = res.getString("idItems");
                 
                 
                 
                 
                 
                 
                
               
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

  
}
