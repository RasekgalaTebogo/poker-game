package za.co.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private final List<Card> cards;

    //populate the deck with cards
    public Deck() {
        cards = new ArrayList<>();
        for (String suit : Card.SUITS) {
            for (String rank : Card.RANKS) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    // Method to shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Method to deal a specified number of cards from the deck
    public List<Card> dealHand(int numberOfCards) {
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            hand.add(cards.remove(cards.size() - 1)); // Remove the top card from the deck and add it to dealtCards
        }
        return hand;
    }
}
