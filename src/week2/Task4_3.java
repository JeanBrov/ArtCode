package week2;

import java.util.Scanner;

/**
 * 3) Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
 */
public class Task4_3 {
    public static void main(String[] args) {
        System.out.println("Please type size of your massives");
        Scanner scanner = new Scanner(System.in);
        int masSize = scanner.nextInt();
        System.out.println("Please type range in your massive");
        int masRange = scanner.nextInt();
        int[] mas1 = ArrayUtils.generateMas(masSize, masRange);
        int[] mas2 = ArrayUtils.generateMas(masSize, masRange);
//        System.out.println("Before replacement");
//        ArrayUtils.printArray(mas1);
//        ArrayUtils.printArray(mas2);

        for (int i = 0; i <mas1.length ; i++) {
            mas2[i]=mas1[i];
        }

//        System.out.println("After replacement");
//        ArrayUtils.printArray(mas1);
//        ArrayUtils.printArray(mas2);

    }
    }
