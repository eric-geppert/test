package package1;

import java.util.ArrayList;

public class Player {
    public Deck getCards() {
        return cards;
    }

    public void setCards(Deck cards) {
        this.cards = cards;
    }

    private Deck cards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "cards=" + cards +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;



}
