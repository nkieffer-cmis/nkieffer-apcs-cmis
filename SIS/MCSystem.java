public class MCSystem
{
    public static void main(String[] argv){
        School school = new School("NKIS");
        for(int i = 0; i < 3; i++){
            Student student = new Student("Student"+i, 12, 6);
        }
        System.out.println(school.getAvgGPA());
        /*insert code here*/
    }
}

