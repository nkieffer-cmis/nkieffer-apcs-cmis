import java.util.Scanner;
import java.util.*;
public class TheSystem
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        School school = new School("CMIS");
        boolean another = true;
        List<Student> s = new ArrayList<Student>();
        while(another){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Grade Level: ");
            int gradeLevel = Integer.parseInt(scanner.nextLine());
            Student student = new Student(name, gradeLevel);
            System.out.format("How many courses for %s? ", name);
            
            int nClasses = Integer.parseInt(scanner.nextLine());
            while(nClasses > 0){
                System.out.print("Course Name: ");
                String courseName = scanner.nextLine();
                System.out.print("Grade: ");
                double grade = Double.parseDouble(scanner.nextLine());
                Course course = new Course(courseName, grade);
                student.addCourse(course);
                nClasses--;
            }
            
            school.addStudent(student);
            
            System.out.print("Add another student? ");
            another = scanner.nextLine().equals("y");
        }         
        
        System.out.println(school);
        System.out.format("The avg GPA at %s is %f\n", school.getName(), school.getAvgGPA());
        
        System.out.println("Roster");
        List<Student> roster = school.getStudents();
        for(Student student : roster){
            System.out.println(student);
        }
    }
}
