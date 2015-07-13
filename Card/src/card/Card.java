/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card;

/**
 *
 * @author johnharvard
 */
class Card {

    int suit;
    int rank;

    public Card() {
        this.suit = 0;
        this.rank = 0;
    }

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public static void printCard(Card x) {
        String[] suits
                = {
                    "Oros",
                    "Copas",
                    "Espadas",
                    "Bastos"
                };
        String[] ranks
                = {
                    "#",
                    "As",
                    "2",
                    "3",
                    "4",
                    "5",
                    "6",
                    "7",
                    "Sota",
                    "Caballo",
                    "Rey"
                };
        System.out.println(ranks[x.rank] + " de " + suits[x.suit]);
    }

    public static boolean sameCard(Card x, Card y) {
        return (x.suit == y.suit && x.rank == y.rank);
    }

    public static void printDeck(Card[] deck) {
        for (Card x : deck) {
            printCard(x);
        }
    }

    /**
     *
     * @param deck
     */
    static void buildDeck(Card[] deck) {
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 10; rank++) {
                deck[index] = new Card(suit, rank);
                index++;
            }
        }
    }

    public static int findCard(Card[] deck, Card card) {
        for (int i = 0; i < deck.length; i++) {
            if (sameCard(deck[i], card)) {
                return i;
            }
        }
        return -1;
    }

    public static int compareCard(Card c1, Card c2) {
        if (c1.suit > c2.suit) {
            return 1;
        }
        if (c1.suit < c2.suit) {
            return -1;
        }
        if (c1.rank > c2.rank) {
            return 1;
        }
        if (c1.rank < c2.rank) {
            return -1;
        }
        return 0;
    }

    public static int findBisect(Card[] deck, Card card, int low, int high) {
        System.out.println(low + ", " + high);
        if (high < low) {
            return -1;
        }
        int mid = (high + low) / 2;
        int comp = compareCard(deck[mid], card);
        if (comp == 0) {
            return mid;
        } else if (comp > 0) {
            return findBisect(deck, card, low, mid - 1);
        } else {
            return findBisect(deck, card, mid + 1, high);
        }
    }
}
