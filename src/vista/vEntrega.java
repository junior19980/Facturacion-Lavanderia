/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import modelo.*;
import controlador.*;
import vista.*;
public class vEntrega extends javax.swing.JFrame {
    /**
     * Creates new form VProducto
     */
    public vEntrega() {
        initComponents(); 
    }
   // mRecepcionPrenda modelo = new mRecepcionPrenda();
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SALIR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        CampoCodigo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        CampoCodigo1 = new javax.swing.JTextField();
        CampoCodigo2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        CodRecepcion = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        CampoFecha = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        Cliente = new javax.swing.JTextField();
        Ci = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CODeQUIPO = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        BotonAgregardetalle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Descrp = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        BotonEliminardetalle = new javax.swing.JButton();
        Descrp1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario Entrega");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(720, 568));
        setPreferredSize(new java.awt.Dimension(720, 568));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });
        getContentPane().setLayout(null);

        SALIR.setBackground(new java.awt.Color(255, 255, 255));
        SALIR.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        SALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/cerrar-sesion (1).png"))); // NOI18N
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        getContentPane().add(SALIR);
        SALIR.setBounds(120, 490, 210, 40);

        jLabel2.setFont(new java.awt.Font("Purisa", 0, 24)); // NOI18N
        jLabel2.setText("Formulario Entrega");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 10, 260, 30);

        Cancelar.setBackground(new java.awt.Color(255, 255, 255));
        Cancelar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/cancelar.png"))); // NOI18N
        Cancelar.setText("CANCELAR  ");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar);
        Cancelar.setBounds(370, 490, 220, 40);

        Nuevo.setBackground(new java.awt.Color(255, 255, 255));
        Nuevo.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/nueva-pagina.png"))); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(Nuevo);
        Nuevo.setBounds(120, 450, 210, 40);

        CampoCodigo.setEditable(false);
        CampoCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(CampoCodigo);
        CampoCodigo.setBounds(150, 70, 50, 30);

        jLabel21.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel21.setText("Observacion");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(100, 110, 80, 30);

        jLabel20.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel20.setText("Nro Factura");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(250, 140, 80, 30);

        CampoCodigo1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo1ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo1);
        CampoCodigo1.setBounds(400, 60, 40, 30);

        CampoCodigo2.setEditable(false);
        CampoCodigo2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo2ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo2);
        CampoCodigo2.setBounds(440, 60, 110, 30);

        jButton2.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/buscando.png"))); // NOI18N
        jButton2.setText("Buscar Factura");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton2FocusGained(evt);
            }
        });
        jButton2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jButton2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 170, 180, 30);

        CodRecepcion.setEditable(false);
        CodRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodRecepcionActionPerformed(evt);
            }
        });
        getContentPane().add(CodRecepcion);
        CodRecepcion.setBounds(250, 170, 50, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(180, 110, 470, 30);

        CampoFecha.setEditable(false);
        CampoFecha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFechaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoFecha);
        CampoFecha.setBounds(490, 10, 110, 30);

        Guardar.setBackground(new java.awt.Color(255, 255, 255));
        Guardar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/guardar-el-archivo.png"))); // NOI18N
        Guardar.setText("GUARDAR");
        getContentPane().add(Guardar);
        Guardar.setBounds(370, 450, 220, 40);

        jLabel22.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel22.setText("Codigo");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(100, 70, 50, 30);

        Cliente.setEditable(false);
        getContentPane().add(Cliente);
        Cliente.setBounds(300, 170, 180, 30);

        Ci.setEditable(false);
        getContentPane().add(Ci);
        Ci.setBounds(480, 170, 170, 30);

        jLabel29.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel29.setText("Cliente ");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(340, 140, 90, 30);

        jLabel30.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel30.setText("CI o RUC");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(530, 140, 120, 30);

        jLabel26.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel26.setText("Usuario");
        getContentPane().add(jLabel26);
        jLabel26.setBounds(340, 60, 50, 30);

        jPanel3.setBackground(new java.awt.Color(108, 99, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        CODeQUIPO.setEditable(false);
        CODeQUIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODeQUIPOActionPerformed(evt);
            }
        });
        jPanel3.add(CODeQUIPO);
        CODeQUIPO.setBounds(10, 60, 90, 40);

        TablaDetalle.setBackground(new java.awt.Color(51, 255, 255));
        TablaDetalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        TablaDetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "PRENDA", "CANTIDAD"
            }
        ));
        TablaDetalle.setName(""); // NOI18N
        jScrollPane1.setViewportView(TablaDetalle);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 100, 640, 90);

        BotonAgregardetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        BotonAgregardetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/boton-agregar.png"))); // NOI18N
        BotonAgregardetalle.setText("AGREGAR");
        BotonAgregardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregardetalleActionPerformed(evt);
            }
        });
        jPanel3.add(BotonAgregardetalle);
        BotonAgregardetalle.setBounds(540, 60, 130, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                           DETALLE DE ENTREGA");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 0, 730, 30);

        Descrp.setEditable(false);
        jPanel3.add(Descrp);
        Descrp.setBounds(100, 60, 320, 40);

        jLabel15.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("  Codigo");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(30, 30, 60, 40);

        jLabel17.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Cantidad");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(440, 30, 80, 40);

        BotonEliminardetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        BotonEliminardetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/archivos.png"))); // NOI18N
        BotonEliminardetalle.setText("ELIMINAR DETALLE");
        BotonEliminardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminardetalleActionPerformed(evt);
            }
        });
        jPanel3.add(BotonEliminardetalle);
        BotonEliminardetalle.setBounds(10, 190, 180, 40);

        Descrp1.setEditable(false);
        jPanel3.add(Descrp1);
        Descrp1.setBounds(420, 60, 120, 40);

        jLabel18.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(" ");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(120, 30, 80, 40);

        jLabel19.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Descripcion Servicio Prenda");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(190, 30, 170, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 210, 680, 230);

        getAccessibleContext().setAccessibleName("Solicitud Cliente");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
this.jButton2.setEnabled(true);
        
 //this.BotonAgregardetalle.setEnabled(false);
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

    private void CampoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaActionPerformed

    private void jButton2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jButton2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2AncestorAdded

    private void jButton2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton2FocusGained
        this.CodRecepcion.setText(VBuscaFacturaEntrega.Id);
        this.Cliente.setText(VBuscaFacturaEntrega.Cliente5);
        this.Ci.setText(VBuscaFacturaEntrega.Cliente6);
     this.CODeQUIPO.setText(VBuscaFacturaEntrega.Cliente);
        this.Descrp.setText(VBuscaFacturaEntrega.Cliente1);
        this.Descrp1.setText(VBuscaFacturaEntrega.Cliente2);
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton2FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new CBuscaFacturaEntrega(new VBuscaFacturaEntrega()).iniciar();
//     this.SeleccionarServicio.setEnabled(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.jButton2.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarActionPerformed

    private void CampoCodigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigo2ActionPerformed

    private void CampoCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigo1ActionPerformed

    private void CodRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodRecepcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodRecepcionActionPerformed

    private void CODeQUIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODeQUIPOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CODeQUIPOActionPerformed

    private void BotonAgregardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregardetalleActionPerformed
        this.Guardar.setEnabled(true);
        this.BotonEliminardetalle.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAgregardetalleActionPerformed

    private void BotonEliminardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminardetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEliminardetalleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cEntrega(new vEntrega()).iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonAgregardetalle;
    public javax.swing.JButton BotonEliminardetalle;
    public javax.swing.JTextField CODeQUIPO;
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoCodigo1;
    public javax.swing.JTextField CampoCodigo2;
    public javax.swing.JTextField CampoFecha;
    public javax.swing.JButton Cancelar;
    public javax.swing.JTextField Ci;
    public javax.swing.JTextField Cliente;
    public javax.swing.JTextField CodRecepcion;
    public javax.swing.JTextField Descrp;
    public javax.swing.JTextField Descrp1;
    public javax.swing.JButton Guardar;
    public javax.swing.JButton Nuevo;
    public javax.swing.JButton SALIR;
    public javax.swing.JTable TablaDetalle;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
