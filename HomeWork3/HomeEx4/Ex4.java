package HomeWork3.HomeEx4;

// 4.Создать программу,
// выводящую на экран случайно сгенерированное трёхзначное
// натуральное число и его наибольшую цифру.
// (Используем класс Math или Random)
public class Ex4 {

    public static void main(String[] args) {
        int number = (int) (100 + Math.random() * (999 - 100)) ;
        System.out.println((int)number);
        int a = (int) Math.floor(number / 100);
        int b = (int) Math.floor((number - a * 100) / 10);
        int c = (int) Math.floor(number - a * 100 - b * 10);

        if(a > b && a > c){
            System.out.println( "number - " + number + " max digite - " + a);
        }if(b > a && b > c){
            System.out.println("number - " + number + " max digite - " + b);
        }if(c > a && c > b ){
            System.out.println("number - " + number + " max digite - " + c);
        }

    }




}
