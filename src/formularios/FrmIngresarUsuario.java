/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Entidades.usuarios;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author parivera
 */
public class FrmIngresarUsuario extends javax.swing.JFrame {
    
    private boolean editar = false;

    /**
     * Creates new form FrmIngresarUsuario
     */
    public FrmIngresarUsuario() {
        initComponents();
        editar = false;
    }
    
    public FrmIngresarUsuario(usuarios u) {
        initComponents();
        
        jtxtUsuario.setText(u.getUsuario());
        jtxtUsuario.setEnabled(false);
        jpPassword.setText(null); 
        editar = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcmbEstado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcmbRol = new javax.swing.JComboBox<>();
        jpPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jbAceptar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setText("Estado");

        jcmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        jLabel3.setText("Rol");

        jcmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Operador", "Contador" }));
        jcmbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbRolActionPerformed(evt);
            }
        });

        jLabel4.setText("Contraseña");

        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        jButton2.setText("salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtUsuario)
                    .addComponent(jcmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcmbRol, 0, 117, Short.MAX_VALUE)
                    .addComponent(jpPassword))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbAceptar)
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAceptar)
                    .addComponent(jButton2))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbRolActionPerformed

    private Connection con;
    
    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        // TODO add your handling code here:
        if (ValidacionUsuario()) {
            ResultSet rs = null;                       
            PreparedStatement st = null;
            usuarios u = new usuarios(jtxtUsuario.getText(), String.valueOf(jpPassword.getPassword()),String.valueOf(jcmbEstado.getSelectedItem()),String.valueOf(jcmbRol.getSelectedItem()));
            if (editar) {
                try {
                    con = Conexion.Conexion.conectar();
                    st = con.prepareStatement("UPDATE usuarios set clave= md5(?), estado = ?, rol = ? WHERE Usuario = ?");         
                    st.setString(1,u.getClave()); 
                    st.setString(2,u.getEstado()); 
                    st.setString(3,u.getRol()); 
                    st.setString(4,u.getUsuario());
                } catch (Exception ex) {
                    Logger.getLogger(FrmIngresarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }          
                editar = false;
                jtxtUsuario.setEnabled(true);
            }else{
                try
                {  
                    con = Conexion.Conexion.conectar();
                    st = con.prepareStatement("SELECT * FROM usuarios WHERE Usuario = ?");            
                    st.setString(1,u.getUsuario());    
                    rs = st.executeQuery(); 
                    if(rs.next()){
                        JOptionPane.showMessageDialog(this,
                        "Existe una persona con ese usuario",
                        "Crear Usuario",
                        JOptionPane.ERROR_MESSAGE);
                    }else{
                        st = con.prepareStatement("INSERT INTO usuarios(Usuario,clave,estado,rol) VALUES(?,md5(?),?,?) ");
                        st.setString(1,u.getUsuario()); 
                        st.setString(2,u.getClave()); 
                        st.setString(3,u.getEstado()); 
                        st.setString(4,u.getRol()); 

                        st.executeUpdate();
                    }
                }        
                catch(HeadlessException | SQLException e){
                    System.out.println("Error en la consulta de usuario. \n"+e);                        

                } catch (Exception ex) {
                    Logger.getLogger(FrmIngresarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
                    if ( con!=null) {
                        try {
                            con.close();
                        } catch (SQLException ex) {
                            Logger.getLogger(FrmIngresarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if (st!=null) {
                        try{
                            st.close();
                        }catch (SQLException ex) {
                            Logger.getLogger(FrmIngresarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }                    
                    if (rs!= null) {
                        try{
                            rs.close();
                        }catch (SQLException ex) {
                            Logger.getLogger(FrmIngresarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }                
            }
        }
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmIngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIngresarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmIngresarUsuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JComboBox<String> jcmbEstado;
    private javax.swing.JComboBox<String> jcmbRol;
    private javax.swing.JPasswordField jpPassword;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables

    private boolean ValidacionUsuario() {
        if (jtxtUsuario.getText().isEmpty() || String.valueOf(jpPassword.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this,
            "Hay campos Vacios",
            "Crear Usuario",
            JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (String.valueOf(jpPassword.getPassword()).length() < 6) {
            JOptionPane.showMessageDialog(this,
            "la contraseña debe tener minimo 6 caracteres",
            "Crear Usuario",
            JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
}
