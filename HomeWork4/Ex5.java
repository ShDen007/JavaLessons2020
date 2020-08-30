package HomeWork4;

// 5.Одна единица некоторого товара стоит 24,5 грн.
// Напечатать таблицу стоимости 2, 3 ... 20 штук этого товара.
public class Ex5 {
    public static void main(String[] args) {
        double goods = 24.5;
        int part = 20;
            for (int i = 1; i < part + 1; ++i) {
                double how = goods * i;
                System.out.print(i + " - " + how + " ");
                System.out.println(" ");


        }
    }

}
