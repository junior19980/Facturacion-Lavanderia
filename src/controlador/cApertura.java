 package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.*;
import modelo.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class cApertura implements ActionListener,MouseListener,KeyListener{

    /** instancia a nuestra interfaz de usuario*/
    vApertura vista ;
    /** instancia a nuestro modelo */
    mApertura modelo = new mApertura();
	Macceso Modelo= new Macceso();

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
  //      modelo.filtro = this.vista.CampoCodigoApertura1.getText();
   //     this.vista.Tabla_Consulta.setModel(modelo.getTabla());
    }
    

    /** Se declaran en un ENUM las acciones que se realizan desde la
 * interfaz de usuario VISTA y posterior ejecución desde el controlador
 */
    public enum AccionMVC
    {
         AbrirCaja, 
         Cancelar,         
         CerrarCaja,         
         GenerarArqueo,          
         Anular,           
         Imprimir   
    }

    /** Constrcutor de clase
 * @param vista Instancia de clase interfaz
 */
    public cApertura( vApertura vista )
    {
        this.vista = vista;
    }
  //EVENTOS DEL RATON SOBRE LOS COMPONENTES
    @Override
    public void mouseClicked(MouseEvent e) {
        /*if (e.getButton() == 1) {
            int fila = this.vista.Tabla_Consulta.rowAtPoint(e.getPoint());
            if (fila > -1) {
                this.vista.CampoCodigoApertura1.setText(String.valueOf(this.vista.Tabla_Consulta.getValueAt(fila, 0)));
            }*/
        }
       /*   if (e.getButton() == 1) {
            int fila = this.vista.Tabla_Consulta1.rowAtPoint(e.getPoint());
            if (fila > -1) {
                this.vista.CampoCodigoApertura2.setText(String.valueOf(this.vista.Tabla_Consulta1.getValueAt(fila, 0)));
                this.vista.CampoCodigoApertura3.setText(String.valueOf(this.vista.Tabla_Consulta1.getValueAt(fila, 6)));
            }
        }*/
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
    public void iniciar(){
		this.modelo.generar();
		this.vista.CampoMontoApertura1.setText(this.modelo.Nro);
         this.modelo.generar_codigoApertura();
         this.vista.CampoCodigoApertura.setText(this.modelo.Cod_Apertura);
        this.vista.CampoCodigoUsuario.setText(Modelo.nivel);
        this.vista.CampoNombreUsuario.setText(Modelo.nombre);
        this.vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        // this.modelo.nombreusuario=this.vista.CampoUsuarioApertura.getText();
        cancelar();
        this.vista.Abrir.setEnabled(true);
        this.vista.Cancelar.setActionCommand( "Cancelar" );
        this.vista.Cancelar.addActionListener(this);
        //this.vista.VER.setActionCommand( "VER" );
        //this.vista.VER.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Abrir.setActionCommand( "AbrirCaja" );
        this.vista.Abrir.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
       // this.vista.Cerrar.setActionCommand( "CerrarCaja" );
    //    this.vista.Cerrar.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        //this.vista.Generar.setActionCommand( "GenerarArqueo" );
        //this.vista.Generar.addActionListener(this);
       //combo
        this.vista.ComboCaja.setModel(this.modelo.getListaCaja());
        //añade e inicia el jtable con un DefaultTableModel vacio
        //this.vista.Tabla_Consulta.addMouseListener(this);
        //this.vista.Tabla_Consulta.setModel( new DefaultTableModel() );
        //this.vista.Tabla_Consulta.setModel( this.modelo.getTabla() );   
        //this.vista.Tabla_Consulta1.addMouseListener(this);
        //this.vista.Tabla_Consulta1.setModel( new DefaultTableModel() );
        //this.vista.Tabla_Consulta1.setModel( this.modelo.getBuscaTabla() );   
    }
   public static String idApertura;
    //Control de eventos de los controles que tienen definido un "ActionCommand"
    @Override
    public void actionPerformed(ActionEvent e) {

    switch ( AccionMVC.valueOf( e.getActionCommand() ) )
        {
            case AbrirCaja:    
				idApertura=  this.vista.CampoCodigoApertura.getText();
                 String caj[] = this.vista.ComboCaja.getSelectedItem().toString().split("-");
                if ( this.modelo.NuevaApertura(
                        this.vista.CampoCodigoApertura.getText(),
                        this.vista.CampoCodigoUsuario.getText(),
                        this.vista.CampoHoraApertura.getText(),
                        this.vista.CampoFechaApertura.getText(),
                        this.vista.CampoMontoApertura.getText(),
                        this.vista.CampoMontoApertura1.getText(),
                        caj[0].trim()) )
                    {
                    JOptionPane.showMessageDialog(vista, "Exito: Nuevo registro agregado.");
		                    limpiarCampos();
		this.vista.dispose();
		 new MenuPrincipal.MenuPrincipalCajero().setVisible(true);
                } else //ocurrio un error
                {
                    JOptionPane.showMessageDialog(vista, "Error: Los datos son incorrectos.");
                }
                break;
                  /* case CerrarCaja:
                          if ( 
                                this.modelo.NuevoCierre(
                                        this.vista.CampoCodigoApertura1.getText(),
                                        this.vista.CampoFechaCierre.getText(),
                                        this.vista.CampoHoraCierre.getText(),
                                        this.vista.CampoHoraCierre1.getText(),
				this.vista.CampoCodigoUsuario.getText()
                              ) )
                    {
                           this.vista.Tabla_Consulta.setModel( this.modelo.getTabla() );
                           JOptionPane.showMessageDialog(vista,"Exito: Nuevo registro agregado.");
                          cancelar();
                    }
                   else //ocurrio un error
                       JOptionPane.showMessageDialog(vista,"Error: Los datos son incorrectos.");
			 this.vista.CampoHoraCierre1.setText("0");
                break;
           
            case GenerarArqueo:            
                this.modelo.generar_codigoArqueo();
                this.vista.CampoCodigoArqueo.setText(this.modelo.Cod_Arqueo);
                if (this.modelo.GuardarArqueo(                   
                        this.vista.CampoCodigoArqueo.getText(),
                        this.vista.CampoCodigoApertura2.getText(),
                        this.vista.CampoFechaArqueo.getText(),
                        this.vista.CampoHoraArqueo.getText(),
                        this.vista.jTextField4.getText(),
                        this.vista.jTextField6.getText(),
                        this.vista.jTextField5.getText(),
                        this.vista.jTextField7.getText(),
			this.vista.CampoCodigoUsuario.getText(),
			this.vista.CampoCodigoApertura3.getText()
                        )){
                    this.vista.Tabla_Consulta1.setModel(this.modelo.getTabla());
                    JOptionPane.showMessageDialog(null, "Exito: Nuevo registro agregado.");
                    cancelar();
                }
                break; */
                     case Cancelar:
                        cancelar();
                 break;
        }
    }    
     public void limpiarCampos() {
                   this.vista.CampoMontoApertura.requestFocus();
                   this.vista.CampoMontoApertura.setText("0") ;       
        //           this.vista.CampoCodigoApertura3.setText("") ;     
      //             this.vista.CampoCodigoApertura2.setText("") ;                   
       //            this.vista.jTextField7.setText("");       
       //            this.vista.jTextField6.setText("");
       //            this.vista.jTextField5.setText("");
		//this.vista.CampoMontoApertura1.setText("");
         //          this.vista.jTextField4.setText("");
            //        this.vista.Tabla_Consulta.setModel( this.modelo.getTabla() );       
    }
    public void cancelar() {
                     limpiarCampos();                     
                     this.modelo.generar_codigoApertura();
                     this.vista.CampoCodigoApertura.setText(this.modelo.Cod_Apertura);
                  //   this.vista.CampoCodigoArqueo.setText(this.modelo.Cod_Arqueo);
                     this.vista.CampoCodigoApertura.setEnabled(false);
               //      this.vista.CampoCodigoArqueo.setEnabled(false);                  
    }
}

