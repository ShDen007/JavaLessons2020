package com.company.lesson2.HomeEx2;

import java.util.Scanner;
//Задание 2. Дана сторона квадрата. Найти его периметр.
public class HomeEx2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть довжину сторони квадрата для розрахунку периметра");
        int a = in.nextInt();

        int square = 4*a;

        System.out.println("Периметр квадрата: "+square+"cm");
        System.out.println("Good-bye");
     in.close();
    }
}
