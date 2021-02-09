package budget.money;

public class InsufficientFundsException extends IllegalArgumentException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
