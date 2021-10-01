public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return (length * width);
    }

    public double getPerimeter() {
        return (2 * (this.length + this.width));
    }

    public double compareTo(Rectangle other) {
        return this.getArea() - other.getArea();
    }

    public boolean equals(Rectangle other) {
        boolean result = false;
        if (this.getArea() == other.getArea()) {
            result = true;
        }
        return result;
    }

    public String toString() {
        return "Length = " + getLength() + " Width = " + getWidth() + " Area = " + getArea() + " Perimeter = "
                + getPerimeter();
    }

}
