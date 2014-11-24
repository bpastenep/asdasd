package Vista;

import Controlador.ControladorCombateCpu;
import Controlador.ControladorPrincipal;
import Controlador.ControladorTorreBatalla;
import Modelo.Pokemon;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VistaTorreBatalla extends javax.swing.JDialog {
    
    public int numeroBatalla;
    private ControladorCombateCpu ccpu;
    private ControladorPrincipal cp;
    private ControladorTorreBatalla ctb;
    String[] equipoTest1, equipoTest2;
    Pokemon[] equipoMaq, equipoHum;
    String usua1;
    
    public VistaTorreBatalla(ControladorTorreBatalla ct, String usua) {
        initComponents();
        this.ctb = ct;
        if(ctb.contadorBatallas() == 0)
            nxtCombate.setText("Comenzar");
        else
            nxtCombate.setText("Siguiente combate");
        vistaP.setText("Menú Principal");
        this.usua1=usua;
        UsuarioTB.setText(usua1);
        batallasG.setText("0");
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nroBatallas = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        nxtCombate = new javax.swing.JButton();
        vistaP = new javax.swing.JButton();
        UsuarioTB = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        batallasG = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(715, 440));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(715, 440));
        setResizable(false);
        getContentPane().setLayout(null);

        nroBatallas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nroBatallas.setForeground(new java.awt.Color(204, 0, 0));
        nroBatallas.setText("Entrenador");
        getContentPane().add(nroBatallas);
        nroBatallas.setBounds(240, 140, 140, 15);
        getContentPane().add(jProgressBar2);
        jProgressBar2.setBounds(220, 350, 315, 25);

        nxtCombate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nxtCombate.setForeground(new java.awt.Color(204, 0, 0));
        nxtCombate.setText("jButton1");
        nxtCombate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtCombateActionPerformed(evt);
            }
        });
        getContentPane().add(nxtCombate);
        nxtCombate.setBounds(200, 290, 130, 23);

        vistaP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vistaP.setForeground(new java.awt.Color(204, 0, 0));
        vistaP.setText("jButton2");
        vistaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaPActionPerformed(evt);
            }
        });
        getContentPane().add(vistaP);
        vistaP.setBounds(410, 290, 130, 23);

        UsuarioTB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UsuarioTB.setText("Usuario");
        getContentPane().add(UsuarioTB);
        UsuarioTB.setBounds(420, 140, 130, 15);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Batallas ganadas :D");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 170, 140, 15);

        batallasG.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        batallasG.setText("jLabel2");
        getContentPane().add(batallasG);
        batallasG.setBounds(420, 170, 110, 15);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VistaTorredeBatalla.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(715, 430));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 720, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nxtCombateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtCombateActionPerformed
        try{
            this.ctb.avanceTorre ();
            batallasG.setText(""+ctb.getCBatallas());
        }catch (SQLException s){}
    }//GEN-LAST:event_nxtCombateActionPerformed

    private void vistaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vistaPActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UsuarioTB;
    private javax.swing.JLabel batallasG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JLabel nroBatallas;
    private javax.swing.JButton nxtCombate;
    private javax.swing.JButton vistaP;
    // End of variables declaration//GEN-END:variables
}