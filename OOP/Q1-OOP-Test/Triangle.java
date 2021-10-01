public class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double base, double height, double side1, double side2, double side3) {
        super(name);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        return (0.5 * base * height);
    }

    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3);
    }

    public double compareTo(Triangle other) {
        return this.getArea() - other.getArea();
    }

    public boolean equals(Square other) {
        boolean result = false;
        if (this.getArea() == other.getArea()) {
            result = true;
        }
        return result;
    }

    public String toString() {
        return "Base = " + getBase() + " Height = " + getHeight() + " Side1 = " + getSide1() + " Side2 = " + getSide2()
                + " Side3 = " + getSide3() + " Area = " + getArea() + " Perimeter = " + getPerimeter();
    }

}
