package HomeWork6;

import java.util.Arrays;

// 13. Создать массив на 10 элементов. Заполнить его случайными числами в диапазоне от 0 до 20.
// Создать копию первого массива.
// Вывести оба массива на экран. Увеличить все элементы второго массива в 2 раза.
// Вывести оба массива на экран.
// (Ожидаемый результат: только элементы второго массива должны быть изменены)
public class Ex13 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int first  = 0;
        int second = 20;
        int  n = second - first;
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) Math.round((Math.random() * n) + first);
        }
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[10];
        int length = 10;
        int arrIndex = 0;
        int arr2Index = 0;
        System.arraycopy(arr,arrIndex,arr2,arr2Index,length);
        for(int j = 0; j < 10;j ++) {
            arr2[j] *= 2;
        }
        System.out.println(Arrays.toString(arr2));
    }
}

