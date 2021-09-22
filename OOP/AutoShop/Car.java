public class Car {
    public int speed;
    public double regularPrice;
    public String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice() {
        return this.regularPrice;
    }

}
