package Vista;

import Controlador.ControladorSP;
import Controlador.ControladorCreaUsuario;
import java.sql.SQLException;

public class VistaSP extends javax.swing.JDialog {

    private ControladorSP cSP;
    private ControladorCreaUsuario cCU;
    private int numPoke;
    
    public VistaSP(ControladorSP parent, boolean modal) throws SQLException {
        initComponents();
        this.cSP = parent;
        cCU = new ControladorCreaUsuario();
        String[] lista = cCU.devuelvePoke();
        pkmn1.setModel(new javax.swing.DefaultComboBoxModel(lista));
        pkmn2.setModel(new javax.swing.DefaultComboBoxModel(lista));
        pkmn3.setModel(new javax.swing.DefaultComboBoxModel(lista));
        pkmn4.setModel(new javax.swing.DefaultComboBoxModel(lista));
        pkmn5.setModel(new javax.swing.DefaultComboBoxModel(lista));
        pkmn6.setModel(new javax.swing.DefaultComboBoxModel(lista));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pkmn1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        pkmn2 = new javax.swing.JComboBox();
        pkmn3 = new javax.swing.JComboBox();
        pkmn4 = new javax.swing.JComboBox();
        pkmn5 = new javax.swing.JComboBox();
        pkmn6 = new javax.swing.JComboBox();
        confirmar = new javax.swing.JButton();

        setModal(true);

        pkmn1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pkmn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkmn1ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pkmn2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pkmn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkmn2ActionPerformed(evt);
            }
        });

        pkmn3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pkmn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkmn3ActionPerformed(evt);
            }
        });

        pkmn4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pkmn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkmn4ActionPerformed(evt);
            }
        });

        pkmn5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pkmn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkmn5ActionPerformed(evt);
            }
        });

        pkmn6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pkmn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkmn6ActionPerformed(evt);
            }
        });

        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pkmn3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pkmn2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pkmn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pkmn6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pkmn5, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pkmn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pkmn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(pkmn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(pkmn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pkmn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(pkmn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(pkmn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(confirmar))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pkmn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkmn1ActionPerformed
        
    }//GEN-LAST:event_pkmn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pkmn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkmn3ActionPerformed
        
    }//GEN-LAST:event_pkmn3ActionPerformed

    private void pkmn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkmn2ActionPerformed
        
    }//GEN-LAST:event_pkmn2ActionPerformed

    private void pkmn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkmn4ActionPerformed
        
    }//GEN-LAST:event_pkmn4ActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        System.out.println();
    }//GEN-LAST:event_confirmarActionPerformed

    private void pkmn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkmn5ActionPerformed
        
    }//GEN-LAST:event_pkmn5ActionPerformed

    private void pkmn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkmn6ActionPerformed
        
    }//GEN-LAST:event_pkmn6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox pkmn1;
    private javax.swing.JComboBox pkmn2;
    private javax.swing.JComboBox pkmn3;
    private javax.swing.JComboBox pkmn4;
    private javax.swing.JComboBox pkmn5;
    private javax.swing.JComboBox pkmn6;
    // End of variables declaration//GEN-END:variables

    public int getNumPoke() {
        return numPoke;
    }

    public void setNumPoke(int numPoke) {
        this.numPoke = numPoke;
    }
}