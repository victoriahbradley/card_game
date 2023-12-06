public class Player
{
    private String name;
    private Card card;
    private int points = 0;
    public Player (String playerName)
    {
        name = playerName;
    }

    public String getName()
    {
        return name;
    }


    public void setName(String playerName)
    {
        name = playerName;
    }

    public void addPoint()
    {
        points++;
    }

    public int getPoints()
    {
        return points;
    }

    public void addCard(Card c)
    {
        card = c;
    }

    public String toString()
    {
        return name + " has " + points + " points";
    }
}
