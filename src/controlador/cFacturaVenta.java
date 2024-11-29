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

public class cFacturaVenta implements ActionListener {

    VAcceso vista;
    public static String basura = "", usu, idFactura = "", apertura = "";
    public static int total;
    vFacturaVenta Vista;
    cApertura med;
    mFacturaVenta Modelo = new mFacturaVenta();
    Macceso modelo = new Macceso();

    public enum AccionMVC {

        AGREGAR,
        GUARDAR,
        CANCELAR,
        SALIR,
        AGREGAR_DETALLE,
        ELIMINAR_DETALLE
    }

    public cFacturaVenta(vFacturaVenta Vista) {
        this.Vista = Vista;
    }

    public void iniciar() {

      //  this.Vista.jComboBox2.setEnabled(false);
        // this.Vista.jComboBox2.setModel(this.Modelo.getListaTipoFacturas());
        this.Modelo.generar_timbrado();
        this.Vista.CampoCodigo7.setText(this.med.idApertura);
        this.Vista.CampoCodigo5.setText(this.Modelo.id);
        this.Vista.CampoCodigo6.setText(this.Modelo.nro);
        usu = this.Vista.CampoCodigo1.getText();
        this.Vista.jTextField1.setText("0.0");
        basura = this.Vista.CampoCodigo.getText();
        this.Vista.jComboBox1.setEnabled(false);
        this.Vista.jComboBox1.setModel(this.Modelo.getListaTipoFactura());
        this.Vista.CampoCodigo1.setText(this.modelo.nivel);
        this.Vista.CampoCodigo2.setText(this.modelo.nombre);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        Date currentDate = new Date();
        String lastdate = formatter.format(currentDate);
        SimpleDateFormat formattermes = new SimpleDateFormat("MM", Locale.getDefault());
        Date currentDate1 = new Date();
        String lastdate1 = formattermes.format(currentDate1);
        this.Vista.CampoFecha.setText(lastdate);
        this.Vista.CampoFecha1.setText(lastdate1);
        this.Vista.setLocationRelativeTo(null);
        this.Vista.Guardar.setEnabled(false);
        this.Vista.Cancelar.setEnabled(false);
        this.Vista.Nuevo.setEnabled(true);
        // this.Vista.SeleccionarRecepcion.setEnabled(false);
        this.Vista.BotonEliminardetalle.setEnabled(false);
        this.Vista.BotonAgregardetalle.setEnabled(false);
        //  this.Vista.SeleccionarRecepcion.setEnabled(false);
        Vista.setVisible(true);
        this.Vista.Nuevo.setActionCommand("AGREGAR");
        this.Vista.Nuevo.addActionListener(this);
        this.Vista.Guardar.setActionCommand("GUARDAR");
        this.Vista.Guardar.addActionListener(this);
        this.Vista.BuscarServicioRealizado.setEnabled(false);
        this.Vista.Cancelar.setActionCommand("CANCELAR");
        this.Vista.Cancelar.addActionListener(this);

        this.Vista.SALIR.setActionCommand("SALIR");
        this.Vista.SALIR.addActionListener(this);

        this.Vista.BotonAgregardetalle.setActionCommand("AGREGAR_DETALLE");
        this.Vista.BotonAgregardetalle.addActionListener(this);

        this.Vista.BotonEliminardetalle.setActionCommand("ELIMINAR_DETALLE");
        this.Vista.BotonEliminardetalle.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        switch (cFacturaVenta.AccionMVC.valueOf(e.getActionCommand())) {
            case AGREGAR:
                //   this.Vista.jComboBox2.setModel(this.Modelo.getListaTipoFacturas());
                this.Vista.jComboBox1.setEnabled(true);
                this.Vista.BotonAgregardetalle.setEnabled(true);
                this.Vista.Cancelar.setEnabled(true);
                this.Vista.Nuevo.setEnabled(false);
                this.Vista.SALIR.setEnabled(false);
                this.Modelo.generar_codigo();
                this.Vista.CampoCodigo.setText(this.Modelo.Nro_Factura);
                this.Modelo.generar_timbrado();
                this.Vista.CampoCodigo3.setText(this.Modelo.Nro);

                //this.Vista.jComboBox2.setEnabled(true);
                break;
            case GUARDAR:
                this.Vista.CampoCodigo.setText(this.Modelo.Nro_Factura);
                this.Modelo.generar_codigo();
                String tipofactura[] = this.Vista.jComboBox1.getSelectedItem().toString().split("-");
                int cantidadMercaderias = this.Vista.TablaDetalle.getRowCount();
                JTable tabla3 = this.Vista.TablaDetalle;
                int basura = Integer.parseInt(tipofactura[0].trim());
                if (this.Modelo.RegistrarVenta(
                        this.Vista.CampoCodigo.getText(),
                        this.Vista.CampoCodigo3.getText(),
                        this.Vista.CampoFecha.getText(),
                        this.Vista.jTextField1.getText(),
                        this.Vista.jTextField11.getText(),
                        this.Vista.CampoCodigo1.getText(),
                        this.Vista.CampoCodigo7.getText(),
                        this.Vista.CampoCodigo5.getText(),
                        tipofactura[0].trim(),
                        this.Vista.CampoFecha1.getText(),
                        this.Vista.jTextField2.getText()
                )) {
                    for (int i = 0; i < cantidadMercaderias; i++) {
                        String codigoMercadria = tabla3.getValueAt(i, 0).toString();
                        String precio = tabla3.getValueAt(i, 2).toString();
                        String cantidad = tabla3.getValueAt(i, 3).toString();
                        String des = tabla3.getValueAt(i, 5).toString();
                        this.Modelo.RegistrarDetalleVenta(codigoMercadria, precio, cantidad, des);
                        idFactura = this.Vista.CampoCodigo.getText();
                        apertura = this.Vista.CampoCodigo7.getText();
			//String tipo[] = this.Vista.jComboBox2.getSelectedItem().toString().split("-");
                        //if(Vista.jRadioButton1.isSelected()){

			//}else {
                        //this.Modelo.RegistrarFormatoPago(
                        // this.Vista.CampoCodigo.getText(),
                        //	 tipo[0].trim()
                        //"",
                        // this.Vista.jTextField1.getText());
                        //		 }
                    }
                    JOptionPane.showMessageDialog(Vista, "Exito: Nuevo registro agregado.");
                    total = Integer.parseInt(this.Vista.jTextField1.getText());
                    this.Vista.CampoCodigo3.setText("");
                    this.Modelo.Reportes("FacturaServicio", this.Vista.TablaDetalle,
                            this.Vista.CampoCodigo.getText(),
                            this.Vista.CampoCodigo2.getText(),
                            this.Vista.jTextField9.getText(),
                            this.Vista.jTextField10.getText(),
                            this.Vista.jTextField1.getText(),
                            this.Vista.jTextField2.getText(),
                            this.Vista.CampoCodigo6.getText(),
                            tipofactura[1].trim());

                } else {
                    JOptionPane.showMessageDialog(Vista, "Error: Los datos son incorrectos.");
                }
                total = Integer.parseInt(this.Vista.jTextField1.getText());
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
            case AGREGAR_DETALLE:
                JTable tabla = this.Vista.TablaDetalle;
                //String totalgeneral = this.vista.CampoTotal.getText();
                if (this.Modelo.cargarDatos(this.Vista.CODSERVICIO.getText().trim(), this.Vista.SERVICIO.getText().trim(), this.Vista.PRECIO.getText(), this.Vista.CANTIDAD.getText(), this.Vista.Descuento.getText(), tabla)) {
                    this.Vista.jTextField1.setText(String.valueOf(this.Modelo.totales3));
                    this.Vista.jTextField2.setText(String.valueOf(this.Modelo.iva));
                } else {
                    JOptionPane.showMessageDialog(Vista, "La mercaderia ya existe en el detalle..", "Atencion",
                            JOptionPane.WARNING_MESSAGE);
                }
                this.Vista.BotonEliminardetalle.setEnabled(true);
                this.Vista.Guardar.setEnabled(true);

                limpia();
                break;
            case ELIMINAR_DETALLE:
                JTable tabla2 = this.Vista.TablaDetalle;
                javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tabla2.getModel();
                int indice = tabla2.getSelectedRow();
                if (indice == -1) {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado el Detalle a borrar..",
                            "Atencion", JOptionPane.WARNING_MESSAGE);
                } else {
                    String totales = (tabla2.getValueAt(indice, 6).toString());
                    int numero1 = Integer.parseInt(totales);
                    int numero2 = Integer.parseInt(this.Vista.jTextField1.getText());
                    int numero3 = numero2 - numero1;
                    int totales2 = Integer.parseInt(totales);
                    this.Vista.jTextField1.setText(String.valueOf(numero3));
                    int iva = numero3 / 11;
                    this.Vista.jTextField2.setText(String.valueOf(iva));
                    dtm.removeRow(indice);
                }
                int nro_fila = tabla2.getRowCount();
                if (nro_fila == 0) {
                    this.Vista.BotonEliminardetalle.setEnabled(false);
                    this.Vista.Guardar.setEnabled(false);
                }
                break;
        }
    }

    private void limpiar() {
        int totales = 0;
        this.Vista.CampoCodigo.setText("");
        //limpiar tabla
        this.Vista.TablaDetalle.selectAll();
        int[] L = this.Vista.TablaDetalle.getSelectedRows();
        javax.swing.table.DefaultTableModel dtm
                = (javax.swing.table.DefaultTableModel) this.Vista.TablaDetalle.getModel();
        for (int i = L.length - 1; i >= 0; --i) {
            dtm.removeRow(L[i]);
        }
    }

    public void limpiarcampos() {
        this.Vista.jTextField1.setText("0");
        this.Vista.jTextField1.setText("0");
        this.Modelo.totales3 = 0;
        this.Vista.jTextField8.setText("");
        this.Vista.jTextField9.setText("");
        this.Vista.jTextField10.setText("");
        this.Vista.CODSERVICIO.setText("");
        this.Vista.SERVICIO.setText("");
        //     this.Vista.SeleccionarRecepcion.setEnabled(false);
    }

    public void limpia() {
        this.Vista.CODSERVICIO.setText("");
        this.Vista.SERVICIO.setText("");
        this.Vista.CANTIDAD.setText("");
        this.Vista.PRECIO.setText("");
    }

    private void deshabilitaBotones() {
        //  this.Vista.jComboBox2.setEnabled(false);
//        this.Vista.SeleccionarRecepcion.setEnabled(false);
        this.Vista.jComboBox1.setEnabled(false);
        this.Vista.BotonAgregardetalle.setEnabled(false);
        this.Vista.BotonEliminardetalle.setEnabled(false);
        this.Vista.BuscarServicioRealizado.setEnabled(false);
        this.Vista.Cancelar.setEnabled(false);
        this.Vista.Guardar.setEnabled(false);
        this.Vista.Cancelar.setEnabled(false);
        this.Vista.Nuevo.setEnabled(true);
        this.Vista.SALIR.setEnabled(true);
        this.Vista.BotonAgregardetalle.setEnabled(false);
        limpiar();
    }
}
