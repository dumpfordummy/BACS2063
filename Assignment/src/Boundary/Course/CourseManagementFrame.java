/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boundary.Course;

/**
 *
 * @author jennw
 */
public class CourseManagementFrame extends javax.swing.JFrame {

    /**
     * Creates new form CourseManagementFrame
     */
    public CourseManagementFrame() {
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
        addCourseBtn = new javax.swing.JButton();
        viewCourseBtn = new javax.swing.JButton();
        findCourseBtn = new javax.swing.JButton();
        modifyCourseBtn = new javax.swing.JButton();
        removeCourseBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CourseTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CourseTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CourseTitle.setText("Course Management");

        addCourseBtn.setText("Add New Course");
        addCourseBtn.setMaximumSize(new java.awt.Dimension(134, 22));
        addCourseBtn.setMinimumSize(new java.awt.Dimension(134, 22));
        addCourseBtn.setPreferredSize(new java.awt.Dimension(134, 22));
        addCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseBtnActionPerformed(evt);
            }
        });

        viewCourseBtn.setText("View ALL Course");
        viewCourseBtn.setMaximumSize(new java.awt.Dimension(134, 22));
        viewCourseBtn.setMinimumSize(new java.awt.Dimension(134, 22));
        viewCourseBtn.setPreferredSize(new java.awt.Dimension(134, 22));
        viewCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCourseBtnActionPerformed(evt);
            }
        });

        findCourseBtn.setText("Find Course");
        findCourseBtn.setMaximumSize(new java.awt.Dimension(134, 22));
        findCourseBtn.setMinimumSize(new java.awt.Dimension(134, 22));
        findCourseBtn.setPreferredSize(new java.awt.Dimension(134, 22));
        findCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCourseBtnActionPerformed(evt);
            }
        });

        modifyCourseBtn.setText("Modify Course");
        modifyCourseBtn.setMaximumSize(new java.awt.Dimension(134, 22));
        modifyCourseBtn.setMinimumSize(new java.awt.Dimension(134, 22));
        modifyCourseBtn.setPreferredSize(new java.awt.Dimension(134, 22));
        modifyCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyCourseBtnActionPerformed(evt);
            }
        });

        removeCourseBtn.setText("Remove Course");
        removeCourseBtn.setMaximumSize(new java.awt.Dimension(134, 22));
        removeCourseBtn.setMinimumSize(new java.awt.Dimension(134, 22));
        removeCourseBtn.setPreferredSize(new java.awt.Dimension(134, 22));
        removeCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCourseBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back to Home");
        backBtn.setMaximumSize(new java.awt.Dimension(134, 22));
        backBtn.setMinimumSize(new java.awt.Dimension(134, 22));
        backBtn.setPreferredSize(new java.awt.Dimension(134, 22));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(CourseTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(findCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modifyCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CourseTitle)
                .addGap(18, 18, 18)
                .addComponent(addCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(findCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modifyCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removeCourseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseBtnActionPerformed
        AddCourse addCourse = new AddCourse();
        addCourse.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addCourseBtnActionPerformed

    private void viewCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCourseBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewCourseBtnActionPerformed

    private void findCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCourseBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findCourseBtnActionPerformed

    private void modifyCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyCourseBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyCourseBtnActionPerformed

    private void removeCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCourseBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeCourseBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CourseManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseManagementFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CourseTitle;
    private javax.swing.JButton addCourseBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton findCourseBtn;
    private javax.swing.JButton modifyCourseBtn;
    private javax.swing.JButton removeCourseBtn;
    private javax.swing.JButton viewCourseBtn;
    // End of variables declaration//GEN-END:variables
}
