package za.co.game;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {

    private Deck deck;

    @BeforeEach
    public void setUp() {
        deck = new Deck();
    }

    @Test
    public void testDeckCreation() {
        assertEquals(52, deck.dealHand(52).size());
    }

    @Test
    public void testDeckShuffle() {
        List<Card> hand1 = deck.dealHand(52);
        deck = new Deck();
        deck.shuffle();
        List<Card> hand2 = deck.dealHand(52);
        assertEquals(52, hand1.size());
        assertEquals(52, hand2.size());
        assertNotEquals(hand1, hand2);
    }

    @Test
    public void testDealHand() {
        List<Card> hand = deck.dealHand(5);
        assertEquals(5, hand.size());
        assertEquals(47, deck.dealHand(47).size()); // Ensure that 47 cards remain in the deck
    }

}
