/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.ControladorCreaUsuario;
import Controlador.Escribir;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Benjamin
 */
public class VistaCreaU extends javax.swing.JDialog {
    
    private final ControladorCreaUsuario cu;
    public String[] ataqueP1;
    
    public VistaCreaU(ControladorCreaUsuario parent, boolean modal) throws SQLException {
        initComponents();
        this.cu = parent;
        String[] nvl = new String[101];
        nvl[0]="¿Nivel?";
        String[] pokeBD = parent.devuelvePoke();
        for (int niveles=1; niveles<100; niveles++){
            nvl[niveles]=""+(niveles+1);
        }
        LvPoke1.setModel(new javax.swing.DefaultComboBoxModel(nvl));
        LvPoke2.setModel(new javax.swing.DefaultComboBoxModel(nvl));
        LvPoke3.setModel(new javax.swing.DefaultComboBoxModel(nvl));
        LvPoke4.setModel(new javax.swing.DefaultComboBoxModel(nvl));
        LvPoke5.setModel(new javax.swing.DefaultComboBoxModel(nvl));
        LvPoke6.setModel(new javax.swing.DefaultComboBoxModel(nvl));
        pokem1.setModel(new javax.swing.DefaultComboBoxModel(pokeBD));
        pokem2.setModel(new javax.swing.DefaultComboBoxModel(pokeBD));
        pokem3.setModel(new javax.swing.DefaultComboBoxModel(pokeBD));
        pokem4.setModel(new javax.swing.DefaultComboBoxModel(pokeBD));
        pokem5.setModel(new javax.swing.DefaultComboBoxModel(pokeBD));
        pokem6.setModel(new javax.swing.DefaultComboBoxModel(pokeBD));
        ata1poke1.setVisible(false);
        ata2poke1.setVisible(false);
        ata3poke1.setVisible(false);
        ata4poke1.setVisible(false);
        ata1poke2.setVisible(false);
        ata2poke2.setVisible(false);
        ata3poke2.setVisible(false);
        ata4poke2.setVisible(false);
        ata1poke3.setVisible(false);
        ata2poke3.setVisible(false);
        ata3poke3.setVisible(false);
        ata4poke3.setVisible(false);
        ata1poke4.setVisible(false);
        ata2poke4.setVisible(false);
        ata3poke4.setVisible(false);
        ata4poke4.setVisible(false);
        ata1poke5.setVisible(false);
        ata2poke5.setVisible(false);
        ata3poke5.setVisible(false);
        ata4poke5.setVisible(false);
        ata1poke6.setVisible(false);
        ata2poke6.setVisible(false);
        ata3poke6.setVisible(false);
        ata4poke6.setVisible(false);    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        pokem1 = new javax.swing.JComboBox();
        pokem3 = new javax.swing.JComboBox();
        pokem6 = new javax.swing.JComboBox();
        pokem5 = new javax.swing.JComboBox();
        pokem2 = new javax.swing.JComboBox();
        pokem4 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ata1poke2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ata2poke1 = new javax.swing.JComboBox();
        ata3poke1 = new javax.swing.JComboBox();
        ata4poke1 = new javax.swing.JComboBox();
        ata4poke6 = new javax.swing.JComboBox();
        ata1poke1 = new javax.swing.JComboBox();
        ata2poke2 = new javax.swing.JComboBox();
        ata3poke2 = new javax.swing.JComboBox();
        ata4poke2 = new javax.swing.JComboBox();
        ata1poke3 = new javax.swing.JComboBox();
        ata2poke3 = new javax.swing.JComboBox();
        ata3poke3 = new javax.swing.JComboBox();
        ata4poke3 = new javax.swing.JComboBox();
        ata1poke4 = new javax.swing.JComboBox();
        ata2poke4 = new javax.swing.JComboBox();
        ata3poke4 = new javax.swing.JComboBox();
        ata4poke4 = new javax.swing.JComboBox();
        ata1poke5 = new javax.swing.JComboBox();
        ata2poke5 = new javax.swing.JComboBox();
        ata3poke5 = new javax.swing.JComboBox();
        ata4poke5 = new javax.swing.JComboBox();
        ata1poke6 = new javax.swing.JComboBox();
        ata2poke6 = new javax.swing.JComboBox();
        ata3poke6 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        nombre2 = new javax.swing.JTextField();
        nombre3 = new javax.swing.JTextField();
        nombre4 = new javax.swing.JTextField();
        nombre5 = new javax.swing.JTextField();
        nombre6 = new javax.swing.JTextField();
        LvPoke1 = new javax.swing.JComboBox();
        LvPoke2 = new javax.swing.JComboBox();
        LvPoke3 = new javax.swing.JComboBox();
        LvPoke4 = new javax.swing.JComboBox();
        LvPoke5 = new javax.swing.JComboBox();
        LvPoke6 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newnombredeusuario.png"))); // NOI18N
        jLabel2.setText("Nombre de Usuario");
        jLabel2.setMaximumSize(new java.awt.Dimension(160, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(160, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(160, 20));
        jLabel2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 60, 170, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/newcontraseña.png"))); // NOI18N
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 90, 160, 20);

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user);
        user.setBounds(320, 60, 130, 20);
        getContentPane().add(pass);
        pass.setBounds(320, 90, 130, 20);

        jButton1.setText("Registrarse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 470, 110, 23);

        pokem1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pokem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokem1ActionPerformed(evt);
            }
        });
        getContentPane().add(pokem1);
        pokem1.setBounds(10, 200, 150, 20);

        pokem3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pokem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokem3ActionPerformed(evt);
            }
        });
        getContentPane().add(pokem3);
        pokem3.setBounds(10, 280, 150, 20);

        pokem6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pokem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokem6ActionPerformed(evt);
            }
        });
        getContentPane().add(pokem6);
        pokem6.setBounds(10, 400, 150, 20);

        pokem5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pokem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokem5ActionPerformed(evt);
            }
        });
        getContentPane().add(pokem5);
        pokem5.setBounds(10, 360, 150, 20);

        pokem2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pokem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokem2ActionPerformed(evt);
            }
        });
        getContentPane().add(pokem2);
        pokem2.setBounds(10, 240, 150, 20);

        pokem4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pokem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pokem4ActionPerformed(evt);
            }
        });
        getContentPane().add(pokem4);
        pokem4.setBounds(10, 320, 150, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccionatuequipopokemon.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 120, 310, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seleccionanombredeuuario.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 10, 310, 40);

        jLabel1.setText("Pokemon");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 170, 50, 14);

        jLabel6.setText("Ataques");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(360, 160, 60, 14);

        ata1poke2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata1poke2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata1poke2ActionPerformed(evt);
            }
        });
        getContentPane().add(ata1poke2);
        ata1poke2.setBounds(170, 240, 90, 20);

        jLabel7.setText("Ataque1");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 180, 50, 14);

        jLabel8.setText("Ataque 2");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(310, 180, 50, 14);

        jLabel9.setText("Ataque 3");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(430, 180, 50, 14);

        jLabel10.setText("Ataque 4");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(550, 180, 50, 14);

        ata2poke1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata2poke1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata2poke1ActionPerformed(evt);
            }
        });
        getContentPane().add(ata2poke1);
        ata2poke1.setBounds(290, 200, 90, 20);

        ata3poke1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata3poke1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata3poke1ActionPerformed(evt);
            }
        });
        getContentPane().add(ata3poke1);
        ata3poke1.setBounds(410, 200, 90, 20);

        ata4poke1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata4poke1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata4poke1ActionPerformed(evt);
            }
        });
        getContentPane().add(ata4poke1);
        ata4poke1.setBounds(530, 200, 90, 20);

        ata4poke6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata4poke6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata4poke6ActionPerformed(evt);
            }
        });
        getContentPane().add(ata4poke6);
        ata4poke6.setBounds(530, 400, 90, 20);

        ata1poke1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata1poke1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata1poke1ActionPerformed(evt);
            }
        });
        getContentPane().add(ata1poke1);
        ata1poke1.setBounds(170, 200, 90, 20);

        ata2poke2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata2poke2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata2poke2ActionPerformed(evt);
            }
        });
        getContentPane().add(ata2poke2);
        ata2poke2.setBounds(290, 240, 90, 20);

        ata3poke2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata3poke2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata3poke2ActionPerformed(evt);
            }
        });
        getContentPane().add(ata3poke2);
        ata3poke2.setBounds(410, 240, 90, 20);

        ata4poke2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata4poke2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata4poke2ActionPerformed(evt);
            }
        });
        getContentPane().add(ata4poke2);
        ata4poke2.setBounds(530, 240, 90, 20);

        ata1poke3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata1poke3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata1poke3ActionPerformed(evt);
            }
        });
        getContentPane().add(ata1poke3);
        ata1poke3.setBounds(170, 280, 90, 20);

        ata2poke3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata2poke3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata2poke3ActionPerformed(evt);
            }
        });
        getContentPane().add(ata2poke3);
        ata2poke3.setBounds(290, 280, 90, 20);

        ata3poke3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata3poke3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata3poke3ActionPerformed(evt);
            }
        });
        getContentPane().add(ata3poke3);
        ata3poke3.setBounds(410, 280, 90, 20);

        ata4poke3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata4poke3);
        ata4poke3.setBounds(530, 280, 90, 20);

        ata1poke4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata1poke4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata1poke4ActionPerformed(evt);
            }
        });
        getContentPane().add(ata1poke4);
        ata1poke4.setBounds(170, 320, 90, 20);

        ata2poke4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata2poke4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata2poke4ActionPerformed(evt);
            }
        });
        getContentPane().add(ata2poke4);
        ata2poke4.setBounds(290, 320, 90, 20);

        ata3poke4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata3poke4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata3poke4ActionPerformed(evt);
            }
        });
        getContentPane().add(ata3poke4);
        ata3poke4.setBounds(410, 320, 90, 20);

        ata4poke4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(ata4poke4);
        ata4poke4.setBounds(530, 320, 90, 20);

        ata1poke5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata1poke5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata1poke5ActionPerformed(evt);
            }
        });
        getContentPane().add(ata1poke5);
        ata1poke5.setBounds(170, 360, 90, 20);

        ata2poke5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata2poke5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata2poke5ActionPerformed(evt);
            }
        });
        getContentPane().add(ata2poke5);
        ata2poke5.setBounds(290, 360, 90, 20);

        ata3poke5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata3poke5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata3poke5ActionPerformed(evt);
            }
        });
        getContentPane().add(ata3poke5);
        ata3poke5.setBounds(410, 360, 90, 20);

        ata4poke5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata4poke5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata4poke5ActionPerformed(evt);
            }
        });
        getContentPane().add(ata4poke5);
        ata4poke5.setBounds(530, 360, 90, 20);

        ata1poke6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata1poke6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata1poke6ActionPerformed(evt);
            }
        });
        getContentPane().add(ata1poke6);
        ata1poke6.setBounds(170, 400, 90, 20);

        ata2poke6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata2poke6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata2poke6ActionPerformed(evt);
            }
        });
        getContentPane().add(ata2poke6);
        ata2poke6.setBounds(290, 400, 90, 20);

        ata3poke6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ata3poke6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ata3poke6ActionPerformed(evt);
            }
        });
        getContentPane().add(ata3poke6);
        ata3poke6.setBounds(410, 400, 90, 20);

        jLabel11.setText("Nivel");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(680, 170, 23, 14);

        jLabel12.setText("Nombre");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(790, 170, 37, 14);
        getContentPane().add(nombre1);
        nombre1.setBounds(750, 200, 120, 20);

        nombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre2ActionPerformed(evt);
            }
        });
        getContentPane().add(nombre2);
        nombre2.setBounds(750, 240, 120, 20);

        nombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre3ActionPerformed(evt);
            }
        });
        getContentPane().add(nombre3);
        nombre3.setBounds(750, 280, 120, 20);
        getContentPane().add(nombre4);
        nombre4.setBounds(750, 320, 120, 20);
        getContentPane().add(nombre5);
        nombre5.setBounds(750, 360, 120, 20);
        getContentPane().add(nombre6);
        nombre6.setBounds(750, 400, 120, 20);

        LvPoke1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        LvPoke1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LvPoke1ActionPerformed(evt);
            }
        });
        getContentPane().add(LvPoke1);
        LvPoke1.setBounds(660, 200, 70, 20);

        LvPoke2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(LvPoke2);
        LvPoke2.setBounds(660, 240, 70, 20);

        LvPoke3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(LvPoke3);
        LvPoke3.setBounds(660, 280, 70, 20);

        LvPoke4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(LvPoke4);
        LvPoke4.setBounds(660, 320, 70, 20);

        LvPoke5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(LvPoke5);
        LvPoke5.setBounds(660, 360, 70, 20);

        LvPoke6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(LvPoke6);
        LvPoke6.setBounds(660, 400, 70, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Validaciones correspondientes   
        if (user.getText().isEmpty() || pass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña vacíos");
        }
        else{
            String[] poke1 = {nombre1.getText(),Integer.toString(LvPoke1.getSelectedIndex()),(String)ata1poke1.getSelectedItem(),(String)ata2poke1.getSelectedItem(),(String)ata3poke1.getSelectedItem(),(String)ata4poke1.getSelectedItem(),(String)pokem1.getSelectedItem()};
            String[] poke2 = {nombre2.getText(),Integer.toString(LvPoke2.getSelectedIndex()),(String)ata1poke2.getSelectedItem(),(String)ata2poke2.getSelectedItem(),(String)ata3poke2.getSelectedItem(),(String)ata4poke2.getSelectedItem(),(String)pokem2.getSelectedItem()};
            String[] poke3 = {nombre3.getText(),Integer.toString(LvPoke3.getSelectedIndex()),(String)ata1poke3.getSelectedItem(),(String)ata2poke3.getSelectedItem(),(String)ata3poke3.getSelectedItem(),(String)ata4poke3.getSelectedItem(),(String)pokem3.getSelectedItem()};
            String[] poke4 = {nombre4.getText(),Integer.toString(LvPoke4.getSelectedIndex()),(String)ata1poke4.getSelectedItem(),(String)ata2poke4.getSelectedItem(),(String)ata3poke4.getSelectedItem(),(String)ata4poke4.getSelectedItem(),(String)pokem4.getSelectedItem()};
            String[] poke5 = {nombre5.getText(),Integer.toString(LvPoke5.getSelectedIndex()),(String)ata1poke5.getSelectedItem(),(String)ata2poke5.getSelectedItem(),(String)ata3poke5.getSelectedItem(),(String)ata4poke5.getSelectedItem(),(String)pokem5.getSelectedItem()};
            String[] poke6 = {nombre6.getText(),Integer.toString(LvPoke6.getSelectedIndex()),(String)ata1poke6.getSelectedItem(),(String)ata2poke6.getSelectedItem(),(String)ata3poke6.getSelectedItem(),(String)ata4poke6.getSelectedItem(),(String)pokem6.getSelectedItem()};
            try {
                JOptionPane.showMessageDialog(null, "Entra al try");
                cu.creaU(poke1,poke2,poke3,poke4,poke5,poke6, user.getText(), pass.getText());
                JOptionPane.showMessageDialog(null, "Usuario creado con exito");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pokem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokem1ActionPerformed
        if(pokem1.getSelectedIndex()!=0){
            
            ata1poke1.setVisible(true);
            ata2poke1.setVisible(false);
            ata3poke1.setVisible(false);
            ata4poke1.setVisible(false);
            try {
                ataqueP1 = cu.devuelveA((String)pokem1.getSelectedItem());
                ata1poke1.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1));
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            
            
        }
    }//GEN-LAST:event_pokem1ActionPerformed

    private void ata4poke6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata4poke6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ata4poke6ActionPerformed

    private void ata2poke5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata2poke5ActionPerformed
       if(ata2poke5.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem5.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-2];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata2poke5.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata1poke5.getSelectedItem())!=0){
                        ataqueP1_2[j]=ataqueP1[i];
                        j=j+1;
                    }      
                    i=i+1;
                }
                ata3poke5.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata3poke5.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata2poke5ActionPerformed

    private void ata3poke5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata3poke5ActionPerformed
        if(ata3poke5.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem5.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-3];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata1poke5.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata2poke5.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata3poke5.getSelectedItem())!=0 ){
                            ataqueP1_2[j]=ataqueP1[i];
                            System.out.println(1);
                            j=j+1;
                    }      
                    i=i+1;
                }
                ata4poke5.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata4poke5.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata3poke5ActionPerformed

    private void ata4poke5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata4poke5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ata4poke5ActionPerformed

    private void ata1poke6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata1poke6ActionPerformed
         if(ata1poke6.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem6.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-1];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata1poke6.getSelectedItem())!=0){
                        ataqueP1_2[j]=ataqueP1[i];
                        j=j+1;
                    }      
                    i=i+1;
                }
                ata2poke6.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata2poke6.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata1poke6ActionPerformed

    private void ata2poke6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata2poke6ActionPerformed
       if(ata2poke6.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem6.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-2];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata2poke6.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata1poke6.getSelectedItem())!=0){
                        ataqueP1_2[j]=ataqueP1[i];
                        j=j+1;
                    }      
                    i=i+1;
                }
                ata3poke6.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata3poke6.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata2poke6ActionPerformed

    private void ata3poke6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata3poke6ActionPerformed
        if(ata3poke6.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem6.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-3];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata1poke6.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata2poke6.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata3poke6.getSelectedItem())!=0 ){
                            ataqueP1_2[j]=ataqueP1[i];
                            System.out.println(1);
                            j=j+1;
                    }      
                    i=i+1;
                }
                ata4poke6.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata4poke6.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata3poke6ActionPerformed

    private void nombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre3ActionPerformed

    private void nombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre2ActionPerformed

    private void ata1poke1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata1poke1ActionPerformed
        if(ata1poke1.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem1.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-1];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata1poke1.getSelectedItem())!=0){
                        ataqueP1_2[j]=ataqueP1[i];
                        j=j+1;
                    }      
                    i=i+1;
                }
                ata2poke1.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata2poke1.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata1poke1ActionPerformed

    private void ata2poke1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata2poke1ActionPerformed
       if(ata2poke1.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem1.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-2];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata2poke1.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata1poke1.getSelectedItem())!=0){
                        ataqueP1_2[j]=ataqueP1[i];
                        j=j+1;
                    }      
                    i=i+1;
                }
                ata3poke1.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata3poke1.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata2poke1ActionPerformed

    private void ata3poke1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata3poke1ActionPerformed
        if(ata3poke1.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem1.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-3];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata1poke1.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata2poke1.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata3poke1.getSelectedItem())!=0 ){
                            ataqueP1_2[j]=ataqueP1[i];
                            System.out.println(1);
                            j=j+1;
                    }      
                    i=i+1;
                }
                ata4poke1.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata4poke1.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata3poke1ActionPerformed

    private void ata4poke1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata4poke1ActionPerformed
       
    }//GEN-LAST:event_ata4poke1ActionPerformed

    private void ata1poke2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata1poke2ActionPerformed
          if(ata1poke2.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem2.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-1];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata1poke2.getSelectedItem())!=0){
                        ataqueP1_2[j]=ataqueP1[i];
                        j=j+1;
                    }      
                    i=i+1;
                }
                ata2poke2.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata2poke2.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata1poke2ActionPerformed

    private void pokem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokem2ActionPerformed
       if(pokem2.getSelectedIndex()!=0){
            
            ata1poke2.setVisible(true);
            ata2poke2.setVisible(false);
            ata3poke2.setVisible(false);
            ata4poke2.setVisible(false);
            try {
                ataqueP1 = cu.devuelveA((String)pokem2.getSelectedItem());
                ata1poke2.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1));
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            
            
        }
    }//GEN-LAST:event_pokem2ActionPerformed

    private void ata2poke2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata2poke2ActionPerformed
       if(ata2poke2.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem2.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-2];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata2poke2.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata1poke2.getSelectedItem())!=0){
                        ataqueP1_2[j]=ataqueP1[i];
                        j=j+1;
                    }      
                    i=i+1;
                }
                ata3poke2.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata3poke2.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata2poke2ActionPerformed

    private void ata3poke2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata3poke2ActionPerformed
        if(ata3poke2.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem2.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-3];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata1poke2.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata2poke2.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata3poke2.getSelectedItem())!=0 ){
                            ataqueP1_2[j]=ataqueP1[i];
                            System.out.println(1);
                            j=j+1;
                    }      
                    i=i+1;
                }
                ata4poke2.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata4poke2.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata3poke2ActionPerformed

    private void ata4poke2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata4poke2ActionPerformed
        if(ata1poke3.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem3.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-1];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata1poke3.getSelectedItem())!=0){
                        ataqueP1_2[j]=ataqueP1[i];
                        j=j+1;
                    }      
                    i=i+1;
                }
                ata2poke3.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata2poke3.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata4poke2ActionPerformed

    private void pokem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokem3ActionPerformed
        if(pokem3.getSelectedIndex()!=0){
            
            ata1poke3.setVisible(true);
            ata2poke3.setVisible(false);
            ata3poke3.setVisible(false);
            ata4poke3.setVisible(false);
            try {
                ataqueP1 = cu.devuelveA((String)pokem3.getSelectedItem());
                ata1poke3.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1));
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            
            
        }
    }//GEN-LAST:event_pokem3ActionPerformed

    private void pokem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokem4ActionPerformed
        if(pokem4.getSelectedIndex()!=0){
            
            ata1poke4.setVisible(true);
            ata2poke4.setVisible(false);
            ata3poke4.setVisible(false);
            ata4poke4.setVisible(false);
            try {
                ataqueP1 = cu.devuelveA((String)pokem4.getSelectedItem());
                ata1poke4.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1));
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            
            
        }
    }//GEN-LAST:event_pokem4ActionPerformed

    private void pokem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokem5ActionPerformed
        if(pokem5.getSelectedIndex()!=0){
            
            ata1poke5.setVisible(true);
            ata2poke5.setVisible(false);
            ata3poke5.setVisible(false);
            ata4poke5.setVisible(false);
            try {
                ataqueP1 = cu.devuelveA((String)pokem5.getSelectedItem());
                ata1poke5.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1));
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            
            
        }
    }//GEN-LAST:event_pokem5ActionPerformed

    private void pokem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pokem6ActionPerformed
       if(pokem6.getSelectedIndex()!=0){
            
            ata1poke6.setVisible(true);
            ata2poke6.setVisible(false);
            ata3poke6.setVisible(false);
            ata4poke6.setVisible(false);
            try {
                ataqueP1 = cu.devuelveA((String)pokem6.getSelectedItem());
                ata1poke6.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1));
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            
            
        }
    }//GEN-LAST:event_pokem6ActionPerformed

    private void ata1poke3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata1poke3ActionPerformed
        if(ata1poke3.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem3.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-1];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata1poke3.getSelectedItem())!=0){
                        ataqueP1_2[j]=ataqueP1[i];
                        j=j+1;
                    }      
                    i=i+1;
                }
                ata2poke3.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata2poke3.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata1poke3ActionPerformed

    private void ata1poke4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata1poke4ActionPerformed
       if(ata1poke4.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem4.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-1];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata1poke4.getSelectedItem())!=0){
                        ataqueP1_2[j]=ataqueP1[i];
                        j=j+1;
                    }      
                    i=i+1;
                }
                ata2poke4.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata2poke4.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
       }
    }//GEN-LAST:event_ata1poke4ActionPerformed
    
    private void ata2poke3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata2poke3ActionPerformed
        if(ata2poke3.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem3.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-2];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata2poke3.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata1poke3.getSelectedItem())!=0){
                        ataqueP1_2[j]=ataqueP1[i];
                        j=j+1;
                    }      
                    i=i+1;
                }
                ata3poke3.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata3poke3.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata2poke3ActionPerformed

    private void ata2poke4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata2poke4ActionPerformed
        if(ata2poke4.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem4.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-2];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata2poke4.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata1poke4.getSelectedItem())!=0){
                        ataqueP1_2[j]=ataqueP1[i];
                        j=j+1;
                    }      
                    i=i+1;
                }
                ata3poke4.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata3poke4.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata2poke4ActionPerformed

    private void ata3poke3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata3poke3ActionPerformed
        if(ata3poke3.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem3.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-3];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata1poke3.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata2poke3.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata3poke3.getSelectedItem())!=0 ){
                            ataqueP1_2[j]=ataqueP1[i];
                            System.out.println(1);
                            j=j+1;
                    }      
                    i=i+1;
                }
                ata4poke3.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata4poke3.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata3poke3ActionPerformed

    private void ata3poke4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata3poke4ActionPerformed
        if(ata3poke4.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem4.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-3];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata1poke4.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata2poke4.getSelectedItem())!=0 && ataqueP1[i].compareToIgnoreCase((String)ata3poke4.getSelectedItem())!=0 ){
                            ataqueP1_2[j]=ataqueP1[i];
                            System.out.println(1);
                            j=j+1;
                    }      
                    i=i+1;
                }
                ata4poke4.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata4poke4.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata3poke4ActionPerformed

    private void ata1poke5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ata1poke5ActionPerformed
         if(ata1poke5.getSelectedIndex()!=0){
            try {
                ataqueP1 = cu.devuelveA((String)pokem5.getSelectedItem());
                String[] ataqueP1_2 = new String[ataqueP1.length-1];
                int i=0;
                int j=0;
                while(i<ataqueP1.length){
                        if(ataqueP1[i].compareToIgnoreCase((String)ata1poke5.getSelectedItem())!=0){
                        ataqueP1_2[j]=ataqueP1[i];
                        j=j+1;
                    }      
                    i=i+1;
                }
                ata2poke5.setModel(new javax.swing.DefaultComboBoxModel(ataqueP1_2));
                ata2poke5.setVisible(true);
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ata1poke5ActionPerformed

    private void LvPoke1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LvPoke1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LvPoke1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox LvPoke1;
    private javax.swing.JComboBox LvPoke2;
    private javax.swing.JComboBox LvPoke3;
    private javax.swing.JComboBox LvPoke4;
    private javax.swing.JComboBox LvPoke5;
    private javax.swing.JComboBox LvPoke6;
    private javax.swing.JComboBox ata1poke1;
    private javax.swing.JComboBox ata1poke2;
    private javax.swing.JComboBox ata1poke3;
    private javax.swing.JComboBox ata1poke4;
    private javax.swing.JComboBox ata1poke5;
    private javax.swing.JComboBox ata1poke6;
    private javax.swing.JComboBox ata2poke1;
    private javax.swing.JComboBox ata2poke2;
    private javax.swing.JComboBox ata2poke3;
    private javax.swing.JComboBox ata2poke4;
    private javax.swing.JComboBox ata2poke5;
    private javax.swing.JComboBox ata2poke6;
    private javax.swing.JComboBox ata3poke1;
    private javax.swing.JComboBox ata3poke2;
    private javax.swing.JComboBox ata3poke3;
    private javax.swing.JComboBox ata3poke4;
    private javax.swing.JComboBox ata3poke5;
    private javax.swing.JComboBox ata3poke6;
    private javax.swing.JComboBox ata4poke1;
    private javax.swing.JComboBox ata4poke2;
    private javax.swing.JComboBox ata4poke3;
    private javax.swing.JComboBox ata4poke4;
    private javax.swing.JComboBox ata4poke5;
    private javax.swing.JComboBox ata4poke6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField nombre2;
    private javax.swing.JTextField nombre3;
    private javax.swing.JTextField nombre4;
    private javax.swing.JTextField nombre5;
    private javax.swing.JTextField nombre6;
    private javax.swing.JPasswordField pass;
    private javax.swing.JComboBox pokem1;
    private javax.swing.JComboBox pokem2;
    private javax.swing.JComboBox pokem3;
    private javax.swing.JComboBox pokem4;
    private javax.swing.JComboBox pokem5;
    private javax.swing.JComboBox pokem6;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
