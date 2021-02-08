package budget;

public class Money {
    private final char currency;
    private double value;

    public Money(char currency, double value) {
        this.currency = currency;
        this.value = value;
    }

    public Money(double value) {
        currency = '$';
        this.value = value;
    }

    public Money(String amount) {
        currency = amount.charAt(0);
        value = Double.parseDouble(amount.substring(1));
    }

    public double getValue() {
        return this.value;
    }

    public char getCurrency() {
        return this.currency;
    }

    public String formattedMoney() {
        return "" + currency + String.format("%.2f", value);
    }
}
