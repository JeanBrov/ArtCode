package week1.additional;

import java.util.Scanner;

/**
 * 1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
 лить, является ли он прямоугольным. Ответ вывести в виде сообщения.

 */
public class task1 {
    public static void main(String[] args) {
        System.out.println("Input three side of triangle");
        System.out.println("A: ");
        Scanner scanner = new Scanner(System.in);
        int A=scanner.nextInt();
        System.out.println("B: ");
        int B=scanner.nextInt();
        System.out.println("C: ");
        int C=scanner.nextInt();

        isRightangledTriangle(A,B,C);
    }

    private static void isRightangledTriangle(int a, int b, int c) {
        int hypotenuse=a;
        int cathetus1=b;
        int cathetus2=c;
        if (b>hypotenuse){hypotenuse=b;cathetus1=a; cathetus2=c;}
        if (c>hypotenuse){hypotenuse=c;cathetus1=a; cathetus2=b;}
        if (Math.pow(hypotenuse,2)==(Math.pow(cathetus1,2)+Math.pow(cathetus2,2))){
            System.out.println("Triangle is Rightangle");
        }
        else System.out.println("Triangle is not Rightangle");
    }
}
