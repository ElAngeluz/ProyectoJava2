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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Johanna Parrales
 */
public class FrmMantenimientoProveedor extends javax.swing.JFrame {

    /**
     * Creates new form FrmMantenimientoProveedor
     */
    public FrmMantenimientoProveedor() {
        initComponents();
        suca();
    }

    private Connection con;
    
    private void suca(){
        if(String.valueOf(cbTodos.getSelectedItem()).equalsIgnoreCase("Todos"))
            tfDescripcion.setEditable(false);
        else
            tfDescripcion.setEditable(true);   
    
        tfDescripcion.setText(null);
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbTodos = new javax.swing.JComboBox<>();
        tfDescripcion = new javax.swing.JTextField();
        bConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tResultado = new javax.swing.JTable();
        bIngresar = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        bEliminasr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cbTodos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "NOMBRE", " " }));
        cbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTodosActionPerformed(evt);
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
                "CODIGO", "NOMBRE", "PRODUCTO", "DIRECCION", "TELEFONO"
            }
        ));
        jScrollPane1.setViewportView(tResultado);

        bIngresar.setText("INGRESAR");
        bIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIngresarActionPerformed(evt);
            }
        });

        bEditar.setText("EDITAR");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bEliminasr.setText("ELIMINAR");
        bEliminasr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminasrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(bEliminasr, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bConsultar)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(tfDescripcion)
                    .addComponent(cbTodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIngresar)
                    .addComponent(bEditar)
                    .addComponent(bEliminasr))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarActionPerformed
        // TODO add your handling code here:
        consultarRegistro();
    }//GEN-LAST:event_bConsultarActionPerformed

    private void cbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTodosActionPerformed
        // TODO add your handling code here:
        suca();
    }//GEN-LAST:event_cbTodosActionPerformed

    private void tfDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescripcionActionPerformed
        // TODO add your handling code here:
        suca();
    }//GEN-LAST:event_tfDescripcionActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        // TODO add your handling code here:
        if(seleccionEdicionValida()){            
            Proveedor p = new Proveedor(tResultado.getValueAt(tResultado.getSelectedRow(),0).toString());
            ResultSet rs=null; 
            PreparedStatement st=null;
            try {
                con = Conexion.Conexion.conectar();   
                
                st = con.prepareStatement("SELECT * FROM proveedor WHERE codigo = ?");
                st.setString(1, String.valueOf(p.getId()));
                rs = st.executeQuery();
                
                while (rs.next()) {                    
                    p.setNombre(rs.getString("nombre"));
                    p.setProducto(rs.getString("producto"));
                    p.setDireccion(rs.getString("direccion"));
                    p.setTelefono(rs.getString("telefono"));
                }
                
                FrmIngresoProveedor frm = new FrmIngresoProveedor(p);
                frm.setVisible(true);
                                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                    "Ocurrió un error al intentar consultar el provedor en la base de datos. "+ e,
                    "Editar",
                    JOptionPane.ERROR_MESSAGE);
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
 
    }//GEN-LAST:event_bEditarActionPerformed

    private void bIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIngresarActionPerformed
        // TODO add your handling code here:
        FrmIngresoProveedor frm = new FrmIngresoProveedor();
        frm.setVisible(true);
    }//GEN-LAST:event_bIngresarActionPerformed

    private void bEliminasrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminasrActionPerformed
        // TODO add your handling code here:
        if (seleccionEdicionValida()) {
            ArrayList<Proveedor> eliminados= new ArrayList<>(); 
            for (int i = 0; i < tResultado.getSelectedRows().length; i++) {
                Proveedor p = new Proveedor(tResultado.getValueAt(tResultado.getSelectedRows()[i],0).toString());
                eliminados.add(p);                
            }
            PreparedStatement st=null; 
            try{           
                con = Conexion.Conexion.conectar();
                for (int i = 0; i < eliminados.size(); i++) { 
                                       
                    st = con.prepareStatement("DELETE FROM proveedor WHERE codigo = ?");            
                    st.setString(1, eliminados.get(i).getId());
                    st.executeUpdate();                    
                    
                    System.out.println("Eliminacion de proveedor con cedula: " + eliminados.get(i).getId() + " fue exitosa");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,
                    "Ocurrió un error al eliminar el provedor en la base de datos",
                    "Eliminación",
                    JOptionPane.ERROR_MESSAGE);
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
            }
        }        
    }//GEN-LAST:event_bEliminasrActionPerformed

     private boolean formularioValido() {       
        if(!(String.valueOf(cbTodos.getSelectedItem()).equalsIgnoreCase("TODOS")) && tfDescripcion.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this,
                    "Debe ingresar una descripción",
                    "Consulta",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(String.valueOf(cbTodos.getSelectedItem()).equals("ID")){
            try{
                Integer.parseInt(tfDescripcion.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this,
                    "El código debe ser de solo numero",
                    "Consulta",
                    JOptionPane.ERROR_MESSAGE);
                return false;
            }    
        }        
        return true;
    }                                         

    private void consultarRegistro() {
        if (formularioValido()) {
            ResultSet rs=null; 
            PreparedStatement st=null;
            try {
                                
                ArrayList<Proveedor> resultado= new ArrayList<>();
                String tipo = String.valueOf(cbTodos.getSelectedItem());
                
                con = Conexion.Conexion.conectar(); 
                                   
                if(tipo.equalsIgnoreCase("Todos")){
                    st = con.prepareStatement("SELECT * FROM proveedor");            
                    rs = st.executeQuery();
                }else if (tipo.equalsIgnoreCase("id")){
                    st = con.prepareStatement("SELECT * FROM proveedor WHERE convert(codigo, char character set utf8) like ? ");            
                    st.setString(1, "%"+String.valueOf(tfDescripcion.getText().toLowerCase())+"%");
                    rs = st.executeQuery();
                }
                
                
                while(rs.next())
                {
                    resultado.add(new Proveedor (rs.getString("codigo"),rs.getString("nombre"),rs.getString("producto"),rs.getString("direccion"),rs.getString("telefono")));                    
                }
                
                DefaultTableModel dtm = (DefaultTableModel) tResultado.getModel();
                dtm.setRowCount(0);
                ArrayList<Object> fila;
                for (Proveedor p:resultado) {
                    fila = new ArrayList<>();
                    fila.add(p.getId());
                    fila.add(p.getNombre());
                    fila.add(p.getProducto());
                    fila.add(p.getDireccion());
                    fila.add(p.getTelefono());
                    dtm.addRow(fila.toArray());
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                    "no se puede consultar! en la base de datos: "+ e,
                    "Consulta",
                    JOptionPane.ERROR_MESSAGE);
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
     public boolean seleccionEdicionValida(){        
        if(!(tResultado.getSelectedRowCount() >=1)){
            JOptionPane.showMessageDialog(this,
                    "Debe seleccionar al menos un registro a editar o eliminar",
                    "Eliminar",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }        
        return true;   
    }                                       

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
            java.util.logging.Logger.getLogger(FrmMantenimientoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientoProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmMantenimientoProveedor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConsultar;
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bEliminasr;
    private javax.swing.JButton bIngresar;
    private javax.swing.JComboBox<String> cbTodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tResultado;
    private javax.swing.JTextField tfDescripcion;
    // End of variables declaration//GEN-END:variables
}
