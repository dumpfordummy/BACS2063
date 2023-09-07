/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Boundary;

import Boundary.Course.CourseManagementFrame;
import Boundary.Tutor.TutorManagementFrame;
import Boundary.Programme.*;
import Boundary.TutorialGroup.TutorialGroupManagementFrame;

/**
 *
 * @author CY
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainFrame() {
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

        jLabel2 = new javax.swing.JLabel();
        programmeBtn = new javax.swing.JButton();
        tutorialGroupBtn = new javax.swing.JButton();
        tutorBtn = new javax.swing.JButton();
        courseBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("TARUMT Management System");

        programmeBtn.setText("Programme");
        programmeBtn.setMaximumSize(new java.awt.Dimension(120, 25));
        programmeBtn.setMinimumSize(new java.awt.Dimension(120, 25));
        programmeBtn.setPreferredSize(new java.awt.Dimension(120, 25));
        programmeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programmeBtnActionPerformed(evt);
            }
        });

        tutorialGroupBtn.setText("Tutorial Group");
        tutorialGroupBtn.setMaximumSize(new java.awt.Dimension(120, 25));
        tutorialGroupBtn.setMinimumSize(new java.awt.Dimension(120, 25));
        tutorialGroupBtn.setPreferredSize(new java.awt.Dimension(120, 25));
        tutorialGroupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorialGroupBtnActionPerformed(evt);
            }
        });

        tutorBtn.setText("Tutor");
        tutorBtn.setMaximumSize(new java.awt.Dimension(120, 25));
        tutorBtn.setMinimumSize(new java.awt.Dimension(120, 25));
        tutorBtn.setPreferredSize(new java.awt.Dimension(120, 25));
        tutorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorBtnActionPerformed(evt);
            }
        });

        courseBtn.setText("Course");
        courseBtn.setMaximumSize(new java.awt.Dimension(120, 25));
        courseBtn.setMinimumSize(new java.awt.Dimension(120, 25));
        courseBtn.setPreferredSize(new java.awt.Dimension(120, 25));
        courseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tutorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tutorialGroupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(programmeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 101, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(programmeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(tutorialGroupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(tutorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(courseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void programmeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programmeBtnActionPerformed
        ProgrammeManagementFrame programmeManagementFrame = new ProgrammeManagementFrame();
        programmeManagementFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_programmeBtnActionPerformed

    private void tutorialGroupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorialGroupBtnActionPerformed
        TutorialGroupManagementFrame tutorialGroupManagement = new TutorialGroupManagementFrame();
        tutorialGroupManagement.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tutorialGroupBtnActionPerformed

    private void tutorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorBtnActionPerformed
        TutorManagementFrame tutorManagement = new TutorManagementFrame();
        tutorManagement.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tutorBtnActionPerformed

    private void courseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseBtnActionPerformed
        CourseManagementFrame courseManagement = new CourseManagementFrame();
        courseManagement.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_courseBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton courseBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton programmeBtn;
    private javax.swing.JButton tutorBtn;
    private javax.swing.JButton tutorialGroupBtn;
    // End of variables declaration//GEN-END:variables
}
