import java.util.*;
public class Wrestler
{
    private String name;
    private int will;
    private double defense;
    private List<SpecialMove> specialMoves;
    public Wrestler(String name, int will, double defense){
        this.name = name;
        this.will = will;
        this.defense = defense;
        specialMoves = new ArrayList<SpecialMove>();
    }
    
    public String getName(){
        return name;
    }
        
    public double getDefense(){
        return defense;
    }
    
    public int getWill(){
        return will;
    }
    
    public void decrementWill(){
        will--;
    }
    
    public void incrementWill(boolean wonLastRound){
        if(wonLastRound){
            while(Math.random() > 0.4){
                will++;
            }
        }else{
            while(Math.random() > 0.6){
                will++;
            }
        }    
    }
    
    public boolean willWrestle(){
        return will > 0;
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
