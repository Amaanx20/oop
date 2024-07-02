import java.util.Scanner;
public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1-100...");
        int number_question = scanner.nextInt();
        scanner.close();
        int[] number_groups = new int[10];
        if (number_question >= 1 && number_question <= 100) {
            int number_collection = (number_question - 1) / 10;
            number_groups[number_collection] = 1;
        } else {
            System.out.println("Error...Please enter a number between 1 and 100...");
            return;
        }
        System.out.println("Histogram...");
        for (int num = 0; num < number_groups.length; num++) {
            int num_ranstart = num * 10 + 1;
            int num_ending = num_ranstart + 9;
            System.out.printf("%2d - %2d | ", num_ranstart, num_ending);
            for (int x = 0; x < number_groups[num]; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
