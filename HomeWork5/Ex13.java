package HomeWork5;

// 13.Дано натуральное число.
// Определить насколько максимальная цифра превышает минимальную.
public class Ex13 {
    public static void main(String[] args) {
        int num = 684;

        int a = (int) Math.floor(num / 100);
        int b = (int) Math.floor((num - a * 100) / 10);
        int c = (int) Math.floor(num - a * 100 - b * 10);

        if(a > b && a > c && b < c){
            double j = a / b;
            System.out.println( "number - " + num + " min digite - " + b +" max digite - " + a);
            System.out.println( "a less than b on :"+ (double)j);
        }if(b > a && b > c && a > c){
            double j = b / c;
            System.out.println("number - " + num + " min digite - " + c +" max digite - " + b);
            System.out.println( "b less than c on :"+ (double)j);
        }if(c > a && c > b && b > a){
            double j = c / a;
            System.out.println("number - " + num + " min digite - " + a +" max digite - " + c);
            System.out.println( "c less than a on :"+ (double)j);
        }
    }
}

