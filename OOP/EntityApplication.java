import java.util.*;
public class EntityApplication
{
    public static void main(String[] args){
        List<Entity> entities = new ArrayList<Entity>();
        
        Entity person = new Person("Bob", 34);
        
        System.out.println(person.getClass().getName());
        Place place = new Place("Chiang Mai", 1200);
        Thing thing = new Thing("Scissors", 500);
        Idea idea = new Idea("Sloth", 100000);

        entities.add(person);
        entities.add(place);
        entities.add(thing);
        entities.add(idea);

        for(int i = 0; i < 10; i++){
            int t = (int)(Math.random() * 6);
            Entity e = null;
            switch(t){
                case 0:
                    e = new Person("Person" + i, i);
                    break;
                case 1:
                    e = new Place("Place"+i, i);
                    break;
                case 2:
                    e = new Thing("Thing"+i, i);
                    break;
                case 3:
                    e = new Idea("Idea"+i, i);
                    break;

            }
            entities.add(e);

        }
        for(Entity e: entities){
            if( e != null){
                p(e.getName());
                p(e.getAge());
                if( e instanceof Idea){
                    Idea i = (Idea) e;
                    p(i.getPopularity());
                }
            }
        }

    }

    public static void p(Object string){
        System.out.println(string);
    }
}
