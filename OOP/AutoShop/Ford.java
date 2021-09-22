public class Ford extends Car {
    public int year;
    public int manafacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manafacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manafacturerDiscount = manafacturerDiscount;
    }

    public double getSalePrice() {
        return regularPrice - manafacturerDiscount;
    }

}