public class Encryption_driver_class {
    public static void main(String[] args) {
        Encryption_method password = new Password_sett();
        String pas = "Paasswordissecure";
        String encryptedPas = password.encryption_1(pas);
        String decryptedPas = password.decrition_1(encryptedPas);
        System.out.println("Password Text: " + pas);
        System.out.println("Encrypted Password: " + encryptedPas);
        System.out.println("Decrypted Password: " + decryptedPas);
    }
}
