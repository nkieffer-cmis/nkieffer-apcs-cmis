import java.util.*;
public class Person extends Entity
{
    private Place location;
    private List<Thing> possessions;
    private Integer x;
    private Integer y;
    private Integer z;
    public Person(){
        super("default");
    }
    
    public Person(String name, int age){
        super(name, age);
    }
    
    public void move(int dx, int dy, int dz){
        x += dx;
        y += dy;
        z += dz;
    }
    
    public List<Integer> getLocation(){
        List<Integer> location = new ArrayList<Integer>();
        location.add(x);
        location.add(y);
        location.add(z);
        return location;
    }
    
    public void setLocation(int newX, int newY, int newZ){
        x = newX;
        y = newY;
        z = newZ;
    }
    public void setAge(int newAge){
        if (newAge <= 150){
            super.setAge(newAge);
        }
    }
    
    public void setLocation(Place newLocation){
        location = newLocation;
    }
    
    public String toString(){
        String out = super.toString();
        out += "->Person";
        return out;
    }
}
