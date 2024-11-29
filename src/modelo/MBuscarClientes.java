package modelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class MBuscarClientes extends ConexionBD {
public ResultSet rs;
public String registro;


        //    Obtiene registros de la tabla Lugar y los devuelve en un DefaultTableModel
     public DefaultTableModel getTablaClientesTodo() 
     {
      DefaultTableModel tablemodel = new DefaultTableModel();
      int registros = 0;
      String[] columNames = {"Codigo","Nombre Apellido","CI","Telefono","Direcion","Barrio"};
      //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
      //para formar la matriz de datos
      try{
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as total FROM cliente cli, barrios b"
                                                                         + "  where cli.idBarrios=b.idBarrios "
                                                                       
                                                                         + " order by cli.idCliente");
         ResultSet res = pstm.executeQuery();                                       
         res.next();
         registros = res.getInt("total");
         res.close();
      }catch(SQLException e){
         System.err.println( e.getMessage() );
      }
    //se crea una matriz con tantas filas y columnas que necesite
    Object[][] data = new String[registros][6];
      try{
          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
         PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM cliente cli, barrios b"
                                                                         +"  where cli.idBarrios=b.idBarrios "
                                                                         
                                                                         + " order by cli.idCliente");
         ResultSet res = pstm.executeQuery();
         int i=0;
         while(res.next()){
                 data[i][0] = res.getString( "cli.idCliente" );
                data[i][1] = res.getString( "cli.Nombre" )+" "+res.getString(  "cli.Apellido" );                                
                data[i][2] = res.getString( "cli.CIRuc" );
                data[i][3] = res.getString( "cli.Direccion" );
                data[i][4] = res.getString( "cli.Telefono" );
                data[i][5] = res.getString("cli.IdBarrios" )+" - "+res.getString(  "b.Descripcion" );
               
                

            i++;
         }
         res.close();
         //se añade la matriz de datos en el DefaultTableModel
         tablemodel.setDataVector(data, columNames );
         }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return tablemodel;
    }
           
   public  String nombre= "";

              public DefaultTableModel getTablaClientesNombre() {
                DefaultTableModel tablemodel = new DefaultTableModel();
                int registros = 0;
                String[] columNames = {"Codigo","Nombre Apellido","CI" ,"Direccion","Telefono","Direcion","Barrio"};
                //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
                //para formar la matriz de datos
                try {
                    PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as total FROM cliente cli, barrios b"
                                                                         +"  where cli.idBarrios=b.idBarrios "
                                                                         
                                                                         + " order by cli.idCliente");
                                                                                                             
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
                    PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM cliente cli, barrios b"
                                                                                                            + "  where CONCAT(cli.Nombre, ' ', cli.Apellido)like '%"+nombre+ "%' and cli.idBarrios=b.idBarrios "
                                                                                                           
                                                                                                            + " order by cli.idCliente");
                                                                                                                                                              
                    ResultSet res = pstm.executeQuery();                                                                                                             

                    int i = 0;
                    while (res.next()) {
                data[i][0] = res.getString( "cli.idCliente" );
                data[i][1] = res.getString( "cli.Nombre" )+" "+res.getString(  "cli.Apellido" );                                
                data[i][2] = res.getString( "cli.CIRuc" );
                data[i][3] = res.getString( "cli.Direccion" );
                data[i][4] = res.getString( "cli.Telefono" );
                data[i][5] = res.getString("cli.IdBarrios" )+" "+res.getString(  "b.Descripcion" );
         
                 
               
                                        i++;
                    }
                    int nro_fila = tablemodel.getRowCount();
                    res.close();
                    //se añade la matriz de datos en el DefaultTableModel
                    tablemodel.setDataVector(data, columNames);
                } catch (SQLException e) {
                    System.err.println(e.getMessage());
                   }
        return tablemodel;
    }


public  String CIRuc= "";

              public DefaultTableModel getTablaClientesCI() {
                DefaultTableModel tablemodel = new DefaultTableModel();
                int registros = 0;
                String[] columNames = {"Codigo","Nombre Apellido","CI" ,"Direccion","Telefono","Direcion","Barrio"};
                //obtenemos la cantidad de registros existentes en la tabla y se almacena en la variable "registros"
                //para formar la matriz de datos
                try {
                    PreparedStatement pstm = this.getConnection().prepareStatement("SELECT count(*) as total FROM cliente cli, barrios b"
                                                                                                            + "  where CIRuc like '%"+CIRuc+ "%' and cli.idBarrios=b.IdBarrios "
                                                                                                            
                                                                                                            + " order by cli.idCliente");
                                                                                                             
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
                    PreparedStatement pstm = this.getConnection().prepareStatement("SELECT * FROM cliente cli, barrios c"
                                                                                                            + "  where CI like '%"+CIRuc+ "%' and cli.idBarrios=b.IdBarrios "
                                                                                                           
                                                                                                            + " order by cli.idCliente");
                                                                                                                                                              
                    ResultSet res = pstm.executeQuery();                                                                                                             

                    int i = 0;
                    while (res.next()) {
                 data[i][0] = res.getString( "cli.idCliente" );
                data[i][1] = res.getString( "cli.Nombre" )+" "+res.getString(  "cli.Apellido" );                                
                data[i][2] = res.getString( "cli.CIRuc" );
                data[i][3] = res.getString( "cli.Direccion" );
                data[i][4] = res.getString( "cli.Telefono" );
                data[i][5] = res.getString("cli.IdBarrios" )+" - "+res.getString(  "b.Descripcion" );
                        i++;
                    }
                    int nro_fila = tablemodel.getRowCount();
                    res.close();
                    //se añade la matriz de datos en el DefaultTableModel
                    tablemodel.setDataVector(data, columNames);
                } catch (SQLException e) {
                    System.err.println(e.getMessage());
                   }
        return tablemodel;
    }
  

 
    
 }

