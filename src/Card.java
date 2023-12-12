import java.lang.Math;
public class Card {
    private String suit;
    private String rank;
    private int point;

    public Card(String newSuit, String newRank) {
        suit = newSuit;
        rank = newRank;
        if (newRank.equals("J") || newRank.equals("Q") || newRank.equals("K")) {
            point = 10;
        } else if (!newRank.equals("A")) {
            point = Integer.parseInt(newRank);
        } else {// "A"
            point = 1;
        }
    }

    public void setSuit(String theSuit) {
        suit = theSuit;
    }

    public void setRank(String theRank) {
        rank = theRank;
    }

    public void setPoints(int newPoints) {
        point = newPoints;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank(Card otherCard) {
        return rank;
    }

    public int getPoints() {
        return this.point;
        //if (rank.equals("J") || rank.equals("Q") || rank.equals("K")) {
        //    point = 10;
        //    return point;
        //} else if (!rank.equals("A")) {
        //    point = Integer.parseInt(rank);
        //    return point;
        //}
            // else
        //{// "A"
        //    point = 11;
        //    return point;
        //}
    }

    public static Card randCard() {
        String newRank = "";
        int newPoints;
        int randSuit = (int) (Math.random() * 4) + 1;
        int randNum = (int) (Math.random() * 13) + 1;
        if (randNum == 11) {
            newRank = "J";
        } else if (randNum == 12) {
            newRank = "Q";
        } else if (randNum == 13) {
            newRank = "K";
        } else if (randNum == 1) {
            newRank = "A";
        } else {
            newRank = randNum + "";
        }
        String[] suits = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
        return new Card(suits[randSuit], newRank);
    }

    public String toString() {
//        return getRank(Game.theCard) + " of " + theCard.getSuit();
        return rank + " of " + suit;
    }

}


