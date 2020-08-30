package HomeWork5;
import java.util.Scanner;
// 9.Запросить у пользователя натуральное число n.
// Вывести в консоль все его цифры через пробел.
public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (char element : Integer.toString(n).toCharArray()) {
            System.out.print(" "+element+" ");
        }
        scanner.close();
        }
}

