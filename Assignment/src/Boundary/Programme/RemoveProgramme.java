/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Boundary.Programme;

import Controller.ProgrammeController;
import Entity.Programme;
import java.awt.Color;

/**
 *
 * @author Wai Loc
 */
public class RemoveProgramme extends javax.swing.JFrame {

    /**
     * Creates new form DeleteProgramme
     */
    public RemoveProgramme() {
        initComponents();
        displayProgrammeListSidebar();
    }

    public final void displayProgrammeListSidebar() {
        ProgrammeController programmeController = new ProgrammeController();
        String output = programmeController.displayProgrammeList(ProgrammeController.getProgrammeList());

        progListTxtArea.setText(output);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewProgLabel = new javax.swing.JLabel();
        progListLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        progListTxtArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        progRemoveBy = new javax.swing.JComboBox<>();
        inputLabel = new javax.swing.JLabel();
        removeInputTField = new javax.swing.JTextField();
        removeBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        feedbackMsg = new javax.swing.JLabel();
        feedbackMsgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewProgLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        viewProgLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewProgLabel.setText("Remove Programme");

        progListLabel.setText("Programme List:");

        progListTxtArea.setEditable(false);
        progListTxtArea.setColumns(20);
        progListTxtArea.setRows(5);
        jScrollPane1.setViewportView(progListTxtArea);

        jLabel1.setText("Remove programme by:");
        jLabel1.setMaximumSize(new java.awt.Dimension(128, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(128, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(128, 30));

        progRemoveBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Index", "Programme ID" }));
        progRemoveBy.setMaximumSize(new java.awt.Dimension(110, 30));
        progRemoveBy.setMinimumSize(new java.awt.Dimension(110, 30));
        progRemoveBy.setName(""); // NOI18N
        progRemoveBy.setPreferredSize(new java.awt.Dimension(110, 30));
        progRemoveBy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                progRemoveByItemStateChanged(evt);
            }
        });
        progRemoveBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progRemoveByActionPerformed(evt);
            }
        });

        inputLabel.setText("Index:");
        inputLabel.setMaximumSize(new java.awt.Dimension(128, 30));
        inputLabel.setMinimumSize(new java.awt.Dimension(128, 30));
        inputLabel.setPreferredSize(new java.awt.Dimension(128, 30));

        removeInputTField.setMaximumSize(new java.awt.Dimension(110, 30));
        removeInputTField.setMinimumSize(new java.awt.Dimension(110, 30));
        removeInputTField.setPreferredSize(new java.awt.Dimension(110, 30));
        removeInputTField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeInputTFieldActionPerformed(evt);
            }
        });

        removeBtn.setText("Remove");
        removeBtn.setMaximumSize(new java.awt.Dimension(80, 25));
        removeBtn.setMinimumSize(new java.awt.Dimension(80, 25));
        removeBtn.setPreferredSize(new java.awt.Dimension(80, 25));
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.setMaximumSize(new java.awt.Dimension(80, 25));
        cancelBtn.setMinimumSize(new java.awt.Dimension(80, 25));
        cancelBtn.setPreferredSize(new java.awt.Dimension(80, 25));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        feedbackMsgLabel.setMaximumSize(new java.awt.Dimension(40, 20));
        feedbackMsgLabel.setMinimumSize(new java.awt.Dimension(40, 20));
        feedbackMsgLabel.setPreferredSize(new java.awt.Dimension(40, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(progListLabel)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .addComponent(feedbackMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(progRemoveBy, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(removeInputTField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGap(20, 20, 20))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(feedbackMsgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(viewProgLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(viewProgLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progListLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(progRemoveBy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(removeInputTField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(feedbackMsgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addGap(18, 18, 18)
                .addComponent(feedbackMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void progRemoveByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progRemoveByActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_progRemoveByActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        ProgrammeController progController = new ProgrammeController();
        boolean result = false;
        
        if (removeInputTField.getText().equals("")) {
            feedbackMsgLabel.setForeground(Color.red);
            feedbackMsgLabel.setText("Index cannot be empty!");
            return;
        }
        
        if (removeInputTField.getText().equals("")){
            removeInputTField.setText("");
            feedbackMsg.setForeground(Color.red);
            feedbackMsg.setText("Input text field is empty!");
            return;
        }
        
        try{
            if (progRemoveBy.getSelectedIndex() == REMOVE_BY_INDEX) {
                result = progController.removeProgramme(Integer.parseInt(removeInputTField.getText()) - 1);
            } else if (progRemoveBy.getSelectedIndex() == REMOVE_BY_PROGID) {
                String programmeID = removeInputTField.getText();
                Programme programme = progController.findProgrammeByID(programmeID);
                result = progController.removeProgramme(programme);
            }
            
            if (result){
            displayProgrammeListSidebar();
            feedbackMsg.setForeground(new Color(56,118,29));
            feedbackMsg.setText("Programme is successfully removed from list!");
            
            } else {
                displayProgrammeListSidebar();
                feedbackMsg.setForeground(Color.red);
                feedbackMsg.setText("Failed to remove programme!");
            }
        } catch (NullPointerException ex){
            feedbackMsg.setForeground(Color.red);
            feedbackMsg.setText("Index is out of bounds! Please enter numbers starting from 1 to " + ProgrammeController.getProgrammeList().size());
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void progRemoveByItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_progRemoveByItemStateChanged
        if (progRemoveBy.getSelectedIndex() == REMOVE_BY_INDEX){
            inputLabel.setText("Index:");
        } else if (progRemoveBy.getSelectedIndex() == REMOVE_BY_PROGID){
            inputLabel.setText("Programme ID:");
        }
    }//GEN-LAST:event_progRemoveByItemStateChanged

    private void removeInputTFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeInputTFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeInputTFieldActionPerformed

    
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
            java.util.logging.Logger.getLogger(RemoveProgramme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveProgramme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveProgramme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveProgramme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveProgramme().setVisible(true);
            }
        });
    }

    private static final int REMOVE_BY_INDEX = 0;
    private static final int REMOVE_BY_PROGID = 1;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel feedbackMsg;
    private javax.swing.JLabel feedbackMsgLabel;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel progListLabel;
    private javax.swing.JTextArea progListTxtArea;
    private javax.swing.JComboBox<String> progRemoveBy;
    private javax.swing.JButton removeBtn;
    private javax.swing.JTextField removeInputTField;
    private javax.swing.JLabel viewProgLabel;
    // End of variables declaration//GEN-END:variables
}
