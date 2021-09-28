public class Dog extends Animal {
    private String breed;

    public Dog(String name, char gender, int yob, String breed) {
        super(name, gender, yob);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void eat() {
        System.out.println("Chomp chomp");
    }

    public void talk() {
        System.out.println("Bow wow");
    }

    public void chase() {
        System.out.println(super.getName() + " is chasing its own tail");
    }

    @Override
    public String toString() {
        return super.toString() + "\tbreed: " + breed;
    }
}
