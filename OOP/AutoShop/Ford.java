public class Ford {
    public int year;
    public int manafacturerDiscount;

    public void getSales(double price) {
        price = price - manafacturerDiscount;
    }

}
