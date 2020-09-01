package HomeWork10;

import java.util.Random;
import java.util.Scanner;
import static java.util.Arrays.sort;


//В функцию передаётся массив случайных чисел в диапазоне от -20 до +20.
// Необходимо найти позиции крайних отрицательных элементов
// (самого левого отрицательного элемента и
// самого правого отрицательного элемента)
// и отсортировать элементы, находящиеся между ними.
public class Ex4 {
    static int  size = 0;
    static  int iter = 0;
    static  int negLeft = 0;
    static  int negRight = 0;

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
    public static void random(int arr[]){
        Random random = new Random();

        for(int i = 0; i < size ; i ++) {
            arr[i] =  random.nextInt(40) - 20;
        }
        System.out.println("innicial array");
        for(int i : arr) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void index (int arr[]){
        for(int i = 0; i < arr.length; i ++){
            if( arr[i] < 0 && iter < 1){
              negLeft = i;
              iter++;
            }
            if(arr[i] < 0 && negLeft != i ){
                negRight = i;
            }
            if(iter <= i){
                System.out.println("Array has not two negative numbers");
            }
        }
    }
public static void sort(int arr[]){
            boolean sort1 = false;
            int temp;
            while(! sort1){
              sort1 = true;
                for(int i = negLeft + 1; i < negRight - 1; i ++){
                   if(arr[i] < arr[ i + 1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sort1 = false;
                   }
                }
            }
            System.out.println("sort array");
            for(int i : arr){
                System.out.println(i + " ");
            }
        }

    public static void main(String[] args) {
        int [] arr = new int[scan()];
        random (arr);
        index (arr);
        if(iter > 1){
            sort(arr);

        }

    }
}
