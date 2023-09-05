/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Boundary.TutorialGroup;

import ADT.Impl.ArrayList;
import Boundary.Tutor.*;
import Controller.TutorController;
import Controller.TutorialGroupController;
import Entity.Student;
import Entity.Tutor;
import Entity.TutorialGroup;
import javax.swing.DefaultListModel;

/**
 *
 * @author CY
 */
public class ViewTutorialGroupDialog extends javax.swing.JDialog {

    /**
     * Creates new form JDialog
     */
    public ViewTutorialGroupDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        tutorialGroupController = TutorialGroupController.getInstance();
        initComponents();
        displayTutorialGroupList();
    }

    private void initializeTutorialGroupField() {
        ArrayList<TutorialGroup> tutorialGroupList = tutorialGroupController.getTutorialGroupList();

        for (TutorialGroup group : tutorialGroupList) {
            tutorialGroupField.addItem(Integer.toString(group.getGroupNumber()));
        }
    }

    private void displayTutorialGroupList() {
        clearTextArea();
        ArrayList<TutorialGroup> tutGroupList;
        int i = 1;
        int selectedTutGroupIndex = tutorialGroupField.getSelectedIndex();
        int selectedSortModeIndex = sortModeField.getSelectedIndex();

        if (selectedTutGroupIndex == 0 && selectedSortModeIndex == 0) {
            tutGroupList = getTutorialGroupAscendingByGroupNo();
        } else if (selectedTutGroupIndex == 0 && selectedSortModeIndex == 1) {
            tutGroupList = getTutorialGroupDescendingByGroupNo();
        } else if (selectedTutGroupIndex == 1 && selectedSortModeIndex == 0) {
            tutGroupList = getTutorialGroupAscendingByStudentNo();
        } else {
            tutGroupList = getTutorialGroupDescendingByStudentNo();
        }

        for (TutorialGroup tutGroup : tutGroupList) {
            int groupNumber = tutGroup.getGroupNumber();
            int noOfStudents = tutGroup.getNoOfStudents();

            tutorialGroupResultTextArea.append("===================================\n");
            tutorialGroupResultTextArea.append(String.format(" %-15s: %s\n", "Entry no.", i));
            tutorialGroupResultTextArea.append(String.format(" %-15s: %s\n", "Group Number", groupNumber));
            tutorialGroupResultTextArea.append(String.format(" %-15s: %s\n", "Student Number", noOfStudents));
            i++;
        }
        if (i != 1) {
            tutorialGroupResultTextArea.append("===================================\n");
        } else {
            tutorialGroupResultTextArea.append("No entries found!\n");
        }
    }

    private ArrayList<TutorialGroup> getTutorialGroupAscendingByGroupNo() {
        ArrayList<TutorialGroup> tutGroupList = tutorialGroupController.getTutorialGroupList();
        ArrayList<TutorialGroup> result = new ArrayList<>();
        result.add(tutGroupList.get(0));
        boolean shouldInsertLast = true;

        for (int i = 1; i < tutGroupList.size(); i++) {
            TutorialGroup tutGroup1 = tutGroupList.get(i);
            shouldInsertLast = true;
            for (int j = 0; j < result.size(); j++) {
                TutorialGroup tutGroup2 = tutGroupList.get(j);
                if (tutGroup1.getGroupNumber() < tutGroup2.getGroupNumber()) {
                    result.add(0, tutGroup1);
                    shouldInsertLast = false;
                    break;
                }
            }

            if (shouldInsertLast) {
                result.add(tutGroup1);
            }
        }
        return result;
    }

    private ArrayList<TutorialGroup> getTutorialGroupDescendingByGroupNo() {
        ArrayList<TutorialGroup> tutGroupList = tutorialGroupController.getTutorialGroupList();
        ArrayList<TutorialGroup> result = new ArrayList<>();
        result.add(tutGroupList.get(0));
        boolean shouldInsertLast = true;

        for (int i = 1; i < tutGroupList.size(); i++) {
            TutorialGroup tutGroup1 = tutGroupList.get(i);
            shouldInsertLast = true;
            for (int j = 0; j < result.size(); j++) {
                TutorialGroup tutGroup2 = tutGroupList.get(j);

                if (tutGroup1.getGroupNumber() > tutGroup2.getGroupNumber()) {
                    result.add(0, tutGroup1);
                    shouldInsertLast = false;
                    break;
                }

            }

            if (shouldInsertLast) {
                result.add(tutGroup1);
            }
        }
        return result;
    }

    private ArrayList<TutorialGroup> getTutorialGroupAscendingByStudentNo() {
        ArrayList<TutorialGroup> tutGroupList = tutorialGroupController.getTutorialGroupList();
        ArrayList<TutorialGroup> result = new ArrayList<>();
        result.add(tutGroupList.get(0));
        boolean shouldInsertLast = true;

        for (int i = 1; i < tutGroupList.size(); i++) {
            TutorialGroup tutGroup1 = tutGroupList.get(i);
            shouldInsertLast = true;
            for (int j = 0; j < result.size(); j++) {
                TutorialGroup tutGroup2 = tutGroupList.get(j);

                if (tutGroup1.getNoOfStudents() < tutGroup2.getNoOfStudents()) {
                    result.add(0, tutGroup1);
                    shouldInsertLast = false;
                    break;
                }

            }

            if (shouldInsertLast) {
                result.add(tutGroup1);
            }
        }
        return result;
    }

    private ArrayList<TutorialGroup> getTutorialGroupDescendingByStudentNo() {
        ArrayList<TutorialGroup> tutGroupList = tutorialGroupController.getTutorialGroupList();
        ArrayList<TutorialGroup> result = new ArrayList<>();
        result.add(tutGroupList.get(0));
        boolean shouldInsertLast = true;

        for (int i = 1; i < tutGroupList.size(); i++) {
            TutorialGroup tutGroup1 = tutGroupList.get(i);
            shouldInsertLast = true;
            for (int j = 0; j < result.size(); j++) {
                TutorialGroup tutGroup2 = tutGroupList.get(j);

                if (tutGroup1.getNoOfStudents() > tutGroup2.getNoOfStudents()) {
                    result.add(0, tutGroup1);
                    shouldInsertLast = false;
                    break;
                }

            }

            if (shouldInsertLast) {
                result.add(tutGroup1);
            }
        }
        return result;
    }

    private void clearTextArea() {
        tutorialGroupResultTextArea.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tutorialGroupResultTextArea = new javax.swing.JTextArea();
        cancelBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tutorialGroupField = new javax.swing.JComboBox<>();
        initializeTutorialGroupField();
        sortModeField = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Tutorial Group List:");

        tutorialGroupResultTextArea.setColumns(20);
        tutorialGroupResultTextArea.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tutorialGroupResultTextArea.setForeground(new java.awt.Color(0, 0, 0));
        tutorialGroupResultTextArea.setLineWrap(true);
        tutorialGroupResultTextArea.setRows(5);
        tutorialGroupResultTextArea.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        tutorialGroupResultTextArea.setEnabled(false);
        jScrollPane1.setViewportView(tutorialGroupResultTextArea);

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Sort by");

        tutorialGroupField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Group No", "Student No" }));
        tutorialGroupField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorialGroupFieldActionPerformed(evt);
            }
        });

        sortModeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));
        sortModeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortModeFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tutorialGroupField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortModeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cancelBtn)
                            .addGap(146, 146, 146))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tutorialGroupField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(sortModeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelBtn)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void tutorialGroupFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorialGroupFieldActionPerformed
        displayTutorialGroupList();
    }//GEN-LAST:event_tutorialGroupFieldActionPerformed

    private void sortModeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortModeFieldActionPerformed
        displayTutorialGroupList();
    }//GEN-LAST:event_sortModeFieldActionPerformed

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
            java.util.logging.Logger.getLogger(ViewTutorialGroupDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTutorialGroupDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTutorialGroupDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTutorialGroupDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewTutorialGroupDialog dialog = new ViewTutorialGroupDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private DefaultListModel<String> dlm = new DefaultListModel<>();
    TutorialGroupController tutorialGroupController;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sortModeField;
    private javax.swing.JComboBox<String> tutorialGroupField;
    private javax.swing.JTextArea tutorialGroupResultTextArea;
    // End of variables declaration//GEN-END:variables
}
