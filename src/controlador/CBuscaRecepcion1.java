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
//import static Vista.vacceso.usunivel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CBuscaRecepcion1 implements ActionListener, MouseListener, KeyListener {

        
    /**
     * instancia a nuestra interfaz de usuario
     */
    VBuscaRecepcion1 vista;
    VAcceso Vista;
    /**
     * instancia a nuestro modelo
     */
    MBuscaResepcion1  modelo = new MBuscaResepcion1();

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
    public CBuscaRecepcion1(VBuscaRecepcion1 vista) {
        this.vista = vista;
    }

    //EVENTOS DEL RATON SOBRE LOS COMPONENTES
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == 1) {
            int fila = this.vista.TablaConsulta.rowAtPoint(e.getPoint());
            if (fila > -1) {
                this.vista.Codigo.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 0)));
                this.vista.nombrecli.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 1)));
                this.vista.clici.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 2)));
                this.vista.codacces.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila,3)));
                this.vista.descriacc.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila,4)));
                this.vista.cantidad.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila,5)));
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
//        this.vista.Seleccionar1.setEnabled(false);
        // int ban=Integer.parseInt(vacceso.usunivel);
        //if(ban==1){
        //this.vista.Seleccionar1.setEnabled(true);
        //}
        this.vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        //declara una acción y añade un escucha al evento producido por el componente
    this.vista.Seleccionar.setActionCommand( "GUARDAR" );
        this.vista.Seleccionar.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        //añade e inicia el jtable con un DefaultTableModel vacio
        this.vista.TablaConsulta.addMouseListener(this);
        this.vista.TablaConsulta.setModel(new DefaultTableModel());

        this.vista.TablaConsulta.setModel(this.modelo.getTablaBusqueda());
        //habilita el campo buscar para que pueda reconocer eventos del  teclado
        this.vista.CampoBuscar.addKeyListener(this);

        //Bloque el campo Codigo
        this.vista.Codigo.setEnabled(false);
    }

    //Control de eventos de los controles que tienen definido un "ActionCommand"
@Override
    public void actionPerformed(ActionEvent e) {

    switch ( CBuscaRecepcion1.AccionMVC.valueOf( e.getActionCommand() ) ){
            case GUARDAR:
                if (this.modelo.Modificar(
                        this.vista.Codigo.getText(),
                        this.vista.codacces.getText()
                        )){
                   // JOptionPane.showMessageDialog(null, "Registro actualizado");
                //    limpiarCampos();
                }this.vista.TablaConsulta.setModel( this.modelo.getTablaBusqueda() );
                break; 
        }
    }

    public void limpiarCampos() {
        this.vista.Codigo.setText("");
        this.vista.nombrecli.setText("");
        this.vista.descriacc.setText("");
        this.vista.clici.setText("");
        this.vista.codacces.setText("");
        this.vista.descriacc.setText("");
    }

    
}
