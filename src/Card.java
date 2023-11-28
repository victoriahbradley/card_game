import java.lang.Math;
public class Card
{
    String suit;
    //ace = 1 or 11, king = 10, queen = 9, and jack = 10
    int num;
    public class (String newSuit, int newNum)
    {
        suit = newSuit;
        num = newNum;
    }

    public static void setSuit(String theSuit)
    {
        newSuit = theSuit;
    }

    public static void setNum(int theNum)
    {
        newNum = theNum;
    }

    public String getSuit()
    {
        return suit;
    }
    public int getNum()
    {
        return num;
    }
    public Card newCard()
    {
        int randSuit = (int) (Math.random() * 4);
        int randNum = (int) (Math.random() * 11);
        String[] suits;
        suits = newString["Spades", "Clubs", "Diamonds", "Hearts"];
        Card.setSuit(suits[randSuit]);
        Card.setNum(randNum);
        return ;
    }
}


