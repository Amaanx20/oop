// Lights.java
public class Lights {
    public static void main(String[] args) {
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();
        Bulb bulb3 = new Bulb();

        // Turning on the bulbs
        bulb1.turnOn();
        bulb2.turnOn();
        // Bulb3 remains off

        System.out.println("Bulb 1: " + bulb1);
        System.out.println("Bulb 2: " + bulb2);
        System.out.println("Bulb 3: " + bulb3);
    }
}
