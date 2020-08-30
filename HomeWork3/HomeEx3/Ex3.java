package HomeWork3.HomeEx3;

// 3.Создаем три переменные  a, b, c записываем в них любые не равные между собой значения.
// Написать программу, которая переставит числа в переменных таким образом,
// чтобы при выводе их на экран последовательность a, b и c оказалась строго возрастающей.

public class Ex3 {

    public static void main(String[] args) {

        int a = 5;
        int b = 9;
        int c = 3;
        int min;
        int max;
        int middle;

        if(a>b) {
            if(a>c) {
                max = a;
                if(c>b) {
                    middle = c;
                    min = b;
                } else {
                    middle = b;
                    min = c;
                }
            } else {
                max = c;
                middle = a;
                min = b;
            }
        } else {
            if(b>c) {
                max = b;
                if(c>a) {
                    middle = c;
                    min = a;
                } else {
                    middle = a;
                    min = c;
                }
            } else {
                max = c;
                middle = b;
                min = a;
            }
        }
        System.out.println(min+" "+middle+" "+max);
    }
}







