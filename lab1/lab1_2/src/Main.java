//2. Программа, в которой все переданные во входную строку аргументы выводятся
//на экран в обратной порядке. Например, если было передано 2 аргумента – make install, то
//на экран должно вывестись llatsni ekam. Примечание*: для разбора слова по буквам
//необходимо использовать функцию charAt(). Например, str.charAt(i) вернет символ с
//позиции i в слове, записанном в строковую переменную str. Команда str.length() возвращает
//длину слова str.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}