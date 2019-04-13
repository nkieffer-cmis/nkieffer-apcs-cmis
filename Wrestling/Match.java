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
        while(wrestler1.willWrestle() && wrestler2.willWrestle()){
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
            System.out.format("%s performed %s on %s.\n%s's will to wrestle: %d\n%s's will to wrestle: %d\n\n",
                aName, moveName, dName, aName, attacker.getWill(), dName, defender.getWill() );
            
        }
        if(wrestler1.willWrestle()){
            winner = wrestler1;
        }else if(wrestler2.willWrestle()){
            winner = wrestler2;
        }
        return winner;     
    }
    
    public Wrestler fightMatch(int nRounds){
        int score[] = {0, 0};
        int round = 1;
        while(round < nRounds+1){
            System.out.format("Round %d\n=======\n", round);
            Wrestler roundWinner = fightRound();
            System.out.format("%s won round %d!!\n\n", roundWinner.getName(), round);
            roundWinner.incrementWill(true);
            if(roundWinner == wrestler1){
                score[0]++;
                wrestler2.incrementWill(false);
            }else{
                score[1]++;
                wrestler1.incrementWill(false);
            }
            round++;
        }
        if(score[0] > score[1]){
            return wrestler1;
        }else if(score[1] > score[0]){
            return wrestler2;
        }else{
            return null;
        }
    }
}
