package HomeWork4;

import java.util.Scanner;
import java.util.InputMismatchException;


// 6.Напечатать таблицу перевода 1, 2 ... 20 долларов США в гривны по текущему курсу
// (значение курса вводится с клавиатуры).
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the dollar exchange rate");
        double uah = scanner.nextDouble();
        int part = 20;
        for (int i = 1; i < part + 1; ++i) {
            double how = uah * i;
            System.out.print(i + " USD" + " - " + how + "UAH");
            System.out.println(" ");
        }

scanner.close();
    }



}
