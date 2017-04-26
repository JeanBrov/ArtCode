package week1;

import java.util.Scanner;

/**
 * Created by Ivan.Kriskun on 26.04.2017.
 * 4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
 * 124    4    -   true
 * 1456   567  -   false
 * 1      2    -   false
 * 18     98   -   true
 */
public class Task4_8 {
    public static void main(String[] args) {
        System.out.println("Input two numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("The first number");
        int firstNumber_1=scanner.nextInt();
        int firstNumber=Math.abs(firstNumber_1);
        System.out.println("The second number");
        int secondNumber_1=scanner.nextInt();
        int secondNumber=Math.abs(secondNumber_1);
        if ((firstNumber>10)&&(secondNumber<10)){
            int lastDigitofFirstNumber=firstNumber%10;
            System.out.println(firstNumber_1+"  "+secondNumber_1+"  "+(lastDigitofFirstNumber==secondNumber));
        } else if ((firstNumber<10)&&(secondNumber>10)){
            int lastDigitofSecondNumber=secondNumber%10;
            System.out.println(firstNumber_1+"  "+secondNumber_1+"  "+(lastDigitofSecondNumber==firstNumber));
        } else {
            int lastDigitofFirstNumber=firstNumber%10;
            int lastDigitofSecondNumber=secondNumber%10;
            System.out.println(firstNumber_1+"  "+secondNumber_1+"  "+(lastDigitofSecondNumber==lastDigitofFirstNumber));
        }

    }
}
