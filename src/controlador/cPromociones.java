package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.*;
import vista.*;
public class cPromociones implements ActionListener {
 VAcceso vista;
 vPromociones Vista;
    mPromociones Modelo = new mPromociones();
Macceso modelo = new Macceso();
    public enum AccionMVC {
        AGREGAR,
        GUARDAR,
        CANCELAR,
        SALIR,
        AGREGAR_DETALLE,
        ELIMINAR_DETALLE
    }

    public cPromociones(vPromociones Vista) {
        this.Vista = Vista;
    }
    public void iniciar() {
	int d1,  m1, a1;
	String d2,m2, a2,fecha,fecha1,f;
           Calendar cal=Calendar.getInstance();
           a1=cal.get(Calendar.YEAR);
           m1=cal.get(Calendar.MONTH);
           d1=cal.get(Calendar.DAY_OF_MONTH);
	   d2=String.valueOf(d1);
	f=String.valueOf(m1+1);
	m2=String.valueOf(m1);
	 a2=String.valueOf(a1);
	 fecha=(a1+"-"+(m1)+"-"+d2);
	 fecha1=(a1+"-"+(f)+"-"+d2);
	 this.Vista.CampoFecha.setText(fecha);
	 this.Vista.jTextField4.setText(fecha1);
           //System.out.println("dia: "+d1+" mes:"+m1+" año:"+a1); 
        this.Vista.CampoCodigo1.setText(this.modelo.nivel);
        this.Vista.CampoCodigo2.setText(this.modelo.nombre);
        //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        //Date currentDate = new Date();
        //String lastdate = formatter.format(currentDate);
        
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
        switch (cPromociones.AccionMVC.valueOf(e.getActionCommand())) {
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
                 this.Vista.CampoCodigo.setText(this.Modelo.Nro_Factura);
                  this.Modelo.generar_codigo();
              //  String tipofactura[] = this.vista.ComboTipoFactura.getSelectedItem().toString().split("-");
                int cantidadMercaderias = this.Vista.TablaDetalle.getRowCount();
                JTable tabla3 = this.Vista.TablaDetalle;
                if (this.Modelo.Registrar(
                      this.Vista.CampoCodigo.getText(),
                        this.Vista.CampoFecha.getText(),
                        this.Vista.jTextField4.getText(),
                       this.Vista.campoDescri.getText(),
                        this.Vista.CampoCodigo1.getText()
                        // this.vista.CODSERVICIO.getText()
                        //tipofactura[0].trim()
                )) {
                    for (int i = 0; i < cantidadMercaderias; i++) {
                        String codigoMercadria = tabla3.getValueAt(i,0).toString();
                         String descri = tabla3.getValueAt(i,1).toString();
                        String precio =  tabla3.getValueAt(i,2).toString();
                        String cantidad =  tabla3.getValueAt(i,3).toString();
                        String promo =  tabla3.getValueAt(i,4).toString();
                        String preciopromo =  tabla3.getValueAt(i,5).toString();
                        
                        this.Modelo.RegistrarDetalle(codigoMercadria,descri,precio,cantidad, promo,preciopromo);
                    }
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
                case AGREGAR_DETALLE:
                JTable tabla = this.Vista.TablaDetalle;
            //   String totalgeneral = this.vista.CampoTotal.getText();
                if (this.Modelo.cargarDatos(this.Vista.CODSERVICIO.getText().trim(),this.Vista.SERVICIO.getText().trim(),this.Vista.CANTIDAD1.getText(),this.Vista.CANTIDAD.getText(), tabla)) {
                  //  this.vista.CampoTotal.setText(String.valueOf(this.modelo.totales3));
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
                  //  String totales = (tabla2.getValueAt(indice, 4).toString());
                 //   int totales2 = Integer.parseInt(totales);
               
               
                 
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
        javax.swing.table.DefaultTableModel dtm =
                (javax.swing.table.DefaultTableModel) this.Vista.TablaDetalle.getModel();
        for (int i = L.length - 1; i >= 0; --i) {
            dtm.removeRow(L[i]);
        }
    }

    public void limpiarcampos() {
        this.Vista.campoDescri.setText("");
        this.Vista.CampoCodigo.setText("");
        this.Vista.jTextField4.setText("");
        this.Vista.CODSERVICIO.setText("");
        this.Vista.SERVICIO.setText("");
        this.Vista.SeleccionarRecepcion.setEnabled(false);
    }
    
    public void limpia() {
        this.Vista.CODSERVICIO.setText("");
        this.Vista.SERVICIO.setText("");
        this.Vista.CANTIDAD1.setText("");
        this.Vista.CANTIDAD.setText("");
    }
    private void deshabilitaBotones() {
      //  this.vista.ComboTipoFactura.setEnabled(false);
        this.Vista.BotonAgregardetalle.setEnabled(false);
        this.Vista.BotonEliminardetalle.setEnabled(false);
        this.Vista.Guardar.setEnabled(false);
        this.Vista.Cancelar.setEnabled(false);
        this.Vista.Nuevo.setEnabled(true);
        this.Vista.SALIR.setEnabled(true);
         this.Vista.BotonAgregardetalle.setEnabled(false);
        limpiar();
    }
}