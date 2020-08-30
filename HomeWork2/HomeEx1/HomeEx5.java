package com.company.lesson2.HomeEx1;
import java.util.Scanner;

//Записать следующие выражения (используя Java  операторы и класс Math).
// Значение переменных a, b, c запросить у юзера.
// рівняння Ж)
public class HomeEx5 {
    int a;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {System.out.println("Приступим до математики  :))");
            System.out.println("Введіть дані для змінної a");
            int a = scanner.nextInt();
            System.out.println("Введіть дані для змінної b");
            int b = scanner.nextInt();
            System.out.println("Введіть дані для змінної c");
            int c = scanner.nextInt();

            int j = -b+(1/a)/(a/c);

            System.out.println("Розвязання рівняння ж) "+(double)j+";");
        }
        scanner.close();
    }
}