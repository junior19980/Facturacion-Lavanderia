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

public class CInformesServicios implements ActionListener{

    /** instancia a nuestra interfaz de usuario*/
    VInformesServicios vista ;
    /** instancia a nuestro modelo */
    MInformesServicios modelo = new MInformesServicios();

    /** Se declaran en un ENUM las acciones que se realizan desde la
 * interfaz de usuario VISTA y posterior ejecución desde el controlador
 */
    public enum AccionMVC
    {
     
     REC ,        
     OT,       
     P,             
     IU,
     SR,
     DIA   
    }

    /** Constrcutor de clase
 * @param vista Instancia de clase interfaz
 */
    public CInformesServicios( VInformesServicios vista )
    {
        this.vista = vista;
    }
  //EVENTOS DEL RATON SOBRE LOS COMPONENTES
    

   
 
    public void iniciar()
    {
        this.vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
        
        
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.rec.setActionCommand( "REC" );
        this.vista.rec.addActionListener(this);
         //declara una acción y añade un escucha al evento producido por el componente
      
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.ot.setActionCommand( "OT" );
        this.vista.ot.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
     this.vista.iu1.setActionCommand( "DIA" );
        this.vista.iu1.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.sr.setActionCommand( "SR" );
        this.vista.sr.addActionListener(this);
        
         
    //declara una acción y añade un escucha al evento producido por el componente
        this.vista.iu.setActionCommand( "IU" );
        this.vista.iu.addActionListener(this);
     this.vista.pre.setActionCommand( "P" );
       this.vista.pre.addActionListener(this);
        //esto EL CAMPO BUSCAR AGREGA LOS EVENTOS DEL TECLADO (addKeyListener)
      
        
       
        
    }
   
    //Control de eventos de los controles que tienen definido un "ActionCommand"
    @Override
    public void actionPerformed(ActionEvent e) {

    switch ( AccionMVC.valueOf( e.getActionCommand() ) )
        {
        
       case REC:
    try {
        this.modelo.Reportesrec("SolicitudServicio");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesServicios.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break; 
       case OT:
    try {
        this.modelo.Reportesot("OrdendeTrabajo");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesServicios.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break; 
       case DIA:
    try {
        this.modelo.Reportesdia("Descuento");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesServicios.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break;  
       case SR:
    try {
        this.modelo.Reportessr("ServicioRealizado");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesServicios.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break;
       case IU:
    try {
        this.modelo.Reportesiu("InsumoUtilizado");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesServicios.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break;
           case P:
    try {
        this.modelo.Reportespre("Presupuestos");
    } catch (SQLException ex) {
        Logger.getLogger(CInformesServicios.class.getName()).log(Level.SEVERE, null, ex);
    }
                 break;
              
}

}
    }