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

   
    public CourseController() {
        courseList = new LinkedList<>();
        seedData();
    }
    
    private void seedData() {                   //hard code data
//        Programme programme1 = new Programme("dwadwa", "dwadwa", 11.11, 1);
//        Programme programme2 = new Programme("dwadwa", "dwadwa", 11.11, 1);
//        Programme programme3 = new Programme("dwadwa", "dwadwa", 11.11, 1);
//        Programme programme4 = new Programme("dwadwa", "dwadwa", 11.11, 1);
//        
//        Course course = new Course();
//        course.getProgrammeList().add(programme1);
//        course.getProgrammeList().add(programme2);
//        course.getProgrammeList().add(programme3);
//        course.getProgrammeList().add(programme4);
        Course course = new Course();
        Course course1 = new Course("Data Structure and Algorithm","BACS2020",20);
        Course course2 = new Course("Database", "AAMS2001", 12);
        Course course3 = new Course("Advanced Calculus", "AMMS2080", 10);

        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
    }
    
    public static final CourseController getInstance() {
        return CourseControllerHolder.INSTANCE;
    }
    
    public LinkedList<Course> getcourseList(){
        return courseList;
    }
    
    public void addCourse(Course course) { 
        courseList.add(course);
    }
    
    public void addCourseAtIndex(int index,Course course) { 
        courseList.add(index,course);
    }
        
    public boolean removeCourse(int index) throws NullPointerException{
        if(index < 0){
            throw new NullPointerException();
        }
        return courseList.remove(index) != null;
    }
    
    public boolean removeCourse(Course course){
        return courseList.remove(course);
    }
    
    public boolean replaceCourse(int index, Course course){
        return courseList.replace(index, course) != null;
    }
    
    public Course findCourseCode(String Code){
        for(Course course : courseList){
            if(course.getCourseCode().equals(Code)){
                return course;
            }
        }
        return null;
    }
    
    public Course findCourseName(String Name){
        for (Course course : courseList) {
            if (course.getCourseName().equals(Name)) {
                return course;
            }
        }
        return null;
    }
    
    public int totalCourse(){
        return courseList.size();
    }
    
    

    public String ListAllCourse(LinkedList<Course> listCourse) {
        String result = "----------------------------------------------\n";
        for (Course course : listCourse) {
            result += "Course Code: " + course.getCourseCode() + "\n"
                    + "Course Name: " + course.getCourseName() + "\n"
                    + "Credit Hours: " + course.getCreditHours() + "\n"
                    + "----------------------------------------------\n";
        }
        return result;
    }

}
