import java.util.Scanner;

/**
 * @code Task13
 *
 * Задача №13_ Работа с данными
 * Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
 * Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
 * 1) Выведите слова, состоящие только из латиницы.
 * 2) Выведите количество этих слов.
 * */
public class TaskWork13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        String [] words = str.split(" ");
        int counter =0;
        System.out.println("Определяем, какие слова состоят только из латиницы.");
        for (String word : words){
            if (word.matches("^[a-zA-Z]+$")) {
                System.out.println("Подходит " + word);
                counter++;
            }
        }
        System.out.println("Количество слов, состоящих только из латииницы: " + counter);
    }
}
