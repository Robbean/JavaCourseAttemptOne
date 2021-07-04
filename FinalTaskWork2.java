import java.util.Scanner;

/**
 * @code FinalTask02
 *
 * Итоговая задача №2
 * Напишите программу, которая позволит решить простое уравнение относительно x.
 * Программа принимает на вход строку длиной 5 символов.
 * Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
 * Первым, третьим и пятым символом являются две цифры (от 0 до 9) и
 * буква ‘x’ (обозначает неизвестное) в любом порядке. Нужно найти неизвестное.
 * Пример для теста работы программы:
 *     Ввод: x+5=7
 *     Вывод: 2
 *     Ввод: 3-x=9
 *     Вывод: -6
 *     Ввод: 3-3=x
 *     Вывод: 0
 *
 *
 *     Не заметил, что 5 символов, решил в более общем виде.
 * */
public class FinalTaskWork2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение:");
        String str = in.next();
        int result;
        int nIndex = str.indexOf("x");
        int eqIndex = str.indexOf("=");
        int actIndex = str.replace("-","+").indexOf("+");
        System.out.print("Корень уравнения равен: ");
        if ((nIndex == 0) && (str.substring(actIndex,actIndex+1).equals("+"))) {
            result = Integer.parseInt(str.substring(eqIndex+1)) - Integer.parseInt(str.substring(actIndex+1,eqIndex));
            System.out.println(result);
        }
        else if ((nIndex == 0) && (str.substring(actIndex,actIndex+1).equals("-"))) {
            result = Integer.parseInt(str.substring(eqIndex+1)) + Integer.parseInt(str.substring(actIndex+1,eqIndex));
            System.out.println(result);
        }
        else if ((nIndex == eqIndex+1) && (str.substring(actIndex,actIndex+1).equals("+"))) {
            result = Integer.parseInt(str.substring(0,actIndex)) + Integer.parseInt(str.substring(actIndex+1,eqIndex));
            System.out.println(result);
        }
        else if ((nIndex == eqIndex+1) && (str.substring(actIndex,actIndex+1).equals("-"))) {
            result = Integer.parseInt(str.substring(0,actIndex)) - Integer.parseInt(str.substring(actIndex+1,eqIndex));
            System.out.println(result);
        }
        else if ((nIndex == actIndex+1) && (str.substring(actIndex,actIndex+1).equals("+"))) {
            result = Integer.parseInt(str.substring(eqIndex+1)) - Integer.parseInt(str.substring(0,actIndex));
            System.out.println(result);
        }
        else if ((nIndex == actIndex+1) && (str.substring(actIndex,actIndex+1).equals("-"))) {
            result = Integer.parseInt(str.substring(0,actIndex)) - Integer.parseInt(str.substring(eqIndex+1));
            System.out.println(result);
        }
        else {
            System.out.println("Значит что-то не то");
        }
    }
}
