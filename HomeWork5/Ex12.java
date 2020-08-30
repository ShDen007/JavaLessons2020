package HomeWork5;

// 12.Дано натуральное число.
// Определить максимальную и минимальную цифру.
public class Ex12 {
    public static void main(String[] args) {
        int num = 123;

        int a = (int) Math.floor(num / 100);
        int b = (int) Math.floor((num - a * 100) / 10);
        int c = (int) Math.floor(num - a * 100 - b * 10);

        if(a > b && a > c && b < c){
            System.out.println( "number - " + num + " min digite - " + b +" max digite - " + a);
        }if(b > a && b > c && a > c){
            System.out.println("number - " + num + " min digite - " + c +" max digite - " + b);
        }if(c > a && c > b && b > a){
            System.out.println("number - " + num + " min digite - " + a +" max digite - " + c);
        }
    }
}
