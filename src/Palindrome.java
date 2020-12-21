/**
 * Palindrome is a class that will check if a given string is a palindrome
 *
 * @author Austin Spencer
 * @version 1.0
 * @since 11/03/2020
 */
public class Palindrome {
    private String testString;

    /**
     * General Constructor with 1 parameter
     * Takes given string and strips the spaces and converts to lowercase
     *
     * @param str given string to check if it is a palindrome
     */
    public Palindrome(String str) {
        testString = str.replaceAll("\\s+", "").toLowerCase();
    }

    /**
     * This method takes a String as a parameter and will return true if the string
     * is a palindrome and false if the string is not a palindrome
     *
     * @return true if the String is a palindrome, false otherwise
     */
    public boolean isPalindrome() {
        boolean palindrome = true;
        int i = 0;
        int j = testString.length() - 1;

        while (i < j) {
            if (testString.charAt(i) != testString.charAt(j)) {
                palindrome = false;
            }
            i++;j--;
        }
        return palindrome;
    }
}
