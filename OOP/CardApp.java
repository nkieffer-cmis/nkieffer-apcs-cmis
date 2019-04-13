import java.util.*;
public class CardApp
{
    public static void main(String[] args){
        Game game = new Game();
        int nPlayers = 5;
        while(nPlayers-- >= 0){
            game.addPlayer();
        }
        int round = 1;
        while(game.playersFunds() > 0){
            System.out.format("+-------+\n|ROUND %d|\n+-------+\n", round++);
            game.setup();
            game.playRound();
            game.evaluate();
            game.summary();
        }
        
    }
}
