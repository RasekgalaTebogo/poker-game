package za.co.game;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class HandTest {

    @Test
    public void testEvaluateHighCard() {
        List<Card> cards = Arrays.asList(
                new Card("Hearts", "2"),
                new Card("Diamonds", "5"),
                new Card("Clubs", "7"),
                new Card("Spades", "9"),
                new Card("Hearts", "J")
        );
        Hand hand = new Hand(cards);
        assertEquals("High Card", hand.evaluateHand());
    }

    @Test
    public void testEvaluateOnePair() {
        List<Card> cards = Arrays.asList(
                new Card("Hearts", "2"),
                new Card("Diamonds", "2"),
                new Card("Clubs", "7"),
                new Card("Spades", "9"),
                new Card("Hearts", "J")
        );
        Hand hand = new Hand(cards);
        assertEquals("One Pair", hand.evaluateHand());
    }

    @Test
    public void testEvaluateTwoPair() {
        List<Card> cards = Arrays.asList(
                new Card("Hearts", "2"),
                new Card("Diamonds", "2"),
                new Card("Clubs", "9"),
                new Card("Spades", "9"),
                new Card("Hearts", "J")
        );
        Hand hand = new Hand(cards);
        assertEquals("Two Pair", hand.evaluateHand());
    }

    @Test
    public void testEvaluateThreeOfAKind() {
        List<Card> cards = Arrays.asList(
                new Card("Hearts", "2"),
                new Card("Diamonds", "2"),
                new Card("Clubs", "2"),
                new Card("Spades", "9"),
                new Card("Hearts", "J")
        );
        Hand hand = new Hand(cards);
        assertEquals("Three of a Kind", hand.evaluateHand());
    }

    @Test
    public void testEvaluateStraight() {
        List<Card> cards = Arrays.asList(
                new Card("Hearts", "5"),
                new Card("Diamonds", "6"),
                new Card("Clubs", "7"),
                new Card("Spades", "8"),
                new Card("Hearts", "9")
        );
        Hand hand = new Hand(cards);
        assertEquals("Straight", hand.evaluateHand());
    }

    @Test
    public void testEvaluateFlush() {
        List<Card> cards = Arrays.asList(
                new Card("Hearts", "2"),
                new Card("Hearts", "5"),
                new Card("Hearts", "7"),
                new Card("Hearts", "9"),
                new Card("Hearts", "J")
        );
        Hand hand = new Hand(cards);
        assertEquals("Flush", hand.evaluateHand());
    }

    @Test
    public void testEvaluateFullHouse() {
        List<Card> cards = Arrays.asList(
                new Card("Hearts", "2"),
                new Card("Diamonds", "2"),
                new Card("Clubs", "2"),
                new Card("Spades", "9"),
                new Card("Hearts", "9")
        );
        Hand hand = new Hand(cards);
        assertEquals("Full House", hand.evaluateHand());
    }

    @Test
    public void testEvaluateFourOfAKind() {
        List<Card> cards = Arrays.asList(
                new Card("Hearts", "2"),
                new Card("Diamonds", "2"),
                new Card("Clubs", "2"),
                new Card("Spades", "2"),
                new Card("Hearts", "9")
        );
        Hand hand = new Hand(cards);
        assertEquals("Four of a Kind", hand.evaluateHand());
    }

    @Test
    public void testEvaluateStraightFlush() {
        List<Card> cards = Arrays.asList(
                new Card("Hearts", "5"),
                new Card("Hearts", "6"),
                new Card("Hearts", "7"),
                new Card("Hearts", "8"),
                new Card("Hearts", "9")
        );
        Hand hand = new Hand(cards);
        assertEquals("Straight Flush", hand.evaluateHand());
    }
}
