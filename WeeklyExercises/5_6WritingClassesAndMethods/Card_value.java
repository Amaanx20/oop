public class Card_value {
    private String card_suitss;
    private String faceValue;
    public Card_value(String card_suit, String faceValue) {
        this.card_suitss = card_suit;
        this.faceValue = faceValue;
    }
    @Override
    public String toString() {
        return faceValue + " of..." + card_suitss;
    }
}
