//4. Создайте программу, вычисляющую факториал целого числа.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a positive integer number: ");
        int num = scanner.nextInt();
        int res = 1;

        if (num == 0) {
            res = 1;
        }

        for (int i = 1; i <= num; i++) {
            res *= i;
        }

        System.out.println("res = " + res);
    }
}