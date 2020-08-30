package com.company.lesson2.HomeEx2;

import java.util.Scanner;
//Задание 3. Дан радиус окружности найти его диаметр.
public class HomeEx3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введіть радіус окружності: ");
        double r = in.nextDouble();

        double Diametr = 2 * r;
        System.out.println("Діаметр окружності : "+ Diametr+";");
     in.close();
    }
}
