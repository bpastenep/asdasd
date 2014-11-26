package Vista;

import Controlador.ControladorLiga;
import Controlador.ControladorSP;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VistaLiga extends javax.swing.JDialog {

    private ControladorLiga cL;
    private ControladorSP cSP;
   
    
    public VistaLiga() throws SQLException {
        initComponents();
        this.cL = new ControladorLiga();
        this.cSP = new ControladorSP();
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

        setTitle("Liga Pokemon");
        setMinimumSize(new java.awt.Dimension(632, 372));
        setResizable(false);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combateLider.setText("Comenzar");
        combateLider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combateLiderActionPerformed(evt);
            }
        });

        segundaFase.setText(":v");
        segundaFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundaFaseActionPerformed(evt);
            }
        });

        nombreRegion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        nombreRegion.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(combateLider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
                .addComponent(segundaFase)
                .addGap(103, 103, 103))
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
            cSP.iniciaVSP();
        }catch(SQLException e){System.out.println(e);}
    }//GEN-LAST:event_combateLiderActionPerformed

    private void segundaFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundaFaseActionPerformed

    }//GEN-LAST:event_segundaFaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton combateLider;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel nombreRegion;
    private javax.swing.JButton segundaFase;
    // End of variables declaration//GEN-END:variables
}
