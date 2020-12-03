package ventana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frTarifas extends javax.swing.JInternalFrame {

    int filas;
    DefaultTableModel modelo;

    public frTarifas() {
        initComponents();
        //tabla
        String[][] data = {};
        String[] comida = {"Tipo de Vehiculo", "tarifa"};
        modelo = new DefaultTableModel(data, comida);
        jTable1.setModel(modelo);
    }

    public void recargartabla() {
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            ResultSet registro = comando.executeQuery("select * from dtarifa");
            String[] dato = new String[2];
            while (registro.next()) {
                dato[0] = registro.getString("tipovehiculo");
                dato[1] = registro.getString("tarifa");
                modelo.addRow(dato);
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txTipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txValor = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnModi = new javax.swing.JButton();
        btnEli = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        jMenuItem1.setText("editar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Tarifas");
        setOpaque(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel1.setText("Tarifa");

        jLabel2.setText("Tipo de vehiculo");

        jLabel3.setText("Valor");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModi.setText("Modificar");
        btnModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModiActionPerformed(evt);
            }
        });

        btnEli.setText("Eliminar");
        btnEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel4.setText("Tarifas Registradas");

        jTable1.setBackground(new java.awt.Color(255, 204, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTable1);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ahorre.png"))); // NOI18N
        jLabel6.setText("        ");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEli))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnSalir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txTipo)
                            .addComponent(txValor, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnModi)
                            .addComponent(btnEli))
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            comando.executeUpdate("insert into dtarifa(tipovehiculo,tarifa) values ('" + txTipo.getText() + "'," + txValor.getText() + ")");
            conexion.close();
            JOptionPane.showMessageDialog(null, "la informacion ha sido agregada corectamente ");
            txTipo.setText("");
            txValor.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        int l = jTable1.getRowCount();
        for (int i = l - 1; i >= 0; i--) {
            modelo.removeRow(i);

        }
        recargartabla();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiActionPerformed
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            int cantidad = comando.executeUpdate("update dtarifa set tipovehiculo='" + txTipo.getText() + "', tarifa=" + txValor.getText() + " where tipovehiculo=" + txTipo.getText()+ "'");
            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null, "!!!!!!!!!!!!!!!!!!!!! se modifico!!!!!!!!!!!!!!!!!!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Se modifico");
            }
            conexion.close();
            txTipo.setText("");
            txValor.setText("");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        int l = jTable1.getRowCount();
        for (int i = l - 1; i >= 0; i--) {
            modelo.removeRow(i);

        }
        recargartabla();
    }//GEN-LAST:event_btnModiActionPerformed

    private void btnEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliActionPerformed
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            int cantidad = comando.executeUpdate("delete from dtarifa where tipovehiculo='" + txTipo.getText()+ "'");
            if (cantidad == 1) {
               
                txValor.setText("");
                 txTipo.setText("");

                JOptionPane.showMessageDialog(null, "Se borro EXITOSAMNETE! ");
            } else {
                JOptionPane.showMessageDialog(null, "No existe!");
            }
            conexion.close();
            txTipo.setText("");
            txValor.setText("");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        int l = jTable1.getRowCount();
        for (int i = l - 1; i >= 0; i--) {
            modelo.removeRow(i);

        }
        recargartabla();
    }//GEN-LAST:event_btnEliActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        recargartabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int filaSelect = jTable1.getSelectedRow();

        txTipo.setText(jTable1.getValueAt(filaSelect, 0).toString());
        txValor.setText(jTable1.getValueAt(filaSelect, 1).toString());

        filas = filaSelect;
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEli;
    private javax.swing.JButton btnModi;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txTipo;
    private javax.swing.JTextField txValor;
    // End of variables declaration//GEN-END:variables
}
