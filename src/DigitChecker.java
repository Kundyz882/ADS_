public class DigitChecker {
    /**
     * Checks if the given string consists only of digits using recursion.
     *
     * Time complexity: O(n), where n is the length of the string.
     * The function processes each character once, making a single recursive call for each.
     *
     * @param s The input string.
     * @param index The current index being checked.
     * @return "Yes" if the string contains only digits, otherwise "No".
     */
    public String isAllDigits(String s, int index) {
        if (index == s.length()) {
            return "Yes";
        }
        if (!Character.isDigit(s.charAt(index))) {
            return "No";
        }
        return isAllDigits(s, index + 1);
    }
}
