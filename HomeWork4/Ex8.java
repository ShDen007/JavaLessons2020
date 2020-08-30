package HomeWork4;

// 8.Даны натуральный числа x и y.
// Вычислить произведение xy, используя лишь оператор сложения.
public class Ex8 {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int product = 0;
        for(int i = 0; i < y; ++i){
            product += x;
        }
        System.out.println("Product x , y - "+ product);
    }
}
