package HomeWork9;

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

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arrMulti[i][j] = (int) Math.round((Math.random() * 50) + 0);
            }
        }



















scanner.close();
    }
}
