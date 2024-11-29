package controlador;
import modelo.*;
import vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//se importa modelo e interfaz

public class CUsuario implements ActionListener,MouseListener{

    /** instancia a nuestra interfaz de usuario*/
    VUsuario vista ;
    /** instancia a nuestro modelo */
    MUsuario modelo = new MUsuario();

    /** Se declaran en un ENUM las acciones que se realizan desde la
 * interfaz de usuario VISTA y posterior ejecución desde el controlador
 */
    public enum AccionMVC
    {
        VER , 
       GUARDAR ,        
       ELIMINAR ,       
       MODIFICAR,             
        NUEVO,
   IMPRIMIR   
    }

    /** Constrcutor de clase
 * @param vista Instancia de clase interfaz
 */
    public CUsuario( VUsuario vista )
    {
        this.vista = vista;
    }
  //EVENTOS DEL RATON SOBRE LOS COMPONENTES
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == 1) {
            int fila = this.vista.TablaConsulta.rowAtPoint(e.getPoint());
            if (fila > -1) {
                this.vista.CampoCodigo.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 0)));
                this.vista.CampoDescripcion.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 1)));
               this.vista.codciudad.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 2)));
                this.vista.CampoDescripcion1.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila,7)));
                this.vista.descriciudad4.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 6))); 
                this.vista.codciudad4.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila,5))); 
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) { }
    
    public void jBImagenFotoActionPerformed(java.awt.event.ActionEvent evt) {
   
    }

    /** Inicia el skin y las diferentes variables que se utilizan */
    public void iniciar()
    {
        this.vista.setLocationRelativeTo(null);
        vista.setVisible(true);
	this.vista.CampoDescripcion.setEnabled(false);
	this.vista.CampoCodigo.setEnabled(false);
		this.vista.CampoDescripcion1.setEnabled(false);
		this.vista.codciudad.setEnabled(false);
		this.vista.Guardar.setEnabled(false);
		this.vista.Modificar.setEnabled(false);
		this.vista.Eliminar.setEnabled(false);
		this.vista.Cancelar.setEnabled(false);
		this.vista.Informe.setEnabled(false);
		this.vista.jButton5.setEnabled(false);
		this.vista.codciudad.setEnabled(false);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.nuevo.setActionCommand( "NUEVO" );
        this.vista.nuevo.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Guardar.setActionCommand( "GUARDAR" );
        this.vista.Guardar.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Modificar.setActionCommand( "MODIFICAR" );
        this.vista.Modificar.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Eliminar.setActionCommand( "ELIMINAR" );
        this.vista.Eliminar.addActionListener(this);
    //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Informe.setActionCommand( "IMPRIMIR" );
        this.vista.Informe.addActionListener(this);
       //combo
        //añade e inicia el jtable con un DefaultTableModel vacio
        this.vista.TablaConsulta.addMouseListener(this);
        this.vista.TablaConsulta.setModel( new DefaultTableModel() );
          this.vista.TablaConsulta.setModel( this.modelo.getTablaBusqueda());
    }
    //Control de eventos de los controles que tienen definido un "ActionCommand"
    @Override
    public void actionPerformed(ActionEvent e) {
    switch ( AccionMVC.valueOf( e.getActionCommand() ) )
        {
            case GUARDAR:	
                //añade un nuevo registro
                if ( this.modelo.Nuevo(
                        this.vista.CampoDescripcion.getText() ,                    
			this.vista.codciudad.getText(),
                          this.vista.codciudad4.getText(),
			 this.vista.CampoDescripcion1.getText()
                        ) )
                {
                    this.vista.TablaConsulta.setModel( this.modelo.getTablaBusqueda());
                    JOptionPane.showMessageDialog(vista,"Exito: Nuevo registro agregado.");
                }
                else //ocurrio un error
                    JOptionPane.showMessageDialog(vista,"Error: Los datos son incorrectos.");
				limpia();
                break;	
            case ELIMINAR:
                 int ax = JOptionPane.showConfirmDialog(null, "ESTAS SEGURO DE ELIMINAR EL REGISTRO?");
                if(ax == JOptionPane.YES_OPTION)
                     if ( this.modelo.Eliminar( this.vista.CampoCodigo.getText() ) )
                {
                    this.vista.TablaConsulta.setModel( this.modelo.getTablaBusqueda());
                 
                    JOptionPane.showMessageDialog(vista,"Exito: Registro eliminado.");
                }
                else if(ax == JOptionPane.NO_OPTION)		
		limpia();
                   break;
            case MODIFICAR:
                if (this.modelo.Actualizar(
                        this.vista.CampoCodigo.getText(),
                        this.vista.CampoDescripcion.getText(),
                         this.vista.CampoDescripcion.getText(),
			this.vista.codciudad4.getText(),
                        this.vista.CampoDescripcion1.getText()
                        )){
                    this.vista.TablaConsulta.setModel(this.modelo.getTablaBusqueda());
      
                    JOptionPane.showMessageDialog(null, "Registro actualizado");
                }
				limpia();
                break; 
                case IMPRIMIR:
                    modelo.Reportes("InformeUsuario");
                 break;
        }
	
    }
	public void limpia(){
		this.vista.Eliminar.setEnabled(false);
           this.vista.Cancelar.setEnabled(false);
           this.vista.Modificar.setEnabled(false);
           this.vista.Guardar.setEnabled(false);
            this.vista.nuevo.setEnabled(true);
             this.vista.jButton5.setEnabled(false);
		this.vista.CampoCodigo.setText("");
		this.vista.CampoDescripcion.setText("");
		this.vista.codciudad.setText("");
		this.vista.CampoDescripcion1.setText("");
		this.vista.codciudad4.setText("");
		this.vista.descriciudad4.setText("");
	}
}

