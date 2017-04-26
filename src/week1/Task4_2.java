package week1;

import java.util.Scanner;

/**
 * Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
 */
public class Task4_2 {
    public static void main(String[] args) {
        System.out.println("Input three digits");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first digit");
        int firstDigit=scanner.nextInt();
        System.out.println("Input second digit");
        int secondtDigit=scanner.nextInt();
        System.out.println("Input third digit");
        int thirdDigit=scanner.nextInt();
        int max=firstDigit;
        int min=firstDigit;
//      Looking for maximum
        if (secondtDigit>max){max=secondtDigit;}
        if (thirdDigit>max){max=thirdDigit;}
//      Looking for minimum
        if (secondtDigit<min){min=secondtDigit;}
        if (thirdDigit<min){min=thirdDigit;}
        System.out.println("Here we are. Maximum: "+max+" Minimum: "+min);
    }
}
