/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Entidades.FacturaVentacCab;
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
 * @author parivera
 */
public class frmMantenimientoFactura extends javax.swing.JFrame {

    private Connection con;
    
    /**
     * Creates new form frmMantenimientoFactura
     */
    public frmMantenimientoFactura() {
        initComponents();
        suca();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbTipo = new javax.swing.JComboBox<>();
        tfDescripcion = new javax.swing.JTextField();
        bConsultar = new javax.swing.JButton();
        spResultado = new javax.swing.JScrollPane();
        tResultado = new javax.swing.JTable();
        bEliminar = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        bIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ESTADO", "CLIENTE" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
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
                "CODIGO", "CODIGO CLIENTE", "ESTADO", "FECHA", "SUBTOTAL", "IVA", "PRECIO"
            }
        ));
        spResultado.setViewportView(tResultado);

        bEliminar.setText("ELIMINAR");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bEditar.setText("EDITAR");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bIngresar.setText("INGRESAR");
        bIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bConsultar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bIngresar)
                        .addGap(229, 229, 229)
                        .addComponent(bEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bEliminar))
                    .addComponent(spResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bConsultar)
                    .addComponent(cbTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIngresar)
                    .addComponent(bEditar)
                    .addComponent(bEliminar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        suca();
    }//GEN-LAST:event_cbTipoActionPerforme

    private void tfDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescripcionActionPerformed
        suca();
    }//GEN-LAST:event_tfDescripcionActionPerformed

    private void bConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarActionPerformed
        consultarRegistros();
    }//GEN-LAST:event_bConsultarActionPerformed

    private void consultarRegistros() {
        if (formularioValido()) {
            ResultSet rs=null; 
            PreparedStatement st=null;
            try {
                                
                ArrayList<FacturaVentacCab> resultado= new ArrayList<>();
                String tipo = String.valueOf(cbTipo.getSelectedItem());
                
                con = Conexion.Conexion.conectar(); 
                                   
                if(tipo.equalsIgnoreCase("Todos")){
                    st = con.prepareStatement("SELECT * FROM ventascabecera ");            
                    rs = st.executeQuery();
                }else if (tipo.equalsIgnoreCase("codigo")){                              
                    st = con.prepareStatement("SELECT * FROM ventascabecera WHERE estado = 'efectiva' and idcliente like ? ");    
                    st.setString(1, "%"+String.valueOf(tfDescripcion.getText().toLowerCase())+"%");
                    rs = st.executeQuery();
                }else{
                    st = con.prepareStatement("SELECT * FROM ventascabecera WHERE estado like ?");                            
                    st.setString(1, "%"+String.valueOf(tfDescripcion.getText().toLowerCase())+"%");                    
                    rs = st.executeQuery();
                }
                
                while(rs.next())
                {
                    resultado.add(new FacturaVentacCab(rs.getString("estado"), rs.getString("codigo"), rs.getString("idcliente"), 
                            rs.getDate("fecha"), rs.getDouble("iva"), rs.getDouble("subtotal"), rs.getDouble("total")));
                }
                
                DefaultTableModel dtm = (DefaultTableModel) tResultado.getModel();
                dtm.setRowCount(0);
                ArrayList<Object> fila;
                for (FacturaVentacCab p:resultado) {
                    fila = new ArrayList<>();
                    fila.add(p.getCodigoFactura());
                    fila.add(p.getIdCliente());
                    fila.add(p.getEstado());                    
                    fila.add(p.getFecha());
                    fila.add(p.getSubtotal());                    
                    fila.add(p.getIva());
                    fila.add(p.getTotal());
                    dtm.addRow(fila.toArray());
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                    "No se puede consultar! en la base de datos: "+ e,
                    "Facturación",
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
                    "El código debe ser de solo número",
                    "Consulta",
                    JOptionPane.ERROR_MESSAGE);
                return false;
            }    
        }        
        return true;
    }
    
    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        if (seleccionEdicionValida()) {            
            
            PreparedStatement st=null;
            try{
                con = Conexion.Conexion.conectar();
                
                st = con.prepareStatement("Update ventascabecera set estado='anulada' WHERE codigo = ?");
                st.setString(1, String.valueOf(tResultado.getValueAt(tResultado.getSelectedRow(),0)));
                st.executeUpdate();                  

                System.out.println("Anulación de factura con código: " + tResultado.getValueAt(tResultado.getSelectedRow(),0) + " fue exitosa");
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,
                    "Ocurrió un error al anular la factuea en la base de datos",
                    "Facturación",
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
    }

    public boolean seleccionEdicionValida(){        
        if(!(tResultado.getSelectedRowCount() >=1)){
            JOptionPane.showMessageDialog(this,
                    "Debe seleccionar al menos un registro a editar o eliminar",
                    "Facturación",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }        
        return true;    
    }
    
    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {
        if(seleccionEdicionValida()){
            FacturaVentacCab f= null;
            ResultSet rs=null;
            PreparedStatement st=null;
            try {
                con = Conexion.Conexion.conectar();

                st = con.prepareStatement("SELECT * FROM ventascabecera WHERE codigo = ?");
                st.setString(1, String.valueOf(tResultado.getValueAt(tResultado.getSelectedRows()[0],0)));
                rs = st.executeQuery();
                
                while (rs.next()) {                    
                    f= new FacturaVentacCab(rs.getString("estado"), rs.getString("codigo"), rs.getString("idcliente"),rs.getDate("fecha") 
                            , rs.getDouble("iva"), rs.getDouble("subtotal"), rs.getDouble("total"));
                }
                
                frmIngresarVentas frm  = new frmIngresarVentas(f);
                frm.setVisible(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                    "Ocurrió un error al intentar consultar la factura en la base de datos. "+ e,
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
        frmIngresarVentas frm = new frmIngresarVentas();
        frm.setVisible(true);
    }//GEN-LAST:event_bIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmMantenimientoFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMantenimientoFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMantenimientoFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMantenimientoFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmMantenimientoFactura().setVisible(true);
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

    private void suca() {
        if(String.valueOf(cbTipo.getSelectedItem()).equalsIgnoreCase("Todos"))
            tfDescripcion.setEditable(false);
        else
            tfDescripcion.setEditable(true);   
        tfDescripcion.setText(null);
    }
}
