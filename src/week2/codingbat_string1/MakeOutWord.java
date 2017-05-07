package week2.codingbat_string1;

/**
 * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string,
 * e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

 makeOutWord("<<>>", "Yay") → "<<Yay>>"
 makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
 makeOutWord("[[]]", "word") → "[[word]]"
 */
public class MakeOutWord {
    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));

    }

    public static String makeOutWord(String out, String word) {
        String startTag=out.substring(0,(out.length())/2);
        String finishTag=out.substring((out.length())/2,out.length());
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(startTag);
        stringBuilder.append(word);
        stringBuilder.append(finishTag);
        return stringBuilder.toString();

    }
}
