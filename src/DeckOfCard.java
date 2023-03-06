public class DeckOfCard {
    public static void main(String[] args) {
        String[] cardsSuit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] cardsRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // initialize deck
        int n = cardsSuit.length * cardsRank.length;
        String[] deck = new String[n];
        for (int i = 0; i < cardsRank.length; i++) {
            for (int j = 0; j < cardsSuit.length; j++) {
                deck[cardsSuit.length * i + j] = cardsRank[i] + " of " + cardsSuit[j];
            }
        }

        // shuffling the deck
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // printing distributed cards for 4 players
        int j2 = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("For Player " + i + ": \n");
            for (int j = 0; j < 9; j++) {

                System.out.print(deck[j2] + " , ");
                j2++;
            }
            System.out.println();
        }
    }
}