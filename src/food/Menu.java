package food;

public class Menu {
    private String name;
    private int price;
    private String description;

    Menu(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String returnName() {
        return name;
    }

    public int returnPrice() {
        return price;
    }

    public String returnDescription() {
        return description;
    }
}
