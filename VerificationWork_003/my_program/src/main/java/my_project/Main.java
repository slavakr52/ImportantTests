package my_project;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nДобро пожаловать в реестр животных!"
                + "\n\nНажмите Enter для начала работы");
        scanner.nextLine();
        Boolean flag = true;
        while (flag) {

            System.out.println("\nГлавное меню"
                    + "\n1. Добавить животное"
                    + "\n2."
                    + "\n3."
                    + "\n4. Выход");

            System.out.print("Выберите пункт меню: ");
            try {
                int userChoose = scanner.nextInt();

                // выбор пункта меню
                switch (userChoose) {
                    case 1:

                        System.out.print("Введите кличку животного: ");
                        String name = scanner.nextLine();
                        System.out.print("Введите кличку животного: ");
                        String birth_date = scanner.nextLine();
                        System.out.print("Введите кличку животного: ");
                        String command = scanner.nextLine();
                        
                        // выбор типа животного
                        System.out.println("\nВыберите тип животного:"
                                + "\n1. Домашнее животное"
                                + "\n2. Вьючное животное");
                        int userChoose2 = scanner.nextInt();
                        switch (userChoose2) {
                            //домашнее животное
                            case 1:
                                String type1 = "Pet";
                                System.out.println("\nКакое домашнее животное вы хотите добавить?"
                                        + "\n1. Собака"
                                        + "\n2. Кошка"
                                        + "\n3. Хомяк");
                                int userChoose3 = scanner.nextInt();
                                switch (userChoose3) {
                                    //собака
                                    case 1:
                                    Dog dog = new Dog (type1, "1", name, birth_date, command);

                                }
                            //вьючное животное
                            case 2:
                                String type2 = "Pack Animal";
                                System.out.println("\nКакое вьючное животное вы хотите добавить?"
                                        + "\n1. Лошадь"
                                        + "\n2. Верблюд"
                                        + "\n3. Осёл");
                        }

                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        flag = false;
                        break;
                    default:
                        System.out.print("Такого пункта нет. Повторите ввод");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Введите корректный пункт меню!");
            }

        }
    }
}
