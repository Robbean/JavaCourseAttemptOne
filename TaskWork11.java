import java.util.Scanner;

/**
 * @code Task11
 *
 * Задача №11_Работа с данными
 * Напишите программу:
 * 1) Ввести первое число с клавиатуры и записать его в строковую переменную.
 * 2) Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
 * 3) Сравнить 2 числа и вывести большее на экран .
 * 4) Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
 * */
public class TaskWork11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String a = in.next();
        System.out.println("Введите второе число:");
        int b = in.nextInt();
        if (Integer.parseInt(a) > b) {
            System.out.println(a);
            System.out.println((double) b);
        }
        else {
            System.out.println(b);
            System.out.println(Double.parseDouble(a));
        }
    }
}
