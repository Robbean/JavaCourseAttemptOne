import java.util.Scanner;

/**
 * @code Task7
 * Задача №7_ Циклы
 *
 * Напишите программу:
 *
 *     Пользователь вводит размер массива и данные с клавиатуры в массив
 *
 *     Сравнить элементы массива с заранее заданными константами x, y, z.
 *
 *     Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
 * */
public class TaskWork7 {
    public static void main(String[] args) {
        final int x = 15;
        final int y = 25;
        final int z = 30;
        int i = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int len = in.nextInt();
        int[] mas = new int[len];
        System.out.println("Введите элементы массива");
        while (i<len) {
            mas[i] = in.nextInt();
            i++;
        }
        int j =0;
        while (j<len) {
            if ((mas[j]==x) ||(mas[j]==y)||(mas[j]==z)){
                System.out.println(mas[j] + " - Данное значение имеется в константах");
            }
            j++;
        }
    }
}
