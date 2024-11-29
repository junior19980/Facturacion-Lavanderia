package controlador;


import modelo.*;
import vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//se importa modelo e interfaz

public class CInformesRef implements ActionListener{

    /** instancia a nuestra interfaz de usuario*/
    VInformesRef vista ;
    /** instancia a nuestro modelo */
    MInformesRef modelo = new MInformesRef();

    /** Se declaran en un ENUM las acciones que se realizan desde la
 * interfaz de usuario VISTA y posterior ejecución desde el controlador
 */
    public enum AccionMVC
    {
     
     PROVEEDORES ,        
     CLIENTES,       
     FUNCIONARIOS,             
     VEHICULOS,
     SUCURSALES,
     INSUMOS   
    }

    /** Constrcutor de clase
 * @param vista Instancia de clase interfaz
 */
    public CInformesRef( VInformesRef vista )
    {
        this.vista = vista;
    }
  //EVENTOS DEL RATON SOBRE LOS COMPONENTES
    

   
 
    public void iniciar()
    {
        this.vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
        
        
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Prov.setActionCommand( "PROVEEDORES" );
        this.vista.Prov.addActionListener(this);
         //declara una acción y añade un escucha al evento producido por el componente
      
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Clie.setActionCommand( "CLIENTES" );
        this.vista.Clie.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Fun.setActionCommand( "FUNCIONARIOS" );
        this.vista.Fun.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
//        this.vista.vehiculos.setActionCommand( "VEHICULOS" );
    //    this.vista.vehiculos.addActionListener(this);
        
         
    //declara una acción y añade un escucha al evento producido por el componente
        this.vista.ins.setActionCommand( "INSUMOS" );
        this.vista.ins.addActionListener(this);
        this.vista.Suc.setActionCommand( "SUCURSALES" );
        this.vista.Suc.addActionListener(this);
        //esto EL CAMPO BUSCAR AGREGA LOS EVENTOS DEL TECLADO (addKeyListener)
      
        
       
        
    }
   
    //Control de eventos de los controles que tienen definido un "ActionCommand"
    @Override
    public void actionPerformed(ActionEvent e) {

    switch ( AccionMVC.valueOf( e.getActionCommand() ) )
        {
         case PROVEEDORES:
    try {
        this.modelo.ReportesProv("Proveedores");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesRef.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break;
   case CLIENTES:
    try {
        this.modelo.ReportesCli("Cliente");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesRef.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break;
       case FUNCIONARIOS:
    try {
        this.modelo.ReportesFun("Funcionarios");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesRef.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break;
           case VEHICULOS:
    try {
        this.modelo.ReportesVeh("Equipos");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesRef.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break;
               case INSUMOS:
    try {
        this.modelo.ReportesIns("Insumos");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesRef.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break;
                   case SUCURSALES:
    try {
        this.modelo.ReportesSuc("Sucursales");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesRef.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break;
}

}
    }