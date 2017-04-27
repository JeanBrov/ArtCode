package week2;

import java.util.Scanner;

/**
 * 7) Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
 */
public class Task4_7 {
    public static void main(String[] args) {
        System.out.println("Please type size of your massives");
        Scanner scanner = new Scanner(System.in);
        int masSize = scanner.nextInt();
        System.out.println("Please type range in your massive");
        int masRange = scanner.nextInt();
        int[] mas= ArrayUtils.generateMas(masSize,masRange);

//        ArrayUtils.printArray(mas);

        double sumFirstPart=0;
        double sumSecondPart=0;
        int midMas=mas.length/2;

        for (int i = 0; i <midMas ; i++) {
            sumFirstPart=sumFirstPart+mas[i];
        }
        for (int i = midMas; i <mas.length ; i++) {
            sumSecondPart=sumSecondPart+mas[i];
        }

        double averageFirstMas=sumFirstPart/midMas;
        double averageSecondMas=sumSecondPart/(mas.length-midMas);

//        System.out.println("averageFirstMas= "+averageFirstMas+" averageSecondMas= "+averageSecondMas);

        if (averageFirstMas>averageSecondMas){
            for (int i = 0; i <midMas ; i++) {
                System.out.print(mas[i]+" ");
            }
        }else {
            for (int i = midMas; i <mas.length ; i++) {
                System.out.print(mas[i]+" ");
            }
        }
            }
}
