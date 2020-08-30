package HomeWork9;

import java.util.Scanner;

//Задние3.Заполните n мерный квадратный массив числами, которые увеличиваются на 1 по
// * спирали (число n должно задаваться с клавиатуры). Выведите результат на экран
// * с соблюдением ширины столбцов. Выполнить задачу с использованием только одного цикла.
// * Для примера массив 4 на 4 должен выглядеть как
// * указано ниже.
// *
// *   1  2  3  4
// *  12 13 14  5
// *  11 16 15  6
// *  10  9  8  7
public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number n (row array)");
        int n = scanner.nextInt();
        System.out.println("Enter number nm (column array)");
        int m = scanner.nextInt();
        int iter = 1;
        int a = 1;
        int b = 1;

        int[][] array = new int[m][n];

            for (int i = 0; i < n; i++) {
                array[0][i] = iter;
                iter++;
            }
            for (int j = 1; j < m; j++) {
                array[j][n - 1] = iter;
                iter++;
            }
            for (int i = n - 2; i >= 0; i--) {
                array[m - 1][i] = iter;
                iter++;
            }
            for (int j = m - 2; j > 0; j--) {
                array[j][0] = iter;
                iter++;
            }
            while (iter < m * n) {

                while (array[a][b + 1] == 0) {
                    array[a][b] = iter;
                    iter++;
                    b++;
                }

                while (array[a + 1][b] == 0) {
                    array[a][b] = iter;
                    iter++;
                    a++;
                }

                while (array[a][b - 1] == 0) {
                    array[a][b] = iter;
                    iter++;
                    b--;
                }

                while (array[a - 1][b] == 0) {
                    array[a][b] = iter;
                    iter++;
                    a--;
                }
            }

            for (int j = 0; j < m; j++) {
                for (int i = 0; i < n; i++) {
                    if (array[j][i] == 0) {
                        array[j][i] = iter;
                    }
                }
            }

            for (int j = 0; j < m; j++) {
                for (int i = 0; i < n; i++) {
                    if (array[j][i] < 10) {
                        System.out.print(array[j][i] + ",   ");
                    } else {
                        System.out.print(array[j][i] + ",  ");
                    }
                }
                System.out.println("");
            }
    scanner.close();
    }
}











