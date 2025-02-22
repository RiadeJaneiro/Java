//Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале
//значений от -n до n с помощью датчика случайных чисел.
//3. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих
//подряд.
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter size (n) of the matrix a [n] [n]: ");
        int n = scanner.nextInt();

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextInt(-n, n);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            int countIncrease = 1, countDecrease = 1;
            int maxIncrease = 1, maxDecrease = 1;

            for (int j = 1; j < n; j++) {
                if (a[i][j] > a[i][j-1]) {
                    countIncrease++;
                    maxIncrease = Math.max(maxIncrease, countIncrease);
                } else {
                    countIncrease = 1;
                }

                if (a[i][j] < a[i][j-1]) {
                    countDecrease++;
                    maxDecrease = Math.max(maxDecrease, countDecrease);
                } else {
                    countDecrease = 1;
                }
            }
            System.out.println("Row " + (i+1) + ": max increasing = " + maxIncrease +
                    ", max decreasing =  " + maxDecrease);
        }
    }
}