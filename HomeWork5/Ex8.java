package HomeWork5;

// 8.Даны натуральные числа x и y. Вычислить произведение x y,
// используя лишь оператор сложения.
public class Ex8 {
    public static void main(String[] args) {
        int x = 8;
        int y = 7;
        int product = 0;
        for(int i = 0; i < y; ++i){
            product += x;
        }
        System.out.println("Derived number x , y : "+ product);
    }

}




