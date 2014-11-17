package Vista;

import Controlador.ControladorCombate;
import Controlador.ControladorPrincipal;
import Modelo.Pokemon;


public class VistaCombateUvsCpu extends javax.swing.JDialog {

    int op1;
    private ControladorCombate cc;
    private ControladorPrincipal cp;
    String[] equipoTest1;
    String[] equipoTest2;
    Pokemon[] equipoP1;
    Pokemon[] equipoP2;
    String usua1;

    public VistaCombateUvsCpu(ControladorCombate cco, ControladorPrincipal op, String usu1, Pokemon[] equipoCpu, Pokemon[] equipoUsuario) {
        System.out.println("Intenta crear la vista");
        initComponents();
        System.out.println("Iniciar componentes");
        this.cp = op;
        this.cc = cco;
        this.equipoP1 = equipoCpu;
        this.equipoP2 = equipoUsuario;
        this.usua1 = usu1;
        String[] ataquesp1= cc.asignaA(equipoP1);
        String[] ataquesp2= cc.asignaA(equipoP2);
        ataquesUsuario.setModel(new javax.swing.DefaultComboBoxModel(ataquesp2));
        ataquesUsuario.setEnabled(false);
        equipoTest1 = cc.asignaP(equipoP1);
        equipoTest2 = cc.asignaP(equipoP2);
        cambiosUsuario.setModel(new javax.swing.DefaultComboBoxModel(equipoTest2));
        cambiosUsuario.setEnabled(false);
        pokemonCpu.setText(equipoP1[0].getNombre());
        pokemonU.setText(equipoP2[0].getNombre());
        nombreU.setText(usu1);
        cpu.setText("CPU");
        hpCpu.setValue(cc.barraHp(equipoP1));
        hpUsuario.setValue(cc.barraHp(equipoP2));
        System.out.println("Crea la vista completa");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ataquesUsuario = new javax.swing.JComboBox();
        cambiosUsuario = new javax.swing.JComboBox();
        ataque = new javax.swing.JButton();
        cambio = new javax.swing.JButton();
        hpUsuario = new javax.swing.JProgressBar();
        pokemonU = new javax.swing.JLabel();
        hpCpu = new javax.swing.JProgressBar();
        pokemonCpu = new javax.swing.JLabel();
        cpu = new javax.swing.JLabel();
        nombreU = new javax.swing.JLabel();

        ataquesUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ataquesUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataquesUsuarioActionPerformed(evt);
            }
        });

        cambiosUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cambiosUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiosUsuarioActionPerformed(evt);
            }
        });

        ataque.setText("atacar");
        ataque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataqueActionPerformed(evt);
            }
        });

        cambio.setText("cambio");
        cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioActionPerformed(evt);
            }
        });

        pokemonU.setText("jLabel1");

        pokemonCpu.setText("jLabel1");

        cpu.setText("CPU");

        nombreU.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hpCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pokemonCpu)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pokemonU)
                                .addComponent(hpUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ataquesUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ataque, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cambiosUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cambio, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(cpu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(nombreU)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreU)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ataquesUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambiosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ataque)
                    .addComponent(cambio))
                .addGap(18, 18, 18)
                .addComponent(pokemonU)
                .addGap(18, 18, 18)
                .addComponent(hpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(cpu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(pokemonCpu)
                .addGap(18, 18, 18)
                .addComponent(hpCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ataquesUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ataquesUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ataquesUsuarioActionPerformed

    private void cambiosUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiosUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambiosUsuarioActionPerformed

    private void ataqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ataqueActionPerformed
        cambiosUsuario.setEnabled(false);
        ataquesUsuario.setEnabled(true);
        op1 = 1;
    }//GEN-LAST:event_ataqueActionPerformed

    private void cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioActionPerformed
       cambiosUsuario.setEnabled(true);
       ataquesUsuario.setEnabled(false);
       op1 = 2;
    }//GEN-LAST:event_cambioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ataque;
    private javax.swing.JComboBox ataquesUsuario;
    private javax.swing.JButton cambio;
    private javax.swing.JComboBox cambiosUsuario;
    private javax.swing.JLabel cpu;
    private javax.swing.JProgressBar hpCpu;
    private javax.swing.JProgressBar hpUsuario;
    private javax.swing.JLabel nombreU;
    private javax.swing.JLabel pokemonCpu;
    private javax.swing.JLabel pokemonU;
    // End of variables declaration//GEN-END:variables
}
