package HomeWork6;

import java.util.Arrays;

// 10. Создать массив целых чисел на 10 элементов.
// Запомнить его случайными числами в диапазоне от -10 до 10.
// Вывести массив на экран.
// Вывести количество отрицательных чисел в массиве и их индексы.
// Например:
//           Количество отрицательных чисел: 5
//	         Индексы чисел в массиве: 3, 6, 9.
public class Ex10 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int first = -10;
        int second = 10;
        int n = second - first;
        int negativeCount = 0;
        int indNegat = 0;
        int i = 0;

        for (i = 1; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * n) + first);
            if (arr[i] < 0) {
                negativeCount++;
                indNegat = i;
                String str = new String();
                System.out.println("Индексы чисел в массиве:" + indNegat);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Количество отрицательных чисел:" + negativeCount);


    }
}