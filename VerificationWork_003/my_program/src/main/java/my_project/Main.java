package my_project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;


public class Main {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in, "UTF-8");
        Scanner scannerLine = new Scanner(System.in, "UTF-8");

        System.out.print("\nДобро пожаловать в реестр животных!"
                + "\n\nНажмите Enter для начала работы");
        scannerLine.nextLine();
        Boolean flag = true;
        while (flag) {

            System.out.println("\nГлавное меню"
                    + "\n1. Добавить животное"
                    + "\n2."
                    + "\n3."
                    + "\n4. Выход");

            List animalList = new ArrayList();

            System.out.print("Выберите пункт меню: ");
            try {
                int userChoose = scannerInt.nextInt();

                // выбор пункта меню
                switch (userChoose) {
                    case 1:
                        // Добавить животное. ввод данных по животному
                        System.out.print("Введите кличку животного: ");
                        String name = scannerLine.nextLine();
                        System.out.print("Введите дату рождения животного: ");
                        String birth_date = scannerLine.nextLine();
                        System.out.print("Введите команды, которые знает животное: ");
                        String command = scannerLine.nextLine();

                        UUID uuid = UUID.randomUUID();
                        String id = uuid.toString();

                        // выбор типа животного
                        System.out.println("\nВыберите тип животного:"
                                + "\n1. Домашнее животное"
                                + "\n2. Вьючное животное");
                        int userChoose2 = scannerInt.nextInt();
                        switch (userChoose2) {

                            // домашнее животное
                            case 1:
                                String type1 = "Pet";
                                System.out.println("\nКакое домашнее животное вы хотите добавить?"
                                        + "\n1. Собака"
                                        + "\n2. Кошка"
                                        + "\n3. Хомяк");
                                int userChoose3 = scannerInt.nextInt();
                                switch (userChoose3) {

                                    // собака
                                    case 1:
                                        Dog dog = new Dog(type1, id, name, birth_date, command);
                                        dog.ShowInfo();
                                        dog.WriteInfo();
                                        break;
                                    // кошка
                                    case 2:
                                        Cat cat = new Cat(type1, id, name, birth_date, command);
                                        cat.ShowInfo();
                                        break;
                                    // хомяк
                                    case 3:
                                        Hamster hamster = new Hamster(type1, id, name, birth_date, command);
                                        hamster.ShowInfo();
                                        break;
                                }
                                break;

                            // вьючное животное
                            case 2:

                                String type2 = "PackAnimal";
                                System.out.println("\nКакое вьючное животное вы хотите добавить?"
                                        + "\n1. Лошадь"
                                        + "\n2. Верблюд"
                                        + "\n3. Осёл");
                                int userChoose4 = scannerInt.nextInt();
                                switch (userChoose4) {
                                    // лошадь
                                    case 1:
                                        Horse horse = new Horse(type2, id, name, birth_date, command);
                                        horse.ShowInfo();
                                        break;
                                    // верблюд
                                    case 2:
                                        Camel camel = new Camel(type2, id, name, birth_date, command);
                                        camel.ShowInfo();
                                        break;
                                    // осёл
                                    case 3:
                                        Donkey donkey = new Donkey(type2, id, name, birth_date, command);
                                        donkey.ShowInfo();
                                        break;
                                }
                        }
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        flag = false;
                        break;
                    default:
                        System.out.print("\nТакого пункта нет. Повторите ввод");
                        scannerLine.nextLine();
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("\nНекорректный ввод! Перезапустите программу\n");
                break;
            }
        }

    }

    
}
