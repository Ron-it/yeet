package StoreItem;

public class StoreItem {
    private String name;
    private double price;
    private String location;
    private boolean perishable;

    private static double taxRate = 0.07; // same for all StoreItems

    public StoreItem(String name, double price, String location, boolean p) {
        // this means current object
        this.name = name; // this.name means current object's name
        this.price = price;
        this.location = location;
        perishable = p;
        // object's attributes = parameters
    }

    public StoreItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.location = "A1"; // fixed
        perishable = false; // fixed
    }

    public double calculatePriceIncTax() {
        // price taxRate
        return price * taxRate + price;
    }

    // getter (accessor) method for name attribute
    public String getName() {
        return name;
    }

    // getter (mutator) method for name attribute
    public void setName(String newName) {
        name = newName;
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

    public String getLocation() {
        return location;
    }

    // getter (mutator) method for name attribute
    public void setLocation(String location) {
        this.location = location;
    }

    public boolean getPerishable() {
        return perishable;
    }

    public String toString() {
        return name + ", " + price + ", " + location + ", " + perishable;
    }

    public static void main(String[] args) {
        StoreItem pencil = new StoreItem("pencil", 0.7, "H1", false);
        System.out.println("pencil price (include tax): " + pencil.calculatePriceIncTax());

        StoreItem thermo = new StoreItem("thermometer", 12.5);
        System.out.println("pencil price (include tax): " + thermo.calculatePriceIncTax());

    }
}
