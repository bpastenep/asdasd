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
        poke1 = new javax.swing.JComboBox();
        poke3 = new javax.swing.JComboBox();
        poke6 = new javax.swing.JComboBox();
        poke5 = new javax.swing.JComboBox();
        poke2 = new javax.swing.JComboBox();
        poke4 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ata1poke1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ata2poke1 = new javax.swing.JComboBox();
        ata3poke1 = new javax.swing.JComboBox();
        ata4poke1 = new javax.swing.JComboBox();
        ata1poke2 = new javax.swing.JComboBox();
        ata1poke3 = new javax.swing.JComboBox();
        ata1poke4 = new javax.swing.JComboBox();
        ata1poke5 = new javax.swing.JComboBox();
        ata1poke6 = new javax.swing.JComboBox();
        ata1poke7 = new javax.swing.JComboBox();
        ata1poke8 = new javax.swing.JComboBox();
        ata1poke9 = new javax.swing.JComboBox();
        ata1poke10 = new javax.swing.JComboBox();
        ata1poke11 = new javax.swing.JComboBox();
        ata1poke12 = new javax.swing.JComboBox();
        ata1poke13 = new javax.swing.JComboBox();
        ata1poke14 = new javax.swing.JComboBox();
        ata1poke15 = new javax.swing.JComboBox();
        ata1poke16 = new javax.swing.JComboBox();
        ata1poke17 = new javax.swing.JComboBox();
        ata1poke18 = new javax.swing.JComboBox();
        ata1poke19 = new javax.swing.JComboBox();
        ata1poke20 = new javax.swing.JComboBox();
        ata1poke21 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newnombredeusuario.png"))); // NOI18N
        jLabel2.setText("Nombre de Usuario");
        jLabel2.setMaximumSize(new java.awt.Dimension(160, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(160, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(160, 20));
        jLabel2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 60, 170, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newcontraseña.png"))); // NOI18N
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 90, 160, 20);

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user);
        user.setBounds(320, 60, 130, 20);
        getContentPane().add(pass);
        pass.setBounds(320, 90, 130, 20);

        jButton1.setText("Registrarse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 480, 87, 23);

        poke1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        poke1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poke1ActionPerformed(evt);
            }
        });
        getContentPane().add(poke1);
        poke1.setBounds(20, 200, 110, 20);

        poke3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(poke3);
        poke3.setBounds(20, 280, 110, 20);

        poke6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(poke6);
        poke6.setBounds(20, 400, 110, 20);

        poke5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(poke5);
        poke5.setBounds(20, 360, 110, 20);

        poke2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(poke2);
        poke2.setBounds(20, 240, 110, 20);

        poke4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(poke4);
        poke4.setBounds(20, 320, 110, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccionatuequipopokemon.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 120, 310, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccionanombredeuuario.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 10, 310, 40);

        jLabel1.setText("Pokemon");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 170, 50, 14);

        jLabel6.setText("Ataques");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(280, 160, 60, 14);

        ata1poke1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke1);
        ata1poke1.setBounds(170, 240, 56, 20);

        jLabel7.setText("Ataque1");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(180, 180, 50, 14);

        jLabel8.setText("Ataque 2");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 180, 50, 14);

        jLabel9.setText("Ataque 3");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(310, 180, 50, 14);

        jLabel10.setText("Ataque 4");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(380, 180, 50, 14);

        ata2poke1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata2poke1);
        ata2poke1.setBounds(240, 200, 56, 20);

        ata3poke1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata3poke1);
        ata3poke1.setBounds(310, 200, 56, 20);

        ata4poke1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata4poke1);
        ata4poke1.setBounds(380, 200, 56, 20);

        ata1poke2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata1poke2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata1poke2ActionPerformed(evt);
            }
        });
        getContentPane().add(ata1poke2);
        ata1poke2.setBounds(380, 400, 56, 20);

        ata1poke3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke3);
        ata1poke3.setBounds(170, 200, 56, 20);

        ata1poke4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke4);
        ata1poke4.setBounds(240, 240, 56, 20);

        ata1poke5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke5);
        ata1poke5.setBounds(310, 240, 56, 20);

        ata1poke6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke6);
        ata1poke6.setBounds(380, 240, 56, 20);

        ata1poke7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke7);
        ata1poke7.setBounds(170, 280, 56, 20);

        ata1poke8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke8);
        ata1poke8.setBounds(240, 280, 56, 20);

        ata1poke9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke9);
        ata1poke9.setBounds(310, 280, 56, 20);

        ata1poke10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke10);
        ata1poke10.setBounds(380, 280, 56, 20);

        ata1poke11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke11);
        ata1poke11.setBounds(170, 320, 56, 20);

        ata1poke12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke12);
        ata1poke12.setBounds(240, 320, 56, 20);

        ata1poke13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke13);
        ata1poke13.setBounds(310, 320, 56, 20);

        ata1poke14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke14);
        ata1poke14.setBounds(380, 320, 56, 20);

        ata1poke15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke15);
        ata1poke15.setBounds(170, 360, 56, 20);

        ata1poke16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata1poke16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata1poke16ActionPerformed(evt);
            }
        });
        getContentPane().add(ata1poke16);
        ata1poke16.setBounds(240, 360, 56, 20);

        ata1poke17.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata1poke17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata1poke17ActionPerformed(evt);
            }
        });
        getContentPane().add(ata1poke17);
        ata1poke17.setBounds(310, 360, 56, 20);

        ata1poke18.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata1poke18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata1poke18ActionPerformed(evt);
            }
        });
        getContentPane().add(ata1poke18);
        ata1poke18.setBounds(380, 360, 56, 20);

        ata1poke19.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata1poke19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata1poke19ActionPerformed(evt);
            }
        });
        getContentPane().add(ata1poke19);
        ata1poke19.setBounds(170, 400, 56, 20);

        ata1poke20.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata1poke20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata1poke20ActionPerformed(evt);
            }
        });
        getContentPane().add(ata1poke20);
        ata1poke20.setBounds(240, 400, 56, 20);

        ata1poke21.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata1poke21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata1poke21ActionPerformed(evt);
            }
        });
        getContentPane().add(ata1poke21);
        ata1poke21.setBounds(310, 400, 56, 20);

        jLabel11.setText("Nivel");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(530, 160, 23, 14);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(520, 400, 56, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(520, 200, 56, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(520, 240, 56, 20);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(520, 280, 56, 20);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(520, 320, 56, 20);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox6);
        jComboBox6.setBounds(520, 360, 56, 20);

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

    private void poke1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poke1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poke1ActionPerformed

    private void ata1poke2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata1poke2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ata1poke2ActionPerformed

    private void ata1poke16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata1poke16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ata1poke16ActionPerformed

    private void ata1poke17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata1poke17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ata1poke17ActionPerformed

    private void ata1poke18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata1poke18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ata1poke18ActionPerformed

    private void ata1poke19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata1poke19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ata1poke19ActionPerformed

    private void ata1poke20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata1poke20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ata1poke20ActionPerformed

    private void ata1poke21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata1poke21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ata1poke21ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ata1poke1;
    private javax.swing.JComboBox ata1poke10;
    private javax.swing.JComboBox ata1poke11;
    private javax.swing.JComboBox ata1poke12;
    private javax.swing.JComboBox ata1poke13;
    private javax.swing.JComboBox ata1poke14;
    private javax.swing.JComboBox ata1poke15;
    private javax.swing.JComboBox ata1poke16;
    private javax.swing.JComboBox ata1poke17;
    private javax.swing.JComboBox ata1poke18;
    private javax.swing.JComboBox ata1poke19;
    private javax.swing.JComboBox ata1poke2;
    private javax.swing.JComboBox ata1poke20;
    private javax.swing.JComboBox ata1poke21;
    private javax.swing.JComboBox ata1poke3;
    private javax.swing.JComboBox ata1poke4;
    private javax.swing.JComboBox ata1poke5;
    private javax.swing.JComboBox ata1poke6;
    private javax.swing.JComboBox ata1poke7;
    private javax.swing.JComboBox ata1poke8;
    private javax.swing.JComboBox ata1poke9;
    private javax.swing.JComboBox ata2poke1;
    private javax.swing.JComboBox ata3poke1;
    private javax.swing.JComboBox ata4poke1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField pass;
    private javax.swing.JComboBox poke1;
    private javax.swing.JComboBox poke2;
    private javax.swing.JComboBox poke3;
    private javax.swing.JComboBox poke4;
    private javax.swing.JComboBox poke5;
    private javax.swing.JComboBox poke6;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
