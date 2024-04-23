import java.util.Scanner;

public class Punctuation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string... ");
        String str = scanner.nextLine();
        scanner.close();
        int stringg = 0;
        for (char c : str.toCharArray()) {
            if (",.!?-'\";:".indexOf(c) != -1) {
                stringg++;
            }
        }

        System.out.println("The number of punctuation marks in the string is: " + stringg);
    }
}

