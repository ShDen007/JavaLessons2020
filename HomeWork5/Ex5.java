package HomeWork5;

// 5.Используя цикл while необходимо вывести на экран следующую последовательность чисел:
// 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
public class Ex5 {
    public static void main(String[] args) {
        int a = 7;
        int b = 1;
        while (b <= 14){
            int c = a * b;
            b++;
            System.out.print(" "+c+" ");
        }
    }
}
