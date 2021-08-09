
public class StoreItem {
    private String name;
    private double price;
    private String location;
    private boolean perishable;
    private static double taxRate = 0.07;

    public StoreItem(String name, double price, String location, boolean p) {
        this.name = name;
        this.price = price;
        this.location = location;
        perishable = p;
    }

    public StoreItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.location = "A1"; // fixed
        perishable = false; // fixed
    }

    public double calculatePriceIncTax() {
        return price * taxRate + price;
    }

    public static void main(String[] args) {
        StoreItem pencil = new StoreItem("pencil", 0.7, "H1", false);
        System.out.println("Pencil price (inclusive tax): " + pencil.calculatePriceIncTax());

        StoreItem thermo = new StoreItem("thermometer", 12.5);
        System.out.println("Thermometer price (inclusive tax): " + thermo.calculatePriceIncTax());
    }

}