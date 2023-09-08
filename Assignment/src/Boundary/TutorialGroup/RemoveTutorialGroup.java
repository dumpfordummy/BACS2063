/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Boundary.TutorialGroup;

import ADT.Impl.ArrayList;
import Controller.TutorialGroupController;
import Entity.Student;
import Entity.TutorialGroup;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Low Hau Shien
 */
public class RemoveTutorialGroup extends javax.swing.JDialog {

    /**
     * Creates new form RemoveDialog
     */
    public RemoveTutorialGroup(java.awt.Frame parent, boolean modal) {
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
        clearDisplayList();
        int i = 0;
        ArrayList<TutorialGroup> tutGroupList = tutorialGroupController.getTutorialGroupList();
        int selectedTutGroupIndex = tutorialGroupField.getSelectedIndex();
        if (tutGroupList.size() != 0 && selectedTutGroupIndex != -1) {
            TutorialGroup tutGroup = tutGroupList.get(selectedTutGroupIndex);
            ArrayList<Student> studentList = (ArrayList<Student>) tutGroup.getStudentList();
            for (Student student : studentList) {
                i++;
                dlm.addElement(String.format("%d. %-15s %s", i, student.getStudID(), student.getFullName()));
            }
        }
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
        jLabel2 = new javax.swing.JLabel();
        removeEntryField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tutorList = new JList<>(dlm);
        removeBtn = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        totalEntryLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tutorialGroupField = new javax.swing.JComboBox<>();
        initializeTutorialGroupField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setText("Enter student id to remove ");

        jLabel2.setText("Student id");

        tutorList.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(tutorList);

        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        totalEntryLabel.setText("Total entry: ");

        jLabel3.setText("Tutorial Group");

        tutorialGroupField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorialGroupFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(totalEntryLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tutorialGroupField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(cancel)
                        .addGap(65, 65, 65)
                        .addComponent(removeBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(removeEntryField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalEntryLabel)
                    .addComponent(jLabel3)
                    .addComponent(tutorialGroupField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(removeEntryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeBtn)
                    .addComponent(cancel))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        String inputStudentId = removeEntryField.getText();
        int selectedTutGroupIndex = tutorialGroupField.getSelectedIndex();
        TutorialGroup currentTutorialGroup = null;
        for (TutorialGroup tutGroup : tutorialGroupController.getTutorialGroupList()) {
            if (tutGroup.getGroupNumber() == selectedTutGroupIndex + 1) {
                currentTutorialGroup = tutGroup;
                break;
            }
        }

        if(currentTutorialGroup == null) {
            return;
        }
        
        ArrayList<Student> studentList = (ArrayList<Student>) currentTutorialGroup.getStudentList();

        if (studentList.size() != 0) {
            for(Student student : studentList) {
                if(student.getStudID().equals(inputStudentId)) {
                    studentList.remove(student);
                    currentTutorialGroup.decrementNoOfStudents();
                    break;
                }
            }
        }

        clearInput();
        displayTutorialGroupList();
    }//GEN-LAST:event_removeBtnActionPerformed

    private void clearInput() {
        removeEntryField.setText("");
    }

    private void clearDisplayList() {
        dlm.clear();
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void tutorialGroupFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorialGroupFieldActionPerformed
        displayTutorialGroupList();
    }//GEN-LAST:event_tutorialGroupFieldActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveTutorialGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveTutorialGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveTutorialGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveTutorialGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RemoveTutorialGroup dialog = new RemoveTutorialGroup(new javax.swing.JFrame(), true);
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

    private TutorialGroupController tutorialGroupController;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeBtn;
    private javax.swing.JTextField removeEntryField;
    private javax.swing.JLabel totalEntryLabel;
    private javax.swing.JList<String> tutorList;
    private javax.swing.JComboBox<String> tutorialGroupField;
    // End of variables declaration//GEN-END:variables
}