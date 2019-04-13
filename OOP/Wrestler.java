import java.util.*;
public class Wrestler
{
    private String name;
    private int life;
    private double defense;
    private List<SpecialMove> specialMoves;
    public Wrestler(String name, int life, double defense){
        this.name = name;
        this.life = life;
        this.defense = defense;
        specialMoves = new ArrayList<SpecialMove>();
    }
    
    public String getName(){
        return name;
    }
        
    public double getDefense(){
        return defense;
    }
    
    public int getLife(){
        return life;
    }
    
    public void decrementLife(){
        life--;
    }
    
    public boolean isAlive(){
        return life > 0;
    }
    
    public void learnSpecialMove(SpecialMove specialMove){
        specialMoves.add(specialMove);
    }
    
    public String attack(Wrestler opponent){
        SpecialMove sm = getSpecialMove();
        sm.perform(opponent);
        return sm.getName();
    }
    
    public SpecialMove getSpecialMove(){
        SpecialMove sm;
        sm = specialMoves.get((int)(Math.random() * specialMoves.size()));
        return sm;
    }
    
}
