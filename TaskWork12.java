/**
 * @code Task12
 *
 * Задача №12_Работа с данными
 * Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
 *     1) Проверить, содержит ли строка подстроку “Java” (используйте contains()).
 *     2) Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
 *     3) Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
 *     4) Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
 *     5) Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).
 * */
public class TaskWork12 {
    public static void main(String[] args) {
        String str ="I like Java!!!";
        boolean a = str.contains("Java");
        boolean b = str.startsWith("I like");
        boolean c = str.endsWith("!!!");
        if ( a && b && c){
            System.out.println(str.toUpperCase());
        }
        String d = str.substring(str.indexOf("J"),str.indexOf("J")+4).replace("a","o");
        System.out.println(d);
    }
}
