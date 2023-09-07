package Boundary.Course;

import ADT.Impl.LinkedList;
import Controller.CourseController;
import Entity.Course;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author jennw
 */
public class FindCourse extends javax.swing.JFrame {

    /**
     * Creates new form FindCourse
     */
    public FindCourse() {
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

        jDialog1 = new javax.swing.JDialog();
        CourseTitle = new javax.swing.JLabel();
        courseComboField = new javax.swing.JComboBox<>();
        FindCourseTxtField = new javax.swing.JTextField();
        findBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CourseTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CourseTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CourseTitle.setText("Find Course ");

        courseComboField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Course Code", "Course Name" }));
        courseComboField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseComboFieldActionPerformed(evt);
            }
        });

        FindCourseTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindCourseTxtFieldActionPerformed(evt);
            }
        });

        findBtn.setText("Find");
        findBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Course Code Example: BACS2020");

        jLabel2.setText("Course Name Example: Database");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(findBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(courseComboField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CourseTitle)
                        .addComponent(FindCourseTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(CourseTitle)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseComboField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FindCourseTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void courseComboFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseComboFieldActionPerformed
        // TODO add your handling code here:
        String itemName = (String) courseComboField.getSelectedItem();
        int itemIndex = courseComboField.getSelectedIndex();
    }//GEN-LAST:event_courseComboFieldActionPerformed

    private void FindCourseTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindCourseTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FindCourseTxtFieldActionPerformed

    
    private final static int FindCourseCode = 0;
    private final static int FindCourseName = 1;
    
    private void findBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtnActionPerformed
        CourseController courseController = CourseController.getInstance();
        String input = FindCourseTxtField.getText();
        LinkedList<Course> courseList = new LinkedList<>();

        if (courseComboField.getSelectedIndex() == FindCourseCode) {
            Course foundCourse = courseController.findCourseCode(input);
            if (foundCourse != null) {
                courseList.add(foundCourse);
                displayFoundCourses(courseList);
            } else {
                JOptionPane.showMessageDialog(null, "Course with code '" + input + "' not found.");
            }
        } else {
            Course foundCourse = courseController.findCourseName(input);
            if (foundCourse != null) {
                courseList.add(foundCourse);
                displayFoundCourses(courseList);
            } else {
                JOptionPane.showMessageDialog(null, "Course with name '" + input + "' not found.");
            }
        }
    }//GEN-LAST:event_findBtnActionPerformed

    private void displayFoundCourses(LinkedList<Course> courses) {
    if (courses.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No courses found.");
        return;
    }

    StringBuilder message = new StringBuilder("Found Courses:\n");

    for (Course course : courses) {
        message.append("Course Code: ").append(course.getCourseCode()).append("\n");
        message.append("Course Name: ").append(course.getCourseName()).append("\n");
        message.append("Total Credit Hour: ").append(course.getCreditHours()).append("\n");
        message.append("\n");
    }

    JOptionPane.showMessageDialog(null, message.toString());
}
    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
        
        CourseManagementFrame courseManagementFrame = new CourseManagementFrame();
        courseManagementFrame.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed


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
            java.util.logging.Logger.getLogger(FindCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindCourse().setVisible(true);
            }
        });
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CourseTitle;
    private javax.swing.JTextField FindCourseTxtField;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> courseComboField;
    private javax.swing.JButton findBtn;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
