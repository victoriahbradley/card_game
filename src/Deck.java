import java.util.ArrayList;
public class Deck
{
    private ArrayList<Card> cards = new ArrayList<Card>();
    private final int[] points = new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    public Deck()
    {
        String[] suits = new String[]{"Spades", "Hearts", "Clubs", "Diamonds"};
        for (int suit = 0; suit < suits.length; suit++)
        {
            String[] ranks = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "K", "Q", "J", "A"};
            for (int rank = 0; rank < ranks.length; rank++)
            {
                cards.add(new Card (suits[suit], ranks[rank]));
            }
        }
    }

    private void printCards()
    {
        for (Card c : cards)
        {
            System.out.println(c);
        }
    }
    public boolean isEmpty()
    {
        return cards.isEmpty();
    }

    public int getCardsLeft()
    {
        return cards.size();
    }

    public Card deal()
    {
        int randCard = (int) (Math.random() * 52);
        return cards.get(randCard);
    }

    public static void shuffle()
    {
        int[] num = new int [52];
        for (int i = 0; i < 52; i++)
        {
            num[i] = i;
        }
        for (int j = 0; j < 52; j++)
        {
            int randNum = (int) (Math.random() * num.length);
        }
    }
}
