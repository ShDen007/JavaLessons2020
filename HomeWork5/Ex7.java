package HomeWork5;

import java.util.Scanner;

// 7.Найти:
// a.Произведение всех чисел от 8 до 15.
// b.Произведение всех чисел от a до 20 (значение a вводится с клавиатуры; 1 <= a <= 20)
// c.Произведение всех чисел от 1 до b (значение b вводится с клавиатуры; 1 <= b <= 20)
public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a 1 <= a <= 20");
        int a = scanner.nextInt();
        System.out.println("Enter number b 1 <= b <= 20");
        int b = scanner.nextInt();
        int mult = 8;
        for(int i = 9; i <= 15; i ++){
            mult = mult * i;
        }
        System.out.println("a. derived number:" + mult);    //a.Произведение всех чисел от 8 до 15.

        int mult1 = a;
        for(int i = a +1; i <= 20; ++i){
            mult1 = mult1 * i;
        }
        System.out.println("b. derived number:" + mult1);  // b.Произведение всех чисел от a до 20
        // (значение a вводится с клавиатуры; 1 <= a <= 20)
        int mult2 = 1;
        for(int i = 2; i <= b; ++i) {
            mult2 = mult2 * i;
        }System.out.println("c. derived number:" + mult2); //c.Произведение всех чисел от 1 до b
        // (значение b вводится с клавиатуры; 1 <= b <= 20)


scanner.close();
    }


}
