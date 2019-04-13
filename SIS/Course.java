public class Course
{
    private String name;
    private double grade;
    
    public Course(String name, double grade){
        this.name = name;
        this.grade = grade;
    }
    
    public String getName(){
        return name;
    }
    
    public double getGrade(){
        return grade;
    }
    
    public void setGrade(double newGrade){
        grade = newGrade;
    }
    
    public String toString(){
        return name + ": " + grade;
    }

}
