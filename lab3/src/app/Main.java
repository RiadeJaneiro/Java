package app;

//Вариант 4. Создайте класс «Книга», который содержит следующую
//информацию: издательство, автор и количество страниц. Предусмотреть get методы.
//Метод класса «Название», который потом будут переопределять производные
//классы.
//Создайте класс «Художественная книга» производный от «Книга» содержит
//дополнительную информацию: жанр.
//Создайте класс «Научная книга» производный от «Книга» содержит
//дополнительную информацию: тематика, сложность.

import books.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FictionBook fiction = new FictionBook("Эксмо", "Достоевский",
                500, "Роман");
        ScientificBook science = new ScientificBook("Наука", "Хокинг",
                250, "Физика", "Высокая");

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Вывести информацию о художественной книге");
            System.out.println("2. Вывести информацию о научной книге");
            System.out.println("3. Выйти");

            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    WriterInfo.printBookInfo(fiction);
                    break;
                case 2:
                    WriterInfo.printBookInfo(science);
                    break;
                case 3:
                    System.out.println("Выход...");
                    return;
                default:
                    System.out.println("Неверный ввод, попробуйте снова");
            }
        }
    }
}
