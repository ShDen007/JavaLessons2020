package HomeWork7;

import java.util.Scanner;

//Задание2: Подсчитать среднюю длину слова во введённом с клавиатуры предложении.
// Дробную часть при выводе отбросить.
// Пример:
// Для входной строки "Hello World"
// Результат будет 5
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String str = scanner.nextLine();
        System.out.println();
        int count = 1;
        int middleWord = 0;
        int i = 0;
        char [] st = str.toCharArray();
        for (i = 0;i < str.length();i++)
            if (st[i] == ' ') {
                count++;
            }
                  System.out.println("String have: " + count + " - word");
             middleWord = str.length() / count;
                  System.out.println("middle word have: " + middleWord + " - letters");
scanner.close();
    }
}

