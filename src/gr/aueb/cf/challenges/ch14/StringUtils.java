package gr.aueb.cf.challenges.ch14;

public class StringUtils {

    private StringUtils() {
    }

    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }

    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }

    public static boolean isPalindrome(String input) {
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        return input.equalsIgnoreCase(reversed.toString());
    }
}
