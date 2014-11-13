/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.Escribir;
import Controlador.ControladorCreaUsuario;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Benjamin
 */
public class VistaCreaU extends javax.swing.JDialog {

    /**
     * Creates new form VistaCreaU2
     */
    private final ControladorCreaUsuario cu;
    public VistaCreaU(ControladorCreaUsuario parent, boolean modal) {
        //super(parent, modal);
        initComponents();
        this.cu=parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(400, 330));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nombreUsuario.png"))); // NOI18N
        jLabel2.setText("Nombre de Usuario");
        jLabel2.setMaximumSize(new java.awt.Dimension(160, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(160, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(160, 20));
        jLabel2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 170, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contraseña.png"))); // NOI18N
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, 130, 160, 20);

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user);
        user.setBounds(210, 90, 103, 20);
        getContentPane().add(pass);
        pass.setBounds(210, 130, 103, 20);

        jButton1.setText("Registrarse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 200, 87, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vistaCreaU13.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          if (user.getText().isEmpty() || pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña vacíos");
        }
        else{
            String linea;
            Escribir es = new Escribir();
            try {
                es.escribirArchivo(user.getText(), pass.getText(), true, cu); 
                this.setVisible(false);
                
            } catch (IOException ex) {
                Logger.getLogger(VistaCreaU.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
