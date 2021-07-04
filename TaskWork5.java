import java.util.Scanner;

/**
 * @code Task5
 * Задача №5_ Операторы
 * Напишите простой калькулятор:
 * 1) Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
 * 2) В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
 * */
public class TaskWork5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа:");
        double result;
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println("Введите знак арифметического действия: +, -, * или /");
        char z = in.next().charAt(0);

        if (z == '+') {
            result = x + y;
            System.out.println("Получилось " + result);
        }
        else if (z == '-') {
            result = x - y;
            System.out.println("Получилось " + result);
        }
        else if (z == '*') {
            result = x * y;
            System.out.println("Получилось " + result);
        }
        else if (z == '/') {
            result = x / y;
            System.out.println("Получилось " + result);
        }
        else {
            System.out.println("Что-то пошло не так...");
        }
    }
}
