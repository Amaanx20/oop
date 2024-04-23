import java.util.Scanner;

public class Reverser {
    public static void main(String[] args) {
        reverser(args);
    }
    public static void reverser(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string... ");
        String input = scanner.nextLine();
        for (int str = input.length() - 1; str >= 0; str--) {
            System.out.print(input.charAt(str));
        }
        scanner.close();
    }
}

