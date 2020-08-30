package HomeWork6;

import java.util.Arrays;

// 12. Создать массив целых чисел на 10 элементов.
// Запомнить его случайными числами в диапазоне от 0 до 10.
// Вывести массив на экран.
// Вывести сколько раз в массиве встречается число 5.
public class Ex12 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int first = 0;
        int second = 10;
        int n = second - first;
        int num = 0;
        int i = 0;

        for (i = 1; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * n) + first);
            if (arr[i] == 5) {
                num++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Число 5 повторяєтса:" + num +" - раз");
    }
}

