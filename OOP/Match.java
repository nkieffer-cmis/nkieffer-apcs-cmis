public class Match
{
    private Wrestler wrestler1;
    private Wrestler wrestler2;
    
    public Match(){
        wrestler1 = new Wrestler("Jim", 10, 9);
        wrestler2 = new Wrestler("Bob", 9, 10);
            
    }
    
    public Match(Wrestler wrestler1, Wrestler wrestler2){
        this.wrestler1 = wrestler1;
        this.wrestler2 = wrestler2;
    }
    
    public Wrestler fightRound(){
        Wrestler winner = null;
        while(wrestler1.isAlive() && wrestler2.isAlive()){
            Wrestler attacker;
            Wrestler defender;
            if(Math.random() > 0.5){
                attacker = wrestler1;
                defender = wrestler2;
            }else{
                attacker = wrestler2;
                defender = wrestler1;
            }
            String moveName = attacker.attack(defender);
            String aName = attacker.getName();
            String dName = defender.getName();
            System.out.format("%s performed %s on %s.\n%s's life: %d\n%s's life: %d\n\n",
                aName, moveName, dName, aName, attacker.getLife(), dName, defender.getLife() );
            
        }
        if(wrestler1.isAlive()){
            winner = wrestler1;
        }else if(wrestler2.isAlive()){
            winner = wrestler2;
        }
        return winner;     
    }
}
