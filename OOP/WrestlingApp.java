public class WrestlingApp
{
    public static void main(String[] args){
        SpecialMove choke = new SpecialMove("choke", 0.3, 0.5);
        SpecialMove kick = new SpecialMove("kick", 0.7, 0.3);
        SpecialMove bite = new SpecialMove("bite", 0.9, 0.1);
        SpecialMove punch = new SpecialMove("punch", 0.5, 0.4);
        Wrestler wrestler1 = new Wrestler("Bob", 10, 0.6);
        wrestler1.learnSpecialMove(choke);
        wrestler1.learnSpecialMove(kick);
        Wrestler wrestler2 = new Wrestler("Dave", 8, 0.8);
        wrestler2.learnSpecialMove(bite);
        wrestler2.learnSpecialMove(punch);
        Match match = new Match(wrestler1, wrestler2);
        Wrestler winner = match.fightRound();
        System.out.format("%s won!", winner.getName());
    }
}
