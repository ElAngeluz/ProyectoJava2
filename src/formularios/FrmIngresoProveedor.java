/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Johanna Parrales
 */
public class FrmIngresoProveedor extends javax.swing.JFrame {

    /**
     * Creates new form FrmIngresoProveedor
     */
    private boolean editar = false;
    
    public FrmIngresoProveedor() {
        initComponents();
        editar = false;
    }
    
    private Connection con;
    
      public FrmIngresoProveedor(Proveedor p) {
        initComponents();
        editar = true;
        tfId.setEnabled(!editar);
        tfId.setText(String.valueOf(p.getId()));
        tfNombre.setText(String.valueOf(p.getNombre()));
        tfProducto.setText(String.valueOf(p.getProducto()));
        tfDireccion.setText(String.valueOf(p.getDireccion()));
        tfTelefono.setText(String.valueOf(p.getTelefono()));
    }

      private void limpiarFormulario(){
        tfNombre.setText(null);
        tfId.setText(null);
        tfDireccion.setText(null);
        tfProducto.setText(null);
        tfTelefono.setText(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfProducto = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        tfTelefono = new javax.swing.JTextField();
        bIngresar = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("ID");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("PRODUCTO");

        jLabel5.setText("DIRECCION");

        jLabel6.setText("TELEFONO");

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        bIngresar.setText("INGRESAR");
        bIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIngresarActionPerformed(evt);
            }
        });

        bLimpiar.setText("LIMPIAR");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
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
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                .addComponent(tfProducto)
                                .addComponent(tfDireccion)
                                .addComponent(tfTelefono))
                            .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(bIngresar)
                        .addGap(96, 96, 96)
                        .addComponent(bLimpiar)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIngresar)
                    .addComponent(bLimpiar))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private boolean ValidacionControles() {
        try {
            Integer.parseInt(tfId.getText());            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                "El ID debe tener valores válidos",
                "Ingresar",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (tfNombre.getText().isEmpty() || tfProducto.getText().isEmpty() || tfDireccion.getText().isEmpty() || tfTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "El formulario tiene valores no válidos",
                "Ingresar",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return proveedorValido(tfId.getText()); //verifica que no se haya ingresado un producto con el mismo codigo en la base de datos
    }
    
    private boolean proveedorValido(String _id) {        
        if (!editar) {
            ResultSet rs=null;                       
            PreparedStatement st=null;
            try
            {   
                con = Conexion.Conexion.conectar();
                st = con.prepareStatement("SELECT * FROM proveedor WHERE codigo = ?");            
                st.setString(1,_id);    
                rs = st.executeQuery(); 
                if(rs.next()){
                    JOptionPane.showMessageDialog(this,
                        "Existe un proveedor con el mismo ID",
                        "Ingresar",
                        JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                return true;
            }        
            catch(Exception e){
                    JOptionPane.showMessageDialog(this,
                        "Error en la consulta de provedor. (Validacion) \n" + e,
                        "Proveedor",
                        JOptionPane.ERROR_MESSAGE);          
                return false;
            } finally{
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
        return true;
    }
    private void bIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIngresarActionPerformed
        // TODO add your handling code here:
         if(ValidacionControles()){
            PreparedStatement st = null;
            try {
                LocalDate todayLocalDate;
                todayLocalDate = LocalDate.now( ZoneId.of( "America/Montreal" ) );

                Proveedor p = new Proveedor(tfId.getText(), tfNombre.getText(), 
                    tfProducto.getText(), tfDireccion.getText(),tfTelefono.getText());

                con = Conexion.Conexion.conectar();
                if (editar) {
                    st = con.prepareStatement("UPDATE proveedor set nombre=?, producto = ?, direccion=?, telefono=?  WHERE codigo = ?");  
                    st.setString(1, p.getNombre());
                    st.setString(2, p.getProducto());
                    st.setString(3, p.getDireccion());
                    st.setString(4, p.getTelefono());
                    st.setString(5, p.getId());
                    
                    st.executeUpdate();
                    
                    System.out.println("Actualización de proveedor exitosa");                    
                    
                }else{                    
                    st = con.prepareStatement("INSERT INTO proveedor(idproveedor,codigo,nombre,producto,direccion,telefono) VALUES(null,?,?,?,?,?) ");
                    st.setString(1, p.getId());
                    st.setString(2, p.getNombre());
                    st.setString(3, p.getProducto());
                    st.setString(4, p.getDireccion());
                    st.setString(5, p.getTelefono());
                    
                    st.executeUpdate();

                    System.out.println("Ingreso de proveedor exitoso");                    
                   
                }
                limpiarFormulario();
                
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(FrmIngresoProveedor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrmIngresoProveedor.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                if (con!=null) {
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
            }
        }
    }//GEN-LAST:event_bIngresarActionPerformed

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarFormulario();
    }//GEN-LAST:event_bLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmIngresoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIngresoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIngresoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIngresoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIngresoProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bIngresar;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfProducto;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
