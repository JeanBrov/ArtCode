package week2;

import java.util.Scanner;

/**
 * 6) Найти среднее арифметическое массива
 */
public class Task4_6 {
    public static void main(String[] args) {
        System.out.println("Please type size of your massives");
        Scanner scanner = new Scanner(System.in);
        int masSize = scanner.nextInt();
        System.out.println("Please type range in your massive");
        int masRange = scanner.nextInt();
        int[] mas= ArrayUtils.generateMas(masSize,masRange);

        double masSum=0;
        for (int i = 0; i < mas.length; i++) {
            masSum=masSum+mas[i];
        }
        double average = masSum/mas.length;

//        ArrayUtils.printArray(mas);
        System.out.println("Average sum of elements masive is: "+average);
    }
}
