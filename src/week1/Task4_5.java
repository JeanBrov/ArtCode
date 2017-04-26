package week1;

import java.util.Scanner;

/**
* 4.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.
 */
public class Task4_5 {
    public static void main(String[] args) {
        System.out.println("Input two digit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("The first digit");
        double firstDigit=scanner.nextDouble();
        System.out.println("The second digit");
        double secondDigit=scanner.nextDouble();
        if (firstDigit>secondDigit){
            System.out.println("Difference= "+(firstDigit-secondDigit));
        } else if (secondDigit>firstDigit){
            System.out.println("Sum= "+(firstDigit+secondDigit));
        }
    }
}
