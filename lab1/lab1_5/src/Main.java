//5. Индивидуальные задания
//3. Ввести с консоли 3 целых числа. На консоль вывести: Числа, которые делятся на
//3 или на 9.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter three integer numbers: ");
        for (int i = 0; i < 3; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (nums[i] % 3 == 0) {
                System.out.println(nums[i]);
            }
        }
    }
}