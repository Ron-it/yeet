public class DrinkItem {
    private String itemCode;
    private int quantity;

    public DrinkItem(String itemCode, int quantity) {
        this.itemCode = itemCode;
        this.quantity = quantity;
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "{" + " itemCode='" + getItemCode() + "'" + ", quantity='" + getQuantity() + "'" + "}";
    }

}
