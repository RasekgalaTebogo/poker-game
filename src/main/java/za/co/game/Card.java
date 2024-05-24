package za.co.game;

// Class representing a single playing card
public class Card {
    private String suit;
    private String rank;

    public static final String[] SUITS = {Suit.HEARTS.getEncoding(), Suit.DIAMONDS.getEncoding(),
            Suit.CLUBS.getEncoding(), Suit.SPADES.getEncoding()};
    public static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + suit;
    }
}
