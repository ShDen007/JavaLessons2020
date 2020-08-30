package HomeWork9;

import java.util.Arrays;
import java.util.Scanner;

//Задание2.Создать квадратный массив размерностью NxN заполненный случайными числами,
// вывести массив на экран в виде таблицы, найти наименьший и наибольший элемент
// массива и вывести их на экран (если найдено несколько одинаковых элементов —
// вывести через запятую индексы строки и столбца, где есть повторения). Вывести на экран
// время выполнения поиска, в миллисекундах. Размерность массива должна
// задаваться с клавиатуры.
public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number rows");
        int row = scanner.nextInt();
        System.out.println("Input number columns");
        int column = scanner.nextInt();

        int[][] arrMulti = new int[row][column];
        int iter = 0;
        int min = 0;
        int max = 0;
        int i = 0;
        int j = 0;

        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                arrMulti[i][j] = (int) Math.round((Math.random() * 50) + 0);
            }
        }
        for (int[] anArrMulti : arrMulti) {
            for (int anAnArrMulti : anArrMulti) {
            }
            System.out.print(Arrays.toString(anArrMulti) + " ");
            System.out.println();
        }
        double startTime = System.nanoTime();

        for(i = 0; i < row; i++){
            for(j = 0; j < column; j++){
                if (min > arrMulti[i][j]){
                    min = arrMulti[i][j];
                }
                if( max < arrMulti[i][j]){
                    max = arrMulti[i][j];
                }
            }
        }
        System.out.println("Min : " + min);
        System.out.println("Max : "+ max);
        for(i = 0; i < row; i++){
            for(j = 0; j < column; j++){
                if(min == arrMulti[i][j]){
                    arrMulti[0][iter] = i;
                    arrMulti[1][iter] = j;
                    iter++;
                }
            }
        }
        if(iter > 1){
            System.out.println("coincidence at min");
            for(i = 0; i < iter; i++){
                System.out.print(arrMulti[0][i]+ ", " + arrMulti[1][i]+ ", ");
            }
        }
        for(i = 0; i < row; i++){
            for(j = 0; j < column; j++){
                if(max == arrMulti[i][j]){
                    arrMulti[0][iter] = i;
                    arrMulti[1][iter] = j;
                    iter++;
                }
            }
        }
        if(iter > 1) {
            System.out.println("coincidence at max");
            for (i = 0; i < iter; i++) {
                System.out.print(arrMulti[0][i] + ", " + arrMulti[1][i] + ", ");

            }
        }
        System.out.println();
        double stop = System.nanoTime();
        double time = stop - startTime;
        System.out.println("Time searching : "+time);

scanner.close();
    }

}
