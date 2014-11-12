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
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setText("Nombre de Usuario");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(39, 78, 91, 14);

        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(39, 116, 56, 14);

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user);
        user.setBounds(165, 75, 103, 20);
        getContentPane().add(pass);
        pass.setBounds(165, 113, 103, 20);

        jButton1.setText("Registrarse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 170, 87, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vistaCreaU2.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          if (user.getText().isEmpty() || pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nombre de uauario o contraseña vacios");
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
