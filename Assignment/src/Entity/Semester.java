/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import ADT.ArraySetUniqueList;

/**
 *
 * @author CY
 */
public class Semester {

    private ArraySetUniqueList<Tutor> tutorList;

    private int semesterCount;

    public Semester() {
    }

    public Semester(ArraySetUniqueList<Tutor> tutorList, int semesterCount) {
        this.tutorList = tutorList;
        this.semesterCount = semesterCount;
    }

    public ArraySetUniqueList<Tutor> getTutorList() {
        return tutorList;
    }

    public int getSemesterCount() {
        return semesterCount;
    }

    public void setSemesterCount(int semesterCount) {
        this.semesterCount = semesterCount;
    }

}
