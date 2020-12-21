import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * This is the runner for my test cases within the MyTests class
 * When ran will run each method with @Tests before it
 * If there is an error it will print the error with my message and what was expected versus
 * what the actual result is
 *
 * @author Austin Spencer
 * @version 1.0
 * @since 11/03/2020
 */
public class MyTestRunner {

    /**
     * Main function to be ran
     * Nothing will be printed in output if each test is correct
     * @param args
     */
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(PalindromeTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}
