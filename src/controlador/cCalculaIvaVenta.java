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
public class cCalculaIvaVenta implements ActionListener {
 VAcceso vista;
    public static  String basura="",usu,idFactura="",apertura="";
public static int total;
    vCalculaIvaVenta Vista;
	cApertura med;
    mCalculaIvaVenta Modelo = new mCalculaIvaVenta();
Macceso modelo = new Macceso();
    public enum AccionMVC {
        AGREGAR,
        GUARDAR,
        CANCELAR,
        SALIR,
        AGREGAR_DETALLE,
        ELIMINAR_DETALLE
    }
    public cCalculaIvaVenta(vCalculaIvaVenta Vista) {
        this.Vista = Vista;
    }
    public void iniciar() {
        //  this.Vista.jComboBox2.setEnabled(false);
       // this.Vista.jComboBox2.setModel(this.Modelo.getListaTipoFacturas());
       //  this.Modelo.generar_timbrado();
	//this.Vista.CampoCodigo7.setText(this.med.idApertura);	
	//this.Vista.CampoCodigo5.setText(this.Modelo.id);	
	//this.Vista.CampoCodigo6.setText(this.Modelo.nro);
	//usu=this.Vista.CampoCodigo1.getText();
      //  this.Vista.jTextField1.setText("0.0");
//        basura=this.Vista.CampoCodigo.getText();
        this.Vista.jComboBox1.setEnabled(true);
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
        this.Vista.setLocationRelativeTo(null);
        this.Vista.Guardar.setEnabled(false);
        Vista.setVisible(true);
        this.Vista.Guardar.setActionCommand("GUARDAR");
        this.Vista.Guardar.addActionListener(this);
        this.Vista.SALIR.setActionCommand("SALIR");
        this.Vista.SALIR.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        switch (cCalculaIvaVenta.AccionMVC.valueOf(e.getActionCommand())) {
            case AGREGAR:
     //   this.Vista.jComboBox2.setModel(this.Modelo.getListaTipoFacturas());
                this.Vista.jComboBox1.setEnabled(true);
                this.Vista.SALIR.setEnabled(false);
                this.Modelo.generar_codigo();
//                this.Vista.CampoCodigo.setText(this.Modelo.Nro_Factura);
              //this.Vista.jComboBox2.setEnabled(true);
                break;
            case GUARDAR:
              //   this.Vista.CampoCodigo.setText(this.Modelo.Nro_Factura);
                  this.Modelo.generar_codigo();
                String tipofactura[] = this.Vista.jComboBox1.getSelectedItem().toString().split("-");
              //  int cantidadMercaderias = this.Vista.TablaDetalle.getRowCount();
               // JTable tabla3 = this.Vista.TablaDetalle;
                int basura=Integer.parseInt(tipofactura[0].trim());
                if (this.Modelo.RegistrarVenta(
                      tipofactura[0].trim()
                )) { this.Vista.jTextField8.setText(Modelo.ivaVenta);
                 this.Vista.jTextField9.setText(Modelo.ivaCredito);
                this.Vista.jTextField11.setText(Modelo.ivaDebito);
                this.Vista.jTextField12.setText(Modelo.totaliva1);
                } 
                break;
            
            case SALIR:
                this.Vista.dispose();
                break;
        }
    }

    
    
}