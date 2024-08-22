/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Conectar.Conectar;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author victo
 */
public class Stock extends javax.swing.JFrame {
    private Connection con;
    /**
     * Creates new form Stockp
     */
    public Stock() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        Conectar conecta = new Conectar();
        con = conecta.getConexion();
        String query = "SELECT Producto FROM Productos";
        try (Statement statement = con.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            // Añadir datos al JComboBox
            while (resultSet.next()) {
                Producto.addItem(resultSet.getString("Producto"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
    }
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        accion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Producto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JSpinner();
        Confirmar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Lista = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        ProductoB = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STOCK DE PRODUCTO");

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menup.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addGap(0, 180, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 120));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel2.setText("CANTIDAD:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 90, -1));

        accion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agregar", "Restar" }));
        bg.add(accion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 210, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel3.setText("ACCION:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        bg.add(Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 210, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel4.setText("PRODUCTO:");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));
        bg.add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 80, 30));

        Confirmar.setBackground(new java.awt.Color(0, 102, 204));
        Confirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfirmarMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto Black", 1, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirmacion.png"))); // NOI18N
        jLabel11.setText("CONFIRMAR");

        javax.swing.GroupLayout ConfirmarLayout = new javax.swing.GroupLayout(Confirmar);
        Confirmar.setLayout(ConfirmarLayout);
        ConfirmarLayout.setHorizontalGroup(
            ConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ConfirmarLayout.setVerticalGroup(
            ConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        bg.add(Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 230, 70));

        Lista.setBackground(new java.awt.Color(0, 102, 204));
        Lista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListaMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/listaventas.png"))); // NOI18N
        jLabel10.setText("LISTA");

        javax.swing.GroupLayout ListaLayout = new javax.swing.GroupLayout(Lista);
        Lista.setLayout(ListaLayout);
        ListaLayout.setHorizontalGroup(
            ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel10)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        ListaLayout.setVerticalGroup(
            ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        bg.add(Lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 240, -1));

        ProductoB.setBackground(new java.awt.Color(0, 102, 204));
        ProductoB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ProductoB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductoBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProductoBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProductoBMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Roboto Black", 1, 28)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mas.png"))); // NOI18N
        jLabel12.setText("PRODUCTO");

        javax.swing.GroupLayout ProductoBLayout = new javax.swing.GroupLayout(ProductoB);
        ProductoB.setLayout(ProductoBLayout);
        ProductoBLayout.setHorizontalGroup(
            ProductoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductoBLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(27, 27, 27))
        );
        ProductoBLayout.setVerticalGroup(
            ProductoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );

        bg.add(ProductoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void ConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseClicked
        if (accion.getSelectedItem().equals("Agregar")){
            
            String sql = "update Productos set stock = stock + ? where Producto = ?";
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, ((Number) Cantidad.getValue()).intValue());
            stmt.setString(2, (String) Producto.getSelectedItem());
            stmt.executeUpdate();
            } catch(SQLException ex) {
                
            }
        } else {
        String selectSql = "SELECT stock FROM Productos WHERE Producto = ?";
        try (PreparedStatement selectStmt = con.prepareStatement(selectSql)) {
            selectStmt.setString(1, (String) Producto.getSelectedItem());
            try (ResultSet rs = selectStmt.executeQuery()) {
                if (rs.next()) {
                int actualStock = rs.getInt("stock");
                int StockRestar = ((Number) Cantidad.getValue()).intValue();

                if (actualStock - StockRestar >= 0) {
                    String updateSql = "UPDATE Productos SET stock = stock - ? WHERE Producto = ?";
                    try (PreparedStatement updateStmt = con.prepareStatement(updateSql)) {
                        updateStmt.setInt(1, ((Number) Cantidad.getValue()).intValue());
                        updateStmt.setString(2, (String) Producto.getSelectedItem());
                        updateStmt.executeUpdate();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Stock insuficiente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    }
        
    }//GEN-LAST:event_ConfirmarMouseClicked

    private void ListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMouseClicked
        ListaProductos p = new ListaProductos();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ListaMouseClicked

    private void ProductoBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductoBMouseClicked
        Productos p = new Productos();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductoBMouseClicked

    private void ConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseEntered
        Confirmar.setBackground(new Color (0,120,240));
    }//GEN-LAST:event_ConfirmarMouseEntered

    private void ConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseExited
        Confirmar.setBackground(new Color (0,102,204));
    }//GEN-LAST:event_ConfirmarMouseExited

    private void ProductoBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductoBMouseEntered
        ProductoB.setBackground(new Color (0,120,240));
    }//GEN-LAST:event_ProductoBMouseEntered

    private void ProductoBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductoBMouseExited
        ProductoB.setBackground(new Color (0,102,204));
    }//GEN-LAST:event_ProductoBMouseExited

    private void ListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMouseEntered
        Lista.setBackground(new Color (0,120,240));
    }//GEN-LAST:event_ListaMouseEntered

    private void ListaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMouseExited
        Lista.setBackground(new Color (0,102,204));
    }//GEN-LAST:event_ListaMouseExited

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
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Cantidad;
    private javax.swing.JPanel Confirmar;
    private javax.swing.JPanel Lista;
    private javax.swing.JComboBox<String> Producto;
    private javax.swing.JPanel ProductoB;
    private javax.swing.JComboBox<String> accion;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
