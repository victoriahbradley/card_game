import java.util.Scanner;
public class Game
{
    public static Card theCard;
    public static Card otherCard;
    private Deck deck;
    private Player player;
    public Game()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What name?");
        String name = scan.nextLine();
        player = new Player(name);
        deck = new Deck();
    }

    public void playGame()
    {
        System.out.println("Welcome to Higher or Lower!");
        System.out.println("To play, you are going to see a card");
        System.out.println("then, you must guess if the next card with have a higher or lower value,");
        System.out.println("if you get it right, then you get a point!");
        System.out.println("If you they are the same card, you will get 2 points!");
        System.out.println("If you get it wrong, you lose!");
        System.out.println("Good luck " + player.getName() + "!!!!");
        while (Player.points <= 7)
        {
            theCard = deck.deal();
            otherCard = deck.deal();
            System.out.println(theCard);
            if (!player.getGuess())
            {
                break;
            }
        }
    }

    // make the game in main and call playGame()
    public static void main(String[] args){
        Game g = new Game();
        g.playGame();
    }
}
