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
        while (Player.points <= 5)
        {
            Card theCard = Deck.deal();
            Card otherCard = Deck.cards.get(Deck.randInt);
            String guess = Player.getGuess();
            if (Player.checkGuess(String guess, Card theCard, Card otherCard))
            {
                Player.points++;
            }
        }
    }

    // make the game in main and call playGame()
    public static void main(String[] args){
        playGame();
    }
}
