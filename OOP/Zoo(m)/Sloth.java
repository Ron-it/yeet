public class Sloth {

    private String species;

    public Sloth(String name, char gender, int yob, String species) {
        this.species = species;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println("leaves yom");
    }

    public void talk() {
        System.out.println("test");
    }

    public void sleep() {
        System.out.println("\"yawn... zzz..\"");
    }

    @Override
    public String toString() {
        return "{" + " species='" + getSpecies() + "'" + "}";
    }

}
