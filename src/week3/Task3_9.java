package week3;

import java.util.Scanner;

/**
 * 3.9. Умножить две матрицы.
 */
public class Task3_9 {
    public static void main(String[] args) {
        System.out.println("Type the size of the matrixs");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[][] mat1=MatrixUtils.genMatrix(size,5);
        int[][] mat2 =MatrixUtils.genMatrix(size,5);
        multiplyMatrix(mat1,mat2);
    }

    private static void multiplyMatrix(int[][] mat1, int[][] mat2) {
        System.out.println("The sorce matrix 1");
        System.out.println(MatrixUtils.toString(mat1));
        System.out.println("The sorce matrix 2");
        System.out.println(MatrixUtils.toString(mat2));

        int m = mat1.length;
        int n = mat2[0].length;
        int o = mat2.length;
        int[][] mat3 = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    mat3[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("Result matrix: ");
        System.out.println(MatrixUtils.toString(mat3));
    }
}
