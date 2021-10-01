public class Square extends Shape {

    private double Side;

    public Square(String name, double Side) {
        super(name);
        this.Side = Side;
    }

    public double getSide() {
        return this.Side;
    }

    public void setSide(double Side) {
        this.Side = Side;
    }

    public double getArea() {
        return (this.Side * this.Side);
    }

    public double getPerimeter() {
        return (4 * this.Side);
    }

    public double compareTo(Square other) {
        return this.getArea() - other.getArea();
    }

    public boolean equals(Square other) {
        boolean result = false;
        if (this.Side == other.Side) {
            result = true;
        }
        return result;
    }

    public String toString() {
        return "Side = " + getSide() + " Area = " + getArea() + " Perimeter = " + getPerimeter();
    }

}