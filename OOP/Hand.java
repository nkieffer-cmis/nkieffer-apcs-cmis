import java.util.*;
public class Hand
{
    private List<Card> cards;

    public Hand(){
        cards = new ArrayList<Card>();
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public int getValue(){
        int score = 0;
        for(Card card: cards){
            int rank = card.getRank();
            if(rank == 0){ // deal with aces
                if(score + 11 > 21){
                    score += 1;
                }else{
                    score += 11;
                }
            }else if(rank < 10){ // deal with numbers
                score += rank + 1;
            }else{ // deal with face cards
                score += 10;
            }
        }
        return score;
    }

    public String toString(){
        String out = "";
        for(Card card : cards){
            out += card.toString() + " ";
        }
        return out;
    }

    public String toString(boolean hidden){
        String out = "";
        if (hidden){
            out += "?? " + getVisibleCard().toString();
        }else{
            for(Card card : cards){
                out += card.toString() + " ";
            }   
        }
        return out;
    }
    
    public Card getVisibleCard(){
        return cards.get(1);
    }
}
