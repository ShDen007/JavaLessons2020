package HomeWork8;

import java.awt.*;

// Задание: Пользователь вводит с клавиатуры строку. Поменять все большие буквы на
//         маленькие, а маленькие на большие.
//         Пример:
//         При введенной строке: iTsTEP
//         Вывод на консоль должен быть: ItStep
public class Ex2 {
    public static void main(String[] args) {
        String a = "iTsTEP";

        char[] chars = a.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }

        System.out.println(new String(chars));
    }
}



