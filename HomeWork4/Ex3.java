package HomeWork4;

// 3. Напечатать числа в виде:
//    20 20 20 20 20
//    20 20 20 20 20
public class Ex3 {

    public static void main(String[] args) {

        int a = 20;

        for( int i = 0; i < 2; i++){
            System.out.print("\n"+ a + " ");
            for( int j = 0; j < 5; j++){
                System.out.print(a + " ");
            }
        }

    }


}
