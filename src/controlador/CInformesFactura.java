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

public class CInformesFactura implements ActionListener{

    /** instancia a nuestra interfaz de usuario*/
    VInformesFactura vista ;
    /** instancia a nuestro modelo */
    MInformesFactura modelo = new MInformesFactura();

    /** Se declaran en un ENUM las acciones que se realizan desde la
 * interfaz de usuario VISTA y posterior ejecución desde el controlador
 */
    public enum AccionMVC
    {
     
     PEDIDO ,        
     FACTURAC,       
     ORDEN,     
     ORDEN1, 
     NC,
     ND   
    }

    /** Constrcutor de clase
 * @param vista Instancia de clase interfaz
 */
    public CInformesFactura( VInformesFactura vista )
    {
        this.vista = vista;
    }
  //EVENTOS DEL RATON SOBRE LOS COMPONENTES
    

   
 
    public void iniciar()
    {
        this.vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
        
        
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.PC.setActionCommand( "PEDIDO" );
        this.vista.PC.addActionListener(this);
         //declara una acción y añade un escucha al evento producido por el componente
      
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.FC.setActionCommand( "FACTURAC" );
        this.vista.FC.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
     //   this.vista.Fun.setActionCommand( "FUNCIONARIOS" );
     //   this.vista.Fun.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.OC.setActionCommand( "ORDEN" );
        this.vista.OC.addActionListener(this);
        this.vista.OC1.setActionCommand( "ORDEN1" );
        this.vista.OC1.addActionListener(this);
         
    //declara una acción y añade un escucha al evento producido por el componente
        
        this.vista.NC.setActionCommand( "NC" );
        this.vista.NC.addActionListener(this);
        this.vista.ND.setActionCommand( "ND" );
        this.vista.ND.addActionListener(this);
        //esto EL CAMPO BUSCAR AGREGA LOS EVENTOS DEL TECLADO (addKeyListener)
      
        
       
        
    }
   
    //Control de eventos de los controles que tienen definido un "ActionCommand"
    @Override
    public void actionPerformed(ActionEvent e) {

    switch ( AccionMVC.valueOf( e.getActionCommand() ) )
        {
         case PEDIDO:
    try {
        this.modelo.Reportespc("FacturaV");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesFactura.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break;
   case ORDEN:
    try {
        this.modelo.Reportesoc("AperturaCaja");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesFactura.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break;
       case ORDEN1:
    try {
        this.modelo.Reportesoc1("CierreCaja");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesFactura.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break;
       
           case FACTURAC:
    try {
        this.modelo.Reportesfc("NDV");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesFactura.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break;
                case NC:
    try {
        this.modelo.Reportesnc("NCV");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesFactura.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break;
                     case ND:
    try {
        this.modelo.Reportesnd("Recaudacion");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesFactura.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break;
              
}

}
    }