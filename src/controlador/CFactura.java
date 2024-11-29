package controlador;

import modelo.MFactura;

import vista.VFactura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class CFactura implements ActionListener {

    VFactura vista;
    MFactura modelo = new MFactura();

    public enum AccionMVC {

        AGREGAR,
        GUARDAR,
        CANCELAR,
        SALIR,
        AGREGAR_DETALLE,
        ELIMINAR_DETALLE
    }

    public CFactura(VFactura vista) {
        this.vista = vista;
    }

    public void iniciar() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        Date currentDate = new Date();
        String lastdate = formatter.format(currentDate);
        this.vista.CampoFecha.setText(lastdate);
        this.vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        vista.CampoTotal.setText(String.valueOf(0));
        

        this.vista.AgregarVentas.setActionCommand("AGREGAR");
        this.vista.AgregarVentas.addActionListener(this);

        this.vista.Guardar.setActionCommand("GUARDAR");
        this.vista.Guardar.addActionListener(this);

        this.vista.CANCELAR.setActionCommand("CANCELAR");
        this.vista.CANCELAR.addActionListener(this);

        this.vista.SALIR.setActionCommand("SALIR");
        this.vista.SALIR.addActionListener(this);

        this.vista.BotonAgregardetalle.setActionCommand("AGREGAR_DETALLE");
        this.vista.BotonAgregardetalle.addActionListener(this);
        
       this.vista.BotonEliminardetalle.setActionCommand("ELIMINAR_DETALLE");
        this.vista.BotonEliminardetalle.addActionListener(this);

        //this.vista.ComboTipoFactura.setModel(this.modelo.getListaTipoFacturas());
    }

    public void actionPerformed(ActionEvent e) {
        switch (CFactura.AccionMVC.valueOf(e.getActionCommand())) {
            case AGREGAR:
               // this.vista.ComboTipoFact.setEnabled(true);
                //this.vista.ComboMercaderias.setEnabled(true);
                this.vista.CANTIDAD.setEnabled(true);
                this.vista.BotonAgregardetalle.setEnabled(true);
                this.vista.CANCELAR.setEnabled(true);
                this.vista.AgregarVentas.setEnabled(false);
                this.vista.SALIR.setEnabled(false);
                this.modelo.generar_codigo();
                this.vista.CampoCodigo.setText(this.modelo.Nro_Factura);
                break;
            case GUARDAR:
                 this.vista.CampoCodigo.setText(this.modelo.Nro_Factura);
                  this.modelo.generar_codigo();
              //  String tipofactura[] = this.vista.ComboTipoFactura.getSelectedItem().toString().split("-");
                int cantidadMercaderias = this.vista.TablaDetalle.getRowCount();
                JTable tabla3 = this.vista.TablaDetalle;
                if (this.modelo.RegistrarVenta(
                       this.vista.jTextField6.getText(),
                        this.vista.CampoFecha.getText(),
                        this.vista.CampoTotal.getText(),
                        "1",
                        this.vista.jTextField1.getText(),
                        this.vista.CodFuncionario.getText()
                        // this.vista.CODSERVICIO.getText()
                        //tipofactura[0].trim()
                )) {
                    for (int i = 0; i < cantidadMercaderias; i++) {
                        String codigoMercadria = tabla3.getValueAt(i, 0).toString();
                        this.modelo.RegistrarDetalleVenta(codigoMercadria);
                    }
                    JOptionPane.showMessageDialog(vista, "Exito: Nuevo registro agregado.");
                    // this.modelo.Reportes("recepcionprenda", this.vista.TablaDetalle, this.vista.CampoCodigo.getText(),
                        //    this.vista.CampoFecha.getText(), this.vista.CampoTotal.getText(); 
                            //this.vista.ComboTipoFactura.getSelectedItem().toString());
                } 
                else {
                    JOptionPane.showMessageDialog(vista, "Error: Los datos son incorrectos.");
                }
                deshabilitaBotones();
                limpiarcampos();
                break;
            case CANCELAR:
                deshabilitaBotones();
                break;
            case SALIR:
                this.vista.dispose();
                break;
            case AGREGAR_DETALLE:
                JTable tabla = this.vista.TablaDetalle;
                String totalgeneral = this.vista.CampoTotal.getText();
                if (this.modelo.cargarDatos(this.vista.CODSERVICIO.getText().trim(),this.vista.SERVICIO.getText().trim(),this.vista.jTextField2.getText().trim(),this.vista.CANTIDAD.getText(), tabla, totalgeneral)) {
                    this.vista.CampoTotal.setText(String.valueOf(this.modelo.totales3));
                } else {
                    JOptionPane.showMessageDialog(vista, "La mercaderia ya existe en el detalle..", "AtenciÃ³n",
                            JOptionPane.WARNING_MESSAGE);
                }
                this.vista.BotonEliminardetalle.setEnabled(true);
                this.vista.Guardar.setEnabled(true);
                limpia();
                break;
            case ELIMINAR_DETALLE:
                JTable tabla2 = this.vista.TablaDetalle;
                javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tabla2.getModel();
                int indice = tabla2.getSelectedRow();
                if (indice == -1) {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado el Detalle a borrar..",
                            "AtenciÃ³n", JOptionPane.WARNING_MESSAGE);
                } else {
                    String totales = (tabla2.getValueAt(indice, 4).toString());
                    int totales2 = Integer.parseInt(totales);
                    int totales3 = Integer.parseInt(this.vista.CampoTotal.getText());
                    int totales4 = totales3 - totales2;
                    this.vista.CampoTotal.setText(String.valueOf(totales4));
                    dtm.removeRow(indice);
                }
                int nro_fila = tabla2.getRowCount();
                if (nro_fila == 0) {
                    this.vista.BotonEliminardetalle.setEnabled(false);
                    this.vista.Guardar.setEnabled(false);
                }
                break;
        }
    }
    private void limpiar() {
        int totales = 0;
        this.vista.CampoCodigo.setText("");
        this.vista.CANTIDAD.setText("");
        this.vista.CampoTotal.setText(String.valueOf(totales));
        //limpiar tabla
        this.vista.TablaDetalle.selectAll();
        int[] L = this.vista.TablaDetalle.getSelectedRows();
        javax.swing.table.DefaultTableModel dtm =
                (javax.swing.table.DefaultTableModel) this.vista.TablaDetalle.getModel();
        for (int i = L.length - 1; i >= 0; --i) {
            dtm.removeRow(L[i]);
        }
    }
    public void limpiarcampos() {
        this.vista.jTextField2.setText("");
        this.vista.jTextField1.setText("");
        this.vista.jTextField2.setText("");
        this.vista.jTextField4.setText("");
        this.vista.jTextField5.setText("");
        this.vista.CODSERVICIO.setText("");
        this.vista.SERVICIO.setText("");
        this.vista.CANTIDAD.setText("");
        this.vista.jTextField6.setText("");
        this.vista.CodFuncionario.setText("");
        this.vista.NombreFuncionario.setText("");
    }
    public void limpia() {
        this.vista.jTextField2.setText("");
        this.vista.CODSERVICIO.setText("");
        this.vista.SERVICIO.setText("");
        this.vista.CANTIDAD.setText("");
    }
    private void deshabilitaBotones() {
      //  this.vista.ComboTipoFactura.setEnabled(false);
        this.vista.CANTIDAD.setEnabled(false);
        this.vista.BotonAgregardetalle.setEnabled(false);
        this.vista.BotonEliminardetalle.setEnabled(false);
        this.vista.Guardar.setEnabled(false);
        this.vista.CANCELAR.setEnabled(false);
        this.vista.AgregarVentas.setEnabled(true);
        this.vista.SALIR.setEnabled(true);
        limpiar();
    }
}