import java.util.Scanner;

/**
 * @code Task9
 * Задача №9_ Циклы
 *
 * Напишите программу:
 * 1) Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
 * 2) Посчитайте среднее арифметическое элементов массива.
 * 3) После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
 * */
public class TaskWork9 {
    public static void main(String[] args) {
        double sum = 0.;
        int i = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int len = in.nextInt();
        double[] mas = new double[len];
        System.out.println("Введите элементы массива");
        while (i < len) {
            mas[i] = in.nextFloat();
            sum += mas[i];
            i++;
            //System.out.println("пока avg равно" + sum/i);
        }
        double avg = sum / len;
        System.out.println("Среднее арифметическое равно" + avg);
        for (double f : mas) {
            System.out.print(f * avg + " ");
        }
    }
}
