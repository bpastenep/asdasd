package Vista;

import Controlador.ControladorCombateCpu;
import Controlador.ControladorPrincipal;
import Controlador.ControladorTorreBatalla;
import Modelo.Pokemon;

public class VistaTorreBatalla extends javax.swing.JDialog {
    
    public int numeroBatalla;
    private ControladorCombateCpu ccpu;
    private ControladorPrincipal cp;
    private ControladorTorreBatalla ctb;
    String[] equipoTest1, equipoTest2;
    Pokemon[] equipoMaq, equipoHum;
    String usua1;
    
    public VistaTorreBatalla() {
        initComponents();
        ctb = new ControladorTorreBatalla();
        if(ctb.contadorBatallas() == 0)
            nxtCombate.setText("Comenzar");
        else
            nxtCombate.setText("Siguiente combate");
        vistaP.setText("Menú Principal");
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nroBatallas = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        nxtCombate = new javax.swing.JButton();
        vistaP = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(401, 470));

        modo.setText("Torre de Batalla");

        nroBatallas.setText("jLabel1");

        nxtCombate.setText("jButton1");
        nxtCombate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtCombateActionPerformed(evt);
            }
        });

        vistaP.setText("jButton2");
        vistaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(modo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nroBatallas)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nxtCombate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vistaP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jProgressBar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modo)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nroBatallas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nxtCombate)
                    .addComponent(vistaP))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nxtCombateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtCombateActionPerformed
        ctb = new ControladorTorreBatalla();
        ctb.avanceTorre();
        
    }//GEN-LAST:event_nxtCombateActionPerformed

    private void vistaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vistaPActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel modo;
    private javax.swing.JLabel nroBatallas;
    private javax.swing.JButton nxtCombate;
    private javax.swing.JButton vistaP;
    // End of variables declaration//GEN-END:variables
}