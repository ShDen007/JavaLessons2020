package HomeWork6;

import java.util.Arrays;

// 3.Создать массив целых чисел на 4 элемента.
// Заполнить его значениями от 10 до 20.
// Поменять местами первый и последний элемент,
// а так же второй и третий.
public class Ex3 {
    public static void main(String[] args) {
        int[] mas2 = new int[4];
        int startNum = 10;
        int endNum = 20;
        for (int i = 0; i < 4; i++) {
            mas2[i] = startNum;
            startNum++;
        }
        System.out.println(Arrays.toString(mas2));  //Заповнення масива;

        int temp =  mas2[0];
        mas2[0] = mas2[3];
        mas2[3]  = temp;
        int temp2 = mas2[1];
        mas2[1] = mas2[2];
        mas2[2] = temp2;
        System.out.println(Arrays.toString(mas2));  //Заміна елементів масива місцями;
    }
}


