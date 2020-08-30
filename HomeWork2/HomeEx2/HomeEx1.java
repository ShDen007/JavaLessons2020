package com.company.lesson2.HomeEx2;
import java.util.Scanner;

//Задание 1. Значение x и a запрашиваем у юзера при помощи сканера.
public class HomeEx1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
            System.out.println("Введіть довільне значення для змінної - x: ");
            int x = in.nextInt();
            System.out.println("Введіть довільне значення для змінної - a: ");
            int a = in.nextInt();
            double y = 7 * Math.pow(x, 2) - 3 * x + 6;
            System.out.println("Розвязання рівняння а) " + y);
            double x1 = 12 * Math.pow(a, 2) + 7 * a - 16;
            System.out.println("Розвязання рівняння б) " + x1);
            in.close();
    }

}
