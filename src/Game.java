import java.util.Scanner;
public class Game
{
    public static Card theCard;
    public static Card otherCard;
    public Game()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What name?");
        String name = scan.nextLine();
        Player player = new Player(name);
        Deck deck = new Deck();
    }

    public static void playGame()
    {
        new Game();
        while (Player.points <= 10)
        {
            Card theCard = Deck.deal();
            Card otherCard = Deck.cards.get(Deck.randInt);
            Card.toString(theCard);
            if (!Player.getGuess())
            {
                break;
            }
        }
        Deck.shuffle();
    }

    // make the game in main and call playGame()
    public static void main(String[] args){
        playGame();
    }
}
