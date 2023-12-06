import java.util.Scanner;
public class Game
{
    private Player player;
    private Deck deck;
    private Scanner scan;
    public Game()
    {
        scan = new Scanner(System.in);
        System.out.println("What name?");
        String name = scan.nextLine();
        player = new Player(name);
        deck = new Deck();
    }

    public static void playGame()
    {
        new Game();
        while (Player.points <= 15)
        {

        }
    }

    // make the game in main and call playGame()
    public static void main(String[] args){
        playGame();
    }
}
