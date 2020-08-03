import org.junit.Test;

import static org.junit.Assert.*;

import package1.Deck;
import package1.Game;
import package1.PrintMe;


public class FristTest {


    @Test
    public void testShuffle(){
        Deck deck1 = Game.createDeck();
        Game.shuffle(deck1);
        Deck deck2 = Game.createDeck();
        assertNotEquals(deck1.getDeckCards().get(0),deck2.getDeckCards().get(0));
    }

    @Test
    public void countCheck(){
        Deck deck1 = Game.createDeck();
        Game.shuffle(deck1);
        Deck deck2 = Game.createDeck();
        assertEquals(deck1.getDeckCards().size(), deck2.getDeckCards().size());
    }
}
