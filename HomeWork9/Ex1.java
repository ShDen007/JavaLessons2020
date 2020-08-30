package HomeWork9;

import java.util.Arrays;
import java.util.Random;

//Здание1. Заполните двухмерный массив размерностью NxM случайными числами и построчно перенесите эти
//числа в одномерный массив. Вывести исходный массив и полученный масcивы.
public class Ex1 {
    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) Math.round((Math.random() * 50) + 0);
            }
        }
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
         int []arr1 = new int[16];



                System.out.print(anAnArr + " ");
            }System.out.print(Arrays.toString(anArr) + " ");
            System.out.println();
        }



    }

}
