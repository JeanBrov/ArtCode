package week1.additional;

import java.util.Scanner;

/**
 * 2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
 тельные заменить на 0.

 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Input three digits");
        System.out.println("A: ");
        Scanner scanner = new Scanner(System.in);
        double A=scanner.nextDouble();
        System.out.println("B: ");
        double B=scanner.nextDouble();
        System.out.println("C: ");
        double C=scanner.nextDouble();

        if (A<0){A=0;}
        else A=Math.pow(A,3);

        if (B<0){B=0;}
        else B=Math.pow(B,3);

        if (C<0){C=0;}
        else C=Math.pow(C,3);

        System.out.println("A= "+A+" B= "+B+" C= "+C);
    }


}
