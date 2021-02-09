package budget.menu;

import budget.money.Money;
import budget.purchases.BalanceSheet;

import java.util.Scanner;

public class Menu {

    private static final Scanner scanner = new Scanner(System.in);
    private static final BalanceSheet balanceSheet = BalanceSheet.getInstance();

    public static void runMenu() {
        MenuOption choice;

        while (true) {
            try {
                MenuOption.printMenu();
                choice = MenuOption.values()[Integer.parseInt(scanner.nextLine())];

                switch (choice) {
                    case EXIT:
                        System.out.println("Bye!");
                        System.exit(0);
                    case ADD_INCOME:
                        System.out.println("Enter income:");
                        double income = Double.parseDouble(scanner.nextLine());
                        balanceSheet.addIncome(new Money(income));
                        break;
                    case ADD_PURCHASE:
                        System.out.println("Enter purchase name:");
                        String itemDescription = scanner.nextLine();
                        System.out.println("Enter its price:");
                        double purchase = Double.parseDouble(scanner.nextLine());
                        balanceSheet.addPurchase(itemDescription, new Money(purchase));
                        break;
                    case SHOW_PURCHASE_LIST:
                        balanceSheet.printPurchases();
                        break;
                    case BALANCE:
                        balanceSheet.printBalance();
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Inappropriate input");
            }
        }
    }
}
