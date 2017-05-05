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

    private static void onesZerosFinding(String str){
        int length=str.length();
        int[] arr=new int[length];
        for (int i = 0; i <length ; i++) {
            arr[i]=Character.getNumericValue(str.charAt(i));
        }

        int finishPositionOne=-1;
        int finishPositionZero=-1;
        int counterZero=0;
        int counterOne=0;
        int max_Zeros=0;
        int max_Ones=0;
        for (int i = 0; i <arr.length ; i++) {

//            Logic of counting Zeroes(Ones). We calculate the maximum of zeroes(ones) and find position of the last digit than
//            finding position of start chain.

            if ((arr[i]==0)){
                counterZero++;
            }else  {
                if (max_Zeros<counterZero){
                    max_Zeros=counterZero;
                    finishPositionZero=i;
                }
                counterZero=0;
            }
            if ((arr[i]==0)&&(i==(arr.length-1))){
                if (max_Zeros<counterZero){
                    max_Zeros=counterZero;
                    finishPositionZero=i;
                }
            }
//
            if ((arr[i]==1)){
                counterOne++;
            }else  {
                if (max_Ones<counterOne){
                    max_Ones=counterOne;
                    finishPositionOne=i;
                }
                counterOne=0;
            }
            if ((arr[i]==0)&&(i==(arr.length-1))){
                if (max_Ones<counterOne){
                    max_Ones=counterOne;
                    finishPositionOne=i;
                }
            }
        }
        int startPositionZero=finishPositionZero-max_Zeros+1;
        int startPositionOne=finishPositionOne-max_Ones+1;
        System.out.println("("+startPositionZero+","+ finishPositionZero+") - цепочка нулей");
        System.out.println("("+startPositionOne+","+finishPositionOne+") - цепочка едениц");
    }
}
