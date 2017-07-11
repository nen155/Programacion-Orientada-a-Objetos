/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import NapakalakiGame.CombatResult;
import NapakalakiGame.Napakalaki;

/**
 *
 * @author nen155
 */
public class NapakalakiView extends javax.swing.JFrame {

    private Napakalaki napakalakiModel;
    
    public void setNapakalaki(Napakalaki n){
        napakalakiModel=n;
        playerView1.setPlayer(napakalakiModel.getCurrentPlayer());
        playerView1.setNapakalaki(napakalakiModel);
        repaint();
        revalidate();
    }
    /**
     * Creates new form NapakalakiView
     */
    public NapakalakiView() {
        initComponents();
        monsterView1.setVisible(false);
        Combat.setEnabled(false);
        nextTurn.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combatDialog = new javax.swing.JDialog();
        labelCombatResult = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        meetTheMonster = new javax.swing.JButton();
        Combat = new javax.swing.JButton();
        nextTurn = new javax.swing.JButton();
        playerView1 = new GUI.PlayerView();
        monsterView1 = new GUI.MonsterView();

        combatDialog.setMinimumSize(new java.awt.Dimension(500, 200));

        labelCombatResult.setText("jLabel2");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout combatDialogLayout = new javax.swing.GroupLayout(combatDialog.getContentPane());
        combatDialog.getContentPane().setLayout(combatDialogLayout);
        combatDialogLayout.setHorizontalGroup(
            combatDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(combatDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(combatDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCombatResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, combatDialogLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        combatDialogLayout.setVerticalGroup(
            combatDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(combatDialogLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(labelCombatResult, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Napakalaki");

        meetTheMonster.setText("Meet the Monster");
        meetTheMonster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meetTheMonsterActionPerformed(evt);
            }
        });

        Combat.setText("Combat");
        Combat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombatActionPerformed(evt);
            }
        });

        nextTurn.setText("Next Turn");
        nextTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextTurnActionPerformed(evt);
            }
        });

        playerView1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        monsterView1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(meetTheMonster)
                .addGap(305, 305, 305)
                .addComponent(Combat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextTurn)
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playerView1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(monsterView1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(613, 613, 613)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playerView1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(monsterView1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meetTheMonster)
                    .addComponent(Combat)
                    .addComponent(nextTurn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meetTheMonsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meetTheMonsterActionPerformed
       //EXAMEN
        playerView1.habilitaIn(false);
        //FIN EXAMEN
        playerView1.habilitarBuy(false);
        meetTheMonster.setEnabled(false);
        Combat.setEnabled(true);
        monsterView1.setVisible(true);
        monsterView1.setMonster(napakalakiModel.getCurrentMonster());
    }//GEN-LAST:event_meetTheMonsterActionPerformed

    private void CombatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombatActionPerformed
        
        CombatResult result = napakalakiModel.developCombat();
        switch (result) {
            case Win: labelCombatResult.setText("Has derrotado al monstruo.");
            break;
            case WinAndWinGame: labelCombatResult.setText("Has ganado el combate y el juego. ¡Enhorabuena!");
            break;
            case Lose: labelCombatResult.setText("Has sido derrotado. Ahora se te aplicará el mal rollo del monstruo.");
            break;
            case LoseAndDie: labelCombatResult.setText("Has sido derrotado y has muerto.");
            break;
            case LoseAndEscape: labelCombatResult.setText("Has logrado escapar del combate a salvo.");
            break;
            case LoseAndConvert: labelCombatResult.setText("Has perdido pero te has convertido en Sectario.");
            break;
            default: labelCombatResult.setText("Error en el combate.");
            break;
            }
        combatDialog.setVisible(true);
        combatDialog.setLocationRelativeTo(this);
        Combat.setEnabled(false);
        nextTurn.setEnabled(true);
        playerView1.habilitarDescarte(true);
        playerView1.habilitarBuy(true);
        playerView1.repaint();
        playerView1.revalidate();
        
        repaint();
        revalidate();
    }//GEN-LAST:event_CombatActionPerformed

    private void nextTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextTurnActionPerformed
        if(napakalakiModel.nextTurn() )
        {
            
            playerView1.habilitarDescarte(false);
            labelCombatResult.setText("");
            //monsterView1.setMonster(napakalakiModel.getCurrentMonster());
            //monsterView1.setVisible(false);
            monsterView1.setVisible(false);
            
            
            playerView1.setPlayer(napakalakiModel.getCurrentPlayer());
            
            nextTurn.setEnabled(false);
            meetTheMonster.setEnabled(true);
            //EXAMEN
            playerView1.habilitaIn(true);
            //FIN EXAMEN
            repaint();
        }
    }//GEN-LAST:event_nextTurnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        combatDialog.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void showView(){
        this.setVisible(true);
    }
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NapakalakiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NapakalakiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NapakalakiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NapakalakiView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NapakalakiView().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Combat;
    private javax.swing.JDialog combatDialog;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCombatResult;
    private javax.swing.JButton meetTheMonster;
    private GUI.MonsterView monsterView1;
    private javax.swing.JButton nextTurn;
    private GUI.PlayerView playerView1;
    // End of variables declaration//GEN-END:variables
}