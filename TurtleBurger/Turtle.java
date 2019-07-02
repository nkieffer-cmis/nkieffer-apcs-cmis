import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Turtle extends Actor
{
    private int score = 0;
    private int life;
    private LifeBar lifebar;
    public Turtle(){
        getImage().scale(20,20);
        life = 40;
        lifebar = new LifeBar(life);
    }

    public void addedToWorld(World world){
        world.addObject(lifebar, 300, 390);
    }

    public void act() 
    {
        if(Greenfoot.isKeyDown("a")){
            turn(-3);
        }else if(Greenfoot.isKeyDown("d")){
            turn(3);
        }
        move(4);
        if(isTouching(Bug.class)){
            life -= 5;
            if(life <=0){
                Greenfoot.stop();
                getWorld().showText("you lose", 300,200);
            } else {
                lifebar.setLife(life);
            }
        }
        if(isTouching(Burger.class)){
            score++;
            life += 10;
            lifebar.setLife(life);
        }
        getWorld().showText("Score: " + score, 100, 10);
        Portal portal = (Portal) getOneIntersectingObject(Portal.class);
        if(portal != null && portal.getContactDuration() > 13){
            Portal destination = portal.getDestination();
            setLocation(destination.getX(), destination.getY());
            portal.setLocation((int)(Math.random() * 600), (int)(Math.random() * 400));
        }
    }    
}
