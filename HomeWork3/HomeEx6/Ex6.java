package HomeWork3.HomeEx6;
import java.lang.Math;

// 6.Генерируем 2 числа. Первый в диапазоне от 1 до 31, второе от 1 до 12.
//  1.Сообщаем пользователю если сгенерированые число и месяц не являются корректной датой и выводим их
//  (например: «Дата: 30 февраля  - не является валидной.»)
//  2.Если дата валидна вывести её на экран в формате «4 апреля».
public class Ex6 {
    public static void main(String[] args) {

        int day = (int) ((int) 1 + (Math.random() * 31));
        //System.out.println(day);

        int mounth = (int) ((int) 1 + (Math.random() * 12));
        //System.out.println((int) mounth);
        String result = null;
        switch (mounth) {
            case 1:
                result = "january";
                break;
            case 2:
                result = "february";
                break;
            case 3:
                result = "march";
                break;
            case 4:
                result = "april";
                break;
            case 5:
                result = "may";
                break;
            case 6:
                result = "june";
                break;
            case 7:
                result = "july";
                break;
            case 8:
                result = "august";
                break;
            case 9:
                result = "september";
                break;
            case 10:
                result = "october";
                break;
            case 11:
                result = "november";
                break;
            case 12:
                result = "december";
                break;
        }
        if ((int) day != 4 && (int) mounth != 4)
            System.out.println((int) day +" " + result + " - "+"do not valid");
        if ((int) day == 4 && (int) mounth == 4) {
            System.out.println((int) day +" " + result + " - "+ "is valid");
        }
    }

}









