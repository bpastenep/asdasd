package Vista;

import Controlador.*;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import static sun.applet.AppletResourceLoader.getImage;


public class VistaPrincipal extends javax.swing.JFrame {
    
    private final ControladorPrincipal cp;
    public ControladorTorreBatalla ctdb;
    public ControladorCombate cc;
    public ControladorLiga cl;
    public String nUsuarioL;
    public String[] tC = {"Tipo de combate", "Usuario vs Usuario", "Usuario vs CPU"};
    public String[] nTdeB = {"Numero de Batallas", "5", "25", "50", "100"};
    
    
    public VistaPrincipal(ControladorPrincipal co, String n) {
        initComponents();
        this.cp = co;
        this.nUsuarioL=n;
        this.jLabel4.setText(n);
        tipoCombate.setModel(new javax.swing.DefaultComboBoxModel(tC));
        comienzaCombate.setVisible(false);
        tipoCombate.setEnabled(false);
        numTdeB.setModel(new javax.swing.DefaultComboBoxModel(nTdeB));
        comienzaTB.setVisible(false);
        numTdeB.setEnabled(false);
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
        simulaCombate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tipoCombate = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        comienzaCombate = new javax.swing.JButton();
        comienzaTB = new javax.swing.JButton();
        numTdeB = new javax.swing.JComboBox();
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
        jButton1.setBounds(190, 340, 170, 23);

        simulaCombate.setText("Simular Combate");
        simulaCombate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulaCombateActionPerformed(evt);
            }
        });
        getContentPane().add(simulaCombate);
        simulaCombate.setBounds(130, 100, 130, 23);
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
        tipoCombate.setBounds(290, 100, 120, 20);

        jButton2.setText("Torre de Batalla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 200, 130, 23);

        jButton3.setText("Liga Pokémon");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(190, 290, 170, 23);

        comienzaCombate.setText("OK");
        comienzaCombate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comienzaCombateActionPerformed(evt);
            }
        });
        getContentPane().add(comienzaCombate);
        comienzaCombate.setBounds(240, 140, 70, 30);

        comienzaTB.setText("OK");
        comienzaTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comienzaTBActionPerformed(evt);
            }
        });
        getContentPane().add(comienzaTB);
        comienzaTB.setBounds(240, 240, 70, 30);

        numTdeB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        numTdeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTdeBActionPerformed(evt);
            }
        });
        getContentPane().add(numTdeB);
        numTdeB.setBounds(290, 200, 120, 20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VistaPrincipal2.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(3, 0, 550, 483);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        VistaLogin vl = new VistaLogin(this,true);
        vl.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void simulaCombateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulaCombateActionPerformed
        numTdeB.setEnabled(false);
        tipoCombate.setEnabled(true);
    }//GEN-LAST:event_simulaCombateActionPerformed

    private void tipoCombateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoCombateActionPerformed
        if(tipoCombate.getSelectedIndex() != 0){
            comienzaCombate.setVisible(true);
        }
        else{
            comienzaCombate.setVisible(false);
        }
    }//GEN-LAST:event_tipoCombateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        comienzaCombate.setVisible(false);
        tipoCombate.setEnabled(false);
        numTdeB.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        comienzaCombate.setVisible(false);
        tipoCombate.setEnabled(false);
        cl = new ControladorLiga();
        cl.iniciarVliga();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void comienzaCombateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comienzaCombateActionPerformed
        if(tipoCombate.getSelectedIndex() == 1){
            String usuario2 = JOptionPane.showInputDialog("Ingrese nombre del segundo usuario: ");
            ControladorCombate cc = new ControladorCombate(cp,nUsuarioL,usuario2);
            cc.iniciarVUvU();
        }
        else if(tipoCombate.getSelectedIndex() == 2){
            ControladorCombateCpu ccpu = new ControladorCombateCpu(cp, nUsuarioL);
            ccpu.iniciarVUvsCpu();
        }
    }//GEN-LAST:event_comienzaCombateActionPerformed

    private void numTdeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTdeBActionPerformed
        if(numTdeB.getSelectedIndex() != 0)
            comienzaTB.setVisible(true);
        else
            comienzaTB.setVisible(false);
    }//GEN-LAST:event_numTdeBActionPerformed

    private void comienzaTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comienzaTBActionPerformed
        ControladorTorreBatalla ctb = new ControladorTorreBatalla(nUsuarioL, cp/*numTdeB.getSelectedIndex()*/);
        ctb.iniciaTdB();
    }//GEN-LAST:event_comienzaTBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comienzaCombate;
    private javax.swing.JButton comienzaTB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox numTdeB;
    private javax.swing.JButton simulaCombate;
    private javax.swing.JComboBox tipoCombate;
    // End of variables declaration//GEN-END:variables
}