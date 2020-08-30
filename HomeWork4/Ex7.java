package HomeWork4;

import java.util.Scanner;

// 7.Найти:
//     a.	Сумму всех чисел от 100 до 500;
//     b.	Сумму всех целых чисел от a до 500 (значение a вводится с клавиатуры a <= 500);
//     c.	Сумму всех четных чисел от a до b (значение a и b вводится с клавиатуры b >= a);
//     d.	Среднее арифметическое всех целых чисел от a до b (значение a и b вводится с клавиатуры b >= 100);
public class Ex7 {
    public static void main(String[] args) {
        int x = 100;
        int y = 500;
        int middle = y - x;
        int sum = middle * (x + 1) / 2;
            System.out.println("a."+sum);

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter numer - a");
        int a = scanner.nextInt();
        while(a > 500){
            System.out.println("please enter number <= 500");
            int a1 = scanner.nextInt();
            break;
        }

        int c = 500;
        int num = c - a;
        int sumb = num * (a + 1) / 2;
        System.out.println("b."+sumb);

        System.out.println("enter numer - b");
        int b = scanner.nextInt();
        while(a >= b && b >= 100){
            System.out.println("please enter number b >= a and b >= 100");
            int b1 = scanner.nextInt();
            break;
        }

        int num1 = b - a;
        int sum1 = num1 * (a + 1) / 2;
        System.out.println("c."+sumb);

        int num2 = b - a;
        int sum2 = num2 * (a + 1) / 2;
        int middleArith = sum2 / num2;
        System.out.println("d."+middleArith);
scanner.close();
    }
}
