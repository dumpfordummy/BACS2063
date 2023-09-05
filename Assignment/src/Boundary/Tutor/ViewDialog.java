/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Boundary.Tutor;

import ADT.Impl.ArraySetUniqueList;
import Controller.TutorController;
import Entity.Tutor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import javax.swing.DefaultListModel;

/**
 *
 * @author CY
 */
public class ViewDialog extends javax.swing.JDialog {

    /**
     * Creates new form JDialog
     */
    public ViewDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        displayTutorList();
    }

    private void initializeTutorField() {
        Field[] fields = ViewDialog.class.getDeclaredFields();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    tutorField.addItem((String) field.get(null));
                } catch (IllegalAccessException ex) {
                    tutorResultTextArea.setText("Failed to initialize tutor options");
                }
            }
        }
    }

    private void clearTextField() {
        tutorResultTextArea.setText("");
    }

    private void displayTutorList() {
        clearTextField();

        int i = 1;
        ArraySetUniqueList<Tutor> tutorList = getSortedTutorList();
        for (Tutor tutor : tutorList) {
            String tutorId = tutor.getTutorId();
            String name = tutor.getName();
            String contact = tutor.getContact();
            String gender = tutor.getGender();
            String qualification = tutor.getQualification();
            int age = tutor.getAge();

            tutorResultTextArea.append("===================================\n");
            tutorResultTextArea.append(String.format(" %-15s: %s\n", "Entry no.", i));
            tutorResultTextArea.append(String.format(" %-15s: %s\n", "Tutor Id", tutorId));
            tutorResultTextArea.append(String.format(" %-15s: %s\n", "Name", name));
            tutorResultTextArea.append(String.format(" %-15s: %s\n", "Contact", contact));
            tutorResultTextArea.append(String.format(" %-15s: %s\n", "Gender", gender));
            tutorResultTextArea.append(String.format(" %-15s: %s\n", "Qualification", qualification));
            tutorResultTextArea.append(String.format(" %-15s: %d\n", "Age", age));
            i++;
        }
        if (i != 1) {
            tutorResultTextArea.append("===================================\n");
        } else {
            tutorResultTextArea.append("No entries found!\n");
        }
    }

    private ArraySetUniqueList<Tutor> getSortedTutorList() {
        TutorController tutorController = TutorController.getInstance();
        ArraySetUniqueList<Tutor> result = tutorController.getTutorList();
        BiFunction<Tutor, Tutor, Boolean> tutorSortCriteriaFunction;

        if (((String) tutorField.getSelectedItem()).equals(TUTORID_ASC)) {
            tutorSortCriteriaFunction = (a, b) -> a.getTutorId().compareTo(b.getTutorId()) < 0;

        } else if (((String) tutorField.getSelectedItem()).equals(TUTORID_DESC)) {
            tutorSortCriteriaFunction = (a, b) -> a.getTutorId().compareTo(b.getTutorId()) > 0;

        } else if (((String) tutorField.getSelectedItem()).equals(TUTORNAME_ASC)) {
            tutorSortCriteriaFunction = (a, b) -> a.getName().compareTo(b.getName()) < 0;

        } else if (((String) tutorField.getSelectedItem()).equals(TUTORNAME_DESC)) {
            tutorSortCriteriaFunction = (a, b) -> a.getName().compareTo(b.getName()) > 0;

        } else if (((String) tutorField.getSelectedItem()).equals(TUTORAGE_ASC)) {
            tutorSortCriteriaFunction = (a, b) -> a.getAge().compareTo(b.getAge()) < 0;

        } else {
            tutorSortCriteriaFunction = (a, b) -> a.getAge().compareTo(b.getAge()) > 0;

        }
        return sortTutor(result, tutorSortCriteriaFunction);
    }

    private ArraySetUniqueList<Tutor> sortTutor(ArraySetUniqueList<Tutor> tutorList, BiFunction<Tutor, Tutor, Boolean> compareFunction) {
        int n = tutorList.size();
        ArraySetUniqueList<Tutor> sortedList = new ArraySetUniqueList<>(n);

        sortedList.add(tutorList.get(0));

        boolean shouldInsertLast = true;

        for (int scanIndex = 1; scanIndex < n; scanIndex++) {
            Tutor tutor1 = tutorList.get(scanIndex);
            shouldInsertLast = true;
            for (int insertIndex = 0; insertIndex < sortedList.size(); insertIndex++) {
                Tutor tutor2 = sortedList.get(insertIndex);

                if (compareFunction.apply(tutor1, tutor2)) {
                    sortedList.add(0, tutor1);
                    shouldInsertLast = false;
                    break;
                }
            }

            if (shouldInsertLast) {
                sortedList.add(tutor1);
            }
        }
        return sortedList;
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
        tutorResultTextArea = new javax.swing.JTextArea();
        cancelBtn = new javax.swing.JButton();
        tutorField = new javax.swing.JComboBox<>();
        initializeTutorField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Tutor List:");

        tutorResultTextArea.setColumns(20);
        tutorResultTextArea.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tutorResultTextArea.setForeground(new java.awt.Color(0, 0, 0));
        tutorResultTextArea.setLineWrap(true);
        tutorResultTextArea.setRows(5);
        tutorResultTextArea.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        tutorResultTextArea.setEnabled(false);
        jScrollPane1.setViewportView(tutorResultTextArea);

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        tutorField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tutor Id Asc", "Tutor Id Desc", "Tutor Name Asc", "Tutor Name Desc", "Tutor Age Asc", "Tutor Age Desc" }));
        tutorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutorFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Sort by");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelBtn)
                        .addGap(146, 146, 146))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tutorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 7, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tutorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
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

    private void tutorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutorFieldActionPerformed
        displayTutorList();
    }//GEN-LAST:event_tutorFieldActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewDialog dialog = new ViewDialog(new javax.swing.JFrame(), true);
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

    private static final String TUTORID_ASC = "Tutor Id Asc";
    private static final String TUTORID_DESC = "Tutor Id Desc";
    private static final String TUTORNAME_ASC = "Tutor Name Asc";
    private static final String TUTORNAME_DESC = "Tutor Name Desc";
    private static final String TUTORAGE_ASC = "Tutor Age Asc";
    private static final String TUTORAGE_DESC = "Tutor Age Desc";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> tutorField;
    private javax.swing.JTextArea tutorResultTextArea;
    // End of variables declaration//GEN-END:variables
}
