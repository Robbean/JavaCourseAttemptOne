import java.util.Scanner;

/**
 * @code Task4
 * Задача №4_Операторы
 * Написать программу, которая будет выполнять следующие действия:
 * 1)Ввести три числа с клавиатуры x, y, z
 * 2)Найти и вывести в консоль среднее арифметическое этих чисел.
 * 3)Разделить среднее арифметическое на 2 и округлить в меньшую сторону
 * 4)Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 * */
public class TaskWork4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три числа:");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        double avg = (x + y + z) / 3.0;
        System.out.println(avg);
        int k = (int) avg / 2;
        if (k>3) {
            System.out.println("Программа выполнена корректно");
        }
        System.out.println("\nп.1: ввели " + x + " " + y + " " + z + "; \nп.2: среднее арифметическое получилось " + avg + "; \nп.3: разделили среднее пополам и округлили до целых в меньшую сторону, получилось " + k);
    }
}
