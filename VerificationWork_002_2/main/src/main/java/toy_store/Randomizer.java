package toy_store;

import java.util.List;

public class Randomizer {
    public Toy chooseRandomToy(List<Toy> toys) {
        double totalWeight = 0.0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }

        int idx = 0;
        for (double r = Math.random() * totalWeight; idx < toys.size() - 1; ++idx) {
            r -= toys.get(idx).getWeight();
            if (r <= 0.0) {
                break;
            }
        }
        System.out.println("You won a toy: " + toys.get(idx).getName() + "!");
        return toys.get(idx);
    }
}
