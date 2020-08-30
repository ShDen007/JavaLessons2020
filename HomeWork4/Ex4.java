package HomeWork4;

// 4.Напечатать в консоли треугольник используя символ +.
public class Ex4 {
    public static void main(String[] args) {
        char plus = '+';
        int size = 7;
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < i; ++j)
                System.out.print(" " + plus + " ");
            System.out.println(" ");
        }
    }
}








