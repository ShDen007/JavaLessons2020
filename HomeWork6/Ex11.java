package HomeWork6;

import java.util.Arrays;

// 11.Создать массив целых чисел на 10 элементов.
// Запомнить его случайными числами в диапазоне от -20 до 10.
// Вывести массив на экран.
// Вывести количество положительных чисел в массиве и их индексы
// (аналогично предыдущему примеру).
public class Ex11 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int first = -20;
        int second = 10;
        int n = second - first;
        int positiveCount = 0;
        int indPositive = 0;
        int i = 0;

        for (i = 1; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * n) + first);
            if (arr[i] > 0) {
                positiveCount++;
                indPositive = i;
                System.out.println("Индексы чисел в массиве:" + indPositive);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Количество положительных чисел :" + positiveCount);
    }
}