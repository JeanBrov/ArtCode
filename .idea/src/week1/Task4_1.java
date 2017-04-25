import java.util.Scanner;

/**
 * 4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
 Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
 */
public class Task4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String timeString = scanner.toString();
        System.out.println("timeString= "+timeString);
        int timeDigit=-1;
//        try {
            timeDigit = Integer.parseInt(timeString);
//        } catch (Exception e){
//            System.out.println("Please type digit from 0 to 24");
//        }
        if ((timeDigit>=9)&&(timeDigit<=18)) {System.out.printf("Я на работе");}
        else if (((timeDigit>=0)&&(timeDigit<9))||((timeDigit>18)&&(timeDigit<24))){System.out.println("Я отдыхаю");}
        else System.out.println("Incorrect digit");
        }

    }
