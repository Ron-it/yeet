public class Item {
    private String name;
    private double price;
    private String rarity;
    private static double taxRate = 0.15;

    public Item(String name, double price, String rarity) {
        this.name = name;
        this.price = price;
        this.rarity = rarity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double calculatePriceIncTax() {
        return ((price * taxRate) + price + 0.01);
    }

    public double getPrice() {
        return price;
    }

    public boolean setPrice(double p) {
        if (p > 0) {
            price = p;
            return true;
        } else {
            System.out.println("The price must be positive");
        }
        return false;
    }

    public String toString() {
        return name.toUpperCase() + ", " + price + ", " + rarity.toUpperCase();
    }

}