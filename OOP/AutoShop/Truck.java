public class Truck {
    public int weight;

    public void getSalePrice(double price) {
        if (weight > 2000) {
            price = price - (price * 0.1);
        } else {
            price = price - (price * 0.2);
        }
    }

}
