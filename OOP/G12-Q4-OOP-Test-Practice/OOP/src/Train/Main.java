package Train;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(1);
        Engine engine2 = new Engine(2);
        Wagon wagon1 = new Wagon(3);
        Wagon wagon2 = new Wagon(4);
        Parcel parcel1 = new Parcel(24);
        parcel1.setWeight(2);
        Parcel parcel2 = new Parcel(66);

        Train train1 = new Train(123);

        System.out.println("Initial Weight = " + train1.getWeight());
        train1.addEngine(engine1);
        train1.addEngine(engine2);
        train1.addWagon(wagon1);
        train1.addWagon(wagon2);
        System.out.println("Weight before parcel = " + train1.getWeight());
        wagon1.addParcel(parcel1);
        System.out.println("Weight after parcel1 = " + train1.getWeight());
        wagon2.addParcel(parcel2);
        parcel2.setWeight(12);
        System.out.println("Weight after parcel2 = " + train1.getWeight());

        Train train2 = new Train(456);

        train2.addEngine(new Engine(11));
        train2.addWagon(wagon1);
        train2.addWagon(wagon2);
    }
}
