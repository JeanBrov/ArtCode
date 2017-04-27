package week2;

import java.util.Scanner;

/**
 * 5) Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
 */
public class Task4_5 {
    public static void main(String[] args) {
        System.out.println("Please type size of your massives");
        Scanner scanner = new Scanner(System.in);
        int masSize = scanner.nextInt();
        System.out.println("Please type range in your massive");
        int masRange = scanner.nextInt();
        int[] mas= new int[masSize];

        for (int i = 0; i <masSize ; i++) {
            int rand=ArrayUtils.genRandomNum(masRange);
            if ((i%2)==0){
                if ((rand%2)==0){
                    mas[i]=rand;
                } else {
                    mas[i]=rand+1;
                }
            } else {
                if ((rand%2)==0){
                    mas[i]=rand+1;
                } else {
                    mas[i]=rand;
                }
            }
//            ArrayUtils.printArray(mas);
        }
    }
}
