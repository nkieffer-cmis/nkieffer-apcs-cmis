import java.util.*;
public class Game
{
    private Deck deck;
    private List<Player> players;
    private Player dealer;
    public Game(){
        deck = new Deck(5);
        players = new ArrayList<Player>();
        dealer = new Player("Dealer", 1000000);
    }
    
    public void addPlayer(){
        Player newPlayer = new Player("Player"+players.size(), 1000);
        players.add(newPlayer);
    }
    
    public void summary(){
        System.out.println("Summary\n=======");
        System.out.println(dealer);
        for(Player player: players){
            System.out.println(player);
        }
    }
    public void setup(){
        System.out.println("Setup\n=====");
        deck.shuffle();
        dealer.throwHand();
        deck.deal(dealer,2);
        System.out.println(dealer.toString(true));
        for(Player player: players){
            player.throwHand();
            if(player.placeBet(10) > 0)
                deck.deal(player, 2);
            System.out.println(player);
        }
    }
    
    public void playRound(){
        System.out.println("Play\n====");
        for(Player player: players){
            if(dealer.getVisibleCard().getRank() > 6){
                while(player.getHandValue() < 15){
                    deck.deal(player, 1);
                }
            }
        }
        while(dealer.getHandValue() < 15){
            deck.deal(dealer, 1);
        }
    }
    
    public void evaluate(){
        for(Player player: players){
            if(player.getHandValue() == 21 || player.getHandValue() > dealer.getHandValue()){
                dealer.placeBet(player.win());
                dealer.lose();
                System.out.println(player.getName() + " wins!");
            }else if(player.getHandValue() <= 21 && dealer.getHandValue() > 21){
                dealer.placeBet(player.win());
                dealer.lose();
                System.out.println(player.getName() + " wins!");
            }else{
                dealer.placeBet(player.lose());
                dealer.win();
            }
            System.out.println(player);
        }
        System.out.println(dealer.toString(false));
    }
    
    public int playersFunds(){
        int funds = 0;
        for(Player player: players){
            funds += player.getChipCount();
        }
        return funds;
    }
}
