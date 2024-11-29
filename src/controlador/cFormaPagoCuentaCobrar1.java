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
public class cFormaPagoCuentaCobrar1 implements ActionListener {
 VAcceso vista;
 VBuscaCuentaCobrar1 dfd;
 cAperturaCierreArqueo apertura;
 MenuPrincipal.MenuPrincipalCajero venta;
    vFormaPagoCuentaCobrar1 Vista;
    mFormaPagoCuentaCobrar1 Modelo = new mFormaPagoCuentaCobrar1();
Macceso modelo = new Macceso();
    public enum AccionMVC {
        AGREGAR,
        GUARDAR,
        CANCELAR,
        SALIR,
        AGREGAR_DETALLE,
        ELIMINAR_DETALLE
    }
    public cFormaPagoCuentaCobrar1(vFormaPagoCuentaCobrar1 Vista) {
        this.Vista = Vista;
    }
    public void iniciar() {
	this.Vista.jTextField4.setText(String.valueOf(dfd.Id1));
	this.Vista.jTextField3.setText(apertura.idAperturaCaja);
	this.Vista.CampoCodigo1.setText(dfd.sd);
        this.Vista.jTextField1.setText(this.modelo.nivel);
         this.Vista.jTextField2.setText(this.modelo.nombre);
	//this.Vista.jTextField4.setText(String.valueof(this.venta.total));
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
        //this.Vista.jButton2.setEnabled(false);  
        this.Vista.Cancelar.setActionCommand("CANCELAR");
        this.Vista.Cancelar.addActionListener(this);
        this.Vista.jComboBox2.setEnabled(false);
        //this.Vista.jComboBox1.setEnabled(false);
        this.Vista.jComboBox2.setModel(this.Modelo.getForamaCobro());
       // this.Vista.jComboBox1.setModel(this.Modelo.getCaja());
        this.Vista.SALIR.setActionCommand("SALIR");
        this.Vista.SALIR.addActionListener(this);
        //this.vista.ComboTipoFactura.setModel(this.modelo.getListaTipoFacturas());
    }
    public void actionPerformed(ActionEvent e) {
        switch (cFormaPagoCuentaCobrar1.AccionMVC.valueOf(e.getActionCommand())) {
            case AGREGAR:
                this.Vista.CampoCodigo1.setText(dfd.sd);
		this.Vista.Guardar.setEnabled(true);
		 this.Vista.Cancelar.setEnabled(true);		
               // this.vista.ComboTipoFact.setEnabled(true);
                //this.vista.ComboMercaderias.setEnabled(true);
                this.Vista.Cancelar.setEnabled(true);
                this.Vista.Nuevo.setEnabled(false);
                this.Vista.SALIR.setEnabled(false);
                this.Modelo.generar_codigo();
                this.Vista.CampoCodigo.setText(this.Modelo.Nro_Factura);
	//	this.Vista.jTextField4.setText(String.valueOf(this.venta.total));
        this.Vista.jComboBox2.setEnabled(true);
        //this.Vista.jComboBox1.setEnabled(true);
                break;
            case GUARDAR:
                 this.Vista.CampoCodigo.setText(this.Modelo.Nro_Factura);
                  this.Modelo.generar_codigo();
             String caja[] = this.Vista.jComboBox2.getSelectedItem().toString().split("-");
              //String forma[] = this.Vista.jComboBox2.getSelectedItem().toString().split("-");
                if (this.Modelo.RegistrarVenta(
                      this.Vista.CampoCodigo.getText(),
                        this.Vista.CampoFecha.getText(),
                        this.Vista.CampoCodigo2.getText(),
                        this.Vista.jTextField3.getText(),
                     this.Vista.jTextField1.getText(),
		this.Vista.CampoCodigo1.getText(),			 
                     this.Vista.jTextField4.getText(),			 
                     this.Vista.CampoCodigo1.getText()
                )) {
                       int ban=Integer.parseInt(caja[0].trim());
		if(ban<6){ String codigoMercadria = this.Vista.CampoCodigo.getText();
                        String canti =  caja[0].trim();
			String sdf=this.Vista.jTextField4.getText();
                         this.Modelo.RegistrarDetalle(codigoMercadria,canti,sdf);
			}                    
                    JOptionPane.showMessageDialog(Vista, "Exito: Nuevo registro agregado.");
                    this.Vista.dispose();
		              //   this.Modelo.Reportes("FormaCobro", this.Vista.CampoCodigo.getText(), this.Vista.CampoCodigo1.getText(),
          //           this.Vista.CampoCodigo2.getText(), this.Vista.jComboBox1.getSelectedItem().toString(), this.Vista.jTextField4.getText(),
                //     this.Vista.jTextField5.getText() ,  this.Vista.jComboBox2.getSelectedItem().toString()); 
                } 
                else {
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
        }    }
    private void limpiar() {
        int totales = 0;
        this.Vista.CampoCodigo.setText("");
        //limpiar tabla
    }
    public void limpiarcampos() {
        this.Vista.jTextField3.setText("");
        this.Vista.jTextField4.setText("");
      //  this.Vista.jTextField5.setText("");
        this.Vista.CampoCodigo1.setText("");
        this.Vista.CampoCodigo2.setText("");
    }
    private void deshabilitaBotones() {
       // this.Vista.jComboBox1.setEnabled(false);
        this.Vista.jComboBox2.setEnabled(false);
        this.Vista.Guardar.setEnabled(false);
        this.Vista.Cancelar.setEnabled(false);
        this.Vista.Nuevo.setEnabled(true);
        this.Vista.SALIR.setEnabled(true);
       // this.Vista.jButton2.setEnabled(false);
        limpiar();
    }
}