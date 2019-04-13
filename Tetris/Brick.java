import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class Brick extends Actor
{
    private List<Block> blocks;
    public Brick(int type){
        GreenfootImage img = null;
        setImage(img);
        blocks = new ArrayList<Block>();
        List<Integerasdfasdfasddfasddfa
        if(type == 0){
            blocks.add(new Block(Color.RED, 0, 0));
            blocks.add(new Block(Color.RED, 0, 10));
            blocks.add(new Block(Color.RED, 10, 10));
            blocks.add(new Block(Color.RED, 10, 0));
        }else if(type == 1){
            blocks.add(new Block(Color.BLUE, 0, 0));
            blocks.add(new Block(Color.BLUE, 0, 10));
            blocks.add(new Block(Color.BLUE, 0, 20));
            blocks.add(new Block(Color.BLUE, 0, 30));
        }
        
    }
    
    protected void addedToWorld(World world){
        for(Block block: blocks){
            world.addObject(block, this.getX()+block.x, this.getY() + block.y);
        }
    }
    public void act() 
    {
        for(Block block: blocks){
            block.fall();
        }
    }    
}
