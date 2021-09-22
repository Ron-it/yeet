public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price_per_item;

    public Invoice(String partNumber, String partDescription, int quantity, double price_per_item) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price_per_item = price_per_item;
    }

    public String getPartNumber() {
        return this.partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return this.partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice_per_item() {
        return this.price_per_item;
    }

    public void setPrice_per_item(double price_per_item) {
        this.price_per_item = price_per_item;
    }

    public double getInvoiceAmount() {
        return quantity * price_per_item;
    }

}
