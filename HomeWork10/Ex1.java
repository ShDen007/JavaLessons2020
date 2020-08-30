package HomeWork10;

import java.util.Random;
import java.util.Scanner;

//Написать метод, определяющую среднее арифметическое элементов передаваемого ей массива.
public class Ex1 {
    static int size = 0;

    public static int scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        if(scanner.hasNextInt()){
            size = scanner.nextInt();
        }else{
            System.out.println("Is not number.Try again");
            while(true){
                scanner = new Scanner(System.in);
                if(scanner.hasNextInt()) {
                    size = scanner.nextInt();
                }else{
                    System.out.println("Is not number.Try again");
                }
            }
        }
        scanner.close();
        return size;
    }
    public static double arithmMean(int arr[]) {
        double arithmMean = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = arr[i] + sum;
        }
        arithmMean = (double) sum / size;
        return arithmMean;
    }
    public static void main(String[] args) {
        scan();
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100) +0;
        }
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println(arithmMean(arr));
    }
}


