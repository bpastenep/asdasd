/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.Escribir;
import Controlador.ControladorCreaUsuario;
import java.io.IOException;
import java.sql.SQLException;
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
    
    public VistaCreaU(ControladorCreaUsuario parent, boolean modal) throws SQLException {
        initComponents();
        this.cu=parent;
        String[] nvl = new String[101];
        nvl[0]="¿Nivel?";
        String[] pokeBD = parent.devuelvePoke();
        for (int niveles=1; niveles<100; niveles++){
            nvl[niveles]=""+(niveles+1);
        }
        NvP1.setModel(new javax.swing.DefaultComboBoxModel(nvl));
        NvP2.setModel(new javax.swing.DefaultComboBoxModel(nvl));
        NvP3.setModel(new javax.swing.DefaultComboBoxModel(nvl));
        NvP4.setModel(new javax.swing.DefaultComboBoxModel(nvl));
        NvP5.setModel(new javax.swing.DefaultComboBoxModel(nvl));
        NvP6.setModel(new javax.swing.DefaultComboBoxModel(nvl));
        poke1.setModel(new javax.swing.DefaultComboBoxModel(pokeBD));
        poke2.setModel(new javax.swing.DefaultComboBoxModel(pokeBD));
        poke3.setModel(new javax.swing.DefaultComboBoxModel(pokeBD));
        poke4.setModel(new javax.swing.DefaultComboBoxModel(pokeBD));
        poke5.setModel(new javax.swing.DefaultComboBoxModel(pokeBD));
        poke6.setModel(new javax.swing.DefaultComboBoxModel(pokeBD));
        ata1poke1.setVisible(false);
        ata2poke1.setVisible(false);
        ata3poke1.setVisible(false);
        ata4poke1.setVisible(false);
        ata1poke2.setVisible(false);
        ata2poke2.setVisible(false);
        ata3poke2.setVisible(false);
        ata4poke2.setVisible(false);
        ata1poke3.setVisible(false);
        ata2poke3.setVisible(false);
        ata3poke3.setVisible(false);
        ata4poke3.setVisible(false);
        ata1poke4.setVisible(false);
        ata2poke4.setVisible(false);
        ata3poke4.setVisible(false);
        ata4poke4.setVisible(false);
        ata1poke5.setVisible(false);
        ata2poke5.setVisible(false);
        ata3poke5.setVisible(false);
        ata4poke5.setVisible(false);
        ata1poke6.setVisible(false);
        ata2poke6.setVisible(false);
        ata3poke6.setVisible(false);
        ata4poke6.setVisible(false);        
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
        ata1poke2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ata2poke1 = new javax.swing.JComboBox();
        ata3poke1 = new javax.swing.JComboBox();
        ata4poke1 = new javax.swing.JComboBox();
        ata4poke6 = new javax.swing.JComboBox();
        ata1poke1 = new javax.swing.JComboBox();
        ata2poke2 = new javax.swing.JComboBox();
        ata3poke2 = new javax.swing.JComboBox();
        ata4poke2 = new javax.swing.JComboBox();
        ata1poke3 = new javax.swing.JComboBox();
        ata2poke3 = new javax.swing.JComboBox();
        ata3poke3 = new javax.swing.JComboBox();
        ata4poke3 = new javax.swing.JComboBox();
        ata1poke4 = new javax.swing.JComboBox();
        ata2poke4 = new javax.swing.JComboBox();
        ata3poke4 = new javax.swing.JComboBox();
        ata4poke4 = new javax.swing.JComboBox();
        ata1poke5 = new javax.swing.JComboBox();
        ata2poke5 = new javax.swing.JComboBox();
        ata3poke5 = new javax.swing.JComboBox();
        ata4poke5 = new javax.swing.JComboBox();
        ata1poke6 = new javax.swing.JComboBox();
        ata2poke6 = new javax.swing.JComboBox();
        ata3poke6 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        NvP6 = new javax.swing.JComboBox();
        NvP1 = new javax.swing.JComboBox();
        NvP2 = new javax.swing.JComboBox();
        NvP3 = new javax.swing.JComboBox();
        NvP4 = new javax.swing.JComboBox();
        NvP5 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        nombre2 = new javax.swing.JTextField();
        nombre3 = new javax.swing.JTextField();
        nombre4 = new javax.swing.JTextField();
        nombre5 = new javax.swing.JTextField();
        nombre6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
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

        ata1poke2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke2);
        ata1poke2.setBounds(170, 240, 56, 20);

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

        ata4poke6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata4poke6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata4poke6ActionPerformed(evt);
            }
        });
        getContentPane().add(ata4poke6);
        ata4poke6.setBounds(380, 400, 56, 20);

        ata1poke1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke1);
        ata1poke1.setBounds(170, 200, 56, 20);

        ata2poke2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata2poke2);
        ata2poke2.setBounds(240, 240, 56, 20);

        ata3poke2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata3poke2);
        ata3poke2.setBounds(310, 240, 56, 20);

        ata4poke2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata4poke2);
        ata4poke2.setBounds(380, 240, 56, 20);

        ata1poke3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke3);
        ata1poke3.setBounds(170, 280, 56, 20);

        ata2poke3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata2poke3);
        ata2poke3.setBounds(240, 280, 56, 20);

        ata3poke3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata3poke3);
        ata3poke3.setBounds(310, 280, 56, 20);

        ata4poke3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata4poke3);
        ata4poke3.setBounds(380, 280, 56, 20);

        ata1poke4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke4);
        ata1poke4.setBounds(170, 320, 56, 20);

        ata2poke4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata2poke4);
        ata2poke4.setBounds(240, 320, 56, 20);

        ata3poke4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata3poke4);
        ata3poke4.setBounds(310, 320, 56, 20);

        ata4poke4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata4poke4);
        ata4poke4.setBounds(380, 320, 56, 20);

        ata1poke5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata1poke5);
        ata1poke5.setBounds(170, 360, 56, 20);

        ata2poke5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata2poke5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata2poke5ActionPerformed(evt);
            }
        });
        getContentPane().add(ata2poke5);
        ata2poke5.setBounds(240, 360, 56, 20);

        ata3poke5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata3poke5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata3poke5ActionPerformed(evt);
            }
        });
        getContentPane().add(ata3poke5);
        ata3poke5.setBounds(310, 360, 56, 20);

        ata4poke5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata4poke5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata4poke5ActionPerformed(evt);
            }
        });
        getContentPane().add(ata4poke5);
        ata4poke5.setBounds(380, 360, 56, 20);

        ata1poke6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata1poke6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata1poke6ActionPerformed(evt);
            }
        });
        getContentPane().add(ata1poke6);
        ata1poke6.setBounds(170, 400, 56, 20);

        ata2poke6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata2poke6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata2poke6ActionPerformed(evt);
            }
        });
        getContentPane().add(ata2poke6);
        ata2poke6.setBounds(240, 400, 56, 20);

        ata3poke6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata3poke6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata3poke6ActionPerformed(evt);
            }
        });
        getContentPane().add(ata3poke6);
        ata3poke6.setBounds(310, 400, 56, 20);

        jLabel11.setText("Nivel");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(530, 160, 23, 14);

        NvP6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(NvP6);
        NvP6.setBounds(520, 400, 56, 20);

        NvP1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(NvP1);
        NvP1.setBounds(520, 200, 56, 20);

        NvP2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(NvP2);
        NvP2.setBounds(520, 240, 56, 20);

        NvP3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(NvP3);
        NvP3.setBounds(520, 280, 56, 20);

        NvP4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(NvP4);
        NvP4.setBounds(520, 320, 56, 20);

        NvP5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(NvP5);
        NvP5.setBounds(520, 360, 56, 20);

        jLabel12.setText("Nombre");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(670, 160, 37, 14);
        getContentPane().add(nombre1);
        nombre1.setBounds(670, 200, 120, 20);

        nombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre2ActionPerformed(evt);
            }
        });
        getContentPane().add(nombre2);
        nombre2.setBounds(670, 240, 120, 20);

        nombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre3ActionPerformed(evt);
            }
        });
        getContentPane().add(nombre3);
        nombre3.setBounds(670, 280, 120, 20);
        getContentPane().add(nombre4);
        nombre4.setBounds(670, 320, 120, 20);
        getContentPane().add(nombre5);
        nombre5.setBounds(670, 360, 120, 20);
        getContentPane().add(nombre6);
        nombre6.setBounds(670, 400, 120, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Validaciones correspondientes   
        if (user.getText().isEmpty() || pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña vacíos");
        }
        else{
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void poke1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poke1ActionPerformed
        if(poke1.getSelectedIndex()!=0){
            
            ata1poke1.setVisible(true);
            
        }
    }//GEN-LAST:event_poke1ActionPerformed

    private void ata4poke6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata4poke6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ata4poke6ActionPerformed

    private void ata2poke5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata2poke5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ata2poke5ActionPerformed

    private void ata3poke5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata3poke5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ata3poke5ActionPerformed

    private void ata4poke5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata4poke5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ata4poke5ActionPerformed

    private void ata1poke6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata1poke6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ata1poke6ActionPerformed

    private void ata2poke6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata2poke6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ata2poke6ActionPerformed

    private void ata3poke6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata3poke6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ata3poke6ActionPerformed

    private void nombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre3ActionPerformed

    private void nombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre2ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox NvP1;
    private javax.swing.JComboBox NvP2;
    private javax.swing.JComboBox NvP3;
    private javax.swing.JComboBox NvP4;
    private javax.swing.JComboBox NvP5;
    private javax.swing.JComboBox NvP6;
    private javax.swing.JComboBox ata1poke1;
    private javax.swing.JComboBox ata1poke2;
    private javax.swing.JComboBox ata1poke3;
    private javax.swing.JComboBox ata1poke4;
    private javax.swing.JComboBox ata1poke5;
    private javax.swing.JComboBox ata1poke6;
    private javax.swing.JComboBox ata2poke1;
    private javax.swing.JComboBox ata2poke2;
    private javax.swing.JComboBox ata2poke3;
    private javax.swing.JComboBox ata2poke4;
    private javax.swing.JComboBox ata2poke5;
    private javax.swing.JComboBox ata2poke6;
    private javax.swing.JComboBox ata3poke1;
    private javax.swing.JComboBox ata3poke2;
    private javax.swing.JComboBox ata3poke3;
    private javax.swing.JComboBox ata3poke4;
    private javax.swing.JComboBox ata3poke5;
    private javax.swing.JComboBox ata3poke6;
    private javax.swing.JComboBox ata4poke1;
    private javax.swing.JComboBox ata4poke2;
    private javax.swing.JComboBox ata4poke3;
    private javax.swing.JComboBox ata4poke4;
    private javax.swing.JComboBox ata4poke5;
    private javax.swing.JComboBox ata4poke6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField nombre2;
    private javax.swing.JTextField nombre3;
    private javax.swing.JTextField nombre4;
    private javax.swing.JTextField nombre5;
    private javax.swing.JTextField nombre6;
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
