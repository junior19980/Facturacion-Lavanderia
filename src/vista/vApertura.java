package vista;
import controlador.*;
import modelo.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
public class vApertura extends javax.swing.JFrame  implements Runnable  {
         String hora,minutos,segundos,ampm;
		 public static String  moo;
     Thread h1;
  public void calcula () {        
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        if(ampm.equals("PM")){
            int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
            hora = h>9?""+h:"0"+h;
        }else{
            hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);            
        }
            minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
            segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND); 
    }
      public void run(){
            Date date = new Date();
        Thread ct = Thread.currentThread();
        while(ct == h1) {   
                calcula();
              //  CampoHoraArqueo.setText(hora + ":" + minutos);
           //      CampoHoraCierre.setText(hora + ":" + minutos);
                  CampoHoraApertura.setText(hora + ":" + minutos);
                  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        Date currentDate = new Date();
        String lastdate = formatter.format(currentDate);
        this.CampoFechaApertura.setText(lastdate);
        //this.CampoFechaCierre.setText(lastdate);
        //this.CampoFechaArqueo.setText(lastdate);
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e) {}
        }
    }
   VAcceso  Vista;
   mAperturaCierreArqueo modelo = new mAperturaCierreArqueo();
    public vApertura() {
         initComponents();
            h1 = new Thread(this);
            h1.start();
            setLocationRelativeTo(null);//para centrar la ventana
            setVisible(true);
            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanelApertura = new javax.swing.JPanel();
        ComboCaja = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CampoFechaApertura = new javax.swing.JTextField();
        CampoHoraApertura = new javax.swing.JTextField();
        CampoMontoApertura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Abrir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        CampoMontoApertura1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CampoCodigoApertura = new javax.swing.JTextField();
        Salir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        CampoCodigoUsuario = new javax.swing.JTextField();
        CampoNombreUsuario = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1170, 480));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jTabbedPane2.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N

        jPanelApertura.setBackground(new java.awt.Color(108, 99, 255));
        jPanelApertura.setForeground(new java.awt.Color(204, 204, 204));
        jPanelApertura.setName(""); // NOI18N
        jPanelApertura.setLayout(null);

        ComboCaja.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        ComboCaja.setForeground(new java.awt.Color(0, 0, 255));
        jPanelApertura.add(ComboCaja);
        ComboCaja.setBounds(220, 130, 160, 40);

        jLabel2.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel2.setText("Punto Expedicion:");
        jPanelApertura.add(jLabel2);
        jLabel2.setBounds(60, 120, 160, 40);

        jLabel3.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel3.setText("Fecha:");
        jPanelApertura.add(jLabel3);
        jLabel3.setBounds(480, 130, 60, 40);

        CampoFechaApertura.setEditable(false);
        CampoFechaApertura.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoFechaApertura.setForeground(new java.awt.Color(0, 0, 255));
        jPanelApertura.add(CampoFechaApertura);
        CampoFechaApertura.setBounds(550, 120, 160, 40);

        CampoHoraApertura.setEditable(false);
        CampoHoraApertura.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoHoraApertura.setForeground(new java.awt.Color(0, 0, 255));
        jPanelApertura.add(CampoHoraApertura);
        CampoHoraApertura.setBounds(780, 120, 160, 40);

        CampoMontoApertura.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoMontoApertura.setForeground(new java.awt.Color(0, 0, 255));
        CampoMontoApertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoMontoAperturaActionPerformed(evt);
            }
        });
        jPanelApertura.add(CampoMontoApertura);
        CampoMontoApertura.setBounds(780, 60, 160, 40);

        jLabel6.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel6.setText("Hora:");
        jPanelApertura.add(jLabel6);
        jLabel6.setBounds(720, 120, 70, 40);

        jLabel7.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel7.setText("Monto:");
        jPanelApertura.add(jLabel7);
        jLabel7.setBounds(720, 60, 80, 40);

        Abrir.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/facturas-de-papel.png"))); // NOI18N
        Abrir.setText("Abrir Caja");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        jPanelApertura.add(Abrir);
        Abrir.setBounds(900, 180, 140, 50);

        jLabel9.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel9.setText("Nro Factura Inicio:");
        jPanelApertura.add(jLabel9);
        jLabel9.setBounds(390, 60, 190, 40);

        CampoMontoApertura1.setEditable(false);
        CampoMontoApertura1.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoMontoApertura1.setForeground(new java.awt.Color(0, 0, 255));
        jPanelApertura.add(CampoMontoApertura1);
        CampoMontoApertura1.setBounds(550, 60, 160, 40);

        jLabel5.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel5.setText("Codigo Apertura:");
        jPanelApertura.add(jLabel5);
        jLabel5.setBounds(60, 60, 160, 40);

        CampoCodigoApertura.setEditable(false);
        CampoCodigoApertura.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoCodigoApertura.setForeground(new java.awt.Color(0, 0, 255));
        jPanelApertura.add(CampoCodigoApertura);
        CampoCodigoApertura.setBounds(220, 60, 160, 40);

        jTabbedPane2.addTab("Apertura Caja", jPanelApertura);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(0, 90, 1130, 290);

        Salir.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/salida (2).png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir);
        Salir.setBounds(1000, 380, 130, 40);

        jLabel11.setFont(new java.awt.Font("Purisa", 1, 24)); // NOI18N
        jLabel11.setText("Apertura Caja");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(420, 0, 230, 80);

        Cancelar.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/cancelar (2).png"))); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar);
        Cancelar.setBounds(850, 380, 140, 40);

        CampoCodigoUsuario.setEditable(false);
        CampoCodigoUsuario.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        getContentPane().add(CampoCodigoUsuario);
        CampoCodigoUsuario.setBounds(40, 50, 30, 30);

        CampoNombreUsuario.setEditable(false);
        CampoNombreUsuario.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoNombreUsuario.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(CampoNombreUsuario);
        CampoNombreUsuario.setBounds(70, 50, 140, 30);

        jLabel15.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel15.setText("Usuario:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(40, 20, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     //  this.Tabla_Consulta.setModel( this.modelo.getTabla() );
               ComboCaja.removeAllItems();
            //combo
          this.ComboCaja.setModel(this.modelo.getListaCaja());
         //combo
    }//GEN-LAST:event_formWindowActivated

    private void CampoMontoAperturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoMontoAperturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoMontoAperturaActionPerformed

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
moo=this.CampoMontoApertura.getText();
// TODO add your handling code here:
    }//GEN-LAST:event_AbrirActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vApertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vApertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vApertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vApertura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cApertura(new vApertura()) .iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Abrir;
    public javax.swing.JTextField CampoCodigoApertura;
    public javax.swing.JTextField CampoCodigoUsuario;
    public javax.swing.JTextField CampoFechaApertura;
    public javax.swing.JTextField CampoHoraApertura;
    public javax.swing.JTextField CampoMontoApertura;
    public javax.swing.JTextField CampoMontoApertura1;
    public javax.swing.JTextField CampoNombreUsuario;
    public javax.swing.JButton Cancelar;
    public javax.swing.JComboBox ComboCaja;
    public javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanelApertura;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}