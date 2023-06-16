package toy_store;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        Toy toy1 = new Toy(0, "Bear", 10);
        Toy toy2 = new Toy(1, "Doll", 20);
        Toy toy3 = new Toy(2, "Bunny", 60);
        Toy toy4 = new Toy(3, "Kitty", 80);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyStore toyStore = new ToyStore(toys);
        toyStore.saveToy();
       
    }
}
