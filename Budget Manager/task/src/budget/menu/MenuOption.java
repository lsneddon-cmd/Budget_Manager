package budget.menu;

import java.util.EnumSet;

public enum MenuOption {
    EXIT("0)\tExit"),
    ADD_INCOME("1)\tAdd income"),
    ADD_PURCHASE("2)\tAdd purchase"),
    SHOW_PURCHASE_LIST("3)\tShow list of purchases"),
    BALANCE("4)\tBalance");

    private final String description;

    MenuOption(String description) {
        this.description = description;
    }

    private String getDescription() {
        return description;
    }

    public static void printMenu() {
        EnumSet.allOf(MenuOption.class)
                .stream()
                .map(MenuOption::getDescription)
                .forEach(System.out::println);
    }

}
