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
public class Course {
    private String courseName;
    private String courseCode;
    private double creditHours;
    private SetUniqueListInterface<Tutorial> tutorialGroupList = new ArraySetUniqueList<>();

    public Course() {
    }

    public Course(String courseName, String courseCode, double creditHours) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
    }
    
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(double creditHours) {
        this.creditHours = creditHours;
    }

    public SetUniqueListInterface<Tutorial> getTutorialGroupList() {
        return tutorialGroupList;
    }

    public void setTutorialGroupList(SetUniqueListInterface<Tutorial> tutorialGroupList) {
        this.tutorialGroupList = tutorialGroupList;
    }
    
}
