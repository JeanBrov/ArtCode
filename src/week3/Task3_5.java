package week3;

import java.util.Scanner;

/**
 * 3.5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
 * b) Поменять наибольший и наименьший столбик в двухмерном массиве.
 */
public class Task3_5 {
    public static void main(String[] args) {
        System.out.println("Type the size of the matrix");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[][] matrix=MatrixUtils.genMatrix(size,10);

//        Testing
        System.out.println("Before");
        System.out.println(MatrixUtils.toString(matrix));
        System.out.println("After");
        System.out.println(MatrixUtils.toString(changeMaxRowMinRow(matrix)));
        System.out.println(MatrixUtils.toString(changeMaxColMinCol(matrix)));
    }

    public static int[][] changeMaxRowMinRow(int[][] matrix){
        int firstRowSum=0;
        for (int i = 0; i <matrix.length ; i++) {
            firstRowSum=firstRowSum+matrix[0][i];
        }

        int maxSum=firstRowSum;
        int minSum=firstRowSum;
        int rowMax=0;
        int rowMin=0;
//i - row, j-col
        for (int i = 0; i <matrix.length ; i++) {
            int tmpSum=0;
            for (int j = 0; j <matrix[i].length ; j++) {
                tmpSum=tmpSum+matrix[i][j];
            }

            if (maxSum<tmpSum){
                maxSum=tmpSum;
                rowMax=i;
            }
            if (minSum>tmpSum){
                minSum=tmpSum;
                rowMin=i;
            }
        }

        int[] tmp= matrix[rowMax];
        matrix[rowMax]=matrix[rowMin];
        matrix[rowMin]=tmp;
//        System.out.println("Maximum sum = "+ maxSum+" Row = "+rowMax);
//        System.out.println("Minimum sum = "+minSum+" Row ="+rowMin);
        return matrix;
    }

    public static int[][] changeMaxColMinCol(int[][] matrix){
        int firstColSum=0;
        for (int i = 0; i <matrix.length ; i++) {
            firstColSum=firstColSum+matrix[i][0];
        }
        int maxSum=firstColSum;
        int minSum=firstColSum;
        int colMax=0;
        int colMin=0;
//i - col, j-row
        for (int i = 0; i <matrix.length ; i++) {
            int tmpSum=0;
            for (int j = 0; j <matrix[i].length ; j++) {
                tmpSum=tmpSum+matrix[j][i];
            }
            if (maxSum<tmpSum){
                maxSum=tmpSum;
                colMax=i;
            }
            if (minSum>tmpSum){
                minSum=tmpSum;
                colMin=i;
            }
        }

//        System.out.println("Maximum sum = "+ maxSum+" Col = "+colMax);
//        System.out.println("Minimum sum = "+minSum+" Col = "+colMin);

        for (int i = 0; i <matrix.length ; i++) {
            int tmp=matrix[i][colMax];
            matrix[i][colMax]=matrix[i][colMin];
            matrix[i][colMin]=tmp;
        }
        return matrix;
    }
}
