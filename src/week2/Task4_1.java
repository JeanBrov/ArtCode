package week2;

import com.sun.deploy.util.ArrayUtil;

import java.util.Scanner;

/**
 * 1) Найти минимальное и максимальное значения в массиве и вывести их на консоль
 */
public class Task4_1 {
    public static void main(String[] args) {
        System.out.println("Please type size of your massive");
        Scanner scanner=new Scanner(System.in);
        int masSize=scanner.nextInt();
        System.out.println("Please type range in your massive");
        int masRange=scanner.nextInt();
        int [] mas= ArrayUtils.generateMas(masSize,masRange);

        int min=mas[0];
        int max=mas[0];

        for (int i = 0; i <mas.length ; i++) {
            if (mas[i]<min){
                min=mas[i];
            }
            if (mas[i]>max){
                max=mas[i];
            }
        }
        System.out.println("Minimum value of massive is: "+min+ " Maximum value of massive is: "+max);
//     ArrayUtils.printArray(mas);
    }
}
