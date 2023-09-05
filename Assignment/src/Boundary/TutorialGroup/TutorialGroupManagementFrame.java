/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Boundary.TutorialGroup;

import Boundary.MainFrame;
import javax.swing.JDialog;


/**
 *
 * @author CY
 */
public class TutorialGroupManagementFrame extends javax.swing.JFrame {

    /**
     * Creates new form Tutor
     */
    public TutorialGroupManagementFrame() {
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

        addStudentBtn = new javax.swing.JButton();
        removeStudentBtn = new javax.swing.JButton();
        findStudentsBtn = new javax.swing.JButton();
        modifyStudentsBtn = new javax.swing.JButton();
        viewStudentsBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewTutorialGroupsBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        addStudentBtn.setText("Add Student");
        addStudentBtn.setMaximumSize(new java.awt.Dimension(104, 22));
        addStudentBtn.setMinimumSize(new java.awt.Dimension(104, 22));
        addStudentBtn.setPreferredSize(new java.awt.Dimension(104, 22));
        addStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentBtnActionPerformed(evt);
            }
        });

        removeStudentBtn.setText("Remove Student");
        removeStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStudentBtnActionPerformed(evt);
            }
        });

        findStudentsBtn.setText("Find Students");
        findStudentsBtn.setMaximumSize(new java.awt.Dimension(104, 22));
        findStudentsBtn.setMinimumSize(new java.awt.Dimension(104, 22));
        findStudentsBtn.setPreferredSize(new java.awt.Dimension(104, 22));
        findStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findStudentsBtnActionPerformed(evt);
            }
        });

        modifyStudentsBtn.setText("Modify Students");
        modifyStudentsBtn.setMaximumSize(new java.awt.Dimension(104, 22));
        modifyStudentsBtn.setMinimumSize(new java.awt.Dimension(104, 22));
        modifyStudentsBtn.setPreferredSize(new java.awt.Dimension(104, 22));
        modifyStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyStudentsBtnActionPerformed(evt);
            }
        });

        viewStudentsBtn.setText("View Students");
        viewStudentsBtn.setMaximumSize(new java.awt.Dimension(104, 22));
        viewStudentsBtn.setMinimumSize(new java.awt.Dimension(104, 22));
        viewStudentsBtn.setPreferredSize(new java.awt.Dimension(104, 22));
        viewStudentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStudentsBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Tutorial Group Management");

        viewTutorialGroupsBtn.setText("View Tutorial Groups");
        viewTutorialGroupsBtn.setMaximumSize(new java.awt.Dimension(104, 22));
        viewTutorialGroupsBtn.setMinimumSize(new java.awt.Dimension(104, 22));
        viewTutorialGroupsBtn.setPreferredSize(new java.awt.Dimension(104, 22));
        viewTutorialGroupsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTutorialGroupsBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.setMaximumSize(new java.awt.Dimension(104, 22));
        backBtn.setMinimumSize(new java.awt.Dimension(104, 22));
        backBtn.setPreferredSize(new java.awt.Dimension(104, 22));
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
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(removeStudentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addStudentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(findStudentsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modifyStudentsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewStudentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewTutorialGroupsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(addStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(removeStudentBtn)
                .addGap(17, 17, 17)
                .addComponent(findStudentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(modifyStudentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(viewStudentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(viewTutorialGroupsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentBtnActionPerformed
        JDialog addDialog = new AddDialog(this, true);
        addDialog.setVisible(true);
    }//GEN-LAST:event_addStudentBtnActionPerformed

    private void removeStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStudentBtnActionPerformed
        JDialog removeDialog = new RemoveDialog(this, true);
        removeDialog.setVisible(true);
    }//GEN-LAST:event_removeStudentBtnActionPerformed

    private void findStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findStudentsBtnActionPerformed
        JDialog findDialog = new FindDialog(this, true);
        findDialog.setVisible(true);
    }//GEN-LAST:event_findStudentsBtnActionPerformed

    private void modifyStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyStudentsBtnActionPerformed
        JDialog modifyDialog = new ModifyDialog(this, true);
        modifyDialog.setVisible(true);
    }//GEN-LAST:event_modifyStudentsBtnActionPerformed

    private void viewStudentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStudentsBtnActionPerformed
        JDialog viewDialog = new ViewDialog(this, true);
        viewDialog.setVisible(true);
    }//GEN-LAST:event_viewStudentsBtnActionPerformed

    private void viewTutorialGroupsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTutorialGroupsBtnActionPerformed
        JDialog viewTutorialGroupDialog = new ViewTutorialGroupDialog(this, true);
        viewTutorialGroupDialog.setVisible(true);
    }//GEN-LAST:event_viewTutorialGroupsBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        MainFrame main = new MainFrame();
        main.setVisible(true);
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
            java.util.logging.Logger.getLogger(TutorialGroupManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutorialGroupManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutorialGroupManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorialGroupManagementFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorialGroupManagementFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton findStudentsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton modifyStudentsBtn;
    private javax.swing.JButton removeStudentBtn;
    private javax.swing.JButton viewStudentsBtn;
    private javax.swing.JButton viewTutorialGroupsBtn;
    // End of variables declaration//GEN-END:variables
}
