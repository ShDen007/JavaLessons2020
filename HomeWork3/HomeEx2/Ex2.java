package HomeWork3.HomeEx2;

import java.util.Scanner;

// 2.Написать калькулятор с базовыми арифметическими операциями (+; -; *; /).
// Запрашиваем у пользователя два целых числа и просим выбрать номер желаемой операции.
// Например:
//       1. сложение
//       2. вычитание
// Если пользователь вводит 1, выполняете операцию сложения
// (используем оператор множественного выбора switch).
// Предусмотреть выбор не поддерживаемой операции.
// Также выполняем проверку деления на ноль и сообщаем пользователю, что деление на 0 запрещено
// (используем оператор if-else).
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int first = scanner.nextInt();
        System.out.println("Input second number");
        int second = scanner.nextInt();

        System.out.println("Input arithmetic operation  (+,-,/,*)");
        char operation = scanner.next().charAt(0);

            int result = 0;
            switch (operation) {
                case '+':
                    result = first + second;
                    break;
                case '-':
                    result = first - second;
                    break;
                case '/':
                    result = first / second;
                    break;
                case '*':
                    result = first * second;
                    break;

            }

        System.out.println(result);
scanner.close();

    }


}
