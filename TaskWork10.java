import java.util.Scanner;

/**
 * @code Task10
 *
 * Задача №10_Циклы
 * Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
 * а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
 * Размерность матрицы задается пользователем.
 * */
public class TaskWork10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы:");
        int a = in.nextInt();
        System.out.println("Введите количество столбцов матрицы:");
        int b = in.nextInt();
        double mas[][] = new double[a][b];
        System.out.println("Введите элементы матрицы:");
        int i;
        int j;
        for (i=0; i<a; i++){
            for (j=0; j<b; j++){
                mas[i][j]= in.nextDouble();
            }
        }
        for (j=0; j<b; j++) {
            System.out.print(3 * mas[0][j] + " ");
        }
    }
}
