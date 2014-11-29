package Vista;

import Controlador.ControladorCombate;
import Controlador.ControladorPrincipal;
import Modelo.Pokemon;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VistaCombateUvU extends javax.swing.JDialog {
    
    int op1;
    int op2;
    private ControladorCombate cc;
    private ControladorPrincipal cp;
    private String[] equipoTest1;
    private String[] equipoTest2;
    private String[] ataquesp1;
    private String[] ataquesp2;
    private Pokemon[] equipoP1;
    private Pokemon[] equipoP2;
    private String usua1;
    private String usua2;
    //Pokemones creados para la prueba
    
    public VistaCombateUvU(ControladorCombate cco, ControladorPrincipal op,String usu1, String usu2, Pokemon[] equipo, Pokemon[] equipo2) {
        initComponents();
        this.cp = op;
        this.cc = cco;
        setEquipoP1(equipo);
        setEquipoP2(equipo2);
        setUsua1(usu1);
        setUsua2(usu2);
        setAtaquesp1(cc.asignaA(equipoP1));
        setAtaquesp2(cc.asignaA(equipoP2));
        ataques1.setModel(new javax.swing.DefaultComboBoxModel(getAtaquesp1()));
        ataques1.setEnabled(false);
        ataques2.setModel(new javax.swing.DefaultComboBoxModel(getAtaquesp2()));
        ataques2.setEnabled(false);
        equipoTest1 = cc.asignaP(equipoP1);
        equipoTest2 = cc.asignaP(equipoP2);
        pokemon1.setModel(new javax.swing.DefaultComboBoxModel(getEquipoTest1()));
        pokemon1.setEnabled(false);
        pokemon2.setModel(new javax.swing.DefaultComboBoxModel(getEquipoTest2()));
        pokemon2.setEnabled(false);
        pokemonActivo1.setText(equipoP1[0].getNombre());
        pokemonActivo2.setText(equipoP2[0].getNombre());
        usuv1.setText(usu1);
        usuv2.setText(usu2);
        Hp1.setText(Integer.toString(equipoP1[0].getPSi()));
        Hp2.setText(Integer.toString(equipoP2[0].getPSi()));
        barraHp1.setValue(cc.barraHp(equipoP1));
        barraHp2.setValue(cc.barraHp(equipoP2));
        barraHp1.setForeground(Color.GREEN);
        barraHp2.setForeground(Color.GREEN);
        pp1.setText("PP: "+ Integer.toString(getEquipoP1()[0].getMovimientos().getMovimientosA()[ataques1.getSelectedIndex()].getpP()));
        pp2.setText("PP: "+ Integer.toString(getEquipoP2()[0].getMovimientos().getMovimientosA()[ataques2.getSelectedIndex()].getpP()));
    } 
    
   
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        pp1 = new javax.swing.JLabel();
        pp2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(714, 404));
        setModal(true);
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

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("SimularTurno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 340, 120, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setText("Atacar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 160, 100, 25);
        jButton2.getAccessibleContext().setAccessibleDescription("");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 153));
        jButton3.setText("Cambiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(200, 160, 100, 25);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setText("Atacar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(410, 160, 100, 25);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 0, 0));
        jButton5.setText("Cambiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(570, 160, 110, 25);

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
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quedeberiahacertexto1.png"))); // NOI18N
        jLabel2.setText("¿Qué debería hacer?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(430, 110, 250, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quedeberiahacertexto1.png"))); // NOI18N
        jLabel4.setText("¿Qué debería hacer?");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 110, 250, 30);

        pp1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pp1.setForeground(new java.awt.Color(255, 255, 255));
        pp1.setText("jLabel5");
        getContentPane().add(pp1);
        pp1.setBounds(50, 250, 80, 14);

        pp2.setText("jLabel5");
        getContentPane().add(pp2);
        pp2.setBounds(410, 250, 100, 14);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VistaCombateNew2.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 710, 390);

        pack();
        setLocationRelativeTo(null);
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
        pp1.setText("PP: "+ Integer.toString(getEquipoP1()[0].getMovimientos().getMovimientosA()[ataques1.getSelectedIndex()].getpP()));
        if(getEquipoP1()[0].getMovimientos().getMovimientosA()[ataques1.getSelectedIndex()].getpP() <= 0 || getEquipoP2()[0].getMovimientos().getMovimientosA()[ataques2.getSelectedIndex()].getpP() <= 0){
                jButton1.setVisible(false);
        }
        else
             jButton1.setVisible(true);
    }//GEN-LAST:event_ataques1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(op1==0 || op2==0){
            JOptionPane.showMessageDialog(null, "¡Ambos jugadores deben seleccionar una opción!");
        }
        else{
            
            try {
                setEquipoP2(cc.realizarAccion(op2, pokemon2.getSelectedIndex(), getEquipoP2(), getEquipoP1(), ataques2.getSelectedIndex()));
                equipoP2[0].getMovimientos().getMovimientosA()[ataques2.getSelectedIndex()].setpP(equipoP2[0].getMovimientos().getMovimientosA()[ataques2.getSelectedIndex()].getpP()- 1);
                pp2.setText("PP: "+ Integer.toString(getEquipoP2()[0].getMovimientos().getMovimientosA()[ataques2.getSelectedIndex()].getpP()));
                if(getEquipoP2()[0].getMovimientos().getMovimientosA()[ataques2.getSelectedIndex()].getpP() <= 0){
                    jButton1.setVisible(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaCombateUvU.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                setEquipoP1(cc.realizarAccion(op1, pokemon1.getSelectedIndex(), getEquipoP1(), getEquipoP2(), ataques1.getSelectedIndex()));
                equipoP1[0].getMovimientos().getMovimientosA()[ataques1.getSelectedIndex()].setpP(equipoP1[0].getMovimientos().getMovimientosA()[ataques1.getSelectedIndex()].getpP()- 1);
                pp1.setText("PP: "+ Integer.toString(getEquipoP1()[0].getMovimientos().getMovimientosA()[ataques1.getSelectedIndex()].getpP()));
                if(getEquipoP1()[0].getMovimientos().getMovimientosA()[ataques1.getSelectedIndex()].getpP() <= 0){
                    jButton1.setVisible(false);
                }
            } catch (SQLException ex) {
                Logger.getLogger(VistaCombateUvU.class.getName()).log(Level.SEVERE, null, ex);
            }
            pokemonActivo1.setText(getEquipoP1()[0].getNombre());
            pokemonActivo2.setText(getEquipoP2()[0].getNombre());
            Hp1.setText(Integer.toString(getEquipoP1()[0].getPS()));
            Hp2.setText(Integer.toString(getEquipoP2()[0].getPS()));
            pokemon1.setModel(new javax.swing.DefaultComboBoxModel(cc.asignaP(getEquipoP1())));
            pokemon2.setModel(new javax.swing.DefaultComboBoxModel(cc.asignaP(getEquipoP2())));
            op1=0;
            op2=0;
            if(cc.hpTotal(getEquipoP1())){
                JOptionPane.showMessageDialog(null, "El ganador es "+getUsua2());
                this.setVisible(false);
            }
            if(cc.hpTotal(getEquipoP2())){
                JOptionPane.showMessageDialog(null, "El ganador es "+getUsua1());
                this.setVisible(false);
            }
            pokemon1.setEnabled(false);
            pokemon2.setEnabled(false);
            ataques1.setEnabled(false);
            ataques2.setEnabled(false);
            barraHp1.setValue(cc.barraHp(getEquipoP1()));
            System.out.println(cc.barraHp(getEquipoP1()));
            barraHp2.setValue(cc.barraHp(getEquipoP2()));
            System.out.println(cc.barraHp(getEquipoP1()));        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ataques2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ataques2ActionPerformed
        pp2.setText("PP: "+ Integer.toString(getEquipoP2()[0].getMovimientos().getMovimientosA()[ataques2.getSelectedIndex()].getpP()));
        if(getEquipoP1()[0].getMovimientos().getMovimientosA()[ataques1.getSelectedIndex()].getpP() <= 0 || getEquipoP2()[0].getMovimientos().getMovimientosA()[ataques2.getSelectedIndex()].getpP() <= 0){
            jButton1.setVisible(false);
        }
        else
            jButton1.setVisible(true);
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
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox pokemon1;
    private javax.swing.JComboBox pokemon2;
    private javax.swing.JLabel pokemonActivo1;
    private javax.swing.JLabel pokemonActivo2;
    private javax.swing.JLabel pp1;
    private javax.swing.JLabel pp2;
    private javax.swing.JLabel usuv1;
    private javax.swing.JLabel usuv2;
    // End of variables declaration//GEN-END:variables

    public String[] getEquipoTest1() {
        return equipoTest1;
    }

    public void setEquipoTest1(String[] equipoTest1) {
        this.equipoTest1 = equipoTest1;
    }

    public String[] getEquipoTest2() {
        return equipoTest2;
    }

    public void setEquipoTest2(String[] equipoTest2) {
        this.equipoTest2 = equipoTest2;
    }

    public String[] getAtaquesp1() {
        return ataquesp1;
    }

    public void setAtaquesp1(String[] ataquesp1) {
        this.ataquesp1 = ataquesp1;
    }

    public String[] getAtaquesp2() {
        return ataquesp2;
    }

    public void setAtaquesp2(String[] ataquesp2) {
        this.ataquesp2 = ataquesp2;
    }

    public Pokemon[] getEquipoP1() {
        return equipoP1;
    }

    public void setEquipoP1(Pokemon[] equipoP1) {
        this.equipoP1 = equipoP1;
    }

    public Pokemon[] getEquipoP2() {
        return equipoP2;
    }

    public void setEquipoP2(Pokemon[] equipoP2) {
        this.equipoP2 = equipoP2;
    }

    public String getUsua1() {
        return usua1;
    }

    public void setUsua1(String usua1) {
        this.usua1 = usua1;
    }

    public String getUsua2() {
        return usua2;
    }

    public void setUsua2(String usua2) {
        this.usua2 = usua2;
    }
}