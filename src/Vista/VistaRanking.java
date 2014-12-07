package Vista;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import Controlador.ControladorRanking;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VistaRanking extends javax.swing.JDialog {

    private ControladorRanking cRan;
    
    public VistaRanking() {
        initComponents();
        setcRan(new ControladorRanking());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        rankTrainer = new javax.swing.JTable();
        vuelveMenu = new javax.swing.JButton();
        rPropio = new javax.swing.JButton();

        setTitle("Ranking");
        setMinimumSize(new java.awt.Dimension(386, 300));
        setResizable(false);

        rankTrainer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N#", "Entrenador", "editable"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(rankTrainer);

        vuelveMenu.setText("Salir");
        vuelveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vuelveMenuActionPerformed(evt);
            }
        });

        rPropio.setText("Ranking Victorias");
        rPropio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPropioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(vuelveMenu))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(rPropio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(rPropio)
                .addGap(18, 18, 18)
                .addComponent(vuelveMenu)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rPropioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPropioActionPerformed
        JTableHeader th = rankTrainer.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();
        TableColumn tc = tcm.getColumn(2);
        tc.setHeaderValue( "Victorias" );
        try {
            getcRan().rankingVictorias();
        }catch(SQLException ex){}
        DefaultTableModel model = (DefaultTableModel) rankTrainer.getModel();
        model.getDataVector().removeAllElements();
        for(int i = 0; i < getcRan().getIndex(); i++){
            String[] fila = {cRan.getRanking()[i][0], cRan.getRanking()[i][1], cRan.getRanking()[i][2]}; 
            model.addRow(fila);
        }
        th.repaint();
    }//GEN-LAST:event_rPropioActionPerformed

    private void vuelveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vuelveMenuActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_vuelveMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton rPropio;
    private javax.swing.JTable rankTrainer;
    private javax.swing.JButton vuelveMenu;
    // End of variables declaration//GEN-END:variables

    public ControladorRanking getcRan() {
        return cRan;
    }

    public void setcRan(ControladorRanking cRan) {
        this.cRan = cRan;
    }
}
