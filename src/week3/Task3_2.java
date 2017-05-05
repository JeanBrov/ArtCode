package week3;

import java.util.Scanner;

/**
 * 3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.
 */
public class Task3_2 {
    public static void main(String[] args) {
        System.out.println("Type the size of the matrix");
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        boolean[][]matBoolean=new boolean[size][size];

        for (int i = 0; i <matBoolean.length ; i++) {
            for (int j = 0; j <matBoolean[i].length ; j++) {
                if(i==j){matBoolean[i][j]=true;}
                else matBoolean[i][j]=false;
            }
        }
//        Print matrix
//        String matRes = "";
//        for (int i = 0; i <matBoolean.length ; i++) {
//            for (int j = 0; j <matBoolean[i].length ; j++) {
//                matRes=matRes+matBoolean[i][j]+" ";
//            }
//            matRes=matRes+"\n";
//        }
//        System.out.println(matRes);
    }
}
