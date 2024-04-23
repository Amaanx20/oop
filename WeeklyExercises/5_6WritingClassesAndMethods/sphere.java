import java.util.Scanner;

public class sphere {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the diameter of a sphere:");
        float sphereDiam = keyboard.nextFloat();
        double sphereRadius = sphereDiam / 2.0;
        double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(sphereRadius, 3);
        System.out.println("The volume is: " + sphereVolume);

        keyboard.close();
    }


}






// contains instance data that represent a sphere’s diameter.
//  Include getter and setter methods for the diameter.
// Include methods to calculate and return the volume and surface area of the sphere.
//  Include a toString method that returns a one-line description of the sphere.
// Create a driver class (main class) called MultiSphere,
// whose main method instantiates and updates several Sphere objects.
