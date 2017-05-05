package week3;

import week2.ArrayUtils;

/**
 * Created by Ivan.Kriskun on 27.04.2017.
 */
public class MatrixUtils {
    public static String toString(int[][] mat) {
        if (mat == null) {
            return "wrong argument, mat is null";
        }

        if (mat.length == 0) {
            return "empty matrix";
        }

        String matRes = "";

        // row
        for (int i = 0; i < mat.length; i++) {
            int[] row = mat[i];
            for (int j = 0; j < row.length; j++) {
                int col = mat[i][j];
                matRes += col + " ";
            }

            matRes += "\n";
        }

        return matRes;
    }

    public static int[][] genMatrix(int size, int range) {
        int[][] mat = new int[size][size];
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[i].length ; j++) {
                mat[i][j]=genRandomNum(range);
            }
        }

        return mat;
    }

    public static int genRandomNum(int range){
        return (int)(Math.random()*range);
    }
}