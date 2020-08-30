package HomeWork5;

import java.time.Year;
import java.util.Scanner;

// 1.Написать программу, которая запрашивает у пользователя номер билетика (шестизначное число).
// Определить является ли билет счастливым (сумма первых трёх чисел, должна быть равна последним трём).
// Если билетик счастливый вывести на экран сообщение: «Везунчик! Твой билетик счастливый ».
// В противном случае: «Увы! Ваш билет не счастливый ».

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ticket number.Number must be 6 digits");

        int sum = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            int number1 = sum / 100000;
            int number2 = (sum / 10000) % 10;
            int number3 = (sum / 1000) % 10 % 10;
            int number4 = (sum / 100) % 10 % 10 % 10;
            int number5 = (sum / 10) % 10 % 10 % 10 % 10;
            int number6 = sum % 10 % 10 % 10 % 10;

            if (number1 + number2 + number3 == number4 + number5 + number6)
            {

                System.out.println("«Везунчик! Твой билетик счастливый \uF04A»");
            } else {
                System.out.println("«Увы! Ваш билет не счастливый \uF04C»");
            }
            break;

        }

  scanner.close();
    }

}


