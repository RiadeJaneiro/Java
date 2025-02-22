//1. Программа, в которой перебираются числа от 1 до 500 и выводятся на экран. Если
//число делится на 5, то вместо него выводится слово fizz, если на 7, то buzz. Если число
//делится на 5 и на 7, то выводить слово fizzbuzz. Примечание*: остаток от деления в Java
//обозначается через символ %.

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0 & i % 7 == 0) {
                System.out.println("fizzbuzz");
                continue;
            }
            else if (i % 5 == 0) {
                System.out.println("fizz");
                continue;
            }
            else if (i % 7 == 0) {
                System.out.println("buzz");
                continue;
            }

            System.out.println(i);
        }
    }
}