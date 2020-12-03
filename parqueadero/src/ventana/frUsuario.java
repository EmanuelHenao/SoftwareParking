
package ventana;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frUsuario extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;
    int filas;
    public frUsuario() {
        initComponents();
        
        
        // tabla user
        String[][] data = {};
        String[] comida = {"Nombre Usuario", "Contraseña"};
        modelo = new DefaultTableModel(data, comida);
        jTable1.setModel(modelo);
    }
    
    public void recargartabla() {
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            ResultSet registro = comando.executeQuery("select * from duser");
            String[] dato = new String[2];
            while (registro.next()) {
                dato[0] = registro.getString("nuser");
                dato[1] = registro.getString("contraseña");

                modelo.addRow(dato);
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }

    public void limpiar(){
    
     int l = jTable1.getRowCount();
     for (int i = l - 1; i >= 0; i--) {
     modelo.removeRow(i);
    }}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txContra = new javax.swing.JPasswordField();
        btnAgregar = new javax.swing.JButton();
        btnModi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEli = new javax.swing.JButton();

        jMenuItem1.setText("editar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Datos del usuario");
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

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel1.setText("Datos  del usuario");

        jLabel2.setText("Nombre del Usuario:");

        jLabel3.setText("Contraseña:");

        btnAgregar.setText("Agregar");
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
        jScrollPane1.setViewportView(jTable1);

        btnEli.setText("Eliminar");
        btnEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(txUser)
                            .addComponent(jLabel3)
                            .addComponent(txContra)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(btnModi)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnEli)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnModi)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnEli)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
           try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            comando.executeUpdate("insert into duser(nuser,contraseña) values ('" + txUser.getText() + "','" + txContra.getText() + "')");
            conexion.close();
            JOptionPane.showMessageDialog(null, "la informacion ha sido agregada corectamente ");
            txUser.setText("");
            txContra.setText("");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
           limpiar();
           recargartabla();
           
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiActionPerformed
              try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/parque", "root", "");
            Statement comando = conexion.createStatement();
            int cantidad = comando.executeUpdate("update duser set nuser='" + txUser.getText() + "',contraseña='" + txContra.getText() + "' where nuser=" + txUser.getText()+ "'");  
            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null, "!!!! se modifico!!!!");
            } else {
                JOptionPane.showMessageDialog(null, "no Se modifico");
            }
            conexion.close();
            txContra.setText("");
            txUser.setText("");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        } 
              limpiar();
              recargartabla();
    }//GEN-LAST:event_btnModiActionPerformed

    private void btnEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliActionPerformed
                   try {
          Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/parque","root" ,"");
          Statement comando=conexion.createStatement();
          int cantidad = comando.executeUpdate("delete from duser where nuser="+txUser.getText()+ "'");
          if (cantidad==1) {
            
            txContra.setText(""); 
            txUser.setText("");
            JOptionPane.showMessageDialog(null,"Se borro EXITOSAMNETE! ");
          } else {
            JOptionPane.showMessageDialog(null,"No existe!");
          }
          conexion.close();
            txUser.setText("");
            txContra.setText("");
        } catch(SQLException ex){
         JOptionPane.showMessageDialog(null,ex.toString());
        } 
        limpiar();
        recargartabla();
        
    }//GEN-LAST:event_btnEliActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
    recargartabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       int filaSelect = jTable1.getSelectedRow();

        txUser.setText(jTable1.getValueAt(filaSelect, 0).toString());
        txContra.setText(jTable1.getValueAt(filaSelect, 1).toString());
       

        filas = filaSelect;
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEli;
    private javax.swing.JButton btnModi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField txContra;
    private javax.swing.JTextField txUser;
    // End of variables declaration//GEN-END:variables
}
