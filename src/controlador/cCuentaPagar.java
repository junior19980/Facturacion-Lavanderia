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

public class cCuentaPagar implements ActionListener {

    VAcceso vista;

    vCuentaPagar Vista;
    mCuentaPagar Modelo = new mCuentaPagar();
    Macceso modelo = new Macceso();

    public enum AccionMVC {

        AGREGAR,
        GUARDAR,
        CANCELAR,
        SALIR,
        AGREGAR_DETALLE,
        ELIMINAR_DETALLE
    }

    public cCuentaPagar(vCuentaPagar Vista) {
        this.Vista = Vista;
    }

    public void iniciar() {
        this.Modelo.generar_codigo();
        this.Vista.fact.setText(this.Modelo.NroFactura);
        this.Modelo.generar_Monto();
        this.Vista.monto.setText(this.Modelo.Monto);
        this.Modelo.genera();
        this.Vista.CampoCodigo.setText(this.Modelo.Nrocuenta);

        this.Vista.CampoCodigo1.setText(this.modelo.nivel);
        this.Vista.CampoCodigo2.setText(this.modelo.nombre);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        Date currentDate = new Date();
        String lastdate = formatter.format(currentDate);
        this.Vista.setLocationRelativeTo(null);
        this.Vista.Guardar.setEnabled(true);
        this.Vista.Cancelar.setEnabled(true);
        // this.Vista.Nuevo.setEnabled(true);
        Vista.setVisible(true);
       // this.Vista.Nuevo.setActionCommand("AGREGAR");
        //  this.Vista.Nuevo.addActionListener(this);
        this.Vista.Guardar.setActionCommand("GUARDAR");
        this.Vista.Guardar.addActionListener(this);
        this.Vista.Cancelar.setActionCommand("CANCELAR");
        this.Vista.Cancelar.addActionListener(this);

        this.Vista.SALIR.setActionCommand("SALIR");
        this.Vista.SALIR.addActionListener(this);

        //this.vista.ComboTipoFactura.setModel(this.modelo.getListaTipoFacturas());
    }

    public void actionPerformed(ActionEvent e) {
        switch (cCuentaPagar.AccionMVC.valueOf(e.getActionCommand())) {

            case GUARDAR:

                //  String tipofactura[] = this.vista.ComboTipoFactura.getSelectedItem().toString().split("-");
                if (this.Modelo.RegistrarVenta(
                        this.Vista.CampoCodigo.getText(),
                        this.Vista.fact.getText(),
                        this.Vista.CampoCodigo1.getText(),
                        this.Vista.CampoFecha1.getText(),
                        this.Vista.monto.getText(),
                        this.Vista.jTextField4.getText()
                )) {
                    JOptionPane.showMessageDialog(Vista, "Exito: Nuevo registro agregado.");
                    // this.modelo.Reportes("recepcionprenda", this.vista.TablaDetalle, this.vista.CampoCodigo.getText(),
                    //    this.vista.CampoFecha.getText(), this.vista.CampoTotal.getText(); 
                    //this.vista.ComboTipoFactura.getSelectedItem().toString());
                } else {
                    JOptionPane.showMessageDialog(Vista, "Error: Los datos son incorrectos.");
                }
                deshabilitaBotones();
                limpiarcampos();
                break;
            case CANCELAR:
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
        this.Vista.monto.setText("");
        this.Vista.fact.setText("");
        this.Vista.CampoFecha1.setText("aaaa-mm-dd");
    }

    private void deshabilitaBotones() {
        //  this.vista.ComboTipoFactura.setEnabled(false);
        this.Vista.Guardar.setEnabled(true);
        this.Vista.Cancelar.setEnabled(true);
//        this.Vista.Nuevo.setEnabled(true);
        this.Vista.SALIR.setEnabled(true);
        limpiar();
    }
}
