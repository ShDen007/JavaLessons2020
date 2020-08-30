package HomeWork7;

import java.util.Scanner;

//Задание1: Ввести с клавиатуры строку текста, а затем один символ. Показать на экран
//индексы (через пробел) и количество совпадений на следующей строке (ищем вхождения символа в строку).
// Если символ не найдет - выводить -1
// Примечание: использовать методы строк
// Пример:
// Для строки "обороноспособность" и введенного символа "o" вывод будет:
// 0 2 4 6 9 11 14
// 7
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text Hello World");
        String str = scanner.nextLine();
        System.out.println(str);
        System.out.println(str.charAt(4));//Ввести с клавиатуры строку текста, а затем один символ.
        char e = str.charAt(4);
        System.out.print(str.indexOf(e,0)+" ");
        System.out.print(str.indexOf(e,5)+" "+"\n");
        System.out.println(str.indexOf(e,10));

scanner.close();
    }

}
