package za.co.game;

// Enum for representing the four suits in a deck of cards
public enum Suit {

    HEARTS("❤"), DIAMONDS("♦"), CLUBS("♣"), SPADES("♠");

    private String encoding;

    private Suit( String encoding) {
        this.encoding = encoding;
    }

    public String getEncoding() {
        return encoding;
    }
}
