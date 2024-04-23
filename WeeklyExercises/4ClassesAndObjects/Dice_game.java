import java.util.Scanner;
import java.util.Random;

public class Dice_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Dice Rolling Simulater...");

        System.out.println("How man sides does the first dice have...");
        int dieside1 = scanner.nextInt();

        System.out.println("How many sides does the second dice have...");
        int dieside2 = scanner.nextInt();

        int dieplay_1 = random.nextInt(dieside1) + 1;
        int dieplay_2 = random.nextInt(dieside1) + 1;
        int dieplay_3 = random.nextInt(dieside1) + 1;
        int diego_1 = random.nextInt(dieside2) + 1;
        int diego_2 = random.nextInt(dieside2) + 1;
        int diego_3 = random.nextInt(dieside2) + 1;
        int dieaddition = dieplay_1 + dieplay_2 + dieplay_3;
        int dieaddition2 = diego_1 + diego_2 + diego_3;

        double average_sum1 = (double) dieaddition / 3;
        double average_sum2 = (double) dieaddition2 / 3;

        System.out.println("Die 1 total: " + dieaddition + ", avarage: " + average_sum1);
        System.out.println("Die 2 total: " + dieaddition2 + ", avarage: " + average_sum2);

        System.out.println("Thanks for playing the Dice Rolling Simulator!");
        scanner.close();
    }
}
