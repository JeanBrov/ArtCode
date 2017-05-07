package week2.codingbat_string1;

/**
 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

 extraEnd("Hello") → "lololo"
 extraEnd("ab") → "ababab"
 extraEnd("Hi") → "HiHiHi"
 */
public class ExtraEnd {
    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));

    }
    public static String extraEnd(String str) {
        String chars2=str.substring((str.length()-2),str.length());
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(chars2);
        stringBuilder.append(chars2);
        stringBuilder.append(chars2);
        return stringBuilder.toString();
    }
}
