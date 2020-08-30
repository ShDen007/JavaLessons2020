package HomeWork4;

import java.util.Scanner;

// 2.Составить программу вывода любое числа любое заданное число раз
// (запросить у пользователя) в виде, аналогичному выше.
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number for output");
        int num = scanner.nextInt();
        System.out.println("Please enter number of display of the entered number ");
        int count = scanner.nextInt();

        for(int i = 0; i < count; i ++){
            System.out.print(num+" ");
        }
    scanner.close();
    }
}
