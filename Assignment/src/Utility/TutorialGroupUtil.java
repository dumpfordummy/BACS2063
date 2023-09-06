/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import ADT.Impl.ArrayList;
import Boundary.TutorialGroup.ViewTutorialGroupDialog;
import Controller.TutorialGroupController;
import Entity.Student;
import Entity.TutorialGroup;

/**
 *
 * @author jennw
 */
public class TutorialGroupUtil {
    private static TutorialGroupController tutorialGroupController = TutorialGroupController.getInstance();
    
    public static ArrayList<Student> getAllStudents() {
        ArrayList<Student> result = new ArrayList<>();
        for(TutorialGroup tutGroup : tutorialGroupController.getTutorialGroupList()) {
            ArrayList<Student> studentList = (ArrayList<Student>) tutGroup.getStudentList();
            if(studentList.size() != 0) {
                for(Student student : studentList) {
                    result.add(student);
                }
            }
        }
        return result;
    }

    public static ArrayList<Student> findStudentsByStudentName(String studentName) {
        ArrayList<Student> result = new ArrayList<>();
        for (TutorialGroup tutGroup : tutorialGroupController.getTutorialGroupList()) {
            for (Student student : tutGroup.getStudentList()) {
                if (student.getFullName().toUpperCase().equals(studentName.toUpperCase())) {
                    result.add(student);
                }
            }
        }
        return result;
    }

    public static Student findStudentByStudentId(String studentId) {
        for (TutorialGroup tutGroup : tutorialGroupController.getTutorialGroupList()) {
            for (Student student : tutGroup.getStudentList()) {
                if (student.getStudID().equals(studentId)) {
                    return student;
                }
            }
        }
        return null;
    }

    public static ArrayList<TutorialGroup> getTutorialGroupAscendingByGroupNo() {
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

    public static ArrayList<TutorialGroup> getTutorialGroupDescendingByGroupNo() {
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

    public static ArrayList<TutorialGroup> getTutorialGroupAscendingByStudentNo() {
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

    public static ArrayList<TutorialGroup> getTutorialGroupDescendingByStudentNo() {
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
}
