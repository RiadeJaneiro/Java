/**Задание 1.
 * В приведенных ниже заданиях необходимо вывести внизу фамилию разработчика, дату и время
 * получения задания, а также дату и время сдачи задания.
 * Добавить комментарии в программы в виде /** комментарий */
/**
 * ,сгенерировать html-файл документации.
 * В заданиях на числа объект можно создавать в виде массива символов.
 * Ввести n чисел с консоли.
 * 3.Вывести на консоль те числа,длина которых меньше(больше)средней,а также длину.
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values you want to input (one per line): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        String[] nums = new String[n];
        System.out.printf("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextLine();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i].length();
        }

        int avg = sum / n;

        for (int i = 0; i < n; i++) {
            if (nums[i].length() < avg) {
                System.out.println("Less than avg: " + nums[i] + " Length: " + nums[i].length());
            } else if (nums[i].length() > avg) {
                System.out.println("More than avg: " + nums[i] + " Length: " + nums[i].length());
            }
        }

        System.out.println("\n\nGorodnyanskaya / 04.02 10:59 / 17.02 12.53");
    }
}