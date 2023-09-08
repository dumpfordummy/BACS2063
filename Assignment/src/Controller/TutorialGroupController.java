/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import ADT.Impl.ArrayList;
import Entity.Student;
import Entity.TutorialGroup;

/**
 *
 * @author Low Hau Shien
 */
public class TutorialGroupController {

    private static class TutorialGroupControllerHolder {

        private static final TutorialGroupController INSTANCE = new TutorialGroupController();
    }

    private final ArrayList<TutorialGroup> tutorialGroupList;

    private TutorialGroupController() {
        tutorialGroupList = new ArrayList<>();
        seedData();
    }

    private void seedData() {
        Student student1 = new Student("Hoo Chun Yuan", "11WMR20193", "1@gmail.com");
        Student student2 = new Student("Hoh Jenn Wen", "12WMR21202", "2@gmail.com");
        Student student3 = new Student("Low Hau Shien", "13WMR21920", "3@gmail.com");
        Student student4 = new Student("Leong Wai Loc", "14WMR21412", "4@gmail.com");

        ArrayList<Student> studentList1 = new ArrayList<>();

        studentList1.add(student1);
        studentList1.add(student2);
        studentList1.add(student3);
        studentList1.add(student4);

        TutorialGroup tutorialGroup1 = new TutorialGroup(studentList1);

        Student student5 = new Student("Pua Jin Jian", "22WMR12345", "5@gmail.com");
        Student student6 = new Student("Tung Chen Chung", "22WMR21202", "6@gmail.com");
        Student student7 = new Student("Tan Zhi Hao", "23WMR21920", "7@gmail.com");
        Student student8 = new Student("Chook Zhen Yew", "24WMR21412", "8@gmail.com");
        Student student9 = new Student("Ng Xu Xiang", "25WMR23484", "9@gmail.com");

        ArrayList<Student> studentList2 = new ArrayList<>();

        studentList2.add(student5);
        studentList2.add(student6);
        studentList2.add(student7);
        studentList2.add(student8);
        studentList2.add(student9);

        TutorialGroup tutorialGroup2 = new TutorialGroup(studentList2);
        
        Student student10 = new Student("Handle Walter", "32WMR61602", "walter@gmail.com");
        Student student11 = new Student("Sulla", "33WMR51921", "sulla@gmail.com");
        Student student12 = new Student("V-IV Rusty", "34WMR21318", "buddy@gmail.com");
        Student student13 = new Student("Cinder Carla", "35WMR12345", "RAD@gmail.com");
        Student student14 = new Student("Ayre", "36WMR66513", "rubicon3@gmail.com");
        Student student15 = new Student("V-II Snail", "37WMR22222", "arquebusCorp@gmail.com");
        Student student16 = new Student("G1 Michigan", "38WMR11111", "balamIndustries@gmail.com");
        Student student17 = new Student("C4-621 Raven", "31WMR04621", "Raven@gmail.com");

        ArrayList<Student> studentList3 = new ArrayList<>();

        studentList3.add(student10);
        studentList3.add(student11);
        studentList3.add(student12);
        studentList3.add(student13);
        studentList3.add(student14);
        studentList3.add(student15);
        studentList3.add(student16);
        studentList3.add(student17);

        TutorialGroup tutorialGroup3 = new TutorialGroup(studentList3);
        
        Student student18 = new Student("Ranni", "41WMR30100", "ranniTheWitch@gmail.com");
        Student student19 = new Student("Blaidd", "42WMR30101", "BlaiddTheHalfWolf@gmail.com");
        Student student20 = new Student("Sellen", "43WMR30102", "sellenSorcerer@gmail.com");
        Student student21 = new Student("Alexander", "44WMR30103", "alexandarIronFist@gmail.com");
        Student student22 = new Student("Malenia", "45WMR30104", "neverKnownDefeat@gmail.com");
        Student student23 = new Student("Margit", "46WMR30105", "foolishAmbitious@gmail.com");

        ArrayList<Student> studentList4 = new ArrayList<>();

        studentList4.add(student18);
        studentList4.add(student19);
        studentList4.add(student20);
        studentList4.add(student21);
        studentList4.add(student22);
        studentList4.add(student23);

        TutorialGroup tutorialGroup4 = new TutorialGroup(studentList4);

        Student student24 = new Student("Glukhar", "51WMR50153", "glukar@gmail.com");
        Student student25 = new Student("Reshala", "52WMR51252", "eft2323@gmail.com");

        ArrayList<Student> studentList5 = new ArrayList<>();

        studentList5.add(student24);
        studentList5.add(student25);

        TutorialGroup tutorialGroup5 = new TutorialGroup(studentList5);
        
        tutorialGroupList.add(tutorialGroup1);
        tutorialGroupList.add(tutorialGroup2);
        tutorialGroupList.add(tutorialGroup3);
        tutorialGroupList.add(tutorialGroup4);
        tutorialGroupList.add(tutorialGroup5);
    }

    public static final TutorialGroupController getInstance() {
        return TutorialGroupControllerHolder.INSTANCE;
    }

    public ArrayList<TutorialGroup> getTutorialGroupList() {
        return tutorialGroupList;
    }

    public void addTutorialGroup(TutorialGroup tutorialGroup) throws NullPointerException {
        if (tutorialGroup == null) {
            throw new NullPointerException();
        }

        tutorialGroupList.add(tutorialGroup);
    }

    public boolean removeStudent(Student student, TutorialGroup tutorialGroup) {
        boolean result = false;
        for (TutorialGroup tutGroup : tutorialGroupList) {
            if (tutGroup.equals(tutorialGroup)) {
                ArrayList<Student> studentList = (ArrayList<Student>) tutGroup.getStudentList();
                result = studentList.remove(student);
                break;
            }
        }
        return result;
    }

    public void removeStudents(Integer[] index) {
        ArrayList<TutorialGroup> tempList = new ArrayList<>();

        for (int i = 0; i < index.length && index[i] != null; i++) {
            tempList.add(tutorialGroupList.get(index[i]));
        }

        for (TutorialGroup tutorialGroup : tempList) {
            tutorialGroupList.remove(tutorialGroup);
        }
    }


    public TutorialGroup findTutorialGroupByGroupNumber(int groupNumber) {
        for (TutorialGroup tutorialGroup : tutorialGroupList) {
            if (tutorialGroup.getGroupNumber() == groupNumber) {
                return tutorialGroup;
            }
        }
        return null;
    }

    public boolean replaceStudent(Student oldStudent, Student newStudent, TutorialGroup targetTutorialGroup) {
        if (oldStudent == null || newStudent == null) {
            return false;
        }

        boolean result = false;

        if (targetTutorialGroup.getStudentList().contains(oldStudent)) { // if didnt change tutorial group
            for (TutorialGroup tutGroup : tutorialGroupList) {
                ArrayList<Student> studentList = (ArrayList<Student>) tutGroup.getStudentList();
                for (Student student : studentList) {
                    if (student.equals(oldStudent)) {
                        studentList.replace(studentList.indexOf(student), newStudent);
                        result = true;
                    }
                }
            }
        } else { // if change tutorial group
            boolean isRemoved = false;
            boolean isInserted = false;
            
            for (TutorialGroup tutGroup : tutorialGroupList) {
                ArrayList<Student> studentList = (ArrayList<Student>) tutGroup.getStudentList();
                for(Student student : studentList) {
                    if(!isInserted && tutGroup.equals(targetTutorialGroup)) {
                        tutGroup.getStudentList().add(newStudent);
                        isInserted = true;
                        break;
                    }
                    
                    if(!isRemoved && student.equals(oldStudent)) {
                        studentList.remove(student);
                        isRemoved = true;
                        break;
                    }
                }
                if(isRemoved && isInserted) {
                    result = true;
                    break;
                }
            }
        }

        return result;
    }

    public int getNumberOfTutorialGroup() {
        return tutorialGroupList.size();
    }

}
