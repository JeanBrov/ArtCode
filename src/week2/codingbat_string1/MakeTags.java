package week2.codingbat_string1;

/**
 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag
 * makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

 makeTags("i", "Yay") → "<i>Yay</i>"
 makeTags("i", "Hello") → "<i>Hello</i>"
 makeTags("cite", "Yay") → "<cite>Yay</cite>"
 */
public class MakeTags {
    public static void main(String[] args) {
        System.out.println(makeTags("i", "Yay"));

    }

    public static String makeTags(String tag, String word) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");
        stringBuilder.append(tag);
        stringBuilder.append(">");
        stringBuilder.append(word);
        stringBuilder.append("</");
        stringBuilder.append(tag);
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}
