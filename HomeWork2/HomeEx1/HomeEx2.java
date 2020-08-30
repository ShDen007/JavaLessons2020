package com.company.lesson2.HomeEx1;

import java.util.Scanner;
//1. Создайте объект типа Scanner (не забываем закрывать в конце приложения).
//2. Запросите у юзера данные: Ф.И.О одной строкой и возраст.
//3. Выведите на экран введённые юзером данные.
public class HomeEx2 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Прізвище, імя по батькові та ваш вік:");
        String s = scanner.nextLine();
        if (s.isEmpty()) {
            System.out.println("String is empty!!!please try again");
        }
        String s1 = scanner.nextLine();
        System.out.println("Прізвище імя та по батькові - вік : "+s);
      scanner.close();
    }



}

