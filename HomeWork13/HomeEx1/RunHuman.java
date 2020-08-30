package com.company.lesson13.HomeEx1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RunHuman {
    public static void main(String[] args) {
        Human human = new Human();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть назву міста");
        human.setCity(scan.nextLine());
        System.out.println(human.getCity());

        System.out.println("Введіть назву країни");
        human.setCountry(scan.nextLine());
        System.out.println(human.getCountry());

        System.out.println("Введіть номер телефону");
        human.setPhone(scan.nextInt());
        System.out.println(human.getPhone());

        System.out.println(human.fullName);
        System.out.println(human.dateOfBirth);
        System.out.println(human.address);





    }


}
