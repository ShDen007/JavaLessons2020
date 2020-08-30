package HomeWork5;

// 14.Найти 15 первых натуральных чисел,
// делящихся нацело на 19 и находящихся в интервале,
// левая граница которого равна 100.
public class Ex14 {
    public static void main(String[] args) {
        int p = 100;
        while(true){
            if(p % 19 == 0){
                for(int i = 0; i < 15; i ++){
                    System.out.println(p);
                    p +=19;
                }break;
            }
            ++p;
       }
    }
}
