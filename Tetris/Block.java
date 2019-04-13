import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Block extends Actor
{
    GreenfootImage img;
    public int x, y;
    public Block(Color color, int x, int y){
        img = new GreenfootImage(10,10);
        img.setColor(color);
        img.fill();
        setImage(img);
        this.x = x;
        this.y = y;
        
    }
    public void fall() 
    {
        setLocation(getX(), getY()+10);
        // Add your action code here.
    }    
}
