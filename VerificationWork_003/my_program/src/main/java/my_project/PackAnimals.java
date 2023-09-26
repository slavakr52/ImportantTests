package my_project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

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

    public void ShowInfo() {
        System.out.println("\nAnimal Type: " + animal_type
                + "\nID: " + id
                + "\nName: " + name
                + "\nBirthdate: " + birth_date
                + "\nCommands: " + command);
    }

    public void WriteInFile() {

        String str = animal_type + ";" + id + ";" + name + ";" + birth_date + ";" + command + "\n";
        try (FileWriter writer = new FileWriter("db.txt", true)) {
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}
