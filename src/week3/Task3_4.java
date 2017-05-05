package week3;

import java.util.Scanner;

/**
 * 3.4. Создать массив, который будет состоять из диагонали матрици
 */
public class Task3_4 {
    public static void main(String[] args) {
        System.out.println("Type the size of the matrix");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[][] matrix=MatrixUtils.genMatrix(size,10);
        int[] arr=new int[size];
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i==j){
                    arr[i]=matrix[i][j];
                }
            }

        }
//        Testing
//        System.out.println(MatrixUtils.toString(matrix));
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
    }
}
