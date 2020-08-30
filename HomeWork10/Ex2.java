package HomeWork10;

import java.util.Random;
import java.util.Scanner;

//Написать функцию, определяющую минимум и максимум (значение и номер)
//элементов передаваемого ей массива.
public class Ex2 {
    static int size = 0;
    static int min = 0;
    static int max = 0;
    static int index = 0;

    public static int scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size");
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        } else {
            System.out.println("Is not number.Try again");
            while (true) {
                scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    size = scanner.nextInt();
                } else {
                    System.out.println("Is not number.Try again");
                }
            }
        }
        scanner.close();
        return size;
    }
    public static void value(int arr[]){
        for(int i = 0;i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
           // System.out.println("min: " + min);
           // System.out.println("max: " + max);

        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }

    public static void index(int arr[]) {
        int iter = 0;
        int arr1[] = new int[size];
        for (int i = 0; i < size; i++) {
            if (min == arr[i]) {
                arr1[iter] = i;
                iter++;
            }
        }
        if (iter > 1) {
            System.out.println("index coincidence min value");
            for (int i = 0; i < iter; i++) {
                System.out.println(arr1[i] + ", ");
            }
        }
        System.out.println();

        iter = 0;
        for(int j = 0;j < size; j++){
            arr1[j] = 0;
        }
        for(int i = 0; i < size; i ++) {

            if (max == arr[i]) {
                arr1[iter] = i;
                iter++;
            }
        }
        if(iter > 1){
            System.out.println("index coincidence max value");
            for(int i = 0; i < iter; i ++){
                System.out.println(arr1[i] + ", ");
            }
        }
    }
        public static void main (String[]args) {
            scan();
            Random random = new Random();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = random.nextInt(50) + 10;
            }
            for (int i : arr) {
                System.out.print(i + " ");
                }
                System.out.println();
                value(arr);
                index(arr);
            }

}