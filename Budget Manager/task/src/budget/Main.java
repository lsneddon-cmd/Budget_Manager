package budget;

import budget.menu.*;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Menu.runMenu();

//        MoneyCounter wallet = new MoneyCounter();
//        List<Item> items = new ArrayList<>();
//        String currentLine;
//        while (scanner.hasNextLine()) {
//            currentLine = scanner.nextLine();
//            items.add(parseItem(currentLine));
//            wallet.addMoney(parseMoneyValue(currentLine));
//        }
//
//        items.stream().forEach(Item::printNameAndCost);
//
//        System.out.println("Total: " + wallet.countMonies().formattedMoney());
    }

//    private static Money parseMoneyValue(String line) {
//        String[] lines = line.split(" ");
//        return new Money(lines[lines.length - 1]);
//    }
//
//    private static Item parseItem(String line) {
//        Money cost = parseMoneyValue(line);
//        String[] description = line.split("$");
//        return new Item(description[0], cost);
//    }
}
