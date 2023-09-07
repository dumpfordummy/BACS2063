/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import ADT.Impl.ArraySetUniqueList;
import ADT.Impl.LinkedList;
import ADT.Interface.SetUniqueListInterface;
import java.util.Objects;

/**
 *
 * @author Wai Loc
 */
public class Course {
    private String courseName;
    private String courseCode;
    private double creditHours;
    private LinkedList<Programme> programmeList = new LinkedList<>();

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

    public LinkedList<Programme> getProgrammeList() {
        return programmeList;
    }

    public void setProgrammeList(LinkedList<Programme> programmeList) {
        this.programmeList = programmeList;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.courseName);
        hash = 23 * hash + Objects.hashCode(this.courseCode);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (!Objects.equals(this.courseName, other.courseName)) {
            return false;
        }
        return Objects.equals(this.courseCode, other.courseCode);
    }
    
    
    
}
