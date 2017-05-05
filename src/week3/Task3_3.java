package week3;

/**
 * 3.3. Написать метод, который проверяет является ли строка палиндромом
 */
public class Task3_3 {
    public static void main(String[] args) {
//Test
        System.out.println(isPolinom("aaabaaa"));
    }

    public static boolean isPolinom(String str){
        str=str.replaceAll("\\W","");
        String strReversed=new StringBuilder(str).reverse().toString();
        return (str.equalsIgnoreCase(strReversed));
    }
}
