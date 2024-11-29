package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//se importa modelo e interfaz
import modelo.*; 
import vista.*; 

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class CBuscaNotaCreditoVenta implements ActionListener, MouseListener, KeyListener {
    /**
     * instancia a nuestra interfaz de usuario
     */
    VBuscaNotaCreditoVenta vista;
    /**
     * instancia a nuestro modelo
     */
   MBuscaNotaCreditoVenta  modelo = new MBuscaNotaCreditoVenta ();
    Macceso  accesi = new Macceso ();
    /**
     * Se declaran en un ENUM las acciones que se realizan desde la interfaz de
     * usuario VISTA y posterior ejecución desde el controlador
     */
    public enum AccionMVC {
        GUARDAR,
        ELIMINAR,
        MODIFICAR,
        INFORME,
        CANCELAR
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    /**
     * detecta lo que se digita en el campo buscar y realiza el filtro
     */
    public void keyReleased(KeyEvent e) {
        /*Por cada letra insertada en el campo buscar se envia el contenido a la variable :filtro: del modelo para realizar la consulta
         y obtener los datos*/
        modelo.filtro = this.vista.CampoBuscar.getText();
        this.vista.TablaConsulta.setModel(modelo.getTablaBusqueda());
    }

    /**
     * Constrcutor de clase
     *
     * @param vista Instancia de clase interfaz
     */
    public CBuscaNotaCreditoVenta(VBuscaNotaCreditoVenta  vista) {
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
                this.vista.telefono2.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila,2)));
                           }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    /**
     * Constrcutor de clase
     *
     * @param vista Instancia de clase interfaz
     */
    /**
     * Inicia el skin y las diferentes variables que se utilizan
     */
  
    public void iniciar() {
        this.vista.Seleccionar1.setEnabled(false);
         int ban=Integer.parseInt(accesi.nivel);
        if(ban==1){
        this.vista.Seleccionar1.setEnabled(true);
        }
        this.vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        //declara una acción y añade un escucha al evento producido por el componente
    this.vista.Seleccionar1.setActionCommand( "GUARDAR" );
        this.vista.Seleccionar1.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        //añade e inicia el jtable con un DefaultTableModel vacio
        this.vista.TablaConsulta.addMouseListener(this);
        this.vista.TablaConsulta.setModel(new DefaultTableModel());

        this.vista.TablaConsulta.setModel(this.modelo.getTablaBusqueda());
        //habilita el campo buscar para que pueda reconocer eventos del  teclado
        this.vista.CampoBuscar.addKeyListener(this);

        //Bloque el campo Codigo
        this.vista.CampoCodigo.setEnabled(false);
    }

    //Control de eventos de los controles que tienen definido un "ActionCommand"
   @Override
    public void actionPerformed(ActionEvent e) {

    switch ( AccionMVC.valueOf( e.getActionCommand() ) ){
            case GUARDAR:
                if (this.modelo.Modificar(
                        this.vista.CampoCodigo.getText()
                        )){
                    JOptionPane.showMessageDialog(null, "Registro actualizado");
                    limpiarCampos();
                }this.vista.TablaConsulta.setModel( this.modelo.getTablaBusqueda() );
                break; 
        }
    }

    public void limpiarCampos() {
        this.vista.CampoCodigo.setText("");
        this.vista.CampoDescripcion.setText("");
        this.vista.telefono2.setText("");
    }

    
}
