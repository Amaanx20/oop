//5) Fraction Write an application that prompts and reads the numerator and denominator of a fraction
// as integers and then prints the decimal equivalent of the fraction.
import java.util.Scanner;
public class Fractions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a numerator...");
        double top = scanner.nextDouble();
        System.out.print("Input a denominator...");
        double bottom = scanner.nextDouble();
        double calc = top / bottom;
        System.out.println("The decimal version of the fraction is.." + calc);
        scanner.close();
    }
}



