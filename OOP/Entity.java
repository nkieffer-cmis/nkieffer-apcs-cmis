 public class Entity
{
    private String name;
    private int age;
    private int value;
    public Entity(String name){
        this.name = name;
        this.age = 0;
    }
    public Entity(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void changeName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }
          
    public int getAge(){
        return age;
    }
    
    public void setAge(int newAge){
        age = newAge;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int newValue){
        value = newValue;
    }
    
    public String toString(){
        return String.format("%s:%s:%s",super.toString(), name ,"Entity");
    }
}
