package HomeWork8;

import javax.crypto.spec.PSource;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//* Задание: С помощью регулярных выражений напишите проверку ввода номера мобильного телефона
// * Пример:
// * +380(99)123-45-67
// * Номер валидный
public class Ex1 {
    public static void main(String[] args) {
        final String regex = "(?<!\\w)(?:(?:(?:(?:\\+?3)?8\\W{0,5})?0\\W{0,5})?[34569]\\s?\\d[^\\w,;(\\+]{0,5})?\\d\\W{0,5}\\d\\W{0,5}\\d\\W{0,5}\\d\\W{0,5}\\d\\W{0,5}\\d\\W{0,5}\\d(?!(\\W?\\d))";
        final String string = "+380(99)123-45-67";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("This number is valid");
            }
        }

    }
}
