import java.util.*;
public class School
{
    private List<Student> students;
    private String name;
    public School(String name){
        students = new ArrayList<Student>();
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void addStudent(Student student){
        students.add(student);
    }
    
    public double getAvgGPA(){
        double sum = 0;
        for(Student student: students){
            sum += student.getGPA();
        }
        return sum / students.size();
    }
    
    public List<Student> getStudents(){
        return students;
    }
    
    public String toString(){
        String out = String.format("Name: %s\nEnrollement: %d", name, students.size());
        return out;
    }
}
