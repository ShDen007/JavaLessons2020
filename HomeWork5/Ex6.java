package HomeWork5;

// 6.Используя цикл while необходимо вывести на экран следующую последовательность чисел:
// 1 2 4 8 16 32 64 128 256 512
public class Ex6 {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 512) {
            System.out.print(" " + n + " ");
            n*=2;
        }
    }
}

