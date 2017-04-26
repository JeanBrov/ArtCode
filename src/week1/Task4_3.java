package week1;

import java.util.Scanner;

/**
 * Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.
 */
public class Task4_3 {
    public static void main(String[] args) {
        System.out.println("Input a digit");
        Scanner scanner = new Scanner(System.in);
        int digit=scanner.nextInt();
        if ((digit%7)==0){
            System.out.println("Here we are, double of your digit= "+digit*2);
        }
    }
}
