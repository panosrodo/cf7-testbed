package gr.aueb.cf.challenges.ch14;

public class ValidationUtils {

    private ValidationUtils() {
    }

    public static boolean isValidLength(String input) {
        if (input == null) return false;
        int length = input.length();
        return length >= 1 && length <= 31;
    }

    public static boolean isNumberInRange(int number) {
        return number >= 1 && number <= 10;
    }
}
