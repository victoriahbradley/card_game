import java.util.ArrayList;
public class Deck
{
    //cannot use random card generator, mkae all cards
    public static ArrayList<Card> cards = new ArrayList<Card>();
    private final int[] points = new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    public static int randInt = (int) (Math.random() * cards.size());
    public Deck()
    {
        String[] suits = new String[]{"Spades", "Hearts", "Clubs", "Diamonds"};
        for (String suit : suits)
        {
            String[] rank = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "K", "Q", "J", "11"};
            for (String s : rank)
            {
                cards.add(new Card(suit, s));
            }
        }
    }

    public boolean isEmpty()
    {
        return cards.isEmpty();
    }

    public static int getCardsLeft()
    {
        return cards.size();
    }

    //Dont use the remove, just use CardsLeft
    public static Card deal()
    {
        int randCard = (int) (Math.random() * getCardsLeft());
        return cards.get(randCard);
    }

    public static void shuffle()
    {
        int[] nums = new int [52];
        for (int i = 0; i < 52; i++)
        {
            nums[i] = i;
        }
        for (int j = 0; j < 52; j++)
        {
            int randNum = (int) (Math.random() * nums.length);

        }
    }
}
