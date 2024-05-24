package za.co.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hand {

    private final List<Card> cards;

    public Hand(List<Card> cards) {
        this.cards = cards;
    }

    //Evaluate the hand and return its rank
    public String evaluateHand() {
        Map<String, Integer> rankCount = new HashMap<>();
        Map<String, Integer> suitCount = new HashMap<>();

        for (Card card : cards) {
            rankCount.put(card.getRank(), rankCount.getOrDefault(card.getRank(), 0) + 1);
            suitCount.put(card.getSuit(), suitCount.getOrDefault(card.getSuit(), 0) + 1);
        }

        boolean isFlush = suitCount.size() == 1;

        List<Integer> rankIndices = new ArrayList<>();
        for (Card card : cards) {
            rankIndices.add(getRankIndex(card.getRank()));
        }
        Collections.sort(rankIndices);
        boolean isStraight = isSequential(rankIndices);

        if (isStraight && isFlush) {
            return "Straight Flush";
        } else if (rankCount.containsValue(4)) {
            return "Four of a Kind";
        } else if (rankCount.containsValue(3) && rankCount.containsValue(2)) {
            return "Full House";
        } else if (isFlush) {
            return "Flush";
        } else if (isStraight) {
            return "Straight";
        } else if (rankCount.containsValue(3)) {
            return "Three of a Kind";
        } else if (Collections.frequency(rankCount.values(), 2) == 2) {
            return "Two Pair";
        } else if (rankCount.containsValue(2)) {
            return "One Pair";
        } else {
            return "High Card";
        }
    }

    private int getRankIndex(String rank) {
        for (int i = 0; i < Card.RANKS.length; i++) {
            if (Card.RANKS[i].equals(rank)) {
                return i;
            }
        }
        return -1; // should never happen
    }

    private boolean isSequential(List<Integer> rankIndices) {
        for (int i = 0; i < rankIndices.size() - 1; i++) {
            if (rankIndices.get(i) + 1 != rankIndices.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder results = new StringBuilder();
        if(!cards.isEmpty()) {
            results.append(cards.get(0)).append(" ");
        }
        for (int i = 1; i < cards.size(); i++) {
            results.append(",  ").append(cards.get(i));
        }
        return results.toString();
    }

}
