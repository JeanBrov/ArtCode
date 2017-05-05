package week2;

import java.util.Scanner;

/**
 *  // обрезать массив по границам start и end
 */
public class Task4_10 {

    public static void main(String[] args) {
        System.out.println("Please type size of your massives");
        Scanner scanner = new Scanner(System.in);
        int masSize = scanner.nextInt();
        System.out.println("Please type range in your massive");
        int masRange = scanner.nextInt();
        int[] arr1= ArrayUtils.generateMas(masSize,masRange);
        int[] arr2= splitArray(arr1,3,5);
        ArrayUtils.printArray(arr1);
        ArrayUtils.printArray(arr2);
    }
    public static int[] splitArray(int[] arr, int start, int end) {
        // обрезать массив по границам start и end
        int lenthArr=end-start;
        int[] arrCutted= new int[lenthArr+1];
        int j=0;
        for (int i = start; i <=end ; i++) {
           arrCutted[j]=arr[i];
            j++;
        }
    return arrCutted;
    }
}
