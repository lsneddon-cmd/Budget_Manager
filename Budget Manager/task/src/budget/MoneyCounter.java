package budget;

import java.util.ArrayList;
import java.util.List;

public class MoneyCounter {
    private List<Money> monies;

    public MoneyCounter() {
        monies = new ArrayList<>();
    }

    public Money countMonies() {
        return new Money(monies.stream().mapToDouble(Money::getValue).sum());
    }

    public void addMoney(Money money) {
        monies.add(money);
    }
}
