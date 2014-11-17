package Vista;
import Controlador.ControladorCombate;
import Controlador.ControladorPrincipal;
import Modelo.Pokemon;
import javax.swing.JOptionPane;
public class VistaCombateUvU extends javax.swing.JDialog {
    
    int op1;
    int op2;
    private ControladorCombate cc;
    private ControladorPrincipal cp;
    String[] equipoTest1;
    String[] equipoTest2;
    Pokemon[] equipoP1;
    Pokemon[] equipoP2;
    String usua1;
    String usua2;
    //Pokemones creados para la prueba
    
    public VistaCombateUvU(ControladorCombate cco, ControladorPrincipal op,String usu1, String usu2, Pokemon[] equipo, Pokemon[] equipo2) {
        initComponents();
        this.cp = op;
        this.cc = cco;
        this.equipoP1 = equipo;
        this.equipoP2 = equipo2;
        this.usua1=usu1;
        this.usua2=usu2;
        System.out.println(equipoP1[0].getNombre()+ " "+ equipo2[0].getNombre());
        String[] ataquesp1=cc.asignaA(equipoP1);
        String[] ataquesp2=cc.asignaA(equipoP2);
        ataques1.setModel(new javax.swing.DefaultComboBoxModel(ataquesp1));
        ataques1.setEnabled(false);
        ataques2.setModel(new javax.swing.DefaultComboBoxModel(ataquesp2));
        ataques2.setEnabled(false);
        equipoTest1 = cc.asignaP(equipoP1);
        equipoTest2 = cc.asignaP(equipoP2);
        pokemon1.setModel(new javax.swing.DefaultComboBoxModel(equipoTest1));
        pokemon1.setEnabled(false);
        pokemon2.setModel(new javax.swing.DefaultComboBoxModel(equipoTest2));
        pokemon2.setEnabled(false);
        pokemonActivo1.setText(equipoP1[0].getNombre());
        pokemonActivo2.setText(equipoP2[0].getNombre());
        usuv1.setText(usu1);
        usuv2.setText(usu2);
        Hp1.setText(Integer.toString(equipoP1[0].getPS()));
        Hp2.setText(Integer.toString(equipoP2[0].getPS()));
        barraHp1.setValue(cc.barraHp(equipoP1));
        barraHp2.setValue(cc.barraHp(equipoP2));
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuv1 = new javax.swing.JLabel();
        ataques1 = new javax.swing.JComboBox();
        pokemon1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        usuv2 = new javax.swing.JLabel();
        ataques2 = new javax.swing.JComboBox();
        pokemon2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        pokemonActivo1 = new javax.swing.JLabel();
        pokemonActivo2 = new javax.swing.JLabel();
        Hp1 = new javax.swing.JLabel();
        Hp2 = new javax.swing.JLabel();
        barraHp2 = new javax.swing.JProgressBar();
        barraHp1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(714, 404));
        setPreferredSize(new java.awt.Dimension(714, 404));
        setResizable(false);
        getContentPane().setLayout(null);

        usuv1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuv1.setForeground(new java.awt.Color(255, 255, 255));
        usuv1.setText("Usuario1");
        getContentPane().add(usuv1);
        usuv1.setBounds(20, 30, 130, 30);

        ataques1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ataques1.setForeground(new java.awt.Color(0, 0, 153));
        ataques1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ataques1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataques1ActionPerformed(evt);
            }
        });
        getContentPane().add(ataques1);
        ataques1.setBounds(50, 220, 90, 20);

        pokemon1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pokemon1.setForeground(new java.awt.Color(0, 0, 153));
        pokemon1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pokemon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokemon1ActionPerformed(evt);
            }
        });
        getContentPane().add(pokemon1);
        pokemon1.setBounds(200, 220, 100, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HP: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 290, 30, 20);

        usuv2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuv2.setForeground(new java.awt.Color(255, 255, 255));
        usuv2.setText("Usuario2");
        getContentPane().add(usuv2);
        usuv2.setBounds(580, 30, 130, 30);

        ataques2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ataques2.setForeground(new java.awt.Color(204, 0, 0));
        ataques2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ataques2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataques2ActionPerformed(evt);
            }
        });
        getContentPane().add(ataques2);
        ataques2.setBounds(410, 220, 100, 20);

        pokemon2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pokemon2.setForeground(new java.awt.Color(204, 0, 0));
        pokemon2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(pokemon2);
        pokemon2.setBounds(570, 220, 100, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("HP:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(450, 290, 30, 17);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("SimularTurno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 340, 120, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setText("Atacar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 160, 100, 23);
        jButton2.getAccessibleContext().setAccessibleDescription("");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 153));
        jButton3.setText("Cambiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(200, 160, 100, 23);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setText("Atacar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(410, 160, 100, 23);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 0, 0));
        jButton5.setText("Cambiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(570, 160, 110, 23);

        pokemonActivo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pokemonActivo1.setForeground(new java.awt.Color(255, 255, 255));
        pokemonActivo1.setText("jLabel10");
        getContentPane().add(pokemonActivo1);
        pokemonActivo1.setBounds(10, 280, 80, 14);

        pokemonActivo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pokemonActivo2.setForeground(new java.awt.Color(255, 255, 255));
        pokemonActivo2.setText("jLabel10");
        getContentPane().add(pokemonActivo2);
        pokemonActivo2.setBounds(390, 280, 80, 14);

        Hp1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Hp1.setForeground(new java.awt.Color(255, 255, 255));
        Hp1.setText("HP1");
        getContentPane().add(Hp1);
        Hp1.setBounds(250, 290, 100, 30);

        Hp2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Hp2.setForeground(new java.awt.Color(255, 255, 255));
        Hp2.setText("hp2");
        getContentPane().add(Hp2);
        Hp2.setBounds(630, 300, 70, 20);
        getContentPane().add(barraHp2);
        barraHp2.setBounds(480, 300, 140, 14);
        getContentPane().add(barraHp1);
        barraHp1.setBounds(100, 300, 146, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Qué debería hacer?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(530, 120, 250, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¿Qué debería hacer?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 120, 250, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VistaCombateNew2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 710, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pokemon1.setEnabled(false);
        ataques1.setEnabled(true);
        op1 = 1;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       pokemon1.setEnabled(true);
       ataques1.setEnabled(false);
       op1 = 2;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        pokemon2.setEnabled(false);
        ataques2.setEnabled(true);
        op2 = 1;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        pokemon2.setEnabled(true);
        ataques2.setEnabled(false);
        op2 = 2;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void pokemon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokemon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pokemon1ActionPerformed

    private void ataques1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ataques1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ataques1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(op1==0 || op2==0){
            JOptionPane.showMessageDialog(null, "¡Ambos jugadores deben seleccionar una opción!");
        }
        else{
            equipoP2=cc.realizarAccion(op2,pokemon2.getSelectedIndex(),equipoP2,equipoP1, ataques2.getSelectedIndex());
            equipoP1=cc.realizarAccion(op1,pokemon1.getSelectedIndex(),equipoP1,equipoP2, ataques1.getSelectedIndex());
            pokemonActivo1.setText(equipoP1[0].getNombre());
            pokemonActivo2.setText(equipoP2[0].getNombre());
            Hp1.setText(Integer.toString(equipoP1[0].getPS()));
            Hp2.setText(Integer.toString(equipoP2[0].getPS()));
            pokemon1.setModel(new javax.swing.DefaultComboBoxModel(cc.asignaP(equipoP1)));
            pokemon2.setModel(new javax.swing.DefaultComboBoxModel(cc.asignaP(equipoP2)));
            op1=0;
            op2=0;
            if(cc.hpTotal(equipoP1)){
                JOptionPane.showMessageDialog(null, "El ganador es "+usua2);
                this.setVisible(false);
            }
            if(cc.hpTotal(equipoP2)){
                JOptionPane.showMessageDialog(null, "El ganador es "+usua1);
                this.setVisible(false);
            }
            pokemon1.setEnabled(false);
            pokemon2.setEnabled(false);
            ataques1.setEnabled(false);
            ataques2.setEnabled(false);
            barraHp1.setValue(cc.barraHp(equipoP1));
            System.out.println(cc.barraHp(equipoP1));
            barraHp2.setValue(cc.barraHp(equipoP2));
            System.out.println(cc.barraHp(equipoP1));        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ataques2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ataques2ActionPerformed
        
    }//GEN-LAST:event_ataques2ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hp1;
    private javax.swing.JLabel Hp2;
    private javax.swing.JComboBox ataques1;
    private javax.swing.JComboBox ataques2;
    private javax.swing.JProgressBar barraHp1;
    private javax.swing.JProgressBar barraHp2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox pokemon1;
    private javax.swing.JComboBox pokemon2;
    private javax.swing.JLabel pokemonActivo1;
    private javax.swing.JLabel pokemonActivo2;
    private javax.swing.JLabel usuv1;
    private javax.swing.JLabel usuv2;
    // End of variables declaration//GEN-END:variables
}
