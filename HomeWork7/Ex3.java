package HomeWork7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Задание3: Ввести строку с клавиатуры. Из введённой строки выбрать все слова
// начинающиеся на гласные буквы (e, o, a, u, i или y) и заканчивающиеся на согласные.
//Вывести отобранные слова на консоль.
public class Ex3 {
    private static boolean isVowel(char c) {
        return VOWEL_SET.contains(Character.toLowerCase(c));
    }

    private static final Set<Character> VOWEL_SET = new HashSet<>
            (Arrays.asList(new Character[]{'a', 'o', 'i', 'y', 'u', 'e'}));

    private static final Predicate<char[]> PREDICATE = chars -> isVowel(chars[0])
            && !isVowel(chars[chars.length - 1]);


        public static void main (String[]args){
            System.out.println("enter text");
            Scanner scanner = new Scanner(System.in);
            List<String> result = Arrays.stream(scanner.nextLine().split(" "))
                    .filter(s -> PREDICATE.test(s.toCharArray())).collect(Collectors.toList());
            System.out.println(result);
            scanner.close();
        }
    }
