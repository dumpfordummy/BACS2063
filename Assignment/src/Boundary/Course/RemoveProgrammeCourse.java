/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boundary.Course;

import ADT.Impl.LinkedList;
import ADT.Impl.LinkedSetUniqueList;
import ADT.Interface.ListInterface;
import Controller.CourseController;
import Controller.ProgrammeController;
import Entity.Course;
import Entity.Programme;
import java.awt.Color;

/**
 *
 * @author jennw
 */
public class RemoveProgrammeCourse extends javax.swing.JFrame {

    /**
     * Creates new form RemoveProgramme
     */
    public RemoveProgrammeCourse() {
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

        CourseTitle = new javax.swing.JLabel();
        programmeSelectList = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        courseSelectList = new javax.swing.JComboBox<>();
        initializeCourseField();
        removeBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        feedbackMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CourseTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CourseTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CourseTitle.setText("Remove Programme from Course");

        programmeSelectList.setMaximumSize(new java.awt.Dimension(230, 25));
        programmeSelectList.setMinimumSize(new java.awt.Dimension(230, 25));
        programmeSelectList.setPreferredSize(new java.awt.Dimension(230, 25));
        programmeSelectList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programmeSelectListActionPerformed(evt);
            }
        });

        jLabel2.setText("Programme:");
        jLabel2.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel2.setPreferredSize(new java.awt.Dimension(80, 25));

        jLabel3.setText("From Course:");
        jLabel3.setMaximumSize(new java.awt.Dimension(80, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(80, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 25));

        courseSelectList.setMaximumSize(new java.awt.Dimension(230, 25));
        courseSelectList.setMinimumSize(new java.awt.Dimension(230, 25));
        courseSelectList.setPreferredSize(new java.awt.Dimension(230, 25));

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

        feedbackMsg.setMaximumSize(new java.awt.Dimension(130, 25));
        feedbackMsg.setMinimumSize(new java.awt.Dimension(130, 25));
        feedbackMsg.setPreferredSize(new java.awt.Dimension(130, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(CourseTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(feedbackMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(courseSelectList, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(246, Short.MAX_VALUE)
                    .addComponent(programmeSelectList, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(130, 130, 130)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(CourseTitle)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseSelectList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(feedbackMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(159, 159, 159)
                    .addComponent(programmeSelectList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(160, Short.MAX_VALUE)))
        );

        initializeProgrammeField();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void programmeSelectListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programmeSelectListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programmeSelectListActionPerformed

    public void initializeCourseField() {
        CourseController courseController = CourseController.getInstance();
        LinkedList<Course> courseList = courseController.getcourseList();

        for (Course course : courseList) {
            courseSelectList.addItem(course.getCourseCode());
        }
        initializeProgrammeField();
    }

    public void initializeProgrammeField() {
        String selectedCourseCode = courseSelectList.getSelectedItem().toString();

        CourseController courseController = CourseController.getInstance();
        Course selectedCourse = courseController.findCourseCode(selectedCourseCode);
        
        programmeSelectList.removeAllItems();
        LinkedList<Programme> programmeList = selectedCourse.getProgrammeList();

        for (Programme programme : programmeList) {
            programmeSelectList.addItem(programme.getProgrammeName());
        }
    }

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed

        String selectedCourseCode = courseSelectList.getSelectedItem().toString();
        String selectedProgrammeName = programmeSelectList.getSelectedItem().toString();

        CourseController courseController = CourseController.getInstance();
        Course selectedCourse = courseController.findCourseCode(selectedCourseCode);

        ProgrammeController programmeController = new ProgrammeController();
        Programme selectedProgramme = programmeController.findProgrammeByName(selectedProgrammeName);

        if (selectedCourse != null && selectedProgramme != null) {
            // Remove the programme from the course
            if (selectedCourse.getProgrammeList().remove(selectedProgramme)) {
                feedbackMsg.setForeground(new Color(56, 118, 29));
                feedbackMsg.setText("Programme removed successfully!");
            } else {
                feedbackMsg.setForeground(Color.red);
                feedbackMsg.setText("Failed to remove Programme!");
            }
        } else {
            feedbackMsg.setForeground(Color.red);
            feedbackMsg.setText("Selected Course or Programme not found!");
        }

    }//GEN-LAST:event_removeBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
        AmendCourse amendCourse = new AmendCourse();
        amendCourse.setVisible(true);

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
            java.util.logging.Logger.getLogger(RemoveProgrammeCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveProgrammeCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveProgrammeCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveProgrammeCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveProgrammeCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CourseTitle;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> courseSelectList;
    private javax.swing.JLabel feedbackMsg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> programmeSelectList;
    private javax.swing.JButton removeBtn;
    // End of variables declaration//GEN-END:variables
}
