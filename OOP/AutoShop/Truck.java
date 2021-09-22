public class Truck extends Car {
    public int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return regularPrice - (regularPrice * 0.1);
        } else {
            return regularPrice - (regularPrice * 0.2);
        }
    }

}