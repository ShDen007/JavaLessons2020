package com.company.lesson2.HomeEx2;
import java.util.Scanner;

//Задание 4. Дано двухзначное число. Найти:
//А) число десятков в нем;
//Б) число единиц в нём;
//В) сумму его цифр;
//Г) произведение его цифр.
public class HomeEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть довільне двоцифрове число");
        int Digite = input.nextInt();

        while (Digite < 10 || Digite > 99) {
            System.out.println("Ви ввели не допустиме число.Спробуйте ще раз");
            Digite = Math.abs(input.nextInt());
        }
            System.out.println("Oк. Введено число - " + Digite + ";");

        int a = Digite / 10;
        System.out.println("Кількість десятків у введеному числі - " + a +";");

        int b = Digite-10*a;
        System.out.println("Кількість одиниць у введеному числі - " + b +";");

        int c = a+b;
        System.out.println("Сума цифр у введеному числі - " + c +";");

        int d = a*b;
        System.out.println("Утворююча введеного числа - " + d +";");
      input.close();
    }

}


