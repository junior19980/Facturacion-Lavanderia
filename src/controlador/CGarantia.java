package controlador;
import modelo.*;
import vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
public class CGarantia implements ActionListener {
    VGarantia vista;
    MGarantia modelo = new MGarantia();
    public enum AccionMVC {
        AGREGAR,
        GUARDAR,
        CANCELAR,
        SALIR,
        AGREGAR_DETALLE,
        ELIMINAR_DETALLE
    }

    public CGarantia(VGarantia vista) {
        this.vista = vista;
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
	 this.vista.CampoFecha.setText(fecha);
	 this.vista.CampoFecha1.setText(fecha1);
	 
      //  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
       // Date currentDate = new Date();
    //    String lastdate = formatter.format(currentDate);
       
        this.vista.setLocationRelativeTo(null);
        this.vista.Guardar.setEnabled(false);
        this.vista.Cancelar.setEnabled(false);
        this.vista.Nuevo.setEnabled(true);
         this.vista.jButton1.setEnabled(false);
         this.vista.observacion.setEnabled(false);
        vista.setVisible(true);
        this.vista.Nuevo.setActionCommand("AGREGAR");
        this.vista.Nuevo.addActionListener(this);

        this.vista.Guardar.setActionCommand("GUARDAR");
        this.vista.Guardar.addActionListener(this);

        this.vista.Cancelar.setActionCommand("CANCELAR");
        this.vista.Cancelar.addActionListener(this);

        this.vista.SALIR.setActionCommand("SALIR");
        this.vista.SALIR.addActionListener(this);

        //this.vista.ComboTipoFactura.setModel(this.modelo.getListaTipoFacturas());
    }
    public void actionPerformed(ActionEvent e) {
        switch (CGarantia.AccionMVC.valueOf(e.getActionCommand())) {
                      case AGREGAR:
               // this.vista.ComboTipoFact.setEnabled(true);
                //this.vista.ComboMercaderias.setEnabled(true);
                this.vista.Cancelar.setEnabled(true);
                this.vista.Nuevo.setEnabled(false);
                this.vista.SALIR.setEnabled(false);
                this.modelo.generar_codigo();
                this.vista.CampoCodigo.setText(this.modelo.Nro_Factura);
                break;
					  case GUARDAR:
                 this.vista.CampoCodigo.setText(this.modelo.Nro_Factura);
                  this.modelo.generar_codigo();
              //  String tipofactura[] = this.vista.ComboTipoFactura.getSelectedItem().toString().split("-");
               
                if (this.modelo.RegistrarVenta(
                       //this.vista.Factura.getText(),
                       this.vista.CampoFecha.getText(),
                       this.vista.CampoFecha1.getText(),
                        this.vista.CodServ.getText(),
                         this.vista.jTextField4.getText(),
                         this.vista.observacion.getText()
                        // this.vista.CODSERVICIO.getText()
                        //tipofactura[0].trim()
                )) {
                   
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
                limpiarcampos();
                deshabilitaBotones();
                break;
            case SALIR:
                this.vista.dispose();
                break;
               
        }
    }
    private void limpiar() {
        int totales = 0;
        this.vista.CampoCodigo.setText("");
       
    }
    public void limpiarcampos() {
      //  this.vista.jTextField1.setText("");
   //     this.vista.jTextField2.setText("");
    //    this.vista.jTextField3.setText("");
    }
    private void deshabilitaBotones() {
        this.vista.Guardar.setEnabled(false);
        this.vista.Cancelar.setEnabled(false);
        this.vista.observacion.setEnabled(false);
        this.vista.Nuevo.setEnabled(true);
        this.vista.SALIR.setEnabled(true);
         this.vista.jButton1.setEnabled(false);
        limpiar();
    }
}