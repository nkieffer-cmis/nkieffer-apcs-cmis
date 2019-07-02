import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class Blob extends Actor
{
    GreenfootImage img;
    int delay;
    public Blob(){
        img = new GreenfootImage(30,30);
        img.setColor(Color.WHITE);//new Color((int)(Math.random() * 255),(int)(Math.random()* 255),(int)(Math.random()*255)));
        img.fillOval(0,0,30,30);
        setImage(img);

    }

    public void addedToWorld(World world){
        while(Math.random() < 0.1){
            world.addObject(new Node(this), getX(), getY());
        }
    }

    public void act(){
        MouseInfo mi = Greenfoot.getMouseInfo();
        turnTowards(mi.getX(), mi.getY());
        if(delay++ % 4 == 0){
            move(3);
        }
    }    
}
