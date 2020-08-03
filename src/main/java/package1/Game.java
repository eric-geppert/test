package package1;

import java.util.ArrayList;
import java.util.Collections;

public class Game {

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Game{" +
                "players=" + players +
                '}';
    }

    private ArrayList<Player> players;

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

    public static void deal(ArrayList<Player> players, Deck deck){
        Deck half1= new Deck();
        ArrayList<Card> list1 = new ArrayList<Card>();
        for(int i =0;i<deck.getDeckCards().size()/2;i++){
            list1.add(deck.getDeckCards().get(i));
        }
        half1.setDeckCards(list1);
        players.get(0).setCards(half1);

        Deck half2= new Deck();
        ArrayList<Card> list2 = new ArrayList<Card>();
        for(int i =deck.getDeckCards().size()/2;i<deck.getDeckCards().size();i++){
            list2.add(deck.getDeckCards().get(i));
        }
        half2.setDeckCards(list2);
        players.get(1).setCards(half2);
//        return players;
    }

    public static void main(String Args[]){

        Game game = new Game();
        ArrayList<Player> playerList = new ArrayList<Player>();
        Player p1 = new Player();
        Player p2 = new Player();

        playerList.add(p1);
        playerList.add(p2);

//        game.setPlayers(playerList);


        Deck deck = createDeck();
        shuffle(deck);

        deal(playerList,deck);

    }

}
