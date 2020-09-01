package HomeWork11;

import java.util.Scanner;
import java.lang.Math;

//Необходимо написать программу, которая бы вычисляла сумму цифр в числе.
// Затем в получившемся числе опять вычисляла сумму цифр.
// Эти действия необходимо выполнять до тех пор, пока не останется число, состоящее из одной цифры.
// Например, если ввести число 555, то, посчитав сумму цифр в нем, получим 5+5+5=15.
// Так как получившееся число 15 состоит не из одной цифры,
// то необходимо посчитать сумму цифр в нем, т.е. 1+5=6.
// Теперь было получено число 6, состоящее из одной цифры, значит 6 - это и есть ответ.
public class Ex2 {
    static  int num = 0;
    static  int cache = 0;
    static  int iter = 0;

    public static int scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Is not number.Try again");
            while (true) {
                scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    num = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Is not number.Try again");
                }
            }
        }
        scanner.close();
        return num;
    }

    public static int numSeparation( int num){
        if (num % 10 == num){
          return  cache = num + cache;
        }
        if (num % 10 != 0 || num >= 10){
            cache = (int) (num % 10 + cache);
            num = (int) (num / 10);
        }
        return numSeparation(num);
        }

    public static int summa(int num) {
        int myCache = 0;
        if (Math.abs(num) < 10) {
            System.out.println("Sum:" + num);
            return num;
        }
        if (Math.abs(num) >= 10) {
            numSeparation(num);
        }
        System.out.println("number iteration: " + (++iter) + " = " + num);
        myCache = cache;
        cache = 0;
        return summa(myCache);
    }

    public static void main(String[] args) {
        scan();
        summa(num);
    }
}
