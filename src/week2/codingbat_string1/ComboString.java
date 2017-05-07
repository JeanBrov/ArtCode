package week2.codingbat_string1;

/**
 * Given 2 strings, a and b, return a string of the form short+long+short,
 * with the shorter string on the outside and the longer string on the inside.
 * The strings will not be the same length, but they may be empty (length 0).

 comboString("Hello", "hi") → "hiHellohi"
 comboString("hi", "Hello") → "hiHellohi"
 comboString("aaa", "b") → "baaab"
 */
public class ComboString {
    public static void main(String[] args) {
        System.out.println(comboString("Hello", "hi"));

    }
    private static String comboString(String a, String b) {
        if (a.length()>b.length()){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(b);
            stringBuilder.append(a);
            stringBuilder.append(b);
            return stringBuilder.toString();
        }
        else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append(b);
            stringBuilder.append(a);
            return stringBuilder.toString();
        }

    }
}
