import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifeBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeBar extends Actor
{
    /**
     * Act - do whatever the LifeBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img;
    public LifeBar(int life){
        img = new GreenfootImage(600, 20);
        img.setColor(Color.BLACK);
        img.fill();
        img.setColor(Color.GREEN);
        img.fillRect(0,0,life, 20);
        img.setColor(Color.WHITE);
        img.drawString(""+life, life, 10);
        setImage(img);
    }
    public void setLife(int life){
        img.setColor(Color.BLACK);
        img.fill();
        img.setColor(Color.GREEN);
        img.fillRect(0,0,life, 20);
        img.setColor(Color.WHITE);
        img.drawString(""+life, life, 10);
    }
}
