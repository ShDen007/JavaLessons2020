package HomeWork6;

import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

// 4.Создать массив целых чисел на 10 элементов.
// Запомнить его случайными числами в диапазоне от 10 до 50.
// Вывести его значения на экран.
public class Ex4 {
    public static void main(String[] args) {
           int [] arr = new int[10];
           int first  = 10;
           int second = 50;
           int  n = second - first;
            for (int i = 0; i < arr.length ; i++) {
                arr[i] = (int) Math.round((Math.random() * n) + first );
           }
        System.out.println(Arrays.toString(arr));
    }

}
