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

public class cAperturaCierreArqueo implements ActionListener,MouseListener,KeyListener{
 public static String idAperturaCaja="";
	/** instancia a nuestra interfaz de usuario*/
    vAperturaCierreArqueo vista ;
    /** instancia a nuestro modelo */
    mAperturaCierreArqueo modelo = new mAperturaCierreArqueo();
	Macceso Modelo= new Macceso();
	mApertura med=new mApertura();
	
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
        modelo.filtro = this.vista.CampoCodigoApertura1.getText();
        this.vista.Tabla_Consulta.setModel(modelo.getTabla());
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
	Calcular,
         Imprimir,
         Recauda
    }
    /** Constrcutor de clase
 * @param vista Instancia de clase interfaz
 */
    public cAperturaCierreArqueo( vAperturaCierreArqueo vista )
    {
        this.vista = vista;
    }
  //EVENTOS DEL RATON SOBRE LOS COMPONENTES
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == 1) {
            int fila = this.vista.Tabla_Consulta.rowAtPoint(e.getPoint());
            if (fila > -1) {
                this.vista.CampoCodigoApertura1.setText(String.valueOf(this.vista.Tabla_Consulta.getValueAt(fila, 0)));
		String num2=String.valueOf(this.vista.Tabla_Consulta.getValueAt(fila,3));
		idAperturaCaja= this.vista.CampoCodigoApertura1.getText();		
		modelo.total(this.vista.CampoCodigoApertura1.getText());
             //   JOptionPane.showMessageDialog(null, modelo.resu);
            double num1;
             if(modelo.resu==null){
                 num1=(0.0);
             }else{
		 num1=Double.parseDouble(modelo.resu);}
                double num=Double.parseDouble(num2);
		double suma=num+num1;
		this.vista.CampoHoraCierre1.setText(String.valueOf(suma));
            }
        }
          if (e.getButton() == 1) {
            int fila = this.vista.Tabla_Consulta1.rowAtPoint(e.getPoint());
            if (fila > -1) {
                this.vista.CampoCodigoApertura2.setText(String.valueOf(this.vista.Tabla_Consulta1.getValueAt(fila, 0)));
                this.vista.CampoCodigoApertura3.setText(String.valueOf(this.vista.Tabla_Consulta1.getValueAt(fila, 6)));
	    }
        }
           if (e.getButton() == 1) {
            int fila = this.vista.Tabla_Consulta2.rowAtPoint(e.getPoint());
            if (fila > -1) {
                this.vista.CampoCodigoApertura4.setText(String.valueOf(this.vista.Tabla_Consulta2.getValueAt(fila, 0)));
                this.vista.CampoCodigoApertura5.setText(String.valueOf(this.vista.Tabla_Consulta2.getValueAt(fila, 3)));
                this.vista.CampoCodigoApertura6.setText(String.valueOf(this.vista.Tabla_Consulta2.getValueAt(fila, 4)));
                double efe,che,total;
                efe=Double.parseDouble(this.vista.CampoCodigoApertura5.getText());
                che=Double.parseDouble(this.vista.CampoCodigoApertura6.getText());
                total=efe+che;
                this.vista.CampoNombreUsuario2.setText(String.valueOf(total));
                modelo.generar_codigoRecaudacion();
                this.vista.CampoNombreUsuario3.setText(modelo.Cod);
                this.vista.Recaudacion.setEnabled(true);
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
    public void iniciar(){
        this.vista.Recaudacion.setEnabled(false);
        modelo.generar_timbrado();
        this.modelo.generar();
        this.vista.CampoMontoApertura1.setText(modelo.ap);
	this.modelo.generar_codigoApertura();
         this.vista.CampoCodigoApertura.setText(this.modelo.Cod_Apertura);
        this.vista.CampoCodigoUsuario.setText(Modelo.nivel);
        this.vista.CampoNombreUsuario.setText(Modelo.nombre);
        this.vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        // this.modelo.nombreusuario=this.vista.CampoUsuarioApertura.getText();
       //* cancelar();
		        this.vista.Abrir.setEnabled(true);
        this.vista.Cancelar.setActionCommand( "Cancelar" );
        this.vista.Cancelar.addActionListener(this);
	this.vista.Calcular.setActionCommand( "Calcular" );
        this.vista.Calcular.addActionListener(this);
        //this.vista.VER.setActionCommand( "VER" );
        //this.vista.VER.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Abrir.setActionCommand( "AbrirCaja" );
        this.vista.Abrir.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Cerrar.setActionCommand( "CerrarCaja" );
        this.vista.Cerrar.addActionListener(this);
        this.vista.Recaudacion.setActionCommand( "Recauda" );
        this.vista.Recaudacion.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Generar.setActionCommand( "GenerarArqueo" );
        this.vista.Generar.addActionListener(this);
       //combo
        this.vista.ComboCaja.setModel(this.modelo.getListaCaja());
        //añade e inicia el jtable con un DefaultTableModel vacio
        this.vista.Tabla_Consulta.addMouseListener(this);
        this.vista.Tabla_Consulta.setModel( new DefaultTableModel() );
        this.vista.Tabla_Consulta.setModel( this.modelo.getTabla() );   
        this.vista.Tabla_Consulta1.addMouseListener(this);
        this.vista.Tabla_Consulta1.setModel( new DefaultTableModel() );
        this.vista.Tabla_Consulta1.setModel( this.modelo.getBuscaTabla() );   
        this.vista.Tabla_Consulta2.addMouseListener(this);
        this.vista.Tabla_Consulta2.setModel( new DefaultTableModel() );
        this.vista.Tabla_Consulta2.setModel( this.modelo.getBuscaTablaArqueo());   
    }
   
    //Control de eventos de los controles que tienen definido un "ActionCommand"
    @Override
    public void actionPerformed(ActionEvent e) {
        
    switch ( AccionMVC.valueOf( e.getActionCommand() ) )
        {
		case Calcular:
		idAperturaCaja=this.vista.CampoCodigoApertura2.getText();
                  if(String.valueOf(this.vista.CampoCodigoApertura2.getText())!=null){
			modelo.calcula();
                          this.vista.jTextField4.setText(modelo.total);
                          this.vista.jTextField6.setText(modelo.to);
                          this.vista.jTextField5.setText(modelo.tot);
                          this.vista.jTextField7.setText(modelo.tut);
                          this.vista.jTextField8.setText(modelo.gol);
                   JOptionPane.showMessageDialog(vista, "Calculo exitoso.");
                     }else //ocurrio un error
                {
                    JOptionPane.showMessageDialog(vista, "Error: Los datos son incorrectos.");
                }
			//this.med.Cod_Apertura=String.valueOf(0);
                break;
            case AbrirCaja:
        this.vista.CampoMontoApertura1.setText(modelo.ap);
                 modelo.generar_timbrado();
                 String caj[] = this.vista.ComboCaja.getSelectedItem().toString().split("-");
                 idAperturaCaja=this.vista.CampoCodigoApertura.getText();
                 
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
			 this.vista.Tabla_Consulta.setModel(modelo.getTabla());
                } else //ocurrio un error
                {
                    JOptionPane.showMessageDialog(vista, "Error: Los datos son incorrectos.");
                }
			this.med.Cod_Apertura=String.valueOf(0);
                break;
                                case CerrarCaja:
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
                    this.vista.Tabla_Consulta1.setModel(this.modelo.getBuscaTabla());
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
			this.vista.CampoCodigoApertura3.getText(),
			this.vista.jTextField8.getText()
                        )){
                    this.vista.Tabla_Consulta1.setModel(this.modelo.getBuscaTabla());
                     this.vista.Tabla_Consulta2.setModel(this.modelo.getBuscaTablaArqueo());
                    JOptionPane.showMessageDialog(null, "Exito: Nuevo registro agregado.");
                    cancelar();
                }
                break; 
                     case Cancelar:
                        cancelar();
                 break;
                     case Recauda:
                         modelo.generar_codigoRecaudacion();
                          if (this.modelo.Recaudacion(                   
                        this.vista.CampoNombreUsuario3.getText(),
                        this.vista.CampoFechaApertura.getText(),
                        this.vista.CampoNombreUsuario2.getText(),
                        this.vista.CampoCodigoUsuario.getText(),
                        this.vista.CampoCodigoApertura4.getText()
                        )){
                    
                    this.vista.Tabla_Consulta2.setModel(modelo.getBuscaTablaArqueo());
                    JOptionPane.showMessageDialog(null, "Exito: Nuevo registro agregado.");
                    lim();
                }
                         
                         break;
        }
    }    
     public void limpiarCampos() {
                   this.vista.CampoMontoApertura.requestFocus();
                   this.vista.CampoMontoApertura.setText("0") ;       
                   this.vista.CampoCodigoApertura3.setText("") ;     
                   this.vista.CampoCodigoApertura2.setText("") ;      
		this.vista.CampoMontoApertura1.setText("");
                    this.vista.Tabla_Consulta.setModel( this.modelo.getTabla() );       
    }
	public void limpia(){
		this.vista.jTextField4.setText("0.0");
		this.vista.jTextField5.setText("0.0");
		this.vista.jTextField6.setText("0.0");
		this.vista.jTextField7.setText("0.0");
		this.vista.jTextField8.setText("0.0");
	}
    public void cancelar() {
		limpia();
                     limpiarCampos();                     
                     this.modelo.generar_codigoApertura();
                     this.vista.CampoCodigoApertura.setText(this.modelo.Cod_Apertura);
                     this.vista.CampoCodigoArqueo.setText(this.modelo.Cod_Arqueo);
                     this.vista.CampoCodigoApertura.setEnabled(false);
                     this.vista.CampoCodigoArqueo.setEnabled(false);                  
    }
    public void lim(){
                     this.vista.CampoNombreUsuario3.setText("");
                     this.vista.CampoNombreUsuario2.setText("");   
                     this.vista.Recaudacion.setEnabled(false);
    
    }
}