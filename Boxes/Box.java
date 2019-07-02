import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class Box extends Actor
{
    private Box parent;
    private List<Box> children;
    private int dx, dy;
    private int side;
    private int steps = 0;
    protected int offset;
    private int rotdir;
    private int spd;
    public Box(Box parent){
        this.parent = parent;
        GreenfootImage img = new GreenfootImage(20,20);
        Color color = new Color((int)(Math.random() * 255),
                (int)(Math.random() * 255),
                (int)(Math.random() * 255));
        img.setColor(color);
        img.fill();
        setImage(img);
        offset = (int)(Math.random() * 180) + 10;
        rotdir = (int)(Math.random() * 10) - 5;
        spd = (int)(Math.random() * 5) + 2;
    }

    public void addedToWorld(World world){
        while(parent == null && Math.random() > 0.1){
            Box child = new Box(this);
            int[] offsets = {child.offset, -child.offset, 0};
            int x = getX() + offsets[(int)(Math.random() * 3)];
            int y = getY() + offsets[(int)(Math.random() * 3)];
            if(x == 0 && y == 0)
                y += offset;
            world.addObject(child, x, y);
        }
        if(parent != null){
            if(getY() < parent.getY()){
                side = 0;
                dx = spd;
                dy = -spd;
            }else{
                side = 2;
                dx = -spd;
                dy = spd;
            }
        }
    }
    public void act(){
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY() - 3);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY() + 3);
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX() - 3, getY());
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX() + 3, getY());
        }
        if(parent != null){
            getWorld().showText(""+side, 100,100);
            switch(side){
                case 0:
                setLocation(getX() + dx, parent.getY()-offset);
                if(getX() > parent.getX() + offset){
                    side = 1;
                    dy = spd;
                }
                break;
                case 1:
                setLocation(parent.getX()+offset, getY() + dy);
                if(getY() > parent.getY() + offset){
                    side = 2;
                    dx = -spd;
                }     
                break;
                case 2:
                setLocation(getX() + dx, parent.getY() + offset);
                if(getX() <= parent.getX() - offset){
                    side = 3;
                    dy = -spd;
                }     
                break;
                case 3:
                setLocation(parent.getX() - offset, getY() + dy);
                if(getY() < parent.getY() - offset){
                    side = 0;
                    dx = spd;
                }     
                break;

            }
        }
        turn(rotdir);
    }

}
