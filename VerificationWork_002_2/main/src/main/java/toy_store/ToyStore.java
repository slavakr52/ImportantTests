package toy_store;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class ToyStore {
    private List<Toy> toys;

    public ToyStore(List<Toy> toys) {
        this.toys = toys;
    }
    
    public Toy getToy() {
        Randomizer random = new Randomizer();
        Toy toy = random.chooseRandomToy(toys);
        return toy;
    }

    public void saveToy() {
        Toy toy = getToy();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("data.txt", true))
        { 
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException exception) {

            System.out.println(exception.getMessage());
        }
        toys.remove(toy);
    }
}
