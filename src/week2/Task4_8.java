package week2;

import java.util.Scanner;

/**
 * 8) Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
 * который получается в результате суммы arr1[i] + arr2[i]

 */
public class Task4_8 {
    public static void main(String[] args) {
        System.out.println("Please type size of your massives");
        Scanner scanner = new Scanner(System.in);
        int masSize = scanner.nextInt();
        System.out.println("Please type range in your massive");
        int masRange = scanner.nextInt();
        int[] arr1= ArrayUtils.generateMas(masSize,masRange);
        int[] arr2= ArrayUtils.generateMas(masSize,masRange);
        int[] arr3= new int[masSize];
        for (int i = 0; i <arr1.length ; i++) {
            arr3[i]=arr1[i]+arr2[i];
        }

//        for (int i = 0; i <arr1.length ; i++) {
//            System.out.print(arr1[i]+" ");
//        }
//        System.out.println();
//        for (int i = 0; i <arr2.length ; i++) {
//            System.out.print(arr2[i]+" ");
//        }
//        System.out.println();
//        for (int i = 0; i <arr3.length ; i++) {
//            System.out.print(arr3[i]+" ");
//        }

        ArrayUtils.printArray(arr3);


    }
}
