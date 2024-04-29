// 5) Sphere Calculations
//Write and application that reads the radius of a sphere and prints its volume and surface area.
// Use the following formulas, where r represents the radius of the sphere.
// Print the output to four decimal places.
//
//Volume =  4πr3 / 3
//
//Surface area = 4πr2
import java.util.Scanner;
public class Sphere_calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a radius of a sphere...");
        double radius_number = scanner.nextDouble();
        double volume_number = (4.0/3.0) * Math.PI * Math.pow(radius_number, 3);
        double area_surface = 4 * Math.PI * Math.pow(radius_number, 2);
        System.out.printf("The volume of the sphere is... %.4f\n", volume_number);
        System.out.printf("The surface are of the sphere is.. %.4f\n",area_surface);
        System.out.println("Thanks for Calculating...");
        scanner.close();


    }
}
