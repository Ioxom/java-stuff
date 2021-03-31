package ca.ioxom.part10.techniques;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Card implements Comparable<Card> {

    public enum Suit {
        CLUB,
        DIAMOND,
        HEART,
        SPADE
    }

    public static class Hand implements Comparable<Hand> {
        private List<Card> cards;

        public Hand() {
            this.cards = new ArrayList<>();
        }

        public void add(Card card) {
            cards.add(card);
        }

        public void print() {
            cards.forEach(System.out::println);
        }

        public void sort() {
            cards = cards.stream().sorted().collect(Collectors.toList());
        }

        public void sortBySuit() {
            cards.sort(new SortBySuit());
        }

        @Override
        public int compareTo(Hand hand) {
            //compare sums
            return cards.stream()
                    .mapToInt(Card::getNumber)
                    .reduce(0, Integer::sum) - hand.cards.stream()
                    .mapToInt(Card::getNumber)
                    .reduce(0, Integer::sum);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Hand hand = (Hand) o;
            return Objects.equals(cards, hand.cards);
        }

        @Override
        public int hashCode() {
            return Objects.hash(cards);
        }
    }

    public static class SortBySuit implements Comparator<Card> {
        public int compare(Card c1, Card c2) {
            return c1.getSuit().ordinal() - c2.getSuit().ordinal();
        }
    }

    private final Suit suit;
    private final int number;

    public Card(int number, Suit suit) {
        if (number > 0 && number <= 14) {
            this.number = number;
        } else {
            System.out.println("invalid number; defaulting to one");
            this.number = 1;
        }

        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        String numberString = switch (number) {
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            case 14 -> "A";
            default -> number + "";
        };

        return suit + " " + numberString;
    }

    @Override
    public int compareTo(Card card) {
        if (number == card.getNumber()) {
            return getSuit().ordinal() - card.getSuit().ordinal();
        } else {
            return number - card.number;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return number == card.getNumber() && suit == card.getSuit();
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, number);
    }

    public static void main(String[] args) {
        Hand hand = new Hand();

        hand.add(new Card(2, Suit.CLUB));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.sort();

        hand.print();

        System.out.println("==");

        Hand hand1 = new Hand();

        hand1.add(new Card(2, Suit.DIAMOND));
        hand1.add(new Card(14, Suit.SPADE));
        hand1.add(new Card(12, Suit.HEART));
        hand1.add(new Card(2, Suit.SPADE));

        Hand hand2 = new Hand();

        hand2.add(new Card(11, Suit.DIAMOND));
        hand2.add(new Card(11, Suit.SPADE));
        hand2.add(new Card(11, Suit.HEART));

        int comparison = hand1.compareTo(hand2);

        if (comparison < 0) {
            System.out.println("better hand is");
            hand2.print();
        } else if (comparison > 0){
            System.out.println("better hand is");
            hand1.print();
        } else {
            System.out.println("hands are equal");
        }

        System.out.println("==");

        Hand hand3 = new Hand();

        hand3.add(new Card(12, Suit.HEART));
        hand3.add(new Card(4, Suit.SPADE));
        hand3.add(new Card(2, Suit.DIAMOND));
        hand3.add(new Card(14, Suit.SPADE));
        hand3.add(new Card(7, Suit.HEART));
        hand3.add(new Card(2, Suit.SPADE));

        hand3.sortBySuit();

        hand3.print();
    }
}
