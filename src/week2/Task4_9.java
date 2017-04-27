package week2;

import java.util.Scanner;

/**
 * 9) Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
 */
public class Task4_9 {
    public static void main(String[] args) {
        System.out.println("Please type size of your massives");
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        int START_ARR=25;
        int END_ARR=75;
        int [] arr1 = new int[arrSize];
        int [] arr2 = new int[arrSize];


        for (int i = 0; i <arrSize ; i++) {
            arr1[i]=(int)(Math.random()*(END_ARR-START_ARR)+START_ARR);
            arr2[i]=(int)(Math.random()*(END_ARR-START_ARR)+START_ARR);
        }

        int evenCounter1=0;
        int evenCounter2=0;

        for (int i = 0; i <arrSize ; i++) {
        if ((arr1[i]%2)==0) {evenCounter1++;};
        if ((arr2[i]%2)==0) {evenCounter2++;};
        }
//        ArrayUtils.printArray(arr1);
//        System.out.println();
//        ArrayUtils.printArray(arr2);

        if (evenCounter1>evenCounter2){
            System.out.println("First array has more evens elements = "+evenCounter1);
        }else System.out.println("Second array has more evens elements = "+evenCounter2);
    }
}
