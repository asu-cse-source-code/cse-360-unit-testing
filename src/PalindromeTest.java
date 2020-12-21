import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * PalindromeTest sets up my junit tests on the Palindrome class' method isPalindrome()
 * There are 7 different tests set up to make sure the method is working for 7 different cases
 *
 * @author Austin Spencer
 * @version 1.0
 * @since 11/03/2020
 */
public class PalindromeTest {
    @Test
    public void simplePalindromeTest() {
        // Test Case 1
        String str = "racecar";
        Palindrome tester = new Palindrome(str);

        // This is a basic palindrome with no spacing or capitalization
        // Should return true

        assertTrue(tester.isPalindrome(), "'racecar' is a palindrome " +
                "and must return true");
    }

    @Test
    public void nonSimplePalindromeTest() {
        // Test Case 2
        String str = "RACE Car";
        Palindrome tester = new Palindrome(str);

        // This test takes the basic palindrome and adds a space and mixed capitalization
        // Should return true

        assertTrue(tester.isPalindrome(), "'RACE Car' is a palindrome " +
                "and must return true");
    }

    @Test
    public void nonPalindromeTest() {
        // Test Case 3
        String str = "Not a palindrome";
        Palindrome tester = new Palindrome(str);

        // This test is just making sure a non palindrome is false
        // Should return false

        assertFalse(tester.isPalindrome(), "'Race cars' is not a palindrome " +
                "and must return false");
    }

    @Test
    public void singleLetterTest() {
        // Test Case 4
        String str = "a";
        Palindrome tester = new Palindrome(str);

        // This test is testing a single letter as a palindrome
        // Should return true

        assertTrue(tester.isPalindrome(), "'a' is a palindrome and must return true");
    }

    @Test
    public void palindromeIntegerTest() {
        // Test Case 5
        String str = "1234321";
        Palindrome tester = new Palindrome(str);

        // This test is to check if integers work as palindromes as they should
        // Should return true

        assertTrue(tester.isPalindrome(), "'1234321' is a palindrome and " +
                "must return true");
    }

    @Test
    public void nonPalindromeIntegerTest() {
        // Test Case 6
        String str = "123456";
        Palindrome tester = new Palindrome(str);

        // This test is to make sure non palindromes of integers work
        // Should return false

        assertFalse(tester.isPalindrome(), "'123456' is not a palindrome and " +
                "must return false");
    }

    @Test
    public void complexPalindromeTest() {
        // Test Case 7
        String str = "A nEw coMpleX paLiNdroMe 4000 x 0004 EmordnIlAPxeLPmocwENA     ";
        Palindrome tester = new Palindrome(str);

        // This test is to check if a complex phrase with mixed capitalization, integers
        // and letters will still recognize palindrome correctly
        // Should return true

        assertTrue(tester.isPalindrome(),
                "'A nEw coMpleX paLiNdroMe 4000 x 0004 EmordnIlAPxeLPmocwENA      '" +
                        "is a palindrome and must return true");
    }
}
