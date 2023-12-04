public class Player
{
    String name;
    int points = 0;
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
}
