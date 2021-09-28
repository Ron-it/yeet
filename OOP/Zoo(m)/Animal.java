public class Animal {
    private String name;
    private char gender;
    private int yob;

    public Animal(String name, char gender, int yob) {
        this.gender = Character.toUpperCase(gender);
        this.name = name;
        this.yob = yob;
    }

    public char setGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = Character.toUpperCase(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public void eat() {
        System.out.println("Animals eat.");
    }

    public void talk() {
        System.out.println("Animals can't talk!");
    }

}
