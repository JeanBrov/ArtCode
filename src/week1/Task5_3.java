package week1;

import java.util.Scanner;

/**
 * 5.3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
 5678  -   1
 5889  -   2
 8888  -   4
 989990  - 1

 */
public class Task5_3 {
    public static void main(String[] args) {
        System.out.println("Enter number for counting of 8: ");
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        int counter=0;
    while (number>0){
        if ((number%10)==8){
            counter++;
        }
        number=number/10;
    }
        System.out.println("The 8 met "+ counter+ " times");
    }
}
