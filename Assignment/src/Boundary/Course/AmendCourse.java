
package Boundary.Course;

import ADT.Impl.LinkedList;
import Controller.CourseController;
import Entity.Course;
import javax.swing.JOptionPane;

/**
 *
 * @author jennw
 */
public class AmendCourse extends javax.swing.JFrame {

    public AmendCourse() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CourseTitle = new javax.swing.JLabel();
        amendBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        courseNameTxtField = new javax.swing.JTextField();
        courseCodeTxtField = new javax.swing.JTextField();
        totalCreditHourTxtField = new javax.swing.JTextField();
        courseNameLabel = new javax.swing.JLabel();
        courseCodeLabel = new javax.swing.JLabel();
        totalCreditHourLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CourseTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CourseTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CourseTitle.setText("Amend Course Details");

        amendBtn.setText("Amend");
        amendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amendBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        courseNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseNameTxtFieldActionPerformed(evt);
            }
        });

        courseNameLabel.setText("Course Name:");
        courseNameLabel.setMaximumSize(new java.awt.Dimension(110, 20));
        courseNameLabel.setMinimumSize(new java.awt.Dimension(110, 20));
        courseNameLabel.setPreferredSize(new java.awt.Dimension(110, 20));

        courseCodeLabel.setText("Course Code:");
        courseCodeLabel.setMaximumSize(new java.awt.Dimension(110, 20));
        courseCodeLabel.setMinimumSize(new java.awt.Dimension(110, 20));
        courseCodeLabel.setPreferredSize(new java.awt.Dimension(110, 20));

        totalCreditHourLabel.setText("Total Credit Hour");
        totalCreditHourLabel.setMaximumSize(new java.awt.Dimension(110, 20));
        totalCreditHourLabel.setMinimumSize(new java.awt.Dimension(110, 20));
        totalCreditHourLabel.setPreferredSize(new java.awt.Dimension(110, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CourseTitle)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(amendBtn)
                        .addGap(19, 19, 19)
                        .addComponent(cancelBtn)
                        .addGap(190, 190, 190))))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(courseNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(courseCodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totalCreditHourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(courseNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseCodeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCreditHourTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(CourseTitle)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseCodeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalCreditHourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCreditHourTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amendBtn)
                    .addComponent(cancelBtn))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amendBtnActionPerformed
        Course course = new Course();
        CourseController courseController =  CourseController.getInstance();

        String courseCode = courseCodeTxtField.getText();
        String courseName = courseNameTxtField.getText();
        double courseHour = Double.parseDouble(totalCreditHourTxtField.getText());

        Course newCourse = new Course(courseCode, courseName, courseHour);

        boolean isDuplicate = false;

        for (Course existingCourse : courseController.getcourseList()) {
            if (existingCourse.equals(newCourse)) {
                isDuplicate = true;
                break;
            }
        }

        if (!isDuplicate) {
            courseController.addCourse(newCourse);
            JOptionPane.showMessageDialog(null, "Successful Added a New Course into the system. \nCourse Code : " +courseCode + "\nCourse Name : " + courseName + "\nCourse Hour : "+String.format("%.0f", courseHour));
        } else {
            JOptionPane.showMessageDialog(null, "There is an Duplication with the existing Course.");
        }
    }//GEN-LAST:event_amendBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();

        CourseManagementFrame courseManagementFrame = new CourseManagementFrame();
        courseManagementFrame.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void courseNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseNameTxtFieldActionPerformed


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
            java.util.logging.Logger.getLogger(AmendCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AmendCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AmendCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AmendCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AmendCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CourseTitle;
    private javax.swing.JButton amendBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel courseCodeLabel;
    private javax.swing.JTextField courseCodeTxtField;
    private javax.swing.JLabel courseNameLabel;
    private javax.swing.JTextField courseNameTxtField;
    private javax.swing.JLabel totalCreditHourLabel;
    private javax.swing.JTextField totalCreditHourTxtField;
    // End of variables declaration//GEN-END:variables
}
