package package1;

import java.util.ArrayList;
import java.util.Collections;

public class Game {

    public static Deck shuffle(Deck deck){
        //div in 2
        //alternate cards
        System.out.println("before:" +deck.getDeckCards());
        Collections.shuffle(deck.getDeckCards());
        System.out.println("after:" +deck.getDeckCards());

        return deck;
    }

    public static Deck createDeck(){
        ArrayList<Card> deck1 = new ArrayList<Card>();

        for (int i = 1; i <= 13; i++) {
            Card card1 = new Card();
            card1.setNumber(i);
            card1.setSuit("clubs");
            deck1.add(card1);
        }
        for (int i = 1; i <= 13; i++) {
            Card card1 = new Card();
            card1.setNumber(i);
            card1.setSuit("hearts");
            deck1.add(card1);
        }
        for (int i = 1; i <= 13; i++) {
            Card card1 = new Card();
            card1.setNumber(i);
            card1.setSuit("dimonds");
            deck1.add(card1);
        }
        for (int i = 1; i <= 13; i++) {
            Card card1 = new Card();
            card1.setNumber(i);
            card1.setSuit("spades");
            deck1.add(card1);
        }
        Deck deck2 = new Deck();
        deck2.setDeckCards(deck1);
        return deck2;
    }

    public static void main(String Args[]){

        Deck deck = createDeck();
        shuffle(deck);
    }

}
