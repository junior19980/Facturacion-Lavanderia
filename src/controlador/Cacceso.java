package controlador;
import modelo.*;
import vista.*;
import MenuPrincipal.MenuPrincipalAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import MenuPrincipal.MenuPrincipalCajero;
import MenuPrincipal.MenuPrincipalCompra;
import MenuPrincipal.MenuPrincipalDeposito;
import MenuPrincipal.MenuPrincipalGerente;
import MenuPrincipal.MenuPrincipalResepcionista;
import MenuPrincipal.MenuPrincipalServicio;
public class Cacceso implements ActionListener {
    // instancia a nuestra interfaz de usuario
    VAcceso vista;
    // instancia a nuestro m odelo
    Macceso modelo = new Macceso();

    //Se declaran en un ENUM las acciones que se realizan desde la interfaz de usuario VISTA y 
    //posterior ejecución desde el controlador.
//    Un enum, también llamado enumeración o tipo enumerado es un tipo de dato definido 
//    por el usuario que solo puede tomar como valores los definidos en una lista.
    public enum AccionMVC {

        INGRESAR,
        SALIR,}

    // Constrcutor de clase vista Instancia de clase interfaz
    public Cacceso(VAcceso vista) {
        this.vista = vista;
    }

    public void iniciar() {
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        Date currentDate = new Date();
        String lastdate = formatter.format(currentDate);
        vista.jLabel2.setText(lastdate);
        this.vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.ingresar.setActionCommand("INGRESAR");
        this.vista.ingresar.addActionListener(this);
        //declara una acción y añade un escucha al evento producido por el componente
        this.vista.Salir.setActionCommand("SALIR");
        this.vista.Salir.addActionListener(this);
    }
    //Control de eventos de los controles que tienen definido un "ActionCommand"
    public void actionPerformed(ActionEvent e) {
        switch (Cacceso.AccionMVC.valueOf(e.getActionCommand())) {
            case INGRESAR:
                if (this.vista.txtusuario.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Favor ingrese Usuario",
                            "Atencion", JOptionPane.INFORMATION_MESSAGE);
                    this.vista.txtusuario.requestFocus();
                } else {
                    if (this.modelo.accesoUsuario(this.vista.txtusuario.getText())) {
                        if (this.vista.txtcontaseña.getText().equals("")) {
                            JOptionPane.showMessageDialog(null, "Favor ingrese la Clave",
                                    "Atencion", JOptionPane.INFORMATION_MESSAGE);
                            this.vista.txtcontaseña.requestFocus();
                        } else {
                            if (this.modelo.accesoClave(this.vista.txtusuario.getText(), this.vista.txtcontaseña.getText())) {
                               int tex=Integer.parseInt(this.modelo.nivel);
                                if(tex==1){
                                new MenuPrincipalAdmin().setVisible(true);
                                this.vista.dispose();
                                }
                                if(tex==2){
                                new cApertura(new vApertura()).iniciar();
                                this.vista.dispose();
                                }
                                if(tex==3){
                                new MenuPrincipalResepcionista().setVisible(true);
                                this.vista.dispose();
                                }
                                if(tex==4){
                                new MenuPrincipalServicio().setVisible(true);
                                this.vista.dispose();
                                }
                                if(tex==5){
                                new MenuPrincipalCompra().setVisible(true);
                                this.vista.dispose();
                                }
                                if(tex==6){
                                new MenuPrincipalDeposito().setVisible(true);
                                this.vista.dispose();
                                }
                                if(tex==7){
                                new MenuPrincipalGerente().setVisible(true);
                                this.vista.dispose();
                                }
                            } else {
                                this.vista.txtcontaseña.setText("");
                                this.vista.txtcontaseña.requestFocus();
                            }
                        }
                    } else {
                        this.vista.txtusuario.setText("");
                        this.vista.txtusuario.requestFocus();
                    }
                }
                break;
            case SALIR:
                System.exit(0);
                break;
        }
    }
}
