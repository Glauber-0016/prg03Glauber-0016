/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.atividade06.view;

import java.lang.reflect.Array;
import java.util.Arrays;
import javax.swing.DefaultListModel;

/**
 *
 * @author Glauber
 */
public class Vetor extends javax.swing.JFrame {

    /**
     * Creates new form Vetor
     */
    
    int vetor[] = new int[10];
    int posição = 0;
    
    DefaultListModel lista = new DefaultListModel();
    
    
    
    public Vetor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnNumero = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        lblVec = new javax.swing.JLabel();
        lblNumVec = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstVetores = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(720, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spnNumero.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        spnNumero.setModel(new javax.swing.SpinnerNumberModel());
        spnNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(spnNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 210, -1));

        btnAdd.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnAdd.setText("Adicionar");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        btnRemove.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnRemove.setText("Remover");
        btnRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        btnSort.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnSort.setText("Ordenar");
        btnSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });
        getContentPane().add(btnSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 210, -1));

        lblVec.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblVec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVec.setText("Vetor");
        lblVec.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(lblVec, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 60, -1));

        lblNumVec.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblNumVec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumVec.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(lblNumVec, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 40, 60, 20));

        lstVetores.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lstVetores.setModel(lista);
        lstVetores.setToolTipText("");
        lstVetores.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lstVetores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstVetoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstVetores);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 200, 310));

        jSeparator1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 220, 360));

        jSeparator2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 230, 140));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 470, 20));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 20, 380));

        jSeparator5.setToolTipText("");
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, 10));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 10, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        vetor[posição] = Integer.parseInt(spnNumero.getValue().toString());
        
        lista.removeAllElements();
        
        for (int i = 0; i <= vetor.length; i++)
        {
            lista.addElement(vetor[i]);
        }
 
    }//GEN-LAST:event_btnAddActionPerformed

    private void lstVetoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstVetoresMouseClicked
        posição = lstVetores.getSelectedIndex();
        lblNumVec.setText("[" + posição + "]");
    }//GEN-LAST:event_lstVetoresMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        vetor[posição] = -1;
        
        lista.removeAllElements();
        
        for (int i = 0; i <= vetor.length; i++)
        {
            lista.addElement(vetor[i]);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        // TODO add your handling code here:
        lista.removeAllElements();
        Arrays.sort(vetor);
        
        for (int i = 0; i <= vetor.length; i++)
        {
            lista.addElement(vetor[i]);
        }
        
    }//GEN-LAST:event_btnSortActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vetor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vetor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSort;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblNumVec;
    private javax.swing.JLabel lblVec;
    private javax.swing.JList<String> lstVetores;
    private javax.swing.JSpinner spnNumero;
    // End of variables declaration//GEN-END:variables
}
