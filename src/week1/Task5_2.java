package week1;

import java.util.Scanner;

/**
 * 5.2. Вычислить факториал числа.
 */
public class Task5_2 {
    public static void main(String[] args) {
        System.out.println("Enter number for factorial definition: ");
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        int result=1;
        int multiplier=1;
        while (number>=multiplier){
            result=result*multiplier;
            multiplier++;
        }
        System.out.println("Factorial of "+ number+" equal "+result);
    }
}
