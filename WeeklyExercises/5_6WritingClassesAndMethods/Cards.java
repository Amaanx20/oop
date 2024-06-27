import java.util.Random;
public class Cards {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] faceValues = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        Random random = new Random();
        System.out.println("Dealing five random cards...");
        for (int c = 0; c < 5; c++) {
            String c_s = suits[random.nextInt(suits.length)];
            String faceValue = faceValues[random.nextInt(faceValues.length)];
            Card_value cardss = new Card_value(c_s, faceValue);
            System.out.println(cardss);
        }
    }
}
