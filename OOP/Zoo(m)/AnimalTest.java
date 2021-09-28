public class AnimalTest {
    public static void main(String[] args) {
        System.out.println("Animal===============================");
        Animal baah = new Animal("Sheep", 'f', 2018);
        System.out.println(baah);
        baah.eat();
        baah.talk();

        System.out.println("Dog==================================");
        Dog snoop = new Dog("Fido", 'm', 2020, "chihuahua");

        System.out.println(snoop);
        snoop.eat();
        snoop.talk();
        snoop.chase();

        System.out.println("Sloth==================================");
        Sloth poke = new Sloth("Poke", 'm', 2016, "two toed");
        poke.eat();
        poke.talk();
        poke.sleep();
        System.out.println(poke.toString());

    }

}
