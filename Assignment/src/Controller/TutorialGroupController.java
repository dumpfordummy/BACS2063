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
 * @author CY
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
        
        ArrayList<Student> studentList = new ArrayList<>();
        
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        
        TutorialGroup tutorialGroup = new TutorialGroup(studentList);

        tutorialGroupList.add(tutorialGroup);
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

    public TutorialGroup removeTutorialGroup(int index) {
        return tutorialGroupList.remove(index);
    }

    public void removeTutorialGroups(Integer[] index) {
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

    public TutorialGroup replaceTutor(TutorialGroup oldTutorialGroup, TutorialGroup newTutorialGroup) {
        if (oldTutorialGroup == null || newTutorialGroup == null) {
            return null;
        }

        int index = tutorialGroupList.indexOf(oldTutorialGroup);
        return tutorialGroupList.replace(index, newTutorialGroup);
    }

    public int getNumberOfTutorialGroup() {
        return tutorialGroupList.size();
    }

}
