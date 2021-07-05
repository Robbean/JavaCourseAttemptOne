import java.util.Scanner;

/**
 * @code FinalTask03
 *
 * Итоговая задача № 3
 * Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
 * Среди данных строк найти строку с максимальным количеством различных символов.
 * Если таких строк будет много, то вывести первую.
 *
 * Пример для теста работы программы:
 *     Количество строк: 3
 *     Строка 1: привет
 *     Строка 2: анализ
 *     Строка 3: 111111111111
 *     Ответ: привет
 * */
public class FinalTaskWork03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int a = in.nextInt();
        String resultWord="";
        int resultNumLetters=0;
        int counter=0;
        System.out.println("Введите строки:");
        String[] text = new String[a];
        for (int i=0; i<text.length; i++) {
            text[i]=in.next();
            for (int j=0; j<text[i].length();j++){
                if (j==text[i].indexOf(text[i].substring(j,j+1))){
                    counter++;
                }
            }
            if (counter>resultNumLetters){
                resultWord=text[i];
                resultNumLetters=counter;
            }
            counter=0;
        }
        System.out.println("Ответ:  " + resultWord + "\nКоличество различных символов: " + resultNumLetters);
    }
}
