/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import ADT.Impl.LinkedList;
import Entity.Course;
import Entity.Programme;
import Entity.TutorialGroup;

/**
 *
 * @author Jenn Wen
 */
public class CourseController {
    private static class CourseControllerHolder {

        private static final CourseController INSTANCE = new CourseController();
    }

    private final LinkedList<Course> courseList;

    private CourseController() {
        courseList = new LinkedList<>();
        seedData();
    }
    
    private void seedData() {                   //hard code data
        Programme programme1 = new Programme("dwadwa", "dwadwa", 11.11, 1);
        Programme programme2 = new Programme("dwadwa", "dwadwa", 11.11, 1);
        Programme programme3 = new Programme("dwadwa", "dwadwa", 11.11, 1);
        Programme programme4 = new Programme("dwadwa", "dwadwa", 11.11, 1);
        
        Course course = new Course();
        course.getProgrammeList().add(programme1);
        course.getProgrammeList().add(programme2);
        course.getProgrammeList().add(programme3);
        course.getProgrammeList().add(programme4);
    }
}
