
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
        AddProgrammeBtn = new javax.swing.JButton();
        removeProgrammeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CourseTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CourseTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CourseTitle.setText("Amend Course Details");

        AddProgrammeBtn.setText("Add Programme");
        AddProgrammeBtn.setMaximumSize(new java.awt.Dimension(134, 22));
        AddProgrammeBtn.setMinimumSize(new java.awt.Dimension(134, 22));
        AddProgrammeBtn.setPreferredSize(new java.awt.Dimension(134, 22));
        AddProgrammeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProgrammeBtnActionPerformed(evt);
            }
        });

        removeProgrammeBtn.setText("Remove Course");
        removeProgrammeBtn.setMaximumSize(new java.awt.Dimension(134, 22));
        removeProgrammeBtn.setMinimumSize(new java.awt.Dimension(134, 22));
        removeProgrammeBtn.setPreferredSize(new java.awt.Dimension(134, 22));
        removeProgrammeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeProgrammeBtnActionPerformed(evt);
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
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(CourseTitle)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AddProgrammeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(removeProgrammeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(CourseTitle)
                .addGap(59, 59, 59)
                .addComponent(AddProgrammeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(removeProgrammeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddProgrammeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProgrammeBtnActionPerformed
        AddProgrammeCourse addProgramme = new AddProgrammeCourse();
        addProgramme.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddProgrammeBtnActionPerformed

    private void removeProgrammeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProgrammeBtnActionPerformed
        RemoveProgrammeCourse removeProgramme = new RemoveProgrammeCourse();
        removeProgramme.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_removeProgrammeBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        CourseManagementFrame courseManagementFrame = new CourseManagementFrame();
        courseManagementFrame.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed


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
    private javax.swing.JButton AddProgrammeBtn;
    private javax.swing.JLabel CourseTitle;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton removeProgrammeBtn;
    // End of variables declaration//GEN-END:variables
}
