package week1;

import java.util.Scanner;

/**
 * 4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.
 */
public class Task4_6 {
    public static void main(String[] args) {
        System.out.println("Input two digit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("The first digit");
        int firstDigit=scanner.nextInt();
        System.out.println("The second digit");
        int secondDigit=scanner.nextInt();
        int sum=firstDigit+secondDigit;
        if ((sum>11)&&(sum<19)) System.out.println("Sum="+sum);
    }
}
