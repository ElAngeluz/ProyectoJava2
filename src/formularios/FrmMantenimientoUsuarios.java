/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Entidades.Productos;
import Entidades.usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author parivera
 */
public class FrmMantenimientoUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form FrmMantenimientoUsuarios
     */
    public FrmMantenimientoUsuarios() {
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

        bEditar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bIngresar = new javax.swing.JButton();
        tfDescripcion = new javax.swing.JTextField();
        bConsultar = new javax.swing.JButton();
        spResultado = new javax.swing.JScrollPane();
        tResultado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bEditar.setText("EDITAR");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bEliminar.setText("ELIMINAR");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bIngresar.setText("INGRESAR");
        bIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIngresarActionPerformed(evt);
            }
        });

        tfDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescripcionActionPerformed(evt);
            }
        });

        bConsultar.setText("CONSULTAR");
        bConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarActionPerformed(evt);
            }
        });

        tResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Rol", "Estado"
            }
        ));
        spResultado.setViewportView(tResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(bConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(spResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(bIngresar)
                    .addGap(67, 67, 67)
                    .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                    .addComponent(bEliminar)
                    .addGap(6, 6, 6)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(bConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(252, 252, 252)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bIngresar)
                        .addComponent(bEditar)
                        .addComponent(bEliminar))
                    .addGap(21, 21, 21)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        // TODO add your handling code here:
        if(seleccionEdicionValida()){
            usuarios u = new usuarios(String.valueOf(tResultado.getValueAt(tResultado.getSelectedRows()[0],0)));
            ResultSet rs; 
            try{
                con = Conexion.Conexion.conectar();
                PreparedStatement st;
                st = con.prepareStatement("SELECT * FROM usuarios WHERE Usuario = ?");
                st.setString(1, u.getUsuario());
                rs = st.executeQuery();

                while(rs.next())
                {
                    u.setRol(rs.getString("rol"));
                    u.setEstado(rs.getString("estado"));                        
                }

                rs.close();
                st.close();     
                con.close();
                System.out.println("la base de datos se cerro");
                                
                FrmIngresarUsuario frm = new FrmIngresarUsuario(u);
                frm.setVisible(true);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,
                    "Ocurrió un error al eliminar el producto en la base de datos",
                    "Eliminación",
                    JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_bEditarActionPerformed

    private Connection con;
    
    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        // TODO add your handling code here:
        if (seleccionEdicionValida()) {
            ArrayList<usuarios> eliminados= new ArrayList<>();
            for (int i = 0; i < tResultado.getSelectedRows().length; i++) {
                usuarios p = new usuarios(String.valueOf(tResultado.getValueAt(tResultado.getSelectedRows()[i],0)));
                eliminados.add(p);
            }

            try{
                con = Conexion.Conexion.conectar();
                for (int i = 0; i < eliminados.size(); i++) {
                    PreparedStatement st;
                    st = con.prepareStatement("DELETE FROM usuarios WHERE Usuario = ?");
                    st.setString(1, eliminados.get(i).getUsuario());
                    st.executeUpdate();
                    st.close();
                    
                    JOptionPane.showMessageDialog(this,
                    "eliminación de usuario con código: " + eliminados.get(i).getUsuario() + " fue exitosa",
                    "Eliminación",
                    JOptionPane.ERROR_MESSAGE);
                    
                }                
                con.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,
                    "Ocurrió un error al eliminar el producto en la base de datos",
                    "Eliminación",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIngresarActionPerformed
        // TODO add your handling code here:
        FrmIngresarUsuario frm = new FrmIngresarUsuario();
        frm.setVisible(true);
    }//GEN-LAST:event_bIngresarActionPerformed

    private void tfDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescripcionActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfDescripcionActionPerformed

    private boolean suca(){
        try {
            Integer.parseInt(String.valueOf(tfDescripcion.getText()));     
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
    
    private void bConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarActionPerformed
        // TODO add your handling code here:
        if (suca()) 
           consultarRegistros(); 
        else
            JOptionPane.showMessageDialog(this,
                    "Debe ser un usuario valido",
                    "Consultar",
                    JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_bConsultarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        FrmPrincipal frm = new FrmPrincipal();
        frm.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FrmMantenimientoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmMantenimientoUsuarios().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConsultar;
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bIngresar;
    private javax.swing.JScrollPane spResultado;
    private javax.swing.JTable tResultado;
    private javax.swing.JTextField tfDescripcion;
    // End of variables declaration//GEN-END:variables

    private boolean seleccionEdicionValida() {
        if(tResultado.getSelectedRowCount()!=1){
            JOptionPane.showMessageDialog(this,
                    "Debe seleccionar un registro a editar o eliminar",
                    "Edición",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }        
        return true; 
    }

    private void consultarRegistros() {
        try {
            ResultSet rs;
            ArrayList<usuarios> resultado= new ArrayList<>();
            PreparedStatement st;
            con = Conexion.Conexion.conectar();
            st = con.prepareStatement("SELECT * FROM usuarios");            
            rs = st.executeQuery();
            while(rs.next())
            {
                resultado.add(new usuarios(rs.getString("Usuario"),rs.getString("clave"),rs.getString("estado"),rs.getString("rol")));                    
            }
            con.close();
            DefaultTableModel dtm = (DefaultTableModel) tResultado.getModel();
                dtm.setRowCount(0);
                for (usuarios p:resultado) {
                    Vector fila = new Vector();
                    fila.add(p.getUsuario());
                    fila.add(p.getEstado());
                    fila.add(p.getRol());
                    dtm.addRow(fila);
                }
        } catch (Exception e) {
        }
    }
}
