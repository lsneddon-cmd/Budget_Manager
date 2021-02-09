package budget.money;

public class IllegalCurrencyException extends  IllegalArgumentException{
    public IllegalCurrencyException(String message) {
        super(message);
    }
}
