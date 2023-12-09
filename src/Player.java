import java.util.Scanner;
public class Player
{
    public static int points = 0;
    private String name;
    private Card card;
    private static Scanner scan;
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

    public static String getGuess()
    {
        scan = new Scanner(System.in);
        System.out.println("Higher (h) or Lower (l)?");
        String guess = scan.nextLine();
    }

    public static boolean checkGuess(String guess, Card theCard, Card otherCard)
    {
        int thePoints = theCard
        if (theCard.points == otherCard.points)
    }
    public String toString()
    {
        return name + " has " + points + " points";
    }
}
