package week1;

import java.util.Scanner;

/**
 *
 * 4.7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления
 * (целую часть от деления  и остачу)
 * в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)

 */
public class Task4_7 {
    public static void main(String[] args) {
        System.out.println("Input two digit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("The first digit");
        int firstDigit=scanner.nextInt();
        System.out.println("The second digit");
        int secondDigit=scanner.nextInt();
        if (firstDigit>secondDigit){
            if ((firstDigit%secondDigit)==0){
                System.out.println("True "+((firstDigit/secondDigit)+" "+(firstDigit%secondDigit)));
            } else {System.out.println("False "+((firstDigit/secondDigit)+" "+(firstDigit%secondDigit)));}
        }
        if (secondDigit>firstDigit){
            if ((secondDigit%firstDigit)==0){
                System.out.println("True "+((secondDigit/firstDigit)+" "+(secondDigit%secondDigit)));
            } else {System.out.println("False "+((secondDigit/firstDigit)+" "+(secondDigit%firstDigit)));}
        }
    }
}
