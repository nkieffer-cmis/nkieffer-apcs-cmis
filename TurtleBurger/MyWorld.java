
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Bug head1, head2;
    Burger burger;
    private double rate = 0.9999;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Turtle turtle = new Turtle();
              addObject(turtle, 300,200); 
        head1 = new Bug((Actor)turtle);
        int startx = (int)(Math.random() * 600);
        int starty = (int)(Math.random() * 400);
        addObject(head1, startx, starty);
       
        head2 = new Bug((Actor)turtle);
        startx = 600 * (int)(Math.random());
        starty = 400 * (int)(Math.random());
        addObject(head2, startx, starty);
        burger = new Burger();
        addObject(burger, (int)(Math.random() * 600), (int)(Math.random() * 400));
        Portal p1 = new Portal();
        Portal p2 = new Portal();
        p1.setDestination(p2);
        p2.setDestination(p1);
        addObject(p1,150, 200);
        addObject(p2,450,200);
    }
    
    public void act(){
        if(Math.random() >= rate){
            rate -= 0.0001;
            int x1 = head1.getX();
            int y1 = head1.getY();
            int x2 = head2.getX();
            int y2 = head2.getY();
            head1 = new Bug(head1);
            head2 = new Bug(head2);
            addObject(head1, x1, y1);
            addObject(head2, x2, y2);
        
        }
    }
    public Burger getBurger(){
        return burger;
    }
}
