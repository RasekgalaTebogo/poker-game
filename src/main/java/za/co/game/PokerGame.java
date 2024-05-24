package za.co.game;

public class PokerGame {

    private final Deck deck;
    private Hand playerHand;

    public PokerGame() {
        deck = new Deck();
    }

    public void startGame() {
        deck.shuffle();
        deal();
        displayHand();
        displayResult();
    }

    private void deal() {
        playerHand = new Hand(deck.dealHand(5));
    }

    private void displayHand() {
        System.out.println("Your hand: " + playerHand);
    }

    private void displayResult() {
        String handRank = playerHand.evaluateHand();
        System.out.println("You have: " + handRank);
    }

    public static void main(String[] args) {
        PokerGame game = new PokerGame();
        System.out.println("Shuffling ... shuffling ... Shuffling ...");
        game.startGame();
    }

}
