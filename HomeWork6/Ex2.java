package HomeWork6;

import java.lang.reflect.Array;
import java.util.Arrays;

// 2.Создать массив целых чисел на 20 элементов.
// Заполнить его значениями от 1 до 20 по возрастающей.
// Вывести его значения на экран.
public class Ex2 {
    public static void main(String[] args) {
        int [] mas1 = new int[20];
        int startIndex = 1;
        int endIndex = 20;
        for(int i = 0;i < endIndex; i++){
            mas1[i]=startIndex;
            startIndex++;
        }
        System.out.println(Arrays.toString(mas1));
    }
}
