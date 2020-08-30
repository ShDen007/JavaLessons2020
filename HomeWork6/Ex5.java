package HomeWork6;

import java.util.Arrays;

// 5.Дан массив:
//       a.	Все его элементы увеличить в два раза.
//       b.	Умножить все элементы на последний элемент.
public class Ex5 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int first  = 10;
        int second = 50;
        int  n = second - first;
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) Math.round((Math.random() * n) + first);
        }
        System.out.println(Arrays.toString(arr));
        for(int j = 0; j < 10;j ++) {   // a.Все его элементы увеличить в два раза.
            arr[j] *= 2;
        }
        System.out.println("a."+Arrays.toString(arr));
        for(int j = 0; j < 10;j ++) {   // b.Умножить все элементы на последний элемент.
            arr[j] *= arr[9];
        }
        System.out.println("b."+Arrays.toString(arr));

    }
}
