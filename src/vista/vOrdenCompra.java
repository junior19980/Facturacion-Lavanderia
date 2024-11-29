/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.*;
import controlador.*;
import vista.*;

public class vOrdenCompra extends javax.swing.JFrame {

    /**
     * Creates new form VProducto
     */
    public vOrdenCompra() {
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
        BotonEliminardetalle = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CODSERVICIO = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        BotonAgregardetalle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SERVICIO = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        CANTIDAD = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        CANTIDAD1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        CampoCodigo1 = new javax.swing.JTextField();
        CampoCodigo2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        SeleccionarPedidos = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orden de Compra");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1250, 630));
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
        CampoCodigo.setBounds(120, 80, 130, 30);

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
        Cancelar.setBounds(390, 540, 220, 40);

        Guardar.setBackground(new java.awt.Color(255, 255, 255));
        Guardar.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/guardar-el-archivo.png"))); // NOI18N
        Guardar.setText("GUARDAR");
        getContentPane().add(Guardar);
        Guardar.setBounds(890, 540, 230, 40);

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
        Nuevo.setBounds(640, 540, 210, 40);

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
        SALIR.setBounds(130, 540, 220, 43);

        CampoFecha.setEditable(false);
        CampoFecha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoFechaActionPerformed(evt);
            }
        });
        getContentPane().add(CampoFecha);
        CampoFecha.setBounds(440, 80, 130, 30);

        BotonEliminardetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        BotonEliminardetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/archivos.png"))); // NOI18N
        BotonEliminardetalle.setText("ELIMINAR DETALLE");
        BotonEliminardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminardetalleActionPerformed(evt);
            }
        });
        getContentPane().add(BotonEliminardetalle);
        BotonEliminardetalle.setBounds(10, 473, 180, 40);

        jLabel2.setFont(new java.awt.Font("Purisa", 0, 24)); // NOI18N
        jLabel2.setText("Formulario Oden Compra");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 10, 320, 30);

        jPanel3.setBackground(new java.awt.Color(108, 99, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        CODSERVICIO.setEditable(false);
        CODSERVICIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODSERVICIOActionPerformed(evt);
            }
        });
        jPanel3.add(CODSERVICIO);
        CODSERVICIO.setBounds(100, 50, 100, 40);

        TablaDetalle.setBackground(new java.awt.Color(51, 255, 255));
        TablaDetalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        TablaDetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "PRECIO", "CANTIDAD"
            }
        ));
        TablaDetalle.setName(""); // NOI18N
        jScrollPane1.setViewportView(TablaDetalle);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 1180, 160);

        BotonAgregardetalle.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        BotonAgregardetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/boton-agregar.png"))); // NOI18N
        BotonAgregardetalle.setText("AGREGAR");
        BotonAgregardetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregardetalleActionPerformed(evt);
            }
        });
        jPanel3.add(BotonAgregardetalle);
        BotonAgregardetalle.setBounds(1050, 50, 140, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                           DETALLES ORDEN COMPRA");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(270, 10, 670, 30);

        SERVICIO.setEditable(false);
        jPanel3.add(SERVICIO);
        SERVICIO.setBounds(290, 50, 270, 40);

        jLabel15.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("  Codigo");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(40, 50, 60, 40);

        jLabel16.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Precio ");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(570, 50, 60, 40);

        CANTIDAD.setEditable(false);
        jPanel3.add(CANTIDAD);
        CANTIDAD.setBounds(930, 50, 80, 40);

        jLabel17.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Descripcion");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(210, 50, 80, 40);

        CANTIDAD1.setEditable(false);
        jPanel3.add(CANTIDAD1);
        CANTIDAD1.setBounds(620, 50, 240, 40);

        jLabel18.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cantidad");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(870, 50, 70, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 200, 1200, 270);

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(120, 170, 50, 30);

        jTextField3.setEditable(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(440, 170, 180, 30);

        jLabel5.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel5.setText("Razon Social");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 140, 70, 40);

        jLabel6.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel6.setText("Id");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 140, 60, 40);

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 170, 270, 30);

        jLabel20.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel20.setText("Usuario");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(850, 20, 50, 30);

        CampoCodigo1.setEditable(false);
        CampoCodigo1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo1ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo1);
        CampoCodigo1.setBounds(900, 20, 40, 30);

        CampoCodigo2.setEditable(false);
        CampoCodigo2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigo2ActionPerformed(evt);
            }
        });
        getContentPane().add(CampoCodigo2);
        CampoCodigo2.setBounds(940, 20, 140, 30);

        jLabel21.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel21.setText("Fecha:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(400, 80, 60, 30);

        jLabel10.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel10.setText("Nro. Pedido");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(880, 130, 80, 30);

        jLabel11.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel11.setText("RUC");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(500, 140, 70, 40);

        jLabel22.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel22.setText(":");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(70, 80, 50, 30);

        jLabel23.setFont(new java.awt.Font("Purisa", 1, 10)); // NOI18N
        jLabel23.setText("Proveedor:");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(60, 170, 60, 30);

        SeleccionarPedidos.setFont(new java.awt.Font("Purisa", 1, 12)); // NOI18N
        SeleccionarPedidos.setText("Seleccionar Pedido Compra");
        SeleccionarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarPedidosActionPerformed(evt);
            }
        });
        SeleccionarPedidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SeleccionarPedidosFocusGained(evt);
            }
        });
        getContentPane().add(SeleccionarPedidos);
        SeleccionarPedidos.setBounds(680, 160, 190, 40);

        jTextField6.setEditable(false);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(870, 160, 90, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        this.BotonAgregardetalle.setEnabled(false);
        this.SeleccionarPedidos.setEnabled(true);

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

    private void BotonEliminardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminardetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEliminardetalleActionPerformed

    private void CODSERVICIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODSERVICIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CODSERVICIOActionPerformed

    private void Funcionario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Funcionario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Funcionario3ActionPerformed

    private void BotonAgregardetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregardetalleActionPerformed
        this.Guardar.setEnabled(true);
        this.BotonEliminardetalle.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAgregardetalleActionPerformed

    private void CampoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed

    }//GEN-LAST:event_CancelarActionPerformed

    private void CampoCodigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigo2ActionPerformed

    private void CampoCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCodigo1ActionPerformed

    private void SeleccionarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarPedidosActionPerformed
        // TODO add your handling code here:
        new CBuscaPedidoCompra1(new VBuscaPedidoCompra1()).iniciar();
        this.BotonAgregardetalle.setEnabled(true);
    }//GEN-LAST:event_SeleccionarPedidosActionPerformed

    private void SeleccionarPedidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SeleccionarPedidosFocusGained
        // TODO add your handling code here:
        this.jTextField6.setText(VBuscaPedidoCompra1.Id);
        this.CODSERVICIO.setText(VBuscaPedidoCompra1.Cliente);
        this.SERVICIO.setText(VBuscaPedidoCompra1.Cliente1);
        this.CANTIDAD1.setText(VBuscaPedidoCompra1.Cliente3);
        this.CANTIDAD.setText(VBuscaPedidoCompra1.Cliente2);
        this.jTextField1.setText(VBuscaPedidoCompra1.Cliente4);
        this.jTextField2.setText(VBuscaPedidoCompra1.Cliente5);
        this.jTextField3.setText(VBuscaPedidoCompra1.Cliente6);

    }//GEN-LAST:event_SeleccionarPedidosFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cOrdenCompra(new vOrdenCompra()).iniciar();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonAgregardetalle;
    public javax.swing.JButton BotonEliminardetalle;
    public javax.swing.JTextField CANTIDAD;
    public javax.swing.JTextField CANTIDAD1;
    public javax.swing.JTextField CODSERVICIO;
    public javax.swing.JTextField CampoCodigo;
    public javax.swing.JTextField CampoCodigo1;
    public javax.swing.JTextField CampoCodigo2;
    public javax.swing.JTextField CampoFecha;
    public javax.swing.JButton Cancelar;
    public javax.swing.JButton Guardar;
    public javax.swing.JButton Nuevo;
    public javax.swing.JButton SALIR;
    public javax.swing.JTextField SERVICIO;
    public javax.swing.JButton SeleccionarPedidos;
    public javax.swing.JTable TablaDetalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
