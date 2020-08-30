package com.company.lesson2.HomeEx1;

import java.util.Scanner;

public class HomeEx6 {
    //Записать следующие выражения (используя Java  операторы и класс Math).
    // Значение переменных a, b, c запросить у юзера.
    // рівняння З)
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            {System.out.println("Приступим до математики  :))");
                System.out.println("Введіть дані для змінної a");
                int a = scanner.nextInt();
                System.out.println("Введіть дані для змінної b");
                int b = scanner.nextInt();


                int j = 2/(2+a+b);

                System.out.println("Розвязання рівняння З) "+(double)j+";");
           }
scanner.close();
     }
}


