package Vista;

import Controlador.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static sun.applet.AppletResourceLoader.getImage;


public class VistaPrincipal extends javax.swing.JFrame {
    
    private final ControladorPrincipal cp;
    private ControladorTorreBatalla ctdb;
    private ControladorCombate cc;
    private ControladorLiga cl;
    private ControladorCombateCpuVs ccpuvs;
    private String nUsuarioL;
    private String[] tC = {"Tipo de combate", "Usuario vs Usuario", "Usuario vs CPU", "CPU vs CPU"};
    private String[] nTdeB = {"Numero de Batallas", "5", "25", "50", "100", "Continuar"};
    
    
    public VistaPrincipal(ControladorPrincipal co, String n) {
        initComponents();
        this.cp = co;
        this.nUsuarioL = n;
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

        jButton1 = new javax.swing.JButton();
        simulaCombate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tipoCombate = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        ligaPkmn = new javax.swing.JButton();
        comienzaCombate = new javax.swing.JButton();
        comienzaTB = new javax.swing.JButton();
        numTdeB = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(530, 483));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Cerrar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 340, 170, 23);

        simulaCombate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        simulaCombate.setForeground(new java.awt.Color(255, 0, 0));
        simulaCombate.setText("Simular Combate");
        simulaCombate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulaCombateActionPerformed(evt);
            }
        });
        getContentPane().add(simulaCombate);
        simulaCombate.setBounds(120, 100, 140, 23);
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

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Torre de Batalla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 200, 130, 23);

        ligaPkmn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ligaPkmn.setForeground(new java.awt.Color(255, 0, 0));
        ligaPkmn.setText("Liga Pokémon");
        ligaPkmn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ligaPkmnActionPerformed(evt);
            }
        });
        getContentPane().add(ligaPkmn);
        ligaPkmn.setBounds(190, 290, 170, 23);

        comienzaCombate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comienzaCombate.setForeground(new java.awt.Color(255, 0, 0));
        comienzaCombate.setText("OK");
        comienzaCombate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comienzaCombateActionPerformed(evt);
            }
        });
        getContentPane().add(comienzaCombate);
        comienzaCombate.setBounds(240, 140, 70, 30);

        comienzaTB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        comienzaTB.setForeground(new java.awt.Color(255, 0, 0));
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
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VistaPrinciplNew666uchihamadara.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 530, 580);

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 240, 160, 14);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        cp.iniciarL();
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
        JOptionPane.showMessageDialog(null, "IMPORTANTE: En caso de ya tener datos en la Torre de Batalla, sino selecciona continuar, perderá su progreso");
        comienzaCombate.setVisible(false);
        tipoCombate.setEnabled(false);
        numTdeB.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ligaPkmnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ligaPkmnActionPerformed
        comienzaCombate.setVisible(false);
        tipoCombate.setEnabled(false);
        try {
            cl = new ControladorLiga();
            
            cl.iniciarVliga();
        } catch (SQLException ex){System.out.println(ex);
        }
    }//GEN-LAST:event_ligaPkmnActionPerformed

    private void comienzaCombateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comienzaCombateActionPerformed
        if(tipoCombate.getSelectedIndex() == 1){
            String usuario2 = JOptionPane.showInputDialog("Ingrese nombre del segundo usuario: ");
            try { cc = new ControladorCombate(cp,nUsuarioL,usuario2);
                cc.iniciarVUvU();
            } 
            catch (SQLException ex) {
                Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else if(tipoCombate.getSelectedIndex() == 2){
            ControladorCombateCpu ccpu ;
            try {
                ccpu = new ControladorCombateCpu(cp, nUsuarioL);
                ccpu.iniciarVUvsCpu();
            } catch (SQLException ex) {
                Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(tipoCombate.getSelectedIndex() == 3){
            try {
                cc = new ControladorCombate(cp, "CPU", "CPU 2");
                ccpuvs = new ControladorCombateCpuVs(cp);
            } catch (SQLException ex) {
                Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            ccpuvs.combateEntreCpu(cc.getEquipoP(), cc.getEquipo2());
        }
    }//GEN-LAST:event_comienzaCombateActionPerformed

    private void numTdeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTdeBActionPerformed
        if(numTdeB.getSelectedIndex() != 0)
            comienzaTB.setVisible(true);
        else
            comienzaTB.setVisible(false);
    }//GEN-LAST:event_numTdeBActionPerformed

    private void comienzaTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comienzaTBActionPerformed
        ControladorTorreBatalla ctb;
        
        try {
            ctb = new ControladorTorreBatalla(nUsuarioL, cp,numTdeB.getSelectedIndex());
            ctb.iniciaTdB();
        } catch (SQLException ex) {
            Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_comienzaTBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comienzaCombate;
    private javax.swing.JButton comienzaTB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton ligaPkmn;
    private javax.swing.JComboBox numTdeB;
    private javax.swing.JButton simulaCombate;
    private javax.swing.JComboBox tipoCombate;
    // End of variables declaration//GEN-END:variables
}
