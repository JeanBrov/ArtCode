package week3;

import java.util.Scanner;

/**
 * 3.6. Нули

 Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.

 Вход:
 10001101001

 Выход:
 (2,4) - цепочка нулей
 (5,6) - цепочка единиц
 */
public class Task3_6 {
    public static void main(String[] args) {
        System.out.println("Type the chaine of 0 or 1");
        Scanner scanner=new Scanner(System.in);
        String chaine=scanner.next();
        onesZerosFinding(chaine);

    }

    public static void onesZerosFinding(String str){
        int length=str.length();
        int[] arr=new int[length];
        for (int i = 0; i <length ; i++) {
            arr[i]=Character.getNumericValue(str.charAt(i));
//            System.out.println(arr[i]);
        }
        int startPositionOne;
        int finishPositionOne;
        int startPositionZero;
        int finishPositionZero;

        int counterZero=0;
        int counterOne=0;
        boolean tagOne=false;
        boolean tagZero=false;
        


        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==0){tagZero=true;}
            if (arr[i]==1){tagOne=true;}
            if (arr[i]==0){
                counterOne++;

            }
        }
    }
}
