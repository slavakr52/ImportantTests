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

            System.out.print("Введите пункт меню: ");
            try {
                int userChoose = scanner.nextInt();

                switch (userChoose) {
                    case 1:
                        System.out.println("\nВыберите тип животного:"
                                + "\n1. Домашнее животное"
                                + "\n2. Вьючное животное");
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
