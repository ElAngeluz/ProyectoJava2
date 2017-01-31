/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Entidades.Productos;
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
 * @author Andres
 */
public class FrmMantenimientoProducto extends javax.swing.JFrame {

    /**
     * Creates new form FrmMantenimientoProducto
     */
    public FrmMantenimientoProducto() {
        initComponents();
        suca();
    }
    
    /*
    procedimeinto que cada vez que cambia al tipo de la consulta modifica el campo descripcion
    */
    private void suca(){
        if(String.valueOf(cbTipo.getSelectedItem()).equalsIgnoreCase("Todos"))
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

        tfDescripcion = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        bConsultar = new javax.swing.JButton();
        bIngresar = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        spResultado = new javax.swing.JScrollPane();
        tResultado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tfDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescripcionActionPerformed(evt);
            }
        });

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "CODIGO", "NOMBRE", "MARCA" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        bConsultar.setText("CONSULTAR");
        bConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarActionPerformed(evt);
            }
        });

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

        bEliminar.setText("ELIMINAR");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        tResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "MARCA", "FECHA CAD.", "CANTIDAD"
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
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bConsultar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bIngresar)
                        .addGap(67, 67, 67)
                        .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bEliminar))
                    .addComponent(spResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(bConsultar))
                    .addComponent(cbTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIngresar)
                    .addComponent(bEditar)
                    .addComponent(bEliminar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescripcionActionPerformed
        // TODO add your handling code here:
        suca();
    }//GEN-LAST:event_tfDescripcionActionPerformed

    private void bConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarActionPerformed
        // TODO add your handling code here:
        consultarRegistros();
    }//GEN-LAST:event_bConsultarActionPerformed

    private void consultarRegistros() {
        if (formularioValido()) {
            ResultSet rs=null; 
            PreparedStatement st=null;
            try {
                                
                ArrayList<Productos> resultado= new ArrayList<>();
                String tipo = String.valueOf(cbTipo.getSelectedItem());
                
                con = Conexion.Conexion.conectar(); 
                                   
                if(tipo.equalsIgnoreCase("Todos")){
                    st = con.prepareStatement("SELECT * FROM productos");            
                    rs = st.executeQuery();
                }else if (tipo.equalsIgnoreCase("codigo")){
                    st = con.prepareStatement("SELECT * FROM productos WHERE convert(codigo, char character set utf8) like ? ");            
                    st.setString(1, "%"+String.valueOf(tfDescripcion.getText().toLowerCase())+"%");
                    rs = st.executeQuery();
                }else{
                    switch (tipo.toLowerCase()) {
                        case "nombre":
                            st = con.prepareStatement("SELECT * FROM productos WHERE nombre LIKE ?");                            
                            st.setString(1, "%"+String.valueOf(tfDescripcion.getText().toLowerCase())+"%");                    
                            rs = st.executeQuery();
                            break;
                        case "marca":
                            st = con.prepareStatement("SELECT * FROM productos WHERE marca LIKE ?");
                            st.setString(1, "%"+String.valueOf(tfDescripcion.getText().toLowerCase())+"%");                    
                            rs = st.executeQuery();
                            break;
                        default:
                            throw new AssertionError();
                    }
                }
                
                while(rs.next())
                {
                    resultado.add(new Productos(rs.getInt("codigo"),rs.getString("nombre"),rs.getString("marca"),rs.getDate("fecha_caducidad"),rs.getInt("cantidad")));                    
                }
                
                DefaultTableModel dtm = (DefaultTableModel) tResultado.getModel();
                dtm.setRowCount(0);
                ArrayList<Object> fila;
                for (Productos p:resultado) {
                    fila = new ArrayList<>();
                    fila.add(p.getCodigo());
                    fila.add(p.getNombre());
                    fila.add(p.getMarca());
                    fila.add(p.getFecha_Caducidad());
                    fila.add(p.getCantidad());
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
    
    private boolean formularioValido() {       
        if(!(String.valueOf(cbTipo.getSelectedItem()).equalsIgnoreCase("TODOS")) && tfDescripcion.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this,
                    "Debe ingresar una descripción",
                    "Consulta",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(String.valueOf(cbTipo.getSelectedItem()).equals("CODIGO")){
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
    
    private void bIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIngresarActionPerformed
        // TODO add your handling code here:
        FrmIngresoProducto frm = new FrmIngresoProducto();
        frm.setVisible(true);
    }//GEN-LAST:event_bIngresarActionPerformed

    private Connection con;
    
    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        // TODO add your handling code here:
        if(seleccionEdicionValida()){            
            Productos p = new Productos((int) tResultado.getValueAt(tResultado.getSelectedRow(), 0));
            ResultSet rs=null; 
            PreparedStatement st=null;
            try {
                con = Conexion.Conexion.conectar();   
                
                st = con.prepareStatement("SELECT * FROM productos WHERE convert(codigo, char character set utf8) = ?");
                st.setString(1, String.valueOf(p.getCodigo()));
                rs = st.executeQuery();
                
                while (rs.next()) {                    
                    p.setNombre(rs.getString("nombre"));
                    p.setMarca(rs.getString("marca"));
                    p.setFecha_Caducidad(rs.getDate("fecha_caducidad"));
                    p.setCantidad(rs.getInt("cantidad"));
                }
                
                FrmIngresoProducto frm = new FrmIngresoProducto(p);
                frm.setVisible(true);
                                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                    "Ocurrió un error al intentar consultar el producto en la base de datos. "+ e,
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

    public boolean seleccionEdicionValida(){        
        if(tResultado.getSelectedRowCount()!=1){
            JOptionPane.showMessageDialog(this,
                    "Debe seleccionar un registro a editar o eliminar",
                    "Edición",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }        
        return true;    
    }
    
    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        if (seleccionEdicionValida()) {
            ArrayList<Productos> eliminados= new ArrayList<>(); 
            for (int i = 0; i < tResultado.getSelectedRows().length; i++) {
                Productos p = new Productos((int)tResultado.getValueAt(tResultado.getSelectedRows()[i],0));
                eliminados.add(p);                
            }
            PreparedStatement st=null; 
            try{           
                con = Conexion.Conexion.conectar();
                for (int i = 0; i < eliminados.size(); i++) { 
                                       
                    st = con.prepareStatement("DELETE FROM productos WHERE cedula = ?");            
                    st.setInt(1, eliminados.get(i).getCodigo());
                    st.executeUpdate();                    
                    
                    System.out.println("modificación de productos con código: " + eliminados.get(i).getCodigo() + " fue exitosa");
                }
                con.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,
                    "Ocurrió un error al eliminar el producto en la base de datos",
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
    }//GEN-LAST:event_bEliminarActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        suca();
    }//GEN-LAST:event_cbTipoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMantenimientoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmMantenimientoProducto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConsultar;
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bIngresar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JScrollPane spResultado;
    private javax.swing.JTable tResultado;
    private javax.swing.JTextField tfDescripcion;
    // End of variables declaration//GEN-END:variables
}
