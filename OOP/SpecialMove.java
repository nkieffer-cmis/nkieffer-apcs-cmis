public class SpecialMove
{
    private String name;
    private double skill;
    private double effect;
    
    public SpecialMove(String name, double skill, double effect){
        this.name = name;
        this.skill = skill;
        this.effect = effect;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void perform(Wrestler opponent){
        if(skill + Math.random() 
            > opponent.getDefense() + Math.random()){
            while(Math.random() + effect > 0.5 && opponent.getLife() > 0){
                opponent.decrementLife();
            }
        }
    }
}
