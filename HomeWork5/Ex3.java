package HomeWork5;

// 3.Напечатать таблицу умножения на 9 в обратном порядке:
// 9 х 9 = 81
// ...
// 1 х 9 = 9
public class Ex3 {
    public static void main(String[] args) {
        int a = 9;
        int b = 9;
        int c;
        while (b > 0 ) {
            c = a * b;
            System.out.println(b-- + " X " + a + " = " + c);
        }


    }
}