import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bug extends Actor
{
    private Actor target;
    private boolean wandering = true;
    public Bug(Actor target){
        this.target = target;
        getImage().scale(20,20);
    }

    public void act() 
    {
        wandering = Math.random() > .99 ? !wandering : wandering;
        if(target == null || wandering){
            if(Math.random() > 0.4){
                if(Math.random() > 0.5){
                    turn(-(int)(Math.random() * 45));
                }else{
                    turn((int)(Math.random() * 45));
                }
            }
            move((int)(Math.random() * 5));
            if(isAtEdge()){
                turnTowards(300,200);
                turn((int)(Math.random() * 360));
            }
        } else if (Math.random() > 0.5) {
            turnTowards(target.getX(), target.getY());
            if(!intersects(target)){
                move((int)(Math.random() * 5));
            }
        }else{
            Burger burger = ((MyWorld)getWorld()).getBurger();
            turnTowards(burger.getX(), burger.getY());
            move((int)(Math.random() * 5));
        }            
        Portal portal = (Portal) getOneIntersectingObject(Portal.class);
        if(portal != null){
            MyWorld my = (MyWorld) getWorld();
            Burger burger = my.getBurger();
            setLocation(burger.getX(), burger.getY());
        }
        // Add your action code here.
    }    
}
