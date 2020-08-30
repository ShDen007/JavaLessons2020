package HomeWork9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Здание1. Заполните двухмерный массив размерностью NxM случайными числами и построчно перенесите эти
//числа в одномерный массив. Вывести исходный массив и полученный масcивы.
public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number rows");
        int row = scanner.nextInt();
        System.out.println("Input number columns");
        int column = scanner.nextInt();
        System.out.println("Multi Array");


        int[][] arrMulti = new int[row][column];
        int iter = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arrMulti[i][j] = (int) Math.round((Math.random() * 50) + 0);
            }
        }
        for (int[] anArrMulti : arrMulti) {
            for (int anAnArrMulti : anArrMulti) {

            }System.out.print(Arrays.toString(anArrMulti) + " ");
            System.out.println();
        }
         int []arr = new int[row*column];

         for(int i = 0; i < row; i++){
             for(int j = 0; j < column;j++ ){
               arr[iter] = arrMulti[i][j];
               iter++;
             }
         }
        System.out.println("one - dimensional array");
         for(int c : arr){
             System.out.print(
                     c + " ");
        }
         scanner.close();
    }
}
