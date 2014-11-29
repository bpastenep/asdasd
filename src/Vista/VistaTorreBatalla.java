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
    
    public VistaTorreBatalla(ControladorTorreBatalla ct, String usua, boolean conti) throws SQLException {
        initComponents();
        this.ctb = ct;
        if(ctb.getNumCV()== 0)
            nxtCombate.setText("Comenzar");
        else 
            nxtCombate.setText("Siguiente combate");
        vistaP.setText("Menú Principal");
        this.usua1=usua;
        UsuarioTB.setText(usua1);
        if(conti)
            batallasG.setText(""+ctb.cBatallas(usua1));
        else
            batallasG.setText("0");
        batallasGM.setText(""+ctb.getCBatallas());
        batallasM.setText(""+ctb.getCantidadCombateGanar());
        this.avanceTDB.setValue(ctb.retornaPorcen());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nroBatallas = new javax.swing.JLabel();
        avanceTDB = new javax.swing.JProgressBar();
        nxtCombate = new javax.swing.JButton();
        vistaP = new javax.swing.JButton();
        UsuarioTB = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        batallasG = new javax.swing.JLabel();
        batallasGM = new javax.swing.JLabel();
        batallasM = new javax.swing.JLabel();
        batallasGM2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VistaTorredeBatalla.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(715, 430));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VistaTorredeBatalla.jpg"))); // NOI18N

        setMinimumSize(new java.awt.Dimension(715, 440));
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(null);

        nroBatallas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nroBatallas.setForeground(new java.awt.Color(51, 51, 255));
        nroBatallas.setText("Entrenador");
        getContentPane().add(nroBatallas);
        nroBatallas.setBounds(240, 140, 140, 15);
        getContentPane().add(avanceTDB);
        avanceTDB.setBounds(220, 350, 315, 25);

        nxtCombate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nxtCombate.setForeground(new java.awt.Color(204, 0, 0));
        nxtCombate.setText("jButton1");
        nxtCombate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nxtCombateActionPerformed(evt);
            }
        });
        getContentPane().add(nxtCombate);
        nxtCombate.setBounds(140, 290, 130, 23);

        vistaP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vistaP.setForeground(new java.awt.Color(204, 0, 0));
        vistaP.setText("jButton2");
        vistaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaPActionPerformed(evt);
            }
        });
        getContentPane().add(vistaP);
        vistaP.setBounds(440, 290, 130, 23);

        UsuarioTB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UsuarioTB.setForeground(new java.awt.Color(255, 255, 153));
        UsuarioTB.setText("Usuario");
        getContentPane().add(UsuarioTB);
        UsuarioTB.setBounds(420, 140, 130, 15);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Batallas ganadas :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 170, 140, 15);

        batallasG.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        batallasG.setForeground(new java.awt.Color(255, 255, 153));
        batallasG.setText("jLabel2");
        getContentPane().add(batallasG);
        batallasG.setBounds(420, 170, 110, 15);

        batallasGM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        batallasGM.setForeground(new java.awt.Color(255, 255, 51));
        batallasGM.setText("/");
        getContentPane().add(batallasGM);
        batallasGM.setBounds(540, 350, 50, 30);

        batallasM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        batallasM.setForeground(new java.awt.Color(255, 255, 51));
        batallasM.setText("jLabel5");
        getContentPane().add(batallasM);
        batallasM.setBounds(590, 350, 50, 30);

        batallasGM2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        batallasGM2.setForeground(new java.awt.Color(255, 255, 51));
        batallasGM2.setText("/");
        getContentPane().add(batallasGM2);
        batallasGM2.setBounds(570, 350, 50, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VistaTorredeBatalla.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 720, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nxtCombateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nxtCombateActionPerformed
        try{
            this.ctb.avanceTorre ();
            batallasG.setText(""+ctb.getCBatallas());
            ctb.setNumCV(ctb.getCBatallas());
            ctb.validarTerminoTDB();
            avanceTDB.setValue(ctb.retornaPorcen());
            batallasGM.setText(""+ctb.getCBatallas());
            batallasM.setText(""+ctb.getCantidadCombateGanar());
        }catch (SQLException s){System.out.println(s);}
    }//GEN-LAST:event_nxtCombateActionPerformed

    private void vistaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaPActionPerformed
       try{
        ctb.guardarRegistro();
        this.setVisible(false);
        }catch (SQLException s){System.out.println(s);}
    }//GEN-LAST:event_vistaPActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UsuarioTB;
    private javax.swing.JProgressBar avanceTDB;
    private javax.swing.JLabel batallasG;
    private javax.swing.JLabel batallasGM;
    private javax.swing.JLabel batallasGM2;
    private javax.swing.JLabel batallasM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel nroBatallas;
    private javax.swing.JButton nxtCombate;
    private javax.swing.JButton vistaP;
    // End of variables declaration//GEN-END:variables
}