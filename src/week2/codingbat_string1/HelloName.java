package week2.codingbat_string1;

/**
 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

 helloName("Bob") → "Hello Bob!"
 helloName("Alice") → "Hello Alice!"
 helloName("X") → "Hello X!"
 */
public class HelloName {
    public static void main(String[] args) {

    }

    public static String helloName(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello ");
        stringBuilder.append(name);
        stringBuilder.append("!");
        return stringBuilder.toString();

    }
}
