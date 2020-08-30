package HomeWork6;

import java.util.Arrays;

// 7.Создать массив целых чисел на 10 элементов.
// Запомнить его случайными числами в диапазоне от 0 до 10.
// Вывести на экран массив в обратном порядке.
public class Ex7 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int first = 0;
        int second = 10;
        int n = second - first;
        String reverse = null;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * n) + first);
           String str = Arrays.toString(arr);
           reverse = new StringBuffer(str).reverse().toString();

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(reverse);
    }
}