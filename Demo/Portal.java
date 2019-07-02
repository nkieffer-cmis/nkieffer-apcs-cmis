import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends Actor
{
    /**
     * Act - do whatever the Portal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Portal destination;
    private int contactDuration;
    public void setDestination(Portal destination){
        this.destination = destination;
    }
    public Portal getDestination(){
        return destination;
    }
    public int getContactDuration(){
        return  contactDuration;
    }
    public void act(){
        if(isTouching(Turtle.class)){
            contactDuration += 1;
        }else{
            contactDuration =0;
        }
    }
}
