package Vista;

import Controlador.ControladorCombate;
import Controlador.ControladorCombateCpu;
import Controlador.ControladorPrincipal;
import Modelo.Pokemon;
import javax.swing.JOptionPane;


public class VistaCombateUvsCpu extends javax.swing.JDialog {
    int op1;
    private ControladorCombate cc;
    private ControladorCombateCpu ccpu;
    private ControladorPrincipal cp;
    String[] equipoTest1, equipoTest2;
    Pokemon[] equipoMaq, equipoHum;
    String usua1;

    public VistaCombateUvsCpu(ControladorCombateCpu cpuu,ControladorCombate cco, ControladorPrincipal op, String usu1, Pokemon[] equipoCpu, Pokemon[] equipoUsuario) {
        
        initComponents();
        this.cp = op;
        this.cc = cco;
        this.equipoMaq = equipoCpu;
        this.equipoHum = equipoUsuario;
        this.usua1 = usu1;
        this.ccpu = cpuu;
        String[] ataquesp1= cc.asignaA(equipoMaq);
        String[] ataquesp2= cc.asignaA(equipoHum);
        ataquesUsuario.setModel(new javax.swing.DefaultComboBoxModel(ataquesp2));
        ataquesUsuario.setEnabled(false);
        equipoTest1 = cc.asignaP(equipoMaq);
        equipoTest2 = cc.asignaP(equipoHum);
        cambiosUsuario.setModel(new javax.swing.DefaultComboBoxModel(equipoTest2));
        cambiosUsuario.setEnabled(false);
        pokemonCpu.setText(equipoMaq[0].getNombre());
        pokemonU.setText(equipoHum[0].getNombre());
        nombreU.setText(usu1);
        cpu.setText("CPU");
        simularT.setText("Simular Turno");
        hpCpu.setValue(cc.barraHp(equipoMaq));
        hpUsuario.setValue(cc.barraHp(equipoHum));
        cPokemonCPU.setText("Al equipo rival aún le quedan "+cc.pokeDeb(equipoMaq)+" pokemones");
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
        simularT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cPokemonCPU = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(714, 414));
        setPreferredSize(new java.awt.Dimension(714, 414));
        setResizable(false);
        getContentPane().setLayout(null);

        ataquesUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ataquesUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataquesUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(ataquesUsuario);
        ataquesUsuario.setBounds(30, 210, 130, 20);

        cambiosUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cambiosUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiosUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(cambiosUsuario);
        cambiosUsuario.setBounds(202, 210, 130, 20);

        ataque.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ataque.setForeground(new java.awt.Color(0, 0, 204));
        ataque.setText("Atacar");
        ataque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataqueActionPerformed(evt);
            }
        });
        getContentPane().add(ataque);
        ataque.setBounds(70, 170, 90, 25);

        cambio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cambio.setForeground(new java.awt.Color(0, 0, 204));
        cambio.setText("Cambio");
        cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioActionPerformed(evt);
            }
        });
        getContentPane().add(cambio);
        cambio.setBounds(200, 170, 90, 25);
        getContentPane().add(hpUsuario);
        hpUsuario.setBounds(100, 270, 193, 12);

        pokemonU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pokemonU.setForeground(new java.awt.Color(0, 51, 204));
        pokemonU.setText("jLabel1");
        getContentPane().add(pokemonU);
        pokemonU.setBounds(10, 270, 70, 17);
        getContentPane().add(hpCpu);
        hpCpu.setBounds(450, 270, 193, 12);

        pokemonCpu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pokemonCpu.setForeground(new java.awt.Color(255, 102, 0));
        pokemonCpu.setText("jLabel1");
        getContentPane().add(pokemonCpu);
        pokemonCpu.setBounds(370, 270, 70, 17);

        cpu.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cpu.setForeground(new java.awt.Color(255, 255, 255));
        cpu.setText("CPU");
        getContentPane().add(cpu);
        cpu.setBounds(570, 34, 130, 20);

        nombreU.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        nombreU.setForeground(new java.awt.Color(255, 255, 255));
        nombreU.setText("jLabel2");
        getContentPane().add(nombreU);
        nombreU.setBounds(20, 34, 120, 20);

        simularT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        simularT.setForeground(new java.awt.Color(0, 51, 153));
        simularT.setText("Simular Turno");
        simularT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simularTActionPerformed(evt);
            }
        });
        getContentPane().add(simularT);
        simularT.setBounds(123, 320, 117, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("HP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 260, 30, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("HP");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(660, 260, 30, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quedeberiahacertexto1.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 120, 250, 30);

        cPokemonCPU.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cPokemonCPU.setForeground(new java.awt.Color(255, 102, 0));
        cPokemonCPU.setText("Jlabel3");
        getContentPane().add(cPokemonCPU);
        cPokemonCPU.setBounds(370, 300, 370, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VistaCombateUvC2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 720, 420);
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

    private void simularTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simularTActionPerformed

        if(op1 == 0){
            JOptionPane.showMessageDialog(null, "El jugador debe seleccionar una opción.");
        }
        else{
            equipoHum = cc.realizarAccion(op1,cambiosUsuario.getSelectedIndex(),equipoHum,equipoMaq, ataquesUsuario.getSelectedIndex());
            equipoMaq = ccpu.accionCpu(equipoMaq, equipoHum, ccpu.verificaHpCpu(equipoMaq));
            pokemonCpu.setText(equipoMaq[0].getNombre());
            pokemonU.setText(equipoHum[0].getNombre());
            cambiosUsuario.setModel(new javax.swing.DefaultComboBoxModel(cc.asignaP(equipoHum)));
            op1=0;
            }
        if(cc.hpTotal(equipoMaq)){
            JOptionPane.showMessageDialog(null, "El ganador es "+usua1+"!");
            this.setVisible(false);
        }
        if(cc.hpTotal(equipoHum)){
            JOptionPane.showMessageDialog(null, "El ganador es CPU!");
            this.setVisible(false);
        }
        cambiosUsuario.setEnabled(false);
        ataquesUsuario.setEnabled(false);
        hpCpu.setValue(cc.barraHp(equipoMaq));
        System.out.println(cc.barraHp(equipoMaq));
        hpUsuario.setValue(cc.barraHp(equipoHum));
        System.out.println(cc.barraHp(equipoHum));
        cPokemonCPU.setText("Al equipo rival aún le quedan "+cc.pokeDeb(equipoMaq)+" pokemones");
        op1=0;
    }//GEN-LAST:event_simularTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ataque;
    private javax.swing.JComboBox ataquesUsuario;
    private javax.swing.JLabel cPokemonCPU;
    private javax.swing.JButton cambio;
    private javax.swing.JComboBox cambiosUsuario;
    private javax.swing.JLabel cpu;
    private javax.swing.JProgressBar hpCpu;
    private javax.swing.JProgressBar hpUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel nombreU;
    private javax.swing.JLabel pokemonCpu;
    private javax.swing.JLabel pokemonU;
    private javax.swing.JButton simularT;
    // End of variables declaration//GEN-END:variables
}
