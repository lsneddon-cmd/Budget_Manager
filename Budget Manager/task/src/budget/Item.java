package budget;

public class Item {
    private final String name;
    private final Money cost;

    public Item(String name, Money cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getNameAndCost() {
        return name + " " + cost.formattedMoney();
    }

    public void printNameAndCost() {
        System.out.println(getNameAndCost());
    }
}
