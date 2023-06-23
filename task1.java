import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {

        // Создаем рандомный массив с 10 значениями от 0 до 100

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList());
        Random number = new Random();
        for (int i = 0; i < 10; i++) {
            int r = number.nextInt(0, 100);
            list.add(i, r);
        }
        System.out.println("У нас получился следующий массив - " + list);

        // Удаляем из массива все четные числа

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println("После удаления всех четных чисел мы получили массив - " + list);

        // Находим минимальное значение

        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Минимальное значение из полученного массива - [" + min + "]");

        // Находим максимальное значение

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }            
        }
        System.out.println("Максимальное значение из полученного массива - [" + max + "]");

        //Находим среднее арифм.значение

        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        result /= list.size();
        System.out.println("Среднее арифмитическое значение - ["+ result + "]");
    }
}