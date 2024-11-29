package vista;
import controlador.*;
import vista.*;
public class VGarantia extends javax.swing.JFrame {
    /**
     * Creates new form VProducto
     */
    public VGarantia() {
        initComponents(); 
    }
   // mRecepcionPrenda modelo = new mRecepcionPrenda();
    
       @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoCodigo = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        CampoFecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        CodServ = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        observacion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        CampoFecha1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orden de Trabajo");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });
        getContentPane().setLayout(null);

        CampoCodigo.setEditable(false);
        CampoCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(CampoCodigo);
        CampoCodigo.setBounds(320, 90, 80, 30);

        Cancelar.setBackground(new java.awt.Color(0, 51, 255));
        Cancelar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("CANCELAR  ");
        getContentPane().add(Cancelar);
        Cancelar.setBounds(360, 210, 220, 40);

        Guardar.setBackground(new java.awt.Color(0, 51, 255));
        Guardar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setText("GUARDAR");
        getContentPane().add(Guardar);
        Guardar.setBounds(870, 210, 230, 40);

        Nuevo.setBackground(new java.awt.Color(0, 51, 255));
        Nuevo.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(Nuevo);
        Nuevo.setBounds(620, 210, 210, 40);

        SALIR.setBackground(new java.awt.Color(102, 51, 255));
        SALIR.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        getContentPane().add(SALIR);
        SALIR.setBounds(110, 210, 220, 43);

        CampoFecha.setEditable(false);
        CampoFecha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFechaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoFecha);
        CampoFecha.setBounds(1030, 30, 110, 30);

        jLabel2.setFont(new java.awt.Font("Purisa", 0, 24)); // NOI18N
        jLabel2.setText("Garantia");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 30, 180, 30);

        jLabel18.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel18.setText("Observacion");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(620, 160, 70, 30);

        CodServ.setEditable(false);
        getContentPane().add(CodServ);
        CodServ.setBounds(280, 160, 50, 30);

        jLabel3.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel3.setText("Codigo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 130, 60, 40);

        jLabel4.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel4.setText("Marca Equipo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 130, 80, 40);

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(330, 160, 120, 30);

        jButton1.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jButton1.setText("Servicio Realizado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });
        jButton1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButton1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 160, 180, 30);

        jTextField3.setEditable(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(450, 160, 160, 30);

        jLabel7.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel7.setText("Codigo Servicio Realizado");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(460, 140, 150, 20);

        observacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacionActionPerformed(evt);
            }
        });
        getContentPane().add(observacion);
        observacion.setBounds(700, 160, 390, 30);

        jLabel20.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel20.setText("Fecha Vencimiento");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(420, 90, 120, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(710, 90, 50, 30);

        jTextField5.setEditable(false);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(760, 90, 90, 30);

        jLabel21.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel21.setText("Codigo");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(270, 90, 50, 30);

        CampoFecha1.setEditable(false);
        CampoFecha1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoFecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFecha1ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoFecha1);
        CampoFecha1.setBounds(530, 90, 110, 30);

        jLabel22.setFont(new java.awt.Font("Purisa", 0, 10)); // NOI18N
        jLabel22.setText("Usuario");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(660, 90, 50, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
 this.jButton1.setEnabled(true);
 this.observacion.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_NuevoActionPerformed

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
            
    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
    }//GEN-LAST:event_formWindowActivated

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_SALIRActionPerformed

    private void Funcionario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Funcionario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Funcionario3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.Guardar.setEnabled(true);
        new CBuscaServicioRealizado(new VBuscaServicioRealizado()).iniciar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
      this.CodServ.setText(VBuscaServicioRealizado.Id);
      this.jTextField2.setText(VBuscaServicioRealizado.Cliente);
	this.jTextField3.setText(VBuscaServicioRealizado.Id1);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1FocusGained

    private void CampoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaActionPerformed

    private void jButton1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1AncestorAdded

    private void observacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observacionActionPerformed

    private void CampoFecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFecha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFecha1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CGarantia(new VGarantia()).iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoFecha;
    public javax.swing.JTextField CampoFecha1;
    public javax.swing.JButton Cancelar;
    public javax.swing.JTextField CodServ;
    public javax.swing.JButton Guardar;
    public javax.swing.JButton Nuevo;
    public javax.swing.JButton SALIR;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField observacion;
    // End of variables declaration//GEN-END:variables
}
