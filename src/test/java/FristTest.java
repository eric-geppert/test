import org.junit.Test;
import package1.Deck;
import package1.Game;
import package1.Player;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static package1.Game.*;


public class FristTest {


    @Test
    public void testShuffle(){
        Deck deck1 = createDeck();
        shuffle(deck1);
        Deck deck2 = createDeck();
        assertNotEquals(deck1.getDeckCards().get(0),deck2.getDeckCards().get(0));
    }

    @Test
    public void countCheck(){
        Deck deck1 = createDeck();
        shuffle(deck1);
        Deck deck2 = createDeck();
        assertEquals(deck1.getDeckCards().size(), deck2.getDeckCards().size());
    }

    @Test
    public void testDeal(){
        ArrayList<Player> players = new ArrayList<Player>();
        Player p1= new Player();
        Player p2= new Player();

        players.add(p1);
        players.add(p2);

        Deck deck = createDeck();
        shuffle(deck);

        deal(players,deck);

        assertNotEquals(players.get(0).getCards().getDeckCards().get(0),players.get(1).getCards().getDeckCards().get(1));

    }

    @Test
    public void numCards(){
        ArrayList<Player> players = new ArrayList<Player>();
        Player p1= new Player();
        Player p2= new Player();

        players.add(p1);
        players.add(p2);

        Deck deck = createDeck();
        shuffle(deck);

        deal(players,deck);

        int diff = Math.abs(p1.getCards().getDeckCards().size()-p2.getCards().getDeckCards().size());

        assertTrue(diff<=1);
    }
}
