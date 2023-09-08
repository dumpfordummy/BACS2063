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
public class EditProgrammeDetails extends javax.swing.JFrame {

    /**
     * Creates new form EditProgrammeDetails
     */
    public EditProgrammeDetails() {
        initComponents();
    }

    public EditProgrammeDetails(Programme p, String index){
        initComponents();
        selectedIndexLabel.setText(selectedIndexLabel.getText() + index);
        progNameTxtField.setText(p.getProgrammeName());
        progIDTxtField.setText(p.getProgrammeID());
        durationTxtField.setText(p.getDuration());
        feesTxtField.setText(String.valueOf(p.getFeesInTotal()));
        totalSemTxtField.setText(String.valueOf(p.getTotalSemesters()));
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        feesLabel = new javax.swing.JLabel();
        progNameTxtField = new javax.swing.JTextField();
        progIDTxtField = new javax.swing.JTextField();
        durationTxtField = new javax.swing.JTextField();
        feesTxtField = new javax.swing.JTextField();
        totalSemTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        progNameLabel = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        progIDLabel = new javax.swing.JLabel();
        feedbackMsgLabel = new javax.swing.JLabel();
        durationLabel = new javax.swing.JLabel();
        totalSemLabel = new javax.swing.JLabel();
        selectedIndexLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        feesLabel.setText("Fees (RM):");
        feesLabel.setMaximumSize(new java.awt.Dimension(110, 20));
        feesLabel.setMinimumSize(new java.awt.Dimension(110, 20));
        feesLabel.setPreferredSize(new java.awt.Dimension(110, 20));

        progNameTxtField.setMaximumSize(new java.awt.Dimension(220, 25));
        progNameTxtField.setMinimumSize(new java.awt.Dimension(220, 25));
        progNameTxtField.setPreferredSize(new java.awt.Dimension(220, 25));

        progIDTxtField.setMaximumSize(new java.awt.Dimension(220, 25));
        progIDTxtField.setMinimumSize(new java.awt.Dimension(220, 25));
        progIDTxtField.setPreferredSize(new java.awt.Dimension(220, 25));

        durationTxtField.setMaximumSize(new java.awt.Dimension(220, 25));
        durationTxtField.setMinimumSize(new java.awt.Dimension(220, 25));
        durationTxtField.setPreferredSize(new java.awt.Dimension(220, 25));

        feesTxtField.setMaximumSize(new java.awt.Dimension(220, 25));
        feesTxtField.setMinimumSize(new java.awt.Dimension(220, 25));
        feesTxtField.setPreferredSize(new java.awt.Dimension(220, 25));

        totalSemTxtField.setMaximumSize(new java.awt.Dimension(220, 25));
        totalSemTxtField.setMinimumSize(new java.awt.Dimension(220, 25));
        totalSemTxtField.setPreferredSize(new java.awt.Dimension(220, 25));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Programme Details");

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        progNameLabel.setText("Programme Name:");
        progNameLabel.setMaximumSize(new java.awt.Dimension(110, 20));
        progNameLabel.setMinimumSize(new java.awt.Dimension(110, 20));
        progNameLabel.setPreferredSize(new java.awt.Dimension(110, 20));

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        progIDLabel.setText("Programme ID:");
        progIDLabel.setMaximumSize(new java.awt.Dimension(110, 20));
        progIDLabel.setMinimumSize(new java.awt.Dimension(110, 20));
        progIDLabel.setPreferredSize(new java.awt.Dimension(110, 20));

        feedbackMsgLabel.setMaximumSize(new java.awt.Dimension(40, 20));
        feedbackMsgLabel.setMinimumSize(new java.awt.Dimension(40, 20));
        feedbackMsgLabel.setPreferredSize(new java.awt.Dimension(40, 20));

        durationLabel.setText("Duration (years):");
        durationLabel.setMaximumSize(new java.awt.Dimension(110, 20));
        durationLabel.setMinimumSize(new java.awt.Dimension(110, 20));
        durationLabel.setPreferredSize(new java.awt.Dimension(110, 20));

        totalSemLabel.setText("Total Semesters:");
        totalSemLabel.setMaximumSize(new java.awt.Dimension(110, 20));
        totalSemLabel.setMinimumSize(new java.awt.Dimension(110, 20));
        totalSemLabel.setPreferredSize(new java.awt.Dimension(110, 20));

        selectedIndexLabel.setText("Selected index: ");
        selectedIndexLabel.setMaximumSize(new java.awt.Dimension(90, 20));
        selectedIndexLabel.setMinimumSize(new java.awt.Dimension(90, 20));
        selectedIndexLabel.setPreferredSize(new java.awt.Dimension(90, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(editBtn)
                        .addGap(71, 71, 71)
                        .addComponent(cancelBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(selectedIndexLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(progNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(progIDLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(durationLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalSemLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(feesLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(progNameTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(progIDTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(durationTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(feesTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalSemTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(feedbackMsgLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(selectedIndexLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(progNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(progNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(progIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(progIDTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(durationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(durationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feesTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalSemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalSemTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(feedbackMsgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn)
                    .addComponent(cancelBtn))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        ProgrammeController progController = new ProgrammeController();

        String programmeName = progNameTxtField.getText();
        String programmeID = progIDTxtField.getText();
        String duration = durationTxtField.getText();
        double feesInTotal = Double.parseDouble(feesTxtField.getText());
        int totalSemesters = Integer.parseInt(totalSemTxtField.getText());
        int index = Integer.parseInt(selectedIndexLabel.getText().substring(16));

        if (progController.replaceProgramme(index, new Programme(programmeName, programmeID, duration, feesInTotal, totalSemesters))){
            feedbackMsgLabel.setText("Programme is edited successfully!");
            feedbackMsgLabel.setForeground(new Color(56,118,29));
        } else {
            feedbackMsgLabel.setText("Failed to edit programme!");
            feedbackMsgLabel.setForeground(Color.red);
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
        EditProgramme editProgramme = new EditProgramme();
        editProgramme.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EditProgrammeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProgrammeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProgrammeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProgrammeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProgrammeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JTextField durationTxtField;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel feedbackMsgLabel;
    private javax.swing.JLabel feesLabel;
    private javax.swing.JTextField feesTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel progIDLabel;
    private javax.swing.JTextField progIDTxtField;
    private javax.swing.JLabel progNameLabel;
    private javax.swing.JTextField progNameTxtField;
    private javax.swing.JLabel selectedIndexLabel;
    private javax.swing.JLabel totalSemLabel;
    private javax.swing.JTextField totalSemTxtField;
    // End of variables declaration//GEN-END:variables
}
