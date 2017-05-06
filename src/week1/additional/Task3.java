package week1.additional;

import java.util.Scanner;

/**
 * 3) Дано трехзначное число. Определить: а) верно ли, что все его цифры
 одинаковые; б) есть ли среди его цифр одинаковые.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Input Three-digit number");
        Scanner scanner = new Scanner(System.in);
        int A=scanner.nextInt();
        int hundreds=A/100;
        int tens=(A-hundreds*100)/10;
        int ones=A-(hundreds*100+tens*10);
        if ((hundreds==tens)&&(tens==ones)){
            System.out.println("All digits in the number the same");
        }
        else if ((hundreds==tens)||(hundreds==ones)||(tens==ones)){
            System.out.println("Between the digits exists the same");
        }

    }
}
