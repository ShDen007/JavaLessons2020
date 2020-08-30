package HomeWork3.HomeEx1;

import java.util.Scanner;

//1.Запрашиваем число у юзера.
//Проверяем является ли целое число записанное в переменную number четным или нечетным.
// Выводим информацию в консоль.
public class Ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int number = scanner.nextInt();
        if (number % 2 == 0){
            System.out.println("This number is even");
        }
        if (number % 2 != 0){
            System.out.println("This number is odd");
        }
scanner.close();
    }








}
