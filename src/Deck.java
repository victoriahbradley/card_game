import java.util.ArrayList;
public class Deck
{
    private ArrayList<Card> cards = new ArrayList<Card>();
    public Deck()
    {
        for (int i = 0; i < 52; i++)
        {
            cards.add(Card.randCard());
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
        if (!isEmpty())
        {
            return cards.remove(0);
        }
        else
        {
            return null;
        }
    }

    public void shuffle()
    {
        for(int i = 0; i < cards.size(); i++){
            int randInd = (int) Math.random() * cards.size();
            Card randcard = cards.remove(i);
            cards.add(randcard);
        }
    }
}
