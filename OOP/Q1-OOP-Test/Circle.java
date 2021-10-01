public class Circle extends Shape {

    private double radius;
    private static double pi = Math.PI;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * (this.radius * this.radius);
    }

    public double getPerimeter() {
        return (2 * pi * this.radius);
    }

    public double compareTo(Circle other) {
        return this.getArea() - other.getArea();
    }

    public boolean equals(Circle other) {
        boolean result = false;
        if (this.radius == other.radius) {
            result = true;
        }
        return result;
    }

    @Override
    public String toString() {
        return ("Radius = " + getRadius() + " Area = " + getArea() + " Circumference = " + getPerimeter());
    }

}
