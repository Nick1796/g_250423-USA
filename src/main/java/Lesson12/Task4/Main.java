package Lesson12.Task4;

public class Main {

    public static void main(String[] args) {
        System.out.println(getReversedConcatString("Hello", "World"));

    }

    public static String getReversedConcatString(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        builder.append(word1).append(word2);
        builder.reverse();
        return builder.toString();

    }
}
