package HomeWork6;

import java.util.Arrays;

// 6.Создать массив целых чисел на 10 элементов.
// Заполнить его случайными числами в диапазоне от 0 до 10.
// Вывести массив на экран.
// Найти наибольшее значение и его индекс.
public class Ex6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int first = 0;
        int second = 10;
        int n = second - first;
        int max = 0;
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * n) + first);
            if(arr[i] > max){
                max = arr[i];
            }
            if(max == arr[i]){
                ind = arr[i];
                ind = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max number:" +max);
        System.out.println("index max number:" +ind);
    }
}









