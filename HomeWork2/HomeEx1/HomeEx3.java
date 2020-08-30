package com.company.lesson2.HomeEx1;

public class HomeEx3 {
    //Составить программу вывода на экран 9 чисел столбиком (не используя пробелы):
    //	3	67	9
    //	67	6	50
    //	4	80	6
    public static void main(String[] args) {

        int [][] ar = {{3,67,9},{67,6,50},{4,80,6}};
        for(int i = 0;i < ar.length; i++){
            for(int j = 0; j < ar[i].length; j++){
                System.out.println(ar[i][j]);
            }

        }










    }

}
