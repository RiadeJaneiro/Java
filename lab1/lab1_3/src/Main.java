//3. Создайте программу, вычисляющую числа Фибоначчи. Числа Фибоначчи –
//последовательность чисел, в котором каждое следующее число равно сумме двух
//предыдущих. Начало этой последовательности – числа 1, 1, 2, 3, 5, 8, 13…

public class Main {
    public static void main(String[] args) {
        int fib1 = 1;
        int fib2 = 1;
        int fibSum = 0;

        System.out.print(fib1 + ", " + fib2 + ", ");
        for (int i = 0; i <= 4; i++) {
            fibSum = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibSum;
            System.out.print(fib2 + ", ");
        }
        System.out.println("...");
    }
}