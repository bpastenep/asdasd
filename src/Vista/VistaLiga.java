package Vista;

import Controlador.ControladorLiga;
import java.sql.SQLException;
import Controlador.ControladorSeleccionPokemon;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VistaLiga extends javax.swing.JDialog {

    private ControladorLiga cL;
    private int region;
    private ControladorSeleccionPokemon cSePo;
    
    public VistaLiga() throws SQLException {
        initComponents();
        this.cL = new ControladorLiga();
        this.cSePo = new ControladorSeleccionPokemon();
        this.nombreRegion.setText("LIGA POKEMON");
        this.combateLider.setText("Inicia Combate");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        combateLider = new javax.swing.JButton();
        segundaFase = new javax.swing.JButton();
        nombreRegion = new javax.swing.JLabel();

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combateLider.setText("jButton2");
        combateLider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combateLiderActionPerformed(evt);
            }
        });

        segundaFase.setText("jButton2");

        nombreRegion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        nombreRegion.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(combateLider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addComponent(segundaFase)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(segundaFase)
                    .addComponent(combateLider))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combateLiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combateLiderActionPerformed
        try {
            cSePo.iniciarSeleccion();
        } catch(SQLException e){}
    }//GEN-LAST:event_combateLiderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton combateLider;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel nombreRegion;
    private javax.swing.JButton segundaFase;
    // End of variables declaration//GEN-END:variables
}
