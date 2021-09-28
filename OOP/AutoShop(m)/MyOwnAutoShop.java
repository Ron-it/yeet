public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(120, 5327.88, "Black", 1242);
        Ford ford1 = new Ford(105, 2833.28, "Red", 2021, 200);
        Ford ford2 = new Ford(102, 2433.28, "Orange", 2019, 120);
        Car car1 = new Car(107, 2645.45, "White");

        System.out.println(sedan.getSalePrice());
        System.out.println(ford1.getSalePrice());
        System.out.println(ford2.getSalePrice());
        System.out.println(car1.getSalePrice());
    }
}