import java.util.Scanner;

/**
 * @code Task6
 * Задача №6_ Операторы
 *
 * Напишите программу конвертер физических величин:
 *
 * 1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
 * > Выберите что переводить: 1 - масса, 2 - расстояние
 * > 2
 *
 * 2. Пользователю предлагается выбрать единицу измерения. Пример:
 * > Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
 * > 1
 *
 * 3. Пользователю предлагается ввести количество выбранных единиц:
 * > Введите число
 * > 10
 * > Результат:
 * > Метры: 10
 * > Мили: 0.006
 * > Ярды: 10.94
 * > Футы: 32.81
 * */
public class TaskWork6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] mas ={{"масса","тонны", "центнеры", "килограммы", "граммы"},{"расстояние","метры", "мили", "ярды", "футы"}};
        Double[][] calc={{0.,0.001,0.01,1.,1000.},{1.,1.,0.0006,1.094,3.281}};
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int what = in.nextInt()-1;
        System.out.printf("Выберите единицу измерения: 1 - %S, 2 - %S, 3 - %S, 4 - %S\n", mas[what][1], mas[what][2], mas[what][3], mas[what][4]);
        int measure = in.nextInt();
        System.out.println("Введите число:");
        int val = in.nextInt();
        System.out.println("Результат:\n" + mas[what][1] + ": " + calc[what][1]/calc[what][measure]*val + "\n" + mas[what][2] + ": " + calc[what][2]/calc[what][measure]*val + "\n" + mas[what][3] + ": " + calc[what][3]/calc[what][measure]*val+ "\n" + mas[what][4] + ": " + calc[what][4]/calc[what][measure]*val);
    }
}
