package HomeWork11;

import java.util.Scanner;

// Разложение на множители с помощью рекурсии.
// Разложить целое число n > 1 на простые множители.
// Вывести в консоль через пробел все множители в порядке возрастания.
// Написать рекурсивный метод для вычисления простых множителей.
//   Пример:           132
//   Вывод на консоль: 2 2 3 11
public class Ex1 {
   static int num = 0;
   static int multi = 2;

    public static int scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Is not number.Try again");
            while (true) {
                scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    num = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Is not number.Try again");
                }
            }
        }
        scanner.close();
        return num;
    }

    public static int recursion(int num) {
        if (num == 1) {
            return 1;
        }
        if ((double) num / multi % 1 == 0) {
            num = num / (multi);
            System.out.print(multi+ "  ");
        } else {
            multi++;
        }

        return recursion(num);
    }
    public static void main(String[] args){
        scan();
        recursion(num);
    }

}


