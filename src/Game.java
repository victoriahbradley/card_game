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
    }

    public static void main(String[] args){
        playGame();
    }
}
