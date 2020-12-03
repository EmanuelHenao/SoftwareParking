package ventana;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frParqueadero extends javax.swing.JInternalFrame {

    int filas;
    DefaultTableModel modelo;

    public frParqueadero() {
        initComponents();

        //tabla
        String[][] data = {};
        String[] comida = {"Nombre", "Nit", "Direccion", "telefono"};
        modelo = new DefaultTableModel(data, comida);
        tabla1.setModel(modelo);

    }

    public void recargartabla() {
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            ResultSet registro = comando.executeQuery("select * from dparqueadero");
            String[] dato = new String[4];
            while (registro.next()) {
                dato[0] = registro.getString("nombre");
                dato[1] = registro.getString("nit");
                dato[2] = registro.getString("direccion");
                dato[3] = registro.getString("telefono");

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
        txNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txNit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txDire = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txTel = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnEli = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jMenuItem1.setText("editar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Datos Del Parqueadero");
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
        jLabel1.setText("Parqueadero Registrado");

        jLabel2.setText("Nombre:");

        jLabel3.setText("*Nit:       ");

        jLabel4.setText("Direccion:");

        jLabel5.setText("Telefono:");

        btnAgregar.setText("Agragar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModi.setText("Modificar");
        btnModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModiActionPerformed(evt);
            }
        });

        tabla1.setBackground(new java.awt.Color(204, 204, 204));
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tabla1);

        jLabel6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel6.setText("Datos Del Parqueadero");

        btnEli.setText("Eliminar");
        btnEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/p.png"))); // NOI18N
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txNit, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txDire, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(10, 10, 10)
                                .addComponent(txTel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModi)
                                .addGap(18, 18, 18)
                                .addComponent(btnEli))
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(txDire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel5))
                                    .addComponent(txTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAgregar)
                                    .addComponent(btnModi)
                                    .addComponent(btnEli)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            comando.executeUpdate("insert into dparqueadero(nombre,nit,direccion,telefono) values ('" + txNombre.getText() + "','" + txNit.getText() + "','" + txDire.getText() + "','" + txTel.getText() + "')");
            conexion.close();
            JOptionPane.showMessageDialog(null, "la informacion ha sido agregada corectamente ");
            txNombre.setText("");
            txNit.setText("");
            txDire.setText("");
            txTel.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        int l = tabla1.getRowCount();
        for (int i = l - 1; i >= 0; i--) {
            modelo.removeRow(i);

        }
        recargartabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiActionPerformed

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            int cantidad = comando.executeUpdate("update dparqueadero set nombre='" + txNombre.getText() + "',nit='" + txNit.getText() + "',direccion='" + txDire.getText() + "',"
                    + "telefono=" + txTel.getText()+ " where nit=" + txNit.getText()+ "'");  
            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null, "!!!! se modifico!!!!");
            } else {
                JOptionPane.showMessageDialog(null, "no Se modifico");
            }
            conexion.close();
            txNombre.setText("");
            txNit.setText("");
            txTel.setText("");
            txDire.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        } 

        
          int l = tabla1.getRowCount();
        for (int i = l - 1; i >= 0; i--) {
            modelo.removeRow(i);

        }
        recargartabla();
    }//GEN-LAST:event_btnModiActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //recargar dato en tabla
        recargartabla();

    }//GEN-LAST:event_formInternalFrameOpened

    private void btnEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliActionPerformed
               try {
          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/parque","root" ,"");
          Statement comando=conexion.createStatement();
          int cantidad = comando.executeUpdate("delete from dparqueadero where nit="+txNit.getText());
          if (cantidad==1) {
            txNit.setText("");
            txDire.setText("");
            txNombre.setText("");
            txTel.setText("");
            
            JOptionPane.showMessageDialog(null,"Se borro EXITOSAMNETE! ");
          } else {
            JOptionPane.showMessageDialog(null,"No existe!");
          }
          conexion.close();
            txNit.setText("");
            txDire.setText("");
            txNombre.setText("");
            txTel.setText("");
        } catch(SQLException ex){
         JOptionPane.showMessageDialog(null,ex.toString());
        } 
         int l = tabla1.getRowCount();
        for (int i = l - 1; i >= 0; i--) {
            modelo.removeRow(i);

        }
               recargartabla();
    }//GEN-LAST:event_btnEliActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
               int filaSelect = tabla1.getSelectedRow();

        txNombre.setText(tabla1.getValueAt(filaSelect, 0).toString());
        txNit.setText(tabla1.getValueAt(filaSelect, 1).toString());
        txDire.setText(tabla1.getValueAt(filaSelect, 2).toString());
        txTel.setText(tabla1.getValueAt(filaSelect, 3).toString());

        filas = filaSelect;
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEli;
    private javax.swing.JButton btnModi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txDire;
    private javax.swing.JTextField txNit;
    private javax.swing.JTextField txNombre;
    private javax.swing.JTextField txTel;
    // End of variables declaration//GEN-END:variables
}
