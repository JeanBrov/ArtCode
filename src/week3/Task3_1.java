package week3;

import java.util.Scanner;

/**
 * 3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8
 */
public class Task3_1 {
    public static void main(String[] args) {
        System.out.println("Type the size of the matrix");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[][] mat=MatrixUtils.genMatrix(size,10);

//        System.out.println("Start matrix");
//        System.out.println(MatrixUtils.toString(mat));

        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[i].length ; j++) {
                if(((mat[i][j]%5)==0)&&(mat[i][j]!=0)){
                    mat[i][j]=8;
                }
            }
        }

//        System.out.println("Result matrix");
//        System.out.println(MatrixUtils.toString(mat));

    }
}
