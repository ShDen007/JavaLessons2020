package HomeWork5;

// 2.Напечатать таблицу умножения на 7:
// 1 х 7 = 7
// ...
// 9 х 7 = 63
public class Ex2 {
    public static void main(String[] args) {
        int a = 7;
        int b = 0;
        int c;
        while(b < 10){
            b++;
            c = a * b;
            System.out.println(b+" X "+ a + " = " +c);
        }
    }
}
