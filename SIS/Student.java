import java.util.*;
public class Student
{
    private String name;
    private List<Course> courses;
    private int gradeLevel;
    
    public Student(String name, int gradeLevel){
        courses = new ArrayList<Course>();
        this.name = name;
        this.gradeLevel = gradeLevel;
    }
    
    public Student(String name, int gradeLevel, int nCourses){
        this(name, gradeLevel);
        for(int i = 0; i < nCourses; i++){
            String courseName = "Course" + i;
            Course course = new Course(courseName, 2.5);
            courses.add(course);
        }
        
    }
    
    public String getName(){
        return name;
    }
    
    public double getGPA(){
        double sum = 0.0;
        for(Course course : courses){
            sum += course.getGrade();
        }
        return sum / courses.size();
    }
    
    public void addCourse(Course newCourse){
        courses.add(newCourse);
    }
    
    public String toString(){
        String courseList = "";
        int n = 1;
        for(Course course: courses){
            courseList += n + ") "+course+ "\n";
            n++;
        }
        String out = String.format("Name: %s\nGrade Level: %d\nGPA: %f\nCourses\n-------\n%s\n", name, gradeLevel, getGPA(), courseList);
        return out;
    }
    
    
}
