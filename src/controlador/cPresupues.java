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

public class cPresupues implements ActionListener {

    VAcceso vista;
    //public static String basura = "";
    vPresupues  Vista;
    mPresupues  Modelo = new mPresupues ();
    Macceso modelo = new Macceso();

    public enum AccionMVC {

        AGREGAR,
        GUARDAR,
        CANCELAR,
        SALIR,
        AGREGAR_DETALLE,
        ELIMINAR_DETALLE
    }

    public cPresupues(vPresupues  Vista) {
        this.Vista = Vista;
    }

    public void iniciar() {
       // basura = this.Vista.CampoNumFac.getText();
     //   this.Vista.ComboTipoFact.setEnabled(false);
        this.Vista.TOTAL.setText(String.valueOf(0));
     //   this.Vista.ComboTipoFact.setModel(this.Modelo.getListaTipoFacturas());
        //this.Vista.CampoCodigo5.setText(this.vista.NumSucursal);
        // this.Vista.CampoCodigo6.setText(this.vista.sucursal);
        this.Vista.CampoCodigoUsu.setText(this.modelo.nivel);
        this.Vista.CampoCodigo2.setText(this.modelo.nombre);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        Date currentDate = new Date();
        String lastdate = formatter.format(currentDate);
        this.Vista.CampoFecha.setText(lastdate);

        this.Vista.setLocationRelativeTo(null);
        this.Vista.Guardar.setEnabled(false);
        this.Vista.Cancelar.setEnabled(false);
        this.Vista.Nuevo.setEnabled(true);
        this.Vista.Seleccionar.setEnabled(false);
        this.Vista.BotonEliminardetalle.setEnabled(false);
        this.Vista.BotonAgregardetalle.setEnabled(false);
        this.Vista.Seleccionar.setEnabled(false);
        Vista.setVisible(true);
        this.Vista.Nuevo.setActionCommand("AGREGAR");
        this.Vista.Nuevo.addActionListener(this);
        this.Vista.Guardar.setActionCommand("GUARDAR");
        this.Vista.Guardar.addActionListener(this);
       // this.Vista.jButton2.setEnabled(false);
        //  this.Vista.jButton3.setEnabled(false);
        this.Vista.Cancelar.setActionCommand("CANCELAR");
        this.Vista.Cancelar.addActionListener(this);

        this.Vista.SALIR.setActionCommand("SALIR");
        this.Vista.SALIR.addActionListener(this);

        this.Vista.BotonAgregardetalle.setActionCommand("AGREGAR_DETALLE");
        this.Vista.BotonAgregardetalle.addActionListener(this);

        this.Vista.BotonEliminardetalle.setActionCommand("ELIMINAR_DETALLE");
        this.Vista.BotonEliminardetalle.addActionListener(this);

        //this.vista.ComboTipoFactura.setModel(this.modelo.getListaTipoFacturas());
    }

    public void actionPerformed(ActionEvent e) {
        switch (cServicioRealizado.AccionMVC.valueOf(e.getActionCommand())) {
            case AGREGAR:
              //  this.Vista.ComboTipoFact.setEnabled(true);
                this.Vista.BotonAgregardetalle.setEnabled(true);
                this.Vista.Cancelar.setEnabled(true);
                this.Vista.Nuevo.setEnabled(false);
                this.Vista.SALIR.setEnabled(false);
                this.Modelo.generar_codigo();
                this.Vista.CampoCodigo.setText(this.Modelo.Nro_Factura);
                break;
            case GUARDAR:

                //this.Vista.CampoCodigo.setText(this.Modelo.Nro_Factura);
                // this.Modelo.generar_codigo();
               // String tipofactura[] = this.Vista.ComboTipoFact.getSelectedItem().toString().split("-");
                int cantidadMercaderias = this.Vista.TablaDetalle.getRowCount();
                JTable tabla3 = this.Vista.TablaDetalle;
                //int basura = Integer.parseInt(tipofactura[0].trim());
                if (this.Modelo.RegistrarVenta(
                        this.Vista.CampoCodigo.getText(),
                        this.Vista.CampoCodigoUsu.getText(),
                        this.Vista.CampoFecha.getText(),
                        this.Vista.CampoCod.getText()
                )) {
                    for (int i = 0; i < cantidadMercaderias; i++) {
                        String codigoMercadria = tabla3.getValueAt(i, 0).toString();
                        String cantidad = tabla3.getValueAt(i, 3).toString();
                        String precio = tabla3.getValueAt(i, 2).toString();
                        this.Modelo.RegistrarDetalleVenta(this.Vista.CampoCodigo.getText(), codigoMercadria, cantidad, precio);
                    }
                    JOptionPane.showMessageDialog(Vista, "Exito: Nuevo registro agregado.");
                 this.Modelo.Reportes("Presupuesto", this.Vista.TablaDetalle, 
                         this.Vista.CampoCodigo.getText(),
                         this.Vista.CampoCodigo2.getText(),
                       this.Vista.Cliente.getText(), 
                       this.Vista.ci.getText(), 
                       this.Vista.TOTAL.getText()); 
                } else {
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
            case AGREGAR_DETALLE:
                JTable tabla = this.Vista.TablaDetalle;
                String totalgeneral = this.Vista.TOTAL.getText();
                if (this.Modelo.cargarDatos(this.Vista.CODSERVICIO.getText().trim(), this.Vista.SERVICIO.getText().trim(), this.Vista.PRECIO.getText(), this.Vista.CANTIDAD.getText(), tabla, totalgeneral)) {
                    this.Vista.TOTAL.setText(String.valueOf(this.Modelo.totales3));
                  //  this.Vista.IVA.setText(String.valueOf(this.Modelo.iva));
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
                   int totales3=Integer.parseInt(this.Vista.TOTAL.getText());
                   int totales4 = totales3-totales2;
                   //int totalesiva = totales4/11;
                     this.Vista.TOTAL.setText(String.valueOf(totales4));
                  //   this.Vista.IVA.setText(String.valueOf(totalesiva));
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
      //  this.Vista.CampoNumFac.setText("");
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
     //   this.Vista.CampoCodOrden.setText("");
//       this.Vista.jTextField6.setText("");
       
        this.Vista.CODSERVICIO.setText("");
        this.Vista.SERVICIO.setText("");
        this.Vista.PRECIO.setText("");
        this.Vista.Seleccionar.setEnabled(false);
    }

    public void limpia() {
        this.Vista.CODSERVICIO.setText("");
        this.Vista.SERVICIO.setText("");
        this.Vista.PRECIO.setText("");
        this.Vista.CANTIDAD.setText("");
    }

    private void deshabilitaBotones() {
        this.Vista.BotonAgregardetalle.setEnabled(false);
        this.Vista.BotonEliminardetalle.setEnabled(false);
//        this.Vista.jButton3.setEnabled(false);
        this.Vista.Cancelar.setEnabled(false);
        this.Vista.Guardar.setEnabled(false);
        this.Vista.Cancelar.setEnabled(false);
        this.Vista.Nuevo.setEnabled(true);
        this.Vista.SALIR.setEnabled(true);
        this.Vista.BotonAgregardetalle.setEnabled(false);
        limpiar();
    }
}
