package HomeWork3.HomeEx5;

import java.util.Scanner;

// 5.Сгенерируйте число от 0 до 100.
// Пользователь должен угадать полученное число за 7 попыток.
// После каждой попытки выводим сообщение «Мало» или «Много» (подсказка для пользователя).
// Если после семи попыток пользователь не смог угадать число,
// сообщите ему о проигрыше и какое число было загадано.
public class Ex5 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100) ;
        //System.out.println((int)number);

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello.You have 7 attempts to guess the number");

        for(int i = 0;i < 7; i++) {
            System.out.println("Please enter you number");
            int num = scan.nextInt();

            if (number < num) {
                System.out.println("No. Your number too large. Try again");
            }
            if (number > num) {
                System.out.println("No . You number too small. Try again");
            }
            if (number == num) {
                System.out.println("It's cool.You guessed." );
        break;
            }
        }
            System.out.println("You did not guess the number");
            System.out.println((int) number);
scan.close();
    }
}
