package HomeWork6;

import java.util.Arrays;

// 8.Создать массив целых чисел на 10 элементов.
// Запомнить его случайными числами в диапазоне от 10 до 100.
// Вывести массив на экран.
// Вывести сумму всех элементов массива.
public class Ex8 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int first = 0;
        int second = 100;
        int n = second - first;
        int sum = 0;
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * n) + first);
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сума всіх чисел масива = "+sum);
    }

}
