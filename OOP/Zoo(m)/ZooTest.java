public class ZooTest {
    public static void main(String[] args) {
        Zoo ofs = new Zoo("OFS");
        Animal newAnimal = new Animal("ant", 'm', 2017);
        ofs.add(newAnimal);
        System.out.println(ofs);
        newAnimal = new Animal("bee", 'f', 2017);
        ofs.add(newAnimal);
        System.out.println(ofs);
    }
}