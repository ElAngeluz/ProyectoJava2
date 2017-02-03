/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Entidades.Productos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Pedro Abel
 */
public class FrmIngresoProducto extends javax.swing.JFrame {

    /**
     * Creates new form FrmIngresoProducto
     */
    
    private boolean editar = false;
    
    public FrmIngresoProducto() {
        initComponents();
        editar = false;
    }
    
    private Connection con;

    public FrmIngresoProducto(Productos p) {
        initComponents();
        editar = true;
        tfCodigo.setEnabled(!editar);
        tfCodigo.setText(String.valueOf(p.getCodigo()));
        tfCantidad.setText(String.valueOf(p.getCantidad()));
        tfFecha.setText(String.valueOf(p.getFecha_Caducidad()));
        tfMarca.setText(String.valueOf(p.getMarca()));
        tfNombre.setText(String.valueOf(p.getNombre()));
        tfPrecio.setText(String.valueOf(p.getPrecio()));
        tfIva.setText(String.valueOf(p.getIva()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lNombre = new javax.swing.JLabel();
        lMarca = new javax.swing.JLabel();
        lCantidad = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfMarca = new javax.swing.JTextField();
        tfCantidad = new javax.swing.JTextField();
        bIngresar = new javax.swing.JButton();
        bLimpiar = new javax.swing.JButton();
        lCodigo = new javax.swing.JLabel();
        lFecha = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfFecha = new javax.swing.JTextField();
        lCantidad1 = new javax.swing.JLabel();
        tfPrecio = new javax.swing.JTextField();
        tfIva = new javax.swing.JTextField();
        lCantidad2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lNombre.setText("NOMBRE");

        lMarca.setText("MARCA");

        lCantidad.setText("CANTIDAD");

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

        lCodigo.setText("CODIGO");

        lFecha.setText("FECHA CAD.");

        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        lCantidad1.setText("PRECIO");

        lCantidad2.setText("VALOR IVA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(bIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addComponent(bLimpiar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addComponent(lNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lFecha)
                            .addComponent(lCodigo))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNombre)
                            .addComponent(tfMarca)
                            .addComponent(tfCantidad)
                            .addComponent(tfFecha)
                            .addComponent(tfCodigo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lCantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPrecio)
                            .addComponent(tfIva))))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFecha)
                    .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bIngresar)
                    .addComponent(bLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void bIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIngresarActionPerformed
        if(ValidacionControles()){
            PreparedStatement st = null;
            try {
                LocalDate todayLocalDate = LocalDate.now( ZoneId.of( "America/Montreal" ) );

                Productos p = new Productos(Integer.parseInt(tfCodigo.getText()), tfNombre.getText(), 
                    tfMarca.getText(), Date.valueOf(todayLocalDate), Integer.parseInt(tfCantidad.getText()), tfPrecio.getText(), tfIva.getText());

                con = Conexion.Conexion.conectar();
                if (editar) {
                    st = con.prepareStatement("UPDATE productos set nombre=?, marca = ?, fecha_caducidad = ?, cantidad=?, precio=?, iva=?  WHERE codigo = ?");  
                    st.setString(1, p.getNombre());
                    st.setString(2, p.getMarca());
                    st.setDate(3, Date.valueOf(todayLocalDate));
                    st.setInt(4, p.getCantidad());
                    st.setString(5, p.getPrecio());
                    st.setString(6, p.getIva());
                    st.setInt(7, p.getCodigo());
                    
                    st.executeUpdate();
                    
                    System.out.println("Actualización de productos exitosa");                    
                    
                }else{                    
                    st = con.prepareStatement("INSERT INTO productos(id,codigo,nombre,marca,fecha_caducidad,cantidad,precio,iva) VALUES(null,?,?,?,?,?,?,?) ");
                    st.setInt(1, p.getCodigo());
                    st.setString(2, p.getNombre());
                    st.setString(3, p.getMarca());
                    st.setDate(4, Date.valueOf(todayLocalDate));
                    st.setInt(5, p.getCantidad());
                    st.setString(6, p.getPrecio());
                    st.setString(7, p.getIva());
                    
                    st.executeUpdate();

                    System.out.println("Ingreso de productos exitoso");                    
                   
                }
                limpiarFormulario();
                
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(FrmIngresoProducto.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(FrmIngresoProducto.class.getName()).log(Level.SEVERE, null, ex);
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
    
    private void limpiarFormulario(){
        tfNombre.setText(null);
        tfMarca.setText(null);
        tfCantidad.setText(null);
        tfCodigo.setText(null);
        tfFecha.setText(null);
        tfPrecio.setText(null);
        tfIva.setText(null);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIngresoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmIngresoProducto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bIngresar;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JLabel lCantidad;
    private javax.swing.JLabel lCantidad1;
    private javax.swing.JLabel lCantidad2;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lFecha;
    private javax.swing.JLabel lMarca;
    private javax.swing.JLabel lNombre;
    private javax.swing.JTextField tfCantidad;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfIva;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPrecio;
    // End of variables declaration//GEN-END:variables

    /*
    Funcion que valida que los campos de los controles esten en formato válido
    */
    private boolean ValidacionControles() {
        try {
            Integer.parseInt(tfCantidad.getText());            
        } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(this,
                "La cantidad debe tener valores válidos",
                "Ingresar",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            Integer.parseInt(tfPrecio.getText());            
        } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(this,
                "El precio debe tener valores válidos",
                "Ingresar",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            Double.parseDouble(tfIva.getText());
        } catch (NumberFormatException e) {
             JOptionPane.showMessageDialog(this,
                "El iva debe tener valores válidos, por ejemplo 0.14",
                "Ingresar",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try {
            Integer.parseInt(tfCodigo.getText());            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                "El código debe tener valores válidos",
                "Ingresar",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (tfNombre.getText().isEmpty() || tfMarca.getText().isEmpty() || tfFecha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "El formulario tiene valores no válidos",
                "Ingresar",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return productoValido(tfCodigo.getText()); //verifica que no se haya ingresado un producto con el mismo codigo en la base de datos
    }

    /*
    funcion que verifica que no se ingrese un producto con el mismo codigo, retorna true en caso de que no exista un producto de igual codigo
    @_codigo: codigo del producto 
    */
    private boolean productoValido(String _codigo) {        
        if (!editar) {
            ResultSet rs=null;                       
            PreparedStatement st=null;
            try
            {   
                con = Conexion.Conexion.conectar();
                st = con.prepareStatement("SELECT * FROM productos WHERE codigo = ?");            
                st.setString(1,_codigo);    
                rs = st.executeQuery(); 
                if(rs.next()){
                    JOptionPane.showMessageDialog(this,
                        "Existe un producto con el mismo código",
                        "Ingresar",
                        JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                return true;
            }        
            catch(Exception e){
                    JOptionPane.showMessageDialog(this,
                        "Error en la consulta de producto. (Validacion) \n" + e,
                        "Ingresar",
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
}
