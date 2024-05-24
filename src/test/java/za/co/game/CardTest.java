package za.co.game;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CardTest {

    @Test
    public void testCardCreation() {
        Card card = new Card("\u2764\uFE0F", "A");
        assertEquals("\u2764\uFE0F", card.getSuit());
        assertEquals("A", card.getRank());
    }

    @Test
    public void testCardToString() {
        Card card = new Card("\u2660", "10");
        assertEquals("10"+ "\u2660", card.toString());
    }
}
