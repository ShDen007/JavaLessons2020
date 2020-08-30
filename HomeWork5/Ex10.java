package HomeWork5;

import java.util.Scanner;

// 10.Запросить у пользователя натуральное число n.
// Найти число получаемое при прочтении его цифр справа налево.
public class Ex10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter natural number n: ");
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        sb = sb.append(n);
        sb.reverse();
        System.out.println(sb.toString());
scanner.close();
    }
}