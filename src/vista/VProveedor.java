package vista;
import vista.*;
import controlador.*;
/**
 *
 * @author Pablo Santander <santander_2220@hotmail.com>
 */
public class VProveedor extends javax.swing.JFrame {
 static String Id= "";
 static String Cliente= "";
 static String ciudad="";
    /**
     * Creates new form VBarrio
     */
    public VProveedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaConsulta = new javax.swing.JTable();
        CampoBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Seleccionar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CampoCodigo = new javax.swing.JTextField();
        CampoDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        codciudad = new javax.swing.JTextField();
        descriciudad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Informe = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        CampoDescripcion1 = new javax.swing.JTextField();
        CampoDescripcion2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CampoDescripcion4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CampoDescripcion5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proveedor");
        setMinimumSize(new java.awt.Dimension(1250, 500));
        getContentPane().setLayout(null);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTabbedPane1.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(108, 99, 255));
        jPanel1.setLayout(null);

        TablaConsulta.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        TablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaConsulta);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 50, 1150, 140);
        jPanel1.add(CampoBuscar);
        CampoBuscar.setBounds(990, 20, 190, 30);

        jLabel2.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(910, 20, 70, 30);

        Seleccionar.setFont(new java.awt.Font("Purisa", 3, 18)); // NOI18N
        Seleccionar.setText("Seleccionar");
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(Seleccionar);
        Seleccionar.setBounds(1020, 200, 150, 40);

        jTabbedPane1.addTab("Listado", jPanel1);

        jPanel2.setBackground(new java.awt.Color(108, 99, 255));
        jPanel2.setLayout(null);

        CampoCodigo.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jPanel2.add(CampoCodigo);
        CampoCodigo.setBounds(260, 30, 50, 30);

        CampoDescripcion.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jPanel2.add(CampoDescripcion);
        CampoDescripcion.setBounds(530, 30, 120, 30);

        jLabel3.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre- Razon Social");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(330, 30, 190, 30);

        jLabel5.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pagina Web");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(710, 80, 110, 30);

        codciudad.setEditable(false);
        codciudad.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jPanel2.add(codciudad);
        codciudad.setBounds(510, 80, 50, 30);

        descriciudad.setEditable(false);
        descriciudad.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jPanel2.add(descriciudad);
        descriciudad.setBounds(560, 80, 120, 30);

        jButton1.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jButton1.setText("Buscar Barrio");
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
        jPanel2.add(jButton1);
        jButton1.setBounds(350, 80, 160, 30);

        Guardar.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Guardar.setText("Guardar");
        jPanel2.add(Guardar);
        Guardar.setBounds(420, 130, 110, 40);

        Cancelar.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel2.add(Cancelar);
        Cancelar.setBounds(550, 180, 120, 40);

        Informe.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Informe.setText("Informe");
        jPanel2.add(Informe);
        Informe.setBounds(690, 180, 110, 40);

        Modificar.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Modificar.setText("Modificar");
        jPanel2.add(Modificar);
        Modificar.setBounds(550, 130, 120, 40);

        Eliminar.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Eliminar.setText("Eliminar");
        jPanel2.add(Eliminar);
        Eliminar.setBounds(690, 130, 110, 40);

        nuevo.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        jPanel2.add(nuevo);
        nuevo.setBounds(420, 180, 110, 40);

        jLabel4.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(830, 30, 90, 30);

        CampoDescripcion1.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        CampoDescripcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDescripcion1ActionPerformed(evt);
            }
        });
        jPanel2.add(CampoDescripcion1);
        CampoDescripcion1.setBounds(740, 30, 90, 30);

        CampoDescripcion2.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jPanel2.add(CampoDescripcion2);
        CampoDescripcion2.setBounds(920, 30, 80, 30);

        jLabel7.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CI-RUC");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(660, 30, 70, 30);

        jLabel8.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(140, 80, 50, 30);

        CampoDescripcion4.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jPanel2.add(CampoDescripcion4);
        CampoDescripcion4.setBounds(190, 80, 130, 30);

        jLabel9.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Codigo");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(200, 30, 60, 30);

        CampoDescripcion5.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        jPanel2.add(CampoDescripcion5);
        CampoDescripcion5.setBounds(810, 80, 240, 30);

        jTabbedPane1.addTab("Registro", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 60, 1200, 280);

        jLabel1.setFont(new java.awt.Font("Purisa", 1, 18)); // NOI18N
        jLabel1.setText("Proveedores");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 20, 160, 30);

        Salir.setFont(new java.awt.Font("Purisa", 1, 14)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir);
        Salir.setBounds(1100, 350, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
        Id= this.CampoCodigo.getText();
        Cliente= this.CampoDescripcion.getText();
        ciudad=this.CampoDescripcion1.getText();
        dispose();
    }//GEN-LAST:event_SeleccionarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

           this.Guardar.setEnabled(true);        
        new CBarrio(new VBarrio()).iniciar(); 
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
       this.codciudad.setText(VBarrio.Id);
       this.descriciudad.setText(VBarrio.Cliente);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1FocusGained

    private void TablaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaConsultaMouseClicked
this.Guardar.setEnabled(false);
  this.Modificar.setEnabled(true);
      this.Eliminar.setEnabled(true);
      this.Cancelar.setEnabled(true);
      this.CampoDescripcion.setEnabled(true);
       this.CampoDescripcion1.setEnabled(true);
           this.CampoDescripcion2.setEnabled(true);
           this.CampoDescripcion4.setEnabled(true);
           this.CampoDescripcion5.setEnabled(true);
      this.codciudad.setEnabled(true);
       this.descriciudad.setEnabled(true);
      this.nuevo.setEnabled(false);
       this.jButton1.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_TablaConsultaMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
           this.nuevo.setEnabled(false);
           this.Cancelar.setEnabled(true);
           this.CampoDescripcion.setEnabled(true);
           this.CampoDescripcion1.setEnabled(true);
           this.CampoDescripcion2.setEnabled(true);
           this.CampoDescripcion4.setEnabled(true);
           this.CampoDescripcion5.setEnabled(true);
           this.jButton1.setEnabled(true);
           this.CampoDescripcion.requestFocus();
// TODO add your handling code here:
    }//GEN-LAST:event_nuevoActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
           this.Modificar.setEnabled(false);
          this.Eliminar.setEnabled(false);
           this.Cancelar.setEnabled(false);
           this.Guardar.setEnabled(false);
            this.nuevo.setEnabled(true);
 this.jButton1.setEnabled(false);
  this.CampoDescripcion.setEnabled(false);
this.CampoDescripcion1.setEnabled(false);
this.CampoDescripcion2.setEnabled(false);
this.CampoDescripcion4.setEnabled(false);
this.CampoDescripcion5.setEnabled(false);
// TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void CampoDescripcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDescripcion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDescripcion1ActionPerformed

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
            java.util.logging.Logger.getLogger(VProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
 new CProveedor(new VProveedor()).iniciar();   }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CampoBuscar;
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoDescripcion;
    public javax.swing.JTextField CampoDescripcion1;
    public javax.swing.JTextField CampoDescripcion2;
    public javax.swing.JTextField CampoDescripcion4;
    public javax.swing.JTextField CampoDescripcion5;
    public javax.swing.JButton Cancelar;
    public javax.swing.JButton Eliminar;
    public javax.swing.JButton Guardar;
    public javax.swing.JButton Informe;
    public javax.swing.JButton Modificar;
    public javax.swing.JButton Salir;
    private javax.swing.JButton Seleccionar;
    public javax.swing.JTable TablaConsulta;
    public javax.swing.JTextField codciudad;
    public javax.swing.JTextField descriciudad;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JButton nuevo;
    // End of variables declaration//GEN-END:variables
}
