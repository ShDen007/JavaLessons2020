package HomeWork4;

import java.util.Scanner;

// 10. Вывести на экран ряд чисел Фибоначчи,
// состоящий из n элементов.
// Числа Фибоначчи – это элементы числовой последовательности
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144…
public class Ex10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci");
        int n = scan.nextInt();

        int n0 = 1;
        int n1 = 1;
        int n2;

        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= n; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();
    }

}


