package HomeWork6;

import java.util.Arrays;

// 9.Создать массив целых чисел на 10 элементов.
// Запомнить его случайными числами в диапазоне от -10 до 10.
// Вывести массив на экран.
// Найти наименьшее значение и его индекс.
public class Ex9 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int first = -10;
        int second = 10;
        int n = second - first;
        int min = arr[0];
        int ind = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * n) + first);
            if (arr[i] < min) {
                min = arr[i];
            }
            if (min == arr[i]) {
                ind = arr[i];
                ind = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Min number:" + min);
        System.out.println("index min number:" + ind);
    }
}