package week2;

import java.util.Scanner;

/**
 * 2) Поменять местами наибольший
*  и наименьший элементы в массиве
 */
public class Task4_2 {
    public static void main(String[] args) {
        System.out.println("Please type size of your massive");
        Scanner scanner=new Scanner(System.in);
        int masSize=scanner.nextInt();
        System.out.println("Please type range in your massive");
        int masRange=scanner.nextInt();
        int [] mas= ArrayUtils.generateMas(masSize,masRange);

        int min=mas[0];
        int max=mas[0];
        int minIndex=0;
        int maxIndex=0;


        for (int i = 0; i <mas.length ; i++) {
            if (mas[i]<min){
                minIndex=i;
            }
            if (mas[i]>max){
                maxIndex=i;
            }
        }
//        ArrayUtils.printArray(mas);

        int tmp=mas[minIndex];
        mas[minIndex]=mas[maxIndex];
        mas[maxIndex]=tmp;
//        System.out.println("*************************");
//        ArrayUtils.printArray(mas);

    }
}
