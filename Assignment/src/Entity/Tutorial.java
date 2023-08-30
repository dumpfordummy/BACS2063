/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import ADT.*;

/**
 *
 * @author Wai Loc
 */
public class Tutorial {
    private String groupNumber;
    private int noOfStudents = 0;
    private static final int maxStudents = 30;
    private SetUniqueListInterface<Student> studentList = new ArraySetUniqueList<>();

    public Tutorial() {
    }

    public Tutorial(String groupNumber){
        this.groupNumber = groupNumber;
    }    

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public SetUniqueListInterface<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(SetUniqueListInterface<Student> studentList) {
        this.studentList = studentList;
        for(int i = 0; i < studentList.size(); i++){
            this.noOfStudents++;
        }
    }
}
