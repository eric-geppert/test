package package1;

import java.util.ArrayList;

public class Deck {

    public ArrayList<Card> getDeckCards() {
        return deckCards;
    }

    public void setDeckCards(ArrayList<Card> deckCards) {
        this.deckCards = deckCards;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deckCards=" + deckCards +
                '}';
    }

    private ArrayList<Card> deckCards;
}
