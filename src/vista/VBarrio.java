/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.CBarrio;
import controlador.CCiudad;
import vista.VCiudad;
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VBarrio extends javax.swing.JFrame {
 static String Id= "";
 static String Cliente= "";
 static String Idciudad="";
 static String ciudad="";
    /**
     * Creates new form VBarrio
     */
    public VBarrio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jLabel1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1220, 480));
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
        jScrollPane1.setBounds(30, 50, 1150, 170);
        jPanel1.add(CampoBuscar);
        CampoBuscar.setBounds(990, 20, 190, 30);

        jLabel2.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(920, 20, 60, 30);

        Seleccionar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Seleccionar.setText("Seleccionar");
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(Seleccionar);
        Seleccionar.setBounds(1020, 220, 150, 40);

        jTabbedPane1.addTab("Listado", jPanel1);

        jPanel2.setBackground(new java.awt.Color(108, 99, 255));
        jPanel2.setLayout(null);

        CampoCodigo.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jPanel2.add(CampoCodigo);
        CampoCodigo.setBounds(320, 30, 50, 30);

        CampoDescripcion.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jPanel2.add(CampoDescripcion);
        CampoDescripcion.setBounds(370, 30, 170, 30);

        jLabel3.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Barrio");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(270, 30, 50, 30);

        jLabel5.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ciudad");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(550, 30, 50, 30);

        codciudad.setEditable(false);
        codciudad.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jPanel2.add(codciudad);
        codciudad.setBounds(600, 30, 50, 30);

        descriciudad.setEditable(false);
        descriciudad.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jPanel2.add(descriciudad);
        descriciudad.setBounds(650, 30, 170, 30);

        jButton1.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jButton1.setText("Buscar Ciudad");
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
        jButton1.setBounds(820, 30, 140, 30);

        Guardar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Guardar.setText("Guardar");
        jPanel2.add(Guardar);
        Guardar.setBounds(440, 70, 100, 40);

        Cancelar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel2.add(Cancelar);
        Cancelar.setBounds(570, 120, 100, 40);

        Informe.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Informe.setText("Informe");
        jPanel2.add(Informe);
        Informe.setBounds(700, 120, 100, 40);

        Modificar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Modificar.setText("Modificar");
        jPanel2.add(Modificar);
        Modificar.setBounds(570, 70, 100, 40);

        Eliminar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Eliminar.setText("Eliminar");
        jPanel2.add(Eliminar);
        Eliminar.setBounds(700, 70, 100, 40);

        nuevo.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        jPanel2.add(nuevo);
        nuevo.setBounds(440, 120, 100, 40);

        jTabbedPane1.addTab("Registro", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 60, 1200, 310);

        jLabel1.setFont(new java.awt.Font("Purisa", 1, 18)); // NOI18N
        jLabel1.setText("Registrar Barrios");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(540, 20, 170, 30);

        Salir.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir);
        Salir.setBounds(1100, 380, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
        Id= this.CampoCodigo.getText();
        Cliente= this.CampoDescripcion.getText();
      //  Idciudad=this.codciudad.getText();
        ciudad=this.descriciudad.getText();
        dispose();
    }//GEN-LAST:event_SeleccionarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new CCiudad(new VCiudad()).iniciar(); 
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
       this.codciudad.setText(VCiudad.Cod);
       this.descriciudad.setText(VCiudad.Cargo);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1FocusGained

    private void TablaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaConsultaMouseClicked
this.Guardar.setEnabled(false);
  this.Modificar.setEnabled(true);
      this.Eliminar.setEnabled(true);
      this.Cancelar.setEnabled(true);
      this.CampoDescripcion.setEnabled(true);
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
           this.Guardar.setEnabled(true);
           this.CampoDescripcion.setEnabled(true);
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


// TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(VBarrio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VBarrio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VBarrio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VBarrio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
 new CBarrio(new VBarrio()).iniciar();   }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CampoBuscar;
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoDescripcion;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JButton nuevo;
    // End of variables declaration//GEN-END:variables
}