package my_project;

public class Pets extends Animal{

    String id;
    String name;
    String birth_date;
    String command;
   
    public Pets(String animal_type, String id, String name, String birth_date, String command) {
        super(animal_type);
        this.id = id;
        this.name = name;
        this.birth_date = birth_date;
        this.command = command;
    }
    




}
