package budget.purchases;

import budget.money.IllegalCurrencyException;
import budget.money.InsufficientFundsException;
import budget.money.Money;

import java.util.*;

public class BalanceSheet {
    private Map<String, Money> sheet = new TreeMap<>();
    private Money balance;
    private static BalanceSheet balanceSheet = new BalanceSheet();

    private BalanceSheet() {
        balance = new Money('$', 0.00);
    }

    public static BalanceSheet getInstance() {
        return balanceSheet;
    }

    public void addIncome(Money money) {
        try {
            balance.addToMoney(money);
            System.out.println("Income was added!");
        } catch (IllegalCurrencyException e) {
            System.out.println(e.getMessage());
        }
    }

    private void subtractIncome(Money money) {
        try {
            balance.subtractFromMoney(money);
        } catch (IllegalCurrencyException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addPurchase(String item, Money price) {
        subtractIncome(price);
        sheet.put(item, price);
        System.out.println("Purchase was added");
    }

    public void printBalance() {
        System.out.println("Balance: " + balance.formattedMoney());
    }

    public void printPurchases() {
        if(sheet.isEmpty()) {
            System.out.println("The purchase list is empty");
        } else {
            sheet.forEach((item, cost) -> System.out.println(item + " " + cost.formattedMoney()));
        }
    }
}
