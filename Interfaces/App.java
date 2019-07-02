import java.util.*;
public class App
{
    public  static void main(String[] argv){
        ThingA a = new ThingA();
        ThingB b = new ThingB();
        
        //System.out.println(a.getY());
        //System.out.println(b.getX());
        
        Moveable[] things = new Moveable[5];
        
        things[0] = a;
        things[1] = b;
        
        for(Moveable thing : things){
            if(thing != null)
                System.out.println(thing.getX());
        }

    }
}
