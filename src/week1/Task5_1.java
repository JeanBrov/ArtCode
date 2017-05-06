package week1;

import java.util.Scanner;

/**
 * 5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число

 */
public class Task5_1 {
    public static void main(String[] args) {
        System.out.println("If you wish convert from decimal to binary type DB, if from binary to decimal type BD");
        Scanner scanner = new Scanner(System.in);
        String convertion=scanner.next();
        int number=0;
        String binaryStr="";
        if (convertion.equals("DB")){
            System.out.println("Please type decimal digits");
            number=scanner.nextInt();
            String binaryDigit=convertToBinary(number);
//            String binaryDigit=Integer.toBinaryString(number);
            System.out.println(binaryDigit);
        }
        else if(convertion.equals("BD")){
            System.out.println("Please type binary digits");
            binaryStr=scanner.next();
            System.out.println(Integer.parseInt(binaryStr,2));
        }
        else System.out.println("Failed input.");

    }

    private static String convertToBinary(int number) {
        int a;
        StringBuilder binaryDigit=new StringBuilder();
        while(number!=0){
            a=number%2;
            binaryDigit.append(a);
            number=number/2;
        }

        return binaryDigit.reverse().toString();
    }
}
