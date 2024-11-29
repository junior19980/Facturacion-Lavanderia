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
public class cLibroIvaCompra implements ActionListener {
 VAcceso vista;
    vLibroIvaCompra Vista;
    mLibroIvaCompra Modelo = new mLibroIvaCompra();
Macceso modelo = new Macceso();
    public enum AccionMVC {
        AGREGAR,
        GUARDAR,
        CANCELAR,
        SALIR,
        AGREGAR_DETALLE,
        ELIMINAR_DETALLE
    }

    public cLibroIvaCompra(vLibroIvaCompra Vista) {
        this.Vista = Vista;
    }
    public void iniciar() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        Date currentDate = new Date();
        String lastdate = formatter.format(currentDate);
	this.Vista.jButton1.setEnabled(false);
        this.Vista.setLocationRelativeTo(null);
        this.Vista.Guardar.setEnabled(false);
        this.Vista.Cancelar.setEnabled(false);
        this.Vista.Nuevo.setEnabled(true);
        Vista.setVisible(true);
        this.Vista.Nuevo.setActionCommand("AGREGAR");
        this.Vista.Nuevo.addActionListener(this);
        this.Vista.Guardar.setActionCommand("GUARDAR");
        this.Vista.Guardar.addActionListener(this);
        this.Vista.Cancelar.setActionCommand("CANCELAR");
        this.Vista.Cancelar.addActionListener(this);
        this.Vista.SALIR.setActionCommand("SALIR");
        this.Vista.SALIR.addActionListener(this);
        //this.vista.ComboTipoFactura.setModel(this.modelo.getListaTipoFacturas());
    }
    public void actionPerformed(ActionEvent e) {
        switch (cLibroIvaCompra.AccionMVC.valueOf(e.getActionCommand())) {
            case AGREGAR:
               // this.vista.ComboTipoFact.setEnabled(true);
                //this.vista.ComboMercaderias.setEnabled(true);
		this.Vista.jButton1.setEnabled(true);
                this.Vista.Cancelar.setEnabled(true);
                this.Vista.Nuevo.setEnabled(false);
                this.Vista.SALIR.setEnabled(false);
                this.Vista.Guardar.setEnabled(true);
                 this.Modelo.genera();
                this.Vista.CampoCodigo.setText(this.Modelo.Nrocuenta);
                          break;
            case GUARDAR:
                     //   this.Vista.CampoCodigo.setText(this.Modelo.Nrocuenta);
                   //   this.Modelo.genera();
               //  String tipofactura[] = this.vista.ComboTipoFactura.getSelectedItem().toString().split("-");
                if (this.Modelo.RegistrarVenta(
                         this.Vista.CampoCodigo.getText(),
                        this.Vista.txtGravada10.getText(),
                        this.Vista.Gravada5.getText(),
                        this.Vista.Exenta.getText(),
                        this.Vista.Iva10.getText(),
                        this.Vista.Iva5.getText(),
                        this.Vista.jTextField1.getText()
                )) {
                    JOptionPane.showMessageDialog(Vista, "Exito: Nuevo registro agregado.");
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
                deshabilitaBotones();
                  limpiarcampos();
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
		this.Vista.jTextField1.setText("");
		this.Vista.jTextField2.setText("");
        this.Vista.Iva10.setText("");
        this.Vista.Iva5.setText("");
        this.Vista.Exenta.setText("");
        this.Vista.txtGravada10.setText("");
        this.Vista.Gravada5.setText("");
        this.Vista.jTextField1.setText("");
    }    
    private void deshabilitaBotones() {
			this.Vista.jButton1.setEnabled(false);
      //  this.vista.ComboTipoFactura.setEnabled(false);
        this.Vista.Guardar.setEnabled(false);
        this.Vista.Cancelar.setEnabled(false);
        this.Vista.Nuevo.setEnabled(true);
        this.Vista.SALIR.setEnabled(true);
        limpiar();
    }
}