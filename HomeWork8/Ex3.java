package HomeWork8;

//Задание: Написать программу которая будет подсчитывать количество слов, гласных и
//согласных букв в строке введённой пользователем. Дополнительно выводить
//количество знаков пунктуации, цифр и др. символов.
//
// Прмер:
// Для введенной строки: "Hello World"
// Вывод на консоль будет:
// Слов - 2
// Гласных - 3
// Согласных - 7
public class Ex3 {
    public static void main(String[] args) {
        String str = "Hello World";
        int j = 0;
        int y = 0;
        int c = 0;

        String[] str1 = str.split(" ");
        for (int i = 0; i < str1.length; i++) {
        }
        System.out.println("Words : " + str1.length);

        for (char i : str.replaceAll
                ("[^aeiouAEIOU]", "").toCharArray())
            for (j = 0; j < str.replaceAll("[^aeiouAEIOU]", "").length(); j++) {
            }
        System.out.println("Vowels : " + j);

        for (char i : str.replaceAll
                ("[^bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "").toCharArray())
            for (y = 0; y < str.replaceAll("[^bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "").length(); y++) {
            }
        System.out.println("Consontans : " + y);

        for (char i : str.replaceAll
                ("[^0123456789./.,*/+(){}@#$%^&*]", "").toCharArray())
            for (c = 0; c < str.replaceAll("[^0123456789./.,*/+(){}@#$%^&*]", "").length(); c++) {
            }
        System.out.println("Digits and symbol : " + c);
    }
}






