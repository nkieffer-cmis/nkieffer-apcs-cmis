public class Player
{
    private String name;
    private int chips;
    private int bet;
    private Hand hand;
    public Player(String name, int chips){
        hand = new Hand();
        this.name = name;
        this.chips = chips;
    }
    
    public String getName(){
        return name;
    }
    
    public int getChipCount(){
        return chips;
    }
    
    public void throwHand(){
        hand = new Hand();
    }
    
    public void hit(Card card){
        addCard(card);
    }
    
    public void addCard(Card card){
        hand.addCard(card);
    }

    public int getHandValue(){
        return hand.getValue();
    }

    public int placeBet(int nChips){
        if (nChips <= chips){
            bet = nChips;
        }else{
            bet = 0;
        }
        return bet;
    }

    public int win(){
        int winnings = bet;
        chips += bet;
        bet = 0;
        return winnings;
    }
    
    public int lose(){
        int losings = bet;
        chips -= bet;
        bet = 0;
        return losings;
    }

    public Card getVisibleCard(){
        return hand.getVisibleCard();
    }
    
    public String toString(){
        String out = String.format("Name: %s\nChips: %d\nBet: %d\nHand: %s\n",
                name, chips, bet, hand);
        return out;
    }
    
    
    public String toString(boolean dealer){
        String out;
        if(dealer){
            out = String.format("Name: %s\nChips: %d\nHand: %s\n",
                name, chips, hand.toString(true));
        } else {
            out = toString();
        }
        return out;
    }
}