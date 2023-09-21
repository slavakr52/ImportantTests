package my_project;

public class PackAnimals extends Animal {
    
    String id;
    String name;
    String birth_date;
    String command;


    public PackAnimals(String animal_type, String id, String name, String birth_date, String command) {
        super(animal_type);
        this.id = id;
        this.name = name;
        this.birth_date = birth_date;
        this.command = command;
    }

    
}
