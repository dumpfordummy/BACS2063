/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import ADT.Impl.ArrayList;
import ADT.Interface.ListInterface;

/**
 *
 * @author Wai Loc
 */
public class TutorialGroup {
    private static int currentGroupNumber = 1;
    private int groupNumber;
    private int noOfStudents = 0;
    public static final int MAXSTUDENTS = 30;
    private ListInterface<Student> studentList = new ArrayList<>();

    public TutorialGroup() {
        groupNumber = currentGroupNumber;
        currentGroupNumber++;
    }

    public TutorialGroup(ListInterface<Student> studentList){
        this();
        this.studentList = studentList;
        this.noOfStudents = studentList.size();
    }    

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public void incrementNoOfStudents() {
        noOfStudents++;
    }

    public void decrementNoOfStudents() {
        noOfStudents--;
    }
    
    public ListInterface<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ListInterface<Student> studentList) {
        this.studentList = studentList;
        for(int i = 0; i < studentList.size(); i++){
            this.noOfStudents++;
        }
    }

    @Override
    public String toString() {
        String studentListString = "";
        for (Student student : studentList){
            studentListString += student.getFullName() + " \n";
        }
        return "Tutorial Group\n==============\n" 
                + "groupNumber: " + groupNumber 
                + "\nNo Of Students: " + noOfStudents 
                + "\nStudent List: " + studentListString 
                + '\n';
    }
    
    
}
