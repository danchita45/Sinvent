/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import sinvent.ConexionSQL;
import sinvent.IncAuto;

/**
 *
 * @author hp
 */
public class C_Proveedor extends javax.swing.JFrame {

    /**
     * Creates new form C_compra
     */
    ConexionSQL cc= new ConexionSQL();
      Connection con = cc.conexion();
        
    public C_Proveedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void Borra(){
        String a= id_proveedores.getText();
        
        String SQL = "delete from proveedores where id_proveedor= '"+a+"'";
        try {
             PreparedStatement pst= con.prepareStatement(SQL);
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "Borrado con exito");
             OpcionesProveedores1 b= new OpcionesProveedores1();
             b.setVisible(true);
             this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo borrar"+ e.getMessage());
       }
       
        
        
    }
    public void Validar (){
        if(!id_proveedores.getText().isEmpty()){
            Eliminar.setEnabled(true);
        }else{
            Eliminar.setEnabled(false);
        }
    }
    public void Muestra(){
        IncAuto a= new IncAuto();
        U_id.setText(String.valueOf(a.autoincProveedor()));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        id_proveedores = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        U_id = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Mensaje = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese ID del Proveedor:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, 41));

        id_proveedores.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        id_proveedores.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                id_proveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                id_proveedoresMouseExited(evt);
            }
        });
        id_proveedores.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                id_proveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(id_proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 160, -1));

        Buscar.setBackground(new java.awt.Color(255, 255, 0));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sinvent/busca.png"))); // NOI18N
        Buscar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 70, -1));

        Eliminar.setBackground(new java.awt.Color(255, 0, 0));
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sinvent/papelera.png"))); // NOI18N
        Eliminar.setEnabled(false);
        Eliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 70, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel2.setText("N° Proveedor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, 29));

        U_id.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        getContentPane().add(U_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 110, 29));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sinvent/Exit.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 32, 28));

        Mensaje.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        Mensaje.setText("Se recomienda ingresar un valor menor al actual");
        Mensaje.setEnabled(false);
        getContentPane().add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 280, 37));
        Mensaje.setVisible(false);

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel4.setText("Buscar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 60, 29));

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel3.setText("Eliminar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 70, 29));

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel5.setText("Eliminar Proveedor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sinvent/fondo.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        Muestra();
        Validar();
    }//GEN-LAST:event_BuscarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Borra();
    }//GEN-LAST:event_EliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        OpcionesProveedores1 a= new OpcionesProveedores1();
        a.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void id_proveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_proveedoresMouseEntered
        Mensaje.setVisible(true);
    }//GEN-LAST:event_id_proveedoresMouseEntered

    private void id_proveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_proveedoresMouseExited
        Mensaje.setVisible(false);
    }//GEN-LAST:event_id_proveedoresMouseExited

    private void id_proveedoresActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_id_proveedoresActionPerformed
    {//GEN-HEADEREND:event_id_proveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_proveedoresActionPerformed

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
            java.util.logging.Logger.getLogger(C_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel U_id;
    private javax.swing.JTextField id_proveedores;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
