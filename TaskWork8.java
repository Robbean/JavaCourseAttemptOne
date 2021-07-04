import java.util.Scanner;

/**
 * @code Task8
 * Задача №8_ Циклы
 *
 * Напишите программу, где пользователь вводит любое целое положительное число n.
 * А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
 * */
public class TaskWork8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        int a = in.nextInt();
        int counter = 1;
        int sum =0;
        do {
            sum += counter;
            counter+=2;
        }
        while (counter < a+1);
        System.out.println("Сумма нечётных натуральных чисел, не превышающих Ваше число, равна " + sum);
    }
}
