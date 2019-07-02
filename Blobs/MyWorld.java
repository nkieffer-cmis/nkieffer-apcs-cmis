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
    Blob blob;
    int clickCount = 0;
    String msg = "Click!";
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        blob = new Blob();
        addObject(blob, 300,200);
        Font.
    }

    public void act(){
        if(Greenfoot.mouseClicked(null)){
            clickCount++;
            MouseInfo mi = Greenfoot.getMouseInfo();
            addObject(new Node(blob), mi.getX(), mi.getY());
        }
        switch(clickCount){
            case 25:
            msg = "Are you winning?";
            break;
            case 50:
            msg = "That's a lot of clicking";
            break;
            case 75:
            msg = "Give up already!";
            break;
            case 100:
            msg = "Do something productive with your life.";
            break;
            case 125:
            msg = "I demand that you stop!";
            break;
            case 126:
            Color c = Color.RED;
            int i = 0;
            while(true){
                c = c == Color.RED ? Color.YELLOW : Color.RED;
                GreenfootImage img = getBackground();
                img.setColor(c);
                img.fill();
                Greenfoot.delay(20);   
            }
        }
        showText(msg, 300,200);
    }
}

