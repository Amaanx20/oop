//4) Pin Encryption
//
//Write a block of source code to encrypt a four digit pin_number by doing the following:
//Convert the pin_number to hexadecimal.
//Generate two random numbers greater than 1000 and less than 65536 and convert them to hexadecimal.
//Sandwich the converted pin between the two random hexadecimal numbers.
import java.util.Scanner;
import java.util.Random;
import java.util.HexFormat;
public class Pin_encryption {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 4 digit passcode...");
        int pin_number = scanner.nextInt();
        String pin_noHex = Integer.toHexString(pin_number);
        Random random = new Random();
        int random_number1 = random.nextInt(64535 - 1001) + 1001;
        int random_number2 = random.nextInt(64535 - 1001) + 1001;
        String random_hex_number1 = Integer.toHexString(random_number1);
        String random_hex_number2 = Integer.toHexString(random_number2);
        String pin_encrypted = random_hex_number1 + pin_noHex + random_hex_number2;
        System.out.println("The Encrypted pin is... " + pin_encrypted);

        scanner.close();
    }







    }

