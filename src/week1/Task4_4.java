package week1;

import java.util.Scanner;

/**
  * 4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
 */
public class Task4_4 {
    public static void main(String[] args) {
        System.out.println("Input a digit");
        Scanner scanner = new Scanner(System.in);
        double digit=scanner.nextDouble();
        if ((digit>0)&&(digit<1)){
            System.out.println("Digit is in the range betwen 0 and 1");
        }
        else System.out.println("Digit is not in the range betwen 0 and 1");

    }
}
