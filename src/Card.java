import java.lang.Math;
public class Card
{
    static String suit;
    //ace = 1 or 11, king = 10, queen = 9, and jack = 10
    static String rank;
    int point;
    public Card (String newSuit, String newRank, int point)
    {
        suit = newSuit;
        rank = newRank;
        if(newRank.equals("J") || newRank.equals("Q") || newRank.equals("K"))
        {
            point = 10;
        }
        else if(!newRank.equals("A"))
        {
            point = Integer.parseInt(newRank);
        }
    }

    public static void setSuit(String theSuit)
    {
        suit = theSuit;
    }

    public static void setRank(String theRank)
    {
        rank = theRank;
    }

    public void setPoints(int newPoints)
    {
        point = newPoints;
    }
    public String getSuit()
    {
        return suit;
    }
    public String getRank()
    {
        return rank;
    }

    public int getPoints()
    {
        return point;
    }
    public Card newCard()
    {
        String newRank = "";
        int newPoints;
        int randSuit = (int) (Math.random() * 4);
        int randNum = (int) (Math.random() * 11);
        if (randNum == 10)
        {
            int randRank = (int) (Math.random() * 3);
            if (randRank == 1)
            {
                newRank = "J";
                newPoints = 10;

            }
            else if (randRank == 2)
            {
                newRank = "Q";
                newPoints = 10;
            }
            else if (randRank == 3)
            {
                newRank = "K";
                newPoints = 10;
            }
        }
        else if (randNum == 1 || randNum == 11)
        {
            newRank = "A";
        }
        else
        {
            newRank = randNum + "";
        }
        String[] suits = new String[4];
        suits = ["Clubs", "Diamonds", "Hearts"];
        return new Card(suits[randSuit], newRank, );
    }

    public
}


