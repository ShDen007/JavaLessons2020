package HomeWork10;

import java.util.Scanner;

//Число называется совершенным, если сумма всех его делителей равна ему самому.
//Напишите функцию поиска таких чисел во введенном интервале.
public class Ex3 {
       static int num = 0;
        public static int scan() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
            } else {
                System.out.println("Is not number.Try again");
                while (true) {
                    scanner = new Scanner(System.in);
                    if (scanner.hasNextInt()) {
                        num = scanner.nextInt();
                    } else {
                        System.out.println("Is not number.Try again");
                    }
                }
            }
            scanner.close();
            return num;
        }
        public static void perfect(int num){
            int cache = 0;

            for(int i = 0; i < num; i++){
                if ((double) num % i == 0)
                cache = i + cache;
            }
        if(num == cache) {
            System.out.println("number : " + num + " is perfect");
        }else {
            System.out.println("number : " + num + " is not perfect");
            }
        }

    public static void main(String[] args) {
        scan();
        perfect(num);
    }
}


