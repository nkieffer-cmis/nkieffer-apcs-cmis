import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.*;
public class Node extends Actor
{
    /**
     * Act - do whatever the Node wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Blob blob;
    GreenfootImage img;
    int range;
    public Node(Blob blob){
        this.blob = blob;
        int d = (int)(Math.random() * 100) + 10;
        img = new GreenfootImage(d,d);
        img.setColor(new Color(0,(int)(Math.random() * 255),0,25));//(int)(Math.random()* 255)));//,(int)(Math.random()*255)));
        img.fillOval(0,0,d,d);
        setImage(img);
        range = (int)(Math.random() * 100);
        setRotation((int)(Math.random() * 360));
        

    }

    public void act() 
    {
        List<Blob> blobs = getObjectsInRange(range, Blob.class);
        if(!blobs.contains(blob)){
            turnTowards(blob.getX(), blob.getY());
            turn((int)(Math.random() * 20) - 10);
        } else {
            /*if(Math.random() > 0.9){
                turn((int)(Math.random() * 360));
            } */  
        }    
        move(3);//(int)(Math.random() * 10));
        if(Math.random() < 0.0025){
            getWorld().removeObject(this);
        }
    }
}
