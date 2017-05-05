package week3;

import java.util.Scanner;

/**
 * 3.8. Верхний регистр.

 Напишите программу, которая позволяет пользователю ввести в консоли строку,
 переводит первый символ слов в верхний регистр и результат выводит в консоль

 Вход:
 иван васильевич

 Выход:
 Иван Васильевич
 */

public class Task3_8 {
    public static void main(String[] args) {
        System.out.println("Type the row");
        Scanner scanner=new Scanner(System.in);
        String row=scanner.nextLine();
        firstLetterToUpperCase(row);
    }

    private static void firstLetterToUpperCase(String row) {
    String[] arrWordsEntrance = row.split(" ");
    String[] arrWordsResult=new String[arrWordsEntrance.length];
        for (int i = 0; i <arrWordsEntrance.length ; i++) {
            arrWordsResult[i]=arrWordsEntrance[i].substring(0,1).toUpperCase()+arrWordsEntrance[i].substring(1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <arrWordsResult.length ; i++) {
            stringBuilder.append(arrWordsResult[i]+" ");
        }
        System.out.println(stringBuilder.toString());
    }
}
