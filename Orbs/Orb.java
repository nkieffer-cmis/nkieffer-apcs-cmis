import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orb extends Actor
{
    int orbit;
    int fx, fy;
    public Orb(int fx, int fy){
        int d = (int)(Math.random() * 100) + 5;
        GreenfootImage img = new GreenfootImage(d,d);
        Color c = new Color((int)(Math.random() * 255),
                            (int)(Math.random() * 255),
                            (int)(Math.random() * 255));
        img.setColor(c);
        img.fillOval(0,0,d,d);
        setImage(img);
        orbit = (int)(Math.random() * 300) + 10;
        this.fx = fx;
        this.fy = fy;
    }
    public void act() 
    {
        int dist = (int)(Math.sqrt(Math.pow((getX() - fx),2) + Math.pow((getY() - fy), 2)));
        World w = getWorld();
        w.showText(""+dist+" "+orbit, 50,50);
        if(dist < orbit){
            turnTowards(fx, fy);
            turn(180);
        }
        turn(1);
        move(1);
    }    
}
