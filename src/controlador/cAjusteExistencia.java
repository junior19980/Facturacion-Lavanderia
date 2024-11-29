package controlador;
import modelo.*;
import vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
public class cAjusteExistencia implements ActionListener {
VAcceso vista;
    vAjusteExistencias Vista;
    mAjusteExistencia Modelo = new mAjusteExistencia();
Macceso modelo = new Macceso();
    public enum AccionMVC {
        AGREGAR,
        GUARDAR,
        CANCELAR,
        SALIR,
        AGREGAR_DETALLE,
        ELIMINAR_DETALLE
    }
    public cAjusteExistencia(vAjusteExistencias Vista) {
        this.Vista = Vista;
    }
    public void iniciar() {
        this.Vista.CampoCodigo1.setText(this.modelo.nivel);
        this.Vista.CampoCodigo2.setText(this.modelo.nombre);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        Date currentDate = new Date();
        String lastdate = formatter.format(currentDate);
        this.Vista.CampoFecha.setText(lastdate);
        this.Vista.setLocationRelativeTo(null);
        this.Vista.Guardar.setEnabled(false);
        this.Vista.Cancelar.setEnabled(false);
        this.Vista.Nuevo.setEnabled(true);
        Vista.setVisible(true);
        this.Vista.Nuevo.setActionCommand("AGREGAR");
        this.Vista.Nuevo.addActionListener(this);
        this.Vista.Guardar.setActionCommand("GUARDAR");
        this.Vista.Guardar.addActionListener(this);
        this.Vista.jButton2.setEnabled(false);  
        this.Vista.jButton3.setEnabled(false);  
        this.Vista.jButton4.setEnabled(false);  
        this.Vista.Cancelar.setActionCommand("CANCELAR");
        this.Vista.Cancelar.addActionListener(this);

        this.Vista.SALIR.setActionCommand("SALIR");
        this.Vista.SALIR.addActionListener(this);
       //this.vista.ComboTipoFactura.setModel(this.modelo.getListaTipoFacturas());
    }
    public void actionPerformed(ActionEvent e) {
        switch (cAjusteExistencia.AccionMVC.valueOf(e.getActionCommand())) {
            case AGREGAR:
               // this.vista.ComboTipoFact.setEnabled(true);
                //this.vista.ComboMercaderias.setEnabled(true);
                this.Vista.Cancelar.setEnabled(true);
                this.Vista.Nuevo.setEnabled(false);
                this.Vista.SALIR.setEnabled(false);
                this.Modelo.generar_codigo();
                this.Vista.CampoCodigo.setText(this.Modelo.Nro_Factura);
                break;
            case GUARDAR:
                 this.Vista.CampoCodigo.setText(this.Modelo.Nro_Factura);
                  this.Modelo.generar_codigo();
              //  String tipofactura[] = this.vista.ComboTipoFactura.getSelectedItem().toString().split("-");          
                if (this.Modelo.RegistrarVenta(
                      this.Vista.CampoCodigo.getText(),
                        this.Vista.CampoFecha.getText(),
                        this.Vista.jTextField7.getText(),
                        this.Vista.CampoCodigo1.getText(),
                        this.Vista.jTextField4.getText(),
                        this.Vista.jTextField8.getText(),
                        this.Vista.jTextField10.getText()
                        
                        // this.vista.CODSERVICIO.getText()
                        //tipofactura[0].trim()
                )) {
                  //  JOptionPane.showMessageDialog(Vista, "Exito: Nuevo registro agregado.");
                    // this.modelo.Reportes("recepcionprenda", this.vista.TablaDetalle, this.vista.CampoCodigo.getText(),
                        //    this.vista.CampoFecha.getText(), this.vista.CampoTotal.getText(); 
                            //this.vista.ComboTipoFactura.getSelectedItem().toString());
                } 
                else {
                    JOptionPane.showMessageDialog(Vista, "Error: Los datos son incorrectos.");
                }
                deshabilitaBotones();
                limpiarcampos();
                break;
            case CANCELAR:
                limpiarcampos();
                deshabilitaBotones();
                break;
            case SALIR:
                this.Vista.dispose();
                break;
        }
    }
    private void limpiar() {
        int totales = 0;
        this.Vista.CampoCodigo.setText("");
        //limpiar tabla  
    }
    public void limpiarcampos() {
        this.Vista.jTextField4.setText("");
        this.Vista.jTextField7.setText("");
        this.Vista.jTextField5.setText("");
        this.Vista.jTextField10.setText("");
        this.Vista.jTextField11.setText("");
        this.Vista.jTextField8.setText("");
        this.Vista.jTextField9.setText("");
    }  
    private void deshabilitaBotones() {
      //  this.vista.ComboTipoFactura.setEnabled(false);
        this.Vista.Guardar.setEnabled(false);
        this.Vista.Cancelar.setEnabled(false);
        this.Vista.Nuevo.setEnabled(true);
        this.Vista.SALIR.setEnabled(true);
        this.Vista.jButton2.setEnabled(false);
        this.Vista.jButton3.setEnabled(false);
        this.Vista.jButton4.setEnabled(false);
        limpiar();
    }
}