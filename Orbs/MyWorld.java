import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1, false); 
        Orb orb;
        for(int i = 0; i < 10; i++){
            orb = new Orb( (int)(Math.random() * 800), (int)(Math.random() * 500));
            addObject(orb, (int)(Math.random() * 800), (int)(Math.random() * 500));
        }
    }
}
