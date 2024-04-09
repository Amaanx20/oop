import java.util.Scanner;

public class Square_Calc {
    public static void main(String[] args) {

        double Area;

        Scanner in = new Scanner(System.in);

        System.out.println("Length Of Square:");
        Area = in.nextDouble();

        double other = Area * Area;


        System.out.println("Area = " + other +"cm");

        double per = Area * 4;
        System.out.println("Perimiter = " + per +"cm");




    }
}
