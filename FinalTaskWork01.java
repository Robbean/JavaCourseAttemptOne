import java.util.Scanner;

/**
 * @code FinalTask01
 *
 * Итоговая задача №1
 * Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
 * Пользователь вводит текущий курс и количество рублей.
 * Итоговое значение должно быть округлено до двух знаков после запятой.
 * Пример для теста работы программы:
 *
 *     Курс доллара: 67,55
 *     Количество рублей: 1000
 *     Итого: 14,80 долларов
 * */
public class FinalTaskWork01 {
    public static void main(String[] args) {
        System.out.println("Калькулятор валют");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите курс доллара:");
        double a = in.nextDouble();
        System.out.println("Введите количество рублей:");
        int b = in.nextInt();
        System.out.printf("Количество долларов: %.2f",b/a);
    }
}
