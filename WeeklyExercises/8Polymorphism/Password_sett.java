public class Password_sett implements Encryption_method {
    @Override
    public String encryption_1(String text) {
        return new StringBuilder(text).reverse().toString();
    }
    @Override
    public String decrition_1(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
