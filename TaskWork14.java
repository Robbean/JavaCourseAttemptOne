import java.util.Random;

/**
 * @code Task14
 *
 * Задача №14_ Работа с данными
 * Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20.
 * Далее:
 * 1) Выведите максимальный и минимальный элемент массива.
 * 2) Из максимального и минимального значения выведите наибольшее по модулю..
 * */
public class TaskWork14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        int minElementIndex=0;
        int maxElementIndex=0;
        for (int i=0; i<15; i++){
            int k= random.nextInt();
            int koef = k/Math.abs(k);
            array[i]=koef*random.nextInt(21);
            System.out.print(array[i] + " ");
            if (array[i]>array[maxElementIndex]){
                maxElementIndex = i;
            }
            else if (array[i]<array[minElementIndex]){
                minElementIndex = i;
            }
        }
        System.out.println("\n");
        System.out.println("Наибольший элемент массива: " + array[maxElementIndex]);
        System.out.println("Наименьший элемент массива: " + array[minElementIndex]);
        int absMaxVal = (Math.abs(array[maxElementIndex]) > Math.abs(array[minElementIndex])) ? (array[maxElementIndex]) : (array[minElementIndex]);
        System.out.print("По модулю больше: " + absMaxVal);
    }
}
