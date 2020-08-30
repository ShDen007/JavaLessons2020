package HomeWork5;

import java.util.Scanner;

// 4.Напечатать таблицу умножения на число n
// (значение n вводится с клавиатуры 1 <= n <= 9)
public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number n");
        int n = scanner.nextInt();

        if( 1 <= n && n <= 9){
        int a = 0;
            while(a < 10 ){
                a++;
                int mult = n * a;
                System.out.println(a +" x "+ n + " = "+mult);
            }
        }
        if (n > 9){
        System.out.println("enter a number of no more than 9");
        }
        scanner.close();
    }
}
