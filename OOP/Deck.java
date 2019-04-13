import java.util.*;
public class Deck
{
    private List<Card> cards;
    private int nDecks;
    public Deck(int nDecks){
        this.nDecks = nDecks;
        initDeck(nDecks * 52);
    }
    public void initDeck(int nDecks){
        cards = new ArrayList<Card>(nDecks*52);
        while(nDecks-- > 0){
            for(int suit = 0; suit < 4; suit++){
                for(int rank = 0; rank < 13; rank++){
                    cards.add(new Card(suit, rank));
                }
            }
        }
    }

    public int nCards(){
        return cards.size();
    }

    public Card draw(){
        if(cards.size() - 1 < 0){
            initDeck(nDecks);
        }
        int last = cards.size() - 1;
        return cards.remove(0);
    }

    public void deal(Player player, int nCards){
        while(nCards > 0){
            Card card = draw();
            player.addCard(card);
            nCards--;
        }
    }

    public void shuffle(){
        for(int i = 0; i < cards.size(); i++){
            int r = (int)(Math.random() * cards.size());
            Card t = cards.get(i);
            cards.set(i, cards.get(r));
            cards.set(r, t);
        }
    }
}
