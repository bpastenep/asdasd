/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.ControladorCombate;
import Controlador.ControladorPrincipal;
import Controlador.ControladorCombateCpu;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import static sun.applet.AppletResourceLoader.getImage;

/**
 *
 * @author Benjamin
 */
public class VistaPrincipal extends javax.swing.JFrame {
    
    private final ControladorPrincipal cp;
    public String nUsuarioL;
    public String[] tC = {"Usuario vs Usuario", "Usuario vs CPU"};
    
    public VistaPrincipal(ControladorPrincipal co, String n) {
        initComponents();
        this.cp = co;
        this.nUsuarioL=n;
        this.jLabel4.setText(n);
        tipoCombate.setModel(new javax.swing.DefaultComboBoxModel(tC));
    }

@Override
public Image getIconImage(){
    Image refValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));
    return refValue;        
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tipoCombate = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(553, 483));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Vista principal");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(241, 38, 138, 14);

        jButton1.setText("Cerrar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 200, 170, 23);

        jButton3.setText("Simular Combate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(190, 160, 170, 23);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(241, 13, 109, 0);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(94, 13, 102, 0);

        tipoCombate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tipoCombate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoCombateActionPerformed(evt);
            }
        });
        getContentPane().add(tipoCombate);
        tipoCombate.setBounds(190, 110, 170, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VistaPrincipal2.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(3, 0, 550, 483);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VistaLogin vl = new VistaLogin(this,true);
        vl.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(tipoCombate.getSelectedIndex() == 0){
        String usuario2 = JOptionPane.showInputDialog("Ingrese nombre del segundo usuario: ");
        ControladorCombate cc = new ControladorCombate(cp,nUsuarioL,usuario2);
        cc.iniciarVUvU();
        }
        else if(tipoCombate.getSelectedIndex() == 1){
            //NULL POINTER EXCEPTION ??? D:
            ControladorCombateCpu ccpu = new ControladorCombateCpu(cp, nUsuarioL);
            ccpu.iniciarVUvsCpu();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tipoCombateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoCombateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoCombateActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox tipoCombate;
    // End of variables declaration//GEN-END:variables
}
