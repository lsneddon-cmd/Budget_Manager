package budget.money;

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

    public void addToMoney(Money additional) throws IllegalCurrencyException {
        if (additional.getCurrency() != currency) {
            throw new IllegalCurrencyException("The currency " + additional.getCurrency() + " is not currently supported");
        }
        value += additional.getValue();
    }

    public void subtractFromMoney(Money subtraction) throws IllegalCurrencyException, InsufficientFundsException {
        if (subtraction.getCurrency() != currency) {
            throw new IllegalCurrencyException("The currency " + subtraction.getCurrency() + " is not currently supported");
        }
        if (value < subtraction.getValue()) {
            throw new InsufficientFundsException("Negative balances are not currently supported.");
        }
        value -= subtraction.getValue();
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
