import java.util.Scanner;
public class Player
{
    public static int points = 0;
    private String name;

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

    public boolean getGuess()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Higher (h) or Lower (l)?");
        String guess = scan.nextLine();
        return checkGuess(guess, Game.theCard, Game.otherCard);
    }

    public boolean checkGuess(String guess, Card theCard, Card otherCard)
    {
        int thePoints = theCard.getPoints();
        int otherPoints = otherCard.getPoints();
        if (thePoints == otherPoints)
        {
            System.out.println("Same card, double points!");
            points += 2;
            return true;
        }
        else if ((thePoints > otherPoints) && (guess.equals("h")))
        {
            System.out.println("You are right! +1 Point!");
            points ++;
            System.out.println("The other card was " + otherCard);
            return true;
        }
        else if ((thePoints < otherPoints) && (guess.equals("l")))
        {
            System.out.println("You are right! +1 Point!");
            points++;
            System.out.println("The other card was " + otherCard);
            return true;
        }
        else if ((thePoints > otherPoints) && (guess.equals("l")))
        {
            System.out.println("You lose!");
            return false;
        }
        else
        {
            return false;
        }
    }
    public String toString()
    {
        return name + " has " + points + " points";
    }
}
