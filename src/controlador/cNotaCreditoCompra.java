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

public class cNotaCreditoCompra implements ActionListener {

    VAcceso vista;

    vNotaCreditoCompra Vista;
    mNotaCreditoCompra Modelo = new mNotaCreditoCompra();
    Macceso modelo = new Macceso();

    public enum AccionMVC {

        AGREGAR,
        GUARDAR,
        CANCELAR,
        SALIR,
        AGREGAR_DETALLE,
        ELIMINAR_DETALLE
    }

    public cNotaCreditoCompra(vNotaCreditoCompra Vista) {
        this.Vista = Vista;
    }

    public void iniciar() {
        this.Vista.CampoCodigousu.setText(this.modelo.nivel);
        this.Vista.CampoCodigo2.setText(this.modelo.nombre);
        SimpleDateFormat formattermes = new SimpleDateFormat("MM", Locale.getDefault());
        Date currentDate1 = new Date();
        String lastdate1 = formattermes.format(currentDate1);
        this.Vista.mes.setText(lastdate1);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        Date currentDate = new Date();
        String lastdate = formatter.format(currentDate);
        this.Vista.CampoFecha.setText(lastdate);
        this.Vista.CampoFechaDocumento.setText(lastdate);
        this.Vista.setLocationRelativeTo(null);
        this.Vista.Guardar.setEnabled(false);
        this.Vista.Cancelar.setEnabled(false);
        this.Vista.Nuevo.setEnabled(true);
        this.Vista.SeleccionarRecepcion.setEnabled(false);
        this.Vista.BotonEliminardetalle.setEnabled(false);
        this.Vista.BotonAgregardetalle.setEnabled(false);
        this.Vista.SeleccionarRecepcion.setEnabled(false);
        Vista.setVisible(true);
        this.Vista.Nuevo.setActionCommand("AGREGAR");
        this.Vista.Nuevo.addActionListener(this);
        this.Vista.Guardar.setActionCommand("GUARDAR");
        this.Vista.Guardar.addActionListener(this);
        this.Vista.jButton2.setEnabled(false);
//        this.Vista.jButton3.setEnabled(false);
        this.Vista.Cancelar.setActionCommand("CANCELAR");
        this.Vista.Cancelar.addActionListener(this);

        this.Vista.SALIR.setActionCommand("SALIR");
        this.Vista.SALIR.addActionListener(this);

        this.Vista.BotonAgregardetalle.setActionCommand("AGREGAR_DETALLE");
        this.Vista.BotonAgregardetalle.addActionListener(this);

        this.Vista.BotonEliminardetalle.setActionCommand("ELIMINAR_DETALLE");
        this.Vista.BotonEliminardetalle.addActionListener(this);
        this.Vista.CampoTOTAL.setText(String.valueOf(0));
        //this.vista.ComboTipoFactura.setModel(this.modelo.getListaTipoFacturas());
    }

    public void actionPerformed(ActionEvent e) {
        switch (cServicioRealizado.AccionMVC.valueOf(e.getActionCommand())) {
            case AGREGAR:
                // this.vista.ComboTipoFact.setEnabled(true);
                //this.vista.ComboMercaderias.setEnabled(true);
                this.Vista.BotonAgregardetalle.setEnabled(true);
                this.Vista.Cancelar.setEnabled(true);
                this.Vista.Nuevo.setEnabled(false);
                this.Vista.SALIR.setEnabled(false);
                this.Modelo.generar_codigo();
                this.Vista.CampoCodigo.setText(this.Modelo.Nro_Factura);
                break;
            case GUARDAR:
                this.Modelo.generar_codigo();
                //  String tipofactura[] = this.vista.ComboTipoFactura.getSelectedItem().toString().split("-");
                int cantidadMercaderias = this.Vista.TablaDetalle.getRowCount();
                JTable tabla3 = this.Vista.TablaDetalle;
                if (this.Modelo.RegistrarVenta(
                        this.Vista.CampoCodigo.getText(),
                        this.Vista.CampoFecha.getText(),
                        this.Vista.CampoTOTAL.getText(),
                        this.Vista.CodigoFac.getText(),
                        this.Vista.CampoCodigousu.getText(),
                        this.Vista.Camponro.getText(),
                        this.Vista.motivo.getText(),
                        this.Vista.IVA.getText(),
                        this.Vista.CampoFechaDocumento.getText(),
                        this.Vista.mes.getText(),
                         this.Vista.Timbrado.getText()
                //tipofactura[0].trim()
                )) {
                    for (int i = 0; i < cantidadMercaderias; i++) {
                        String codigoMercadria = tabla3.getValueAt(i, 0).toString();
                        String precio = tabla3.getValueAt(i, 2).toString();
                        String cantidad = tabla3.getValueAt(i, 3).toString();
                        this.Modelo.RegistrarDetalleVenta(this.Vista.CampoCodigo.getText(), codigoMercadria, precio, cantidad);
                    }
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
            case AGREGAR_DETALLE:
                JTable tabla = this.Vista.TablaDetalle;
                String totalgeneral = this.Vista.CampoTOTAL.getText();
                if (this.Modelo.cargarDatos(this.Vista.CODSERVICIO.getText().trim(), this.Vista.SERVICIO.getText().trim(), this.Vista.PRECIO.getText(), this.Vista.CANTIDAD.getText(), tabla, totalgeneral)) {
                    this.Vista.CampoTOTAL.setText(String.valueOf(this.Modelo.totales3));
                    this.Vista.IVA.setText(String.valueOf(this.Modelo.iva));
                } else {
                    JOptionPane.showMessageDialog(Vista, "La mercaderia ya existe en el detalle..", "AtenciÃ³n",
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
                            "AtenciÃ³n", JOptionPane.WARNING_MESSAGE);
                } else {
                    String totales = (tabla2.getValueAt(indice, 4).toString());
                    int totales2 = Integer.parseInt(totales);
                    int totales3 = Integer.parseInt(this.Vista.CampoTOTAL.getText());
                    int totales4 = totales3 - totales2;
                    int totalesiva = totales4 / 11;
                    this.Vista.CampoTOTAL.setText(String.valueOf(totales4));
                    this.Vista.IVA.setText(String.valueOf(totalesiva));
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

        // this.Vista.CampoTOTAL.setText("0");
        int totales = 0;
        this.Vista.Camponro.setText("");
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
        this.Vista.motivo.setText("");
        this.Vista.nrofacturacom.setText("");
        this.Vista.RucProv.setText("");
        this.Vista.CodigoFac.setText("");
        this.Vista.NombreProv.setText("");
        this.Vista.Timbrado.setText("");
        this.Vista.CODSERVICIO.setText("");
        this.Vista.SERVICIO.setText("");
        this.Vista.SeleccionarRecepcion.setEnabled(false);
    }

    public void limpia() {
        this.Vista.CODSERVICIO.setText("");
        this.Vista.SERVICIO.setText("");
        this.Vista.CANTIDAD.setText("");
        this.Vista.PRECIO.setText("");
        //   this.Vista.CampoTOTAL.setText("0");
    }

    private void deshabilitaBotones() {
        //    this.Vista.jButton2.setEnabled(false);
        this.Vista.BotonAgregardetalle.setEnabled(false);
        this.Vista.BotonEliminardetalle.setEnabled(false);
        // this.Vista.jButton3.setEnabled(false);
        this.Vista.Cancelar.setEnabled(false);
        this.Vista.Guardar.setEnabled(false);
        this.Vista.Cancelar.setEnabled(false);
        this.Vista.Nuevo.setEnabled(true);
        this.Vista.SALIR.setEnabled(true);
        this.Vista.BotonAgregardetalle.setEnabled(false);
        limpiar();
    }
}
