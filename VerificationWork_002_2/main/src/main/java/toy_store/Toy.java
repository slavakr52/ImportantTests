package toy_store;

public class Toy {
    Integer id;
    String name;
    double weight;

    public Toy(Integer id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Toy [" + id + ";" + name + ";" + weight + "]";
    }
}
