import java.util.ArrayList;
public class Deck
{
    //cannot use random card generator, mkae all cards
    public static ArrayList<Card> cards = new ArrayList<Card>();
    private final String[] suits = new String []{"Spades", "Hearts", "Clubs", "Diamonds"};
    private final String[] rank = new String []{"1", "2", "3", "4", "5", "6", "7", "8", "9", "K", "Q", "J", "11"};
    private final int[] points = new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    public static int randInt = (int) Math.random() * cards.size();
    public Deck()
    {
        for (int i = 0; i < suits.length; i++)
        {
            for (int j = 0; j < rank.length; j++)
            {
                cards.add(new Card(suits[i], rank[j]));
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
        int randCard = (int) Math.random() * getCardsLeft();
        Card theCard = cards.get(randCard);
        return theCard;
    }

    public void shuffle()
    {
        int j;
        for (int i = 0; i < cards.size(); i++)
        {
            j = (int) (Math.random() * )
        }
    }
}
