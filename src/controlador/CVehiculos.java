package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//se importa modelo e interfaz
import modelo.MVehiculo; 
import vista.VVehiculo; 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CVehiculos implements ActionListener, MouseListener, KeyListener {

    /**
     * instancia a nuestra interfaz de usuario
     */
    VVehiculo vista;
    /**
     * instancia a nuestro modelo
     */
    MVehiculo modelo = new MVehiculo();

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
    public CVehiculos(VVehiculo vista) {
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
                this.vista.descriciudad.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 3)));
                 this.vista.codciudad1.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 4)));
                this.vista.descriciudad1.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila,5)));
                this.vista.codciudad2.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 6)));
                this.vista.descriciudad2.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 7)));
                 this.vista.codciudad3.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 8)));
                this.vista.descriciudad3.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 9)));
                this.vista.codciudad4.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 10)));
                this.vista.descriciudad4.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 11)));
                this.vista.codciudad5.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 12)));
                this.vista.descriciudad5.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 13)));
                this.vista.descriciudad6.setText(String.valueOf(this.vista.TablaConsulta.getValueAt(fila, 14)));

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
        this.vista.CampoDescripcion.setEnabled(false);
          this.vista.Guardar.setEnabled(false);
        this.vista.Modificar.setEnabled(false);
        this.vista.Eliminar.setEnabled(false);
        this.vista.Cancelar.setEnabled(false);
        this.vista.Informe.setEnabled(false);
         this.vista.jButton1.setEnabled(false);
          this.vista.jButton2.setEnabled(false);
           this.vista.jButton3.setEnabled(false);
           this.vista.jButton4.setEnabled(false);
            this.vista.jButton5.setEnabled(false);
            this.vista.jButton6.setEnabled(false);


        
        this.vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Guardar.setActionCommand("GUARDAR");
        this.vista.Guardar.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Modificar.setActionCommand("MODIFICAR");
        this.vista.Modificar.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Cancelar.setActionCommand("CANCELAR");
        this.vista.Cancelar.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Eliminar.setActionCommand("ELIMINAR");
        this.vista.Eliminar.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Informe.setActionCommand("INFORME");
        this.vista.Informe.addActionListener(this);

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

        switch (AccionMVC.valueOf(e.getActionCommand())) {

            case GUARDAR:
                //añade un nuevo registro
                this.vista.CampoCodigo.setText(this.modelo.Cod_Cargo);
                this.modelo.generar_codigo();
                if (this.modelo.Nuevo(
                        this.vista.CampoDescripcion.getText(),
                         this.vista.codciudad.getText(),
                         this.vista.codciudad1.getText(),
                           this.vista.codciudad2.getText(),
                            this.vista.codciudad3.getText(),
                           this.vista.codciudad4.getText(),
                           this.vista.codciudad5.getText()
                )) {
                    this.vista.TablaConsulta.setModel(this.modelo.getTablaBusqueda());
                    JOptionPane.showMessageDialog(vista, "Exito: Nuevo registro agregado.");
                    limpiarCampos();
                    this.vista.codciudad.setText("");
                    this.vista.descriciudad.setText("");
                } else //ocurrio un error
                {
                    JOptionPane.showMessageDialog(vista, "Error: Los datos son incorrectos.");
                } this.vista.Guardar.setEnabled(false);limpiarCampos();
      this.vista.Cancelar.setEnabled(false);
      this.vista.nuevo.setEnabled(true);
      this.vista.jButton1.setEnabled(false);
          this.vista.jButton2.setEnabled(false);
          this.vista.jButton3.setEnabled(false);
          this.vista.jButton4.setEnabled(false);
          this.vista.jButton5.setEnabled(false);
          this.vista.jButton6.setEnabled(false);
                break;
            case ELIMINAR:
                if (this.modelo.Eliminar(this.vista.CampoCodigo.getText())) {
                    this.vista.TablaConsulta.setModel(this.modelo.getTablaBusqueda());
                    JOptionPane.showMessageDialog(vista, "Exito: Registro eliminado.");
                    limpiarCampos();
                }  this.vista.Eliminar.setEnabled(false);
      this.vista.Cancelar.setEnabled(false);
      this.vista.nuevo.setEnabled(true);
      this.vista.CampoDescripcion.setEnabled(false);
       this.vista.Modificar.setEnabled(false);
        this.vista.jButton1.setEnabled(false);
         this.vista.jButton2.setEnabled(false);
          this.vista.jButton3.setEnabled(false);
          this.vista.jButton4.setEnabled(false);
          this.vista.jButton5.setEnabled(false);
          this.vista.jButton6.setEnabled(false);
                break;
            case MODIFICAR:

                if (this.modelo.Actualizar(
                        this.vista.CampoCodigo.getText(),
                        this.vista.CampoDescripcion.getText(),
                        this.vista.codciudad.getText(),
                        this.vista.codciudad1.getText(),
                        this.vista.codciudad2.getText(),
                        this.vista.codciudad3.getText(),
                        this.vista.codciudad4.getText(),
                        this.vista.codciudad5.getText()
                )) {
                    this.vista.TablaConsulta.setModel(this.modelo.getTablaBusqueda());
                    JOptionPane.showMessageDialog(null, "Registro actualizado");
                    limpiarCampos();
                }  this.vista.Eliminar.setEnabled(false);
      this.vista.Cancelar.setEnabled(false);
      this.vista.nuevo.setEnabled(true);
      this.vista.CampoDescripcion.setEnabled(false);
         this.vista.Modificar.setEnabled(false);
        this.vista.jButton1.setEnabled(false);
         this.vista.jButton2.setEnabled(false);
          this.vista.jButton3.setEnabled(false);
          this.vista.jButton4.setEnabled(false);
          this.vista.jButton5.setEnabled(false);
          this.vista.jButton6.setEnabled(false);
                break;
            case CANCELAR:
                limpiarCampos();
                break;
            case INFORME:
                modelo.Reportes("Cargos");
                break;
        }
    }

    public void limpiarCampos() {
        this.vista.CampoCodigo.setText("");
        this.vista.CampoDescripcion.setText("");
        this.vista.codciudad.setText("");
        this.vista.descriciudad.setText("");
        this.vista.codciudad1.setText("");
        this.vista.descriciudad1.setText("");
        this.vista.codciudad2.setText("");
        this.vista.descriciudad2.setText("");
        this.vista.codciudad3.setText("");
        this.vista.descriciudad3.setText("");
        this.vista.codciudad4.setText("");
        this.vista.descriciudad4.setText("");
        this.vista.codciudad5.setText("");
        this.vista.descriciudad5.setText("");
        this.vista.CampoDescripcion.setText("");
    }

    
}
