package week2;

import java.util.Scanner;

/**
 * Created by Ivan.Kriskun on 26.04.2017.
 */
public class Task4_4 {
    public static void main(String[] args) {
        System.out.println("Please type size of your massives");
        Scanner scanner = new Scanner(System.in);
        int masSize = scanner.nextInt();
        System.out.println("Please type range in your massive");
        int masRange = scanner.nextInt();
        System.out.println("Please type digit in your massive");
        int nessesaryDigit = scanner.nextInt();
        int[] mas = ArrayUtils.generateMas(masSize, masRange);
//        ArrayUtils.printArray(mas);
        int counter=0;
        for (int i = 0; i <mas.length ; i++) {
            if (mas[i]==nessesaryDigit){
                counter++;
            }
        }
        System.out.println("The digit "+ nessesaryDigit+ " in the massive was found "+counter +" times.");
    }
}
