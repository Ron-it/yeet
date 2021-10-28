import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();
    private String zooName;

    public Zoo(String zooName) {
        this.zooName = zooName;
    }

    public Zoo() {
        this.zooName = "";
    }

    public void setAnimal(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void setAnimal(Animal animal, int index) {
        this.animals.add(index, animal);
    }

    public void add(Animal animal) {
        this.animals.add(animal);
    }

    public boolean remove(int index) {
        if (index < 0 || index >= animals.size()) {
            return false;
        }
        animals.remove(index);
        return true;
    }

    public Animal getAnimal(int index) {
        return animals.get(index);
    }

    public int getSize() {
        return animals.size();
    }

    public String getZooName() {
        return zooName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(zooName + " has " + animals.size() + " animals: ");
        for (Animal animal : animals) {
            sb.append(animal.getName() + " ");
        }
        return sb.toString();
    }

}
