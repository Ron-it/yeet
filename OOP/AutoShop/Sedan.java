public class Sedan {
    public int length;

    public void getSalePrice(double price) {
        if (length > 20) {
            price = price - (price * 0.05);
        } else {
            price = price - (price * 0.1);
        }
    }

}
