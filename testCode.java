import java.util.ArrayList;
import java.util.List;

public class SonarQubeSample {

    public static void main(String[] args) {
        // Unused variable
        int unusedVariable = 10;

        // Null pointer exception
        String nullPointerExample = null;
        System.out.println(nullPointerExample.length());

        // Infinite loop
        while (true) {
            // Some code
        }

        // Incorrect exception handling
        try {
            // Code that may throw an exception
        } catch (Exception e) {
            // Empty catch block
        }

        // Unreachable code
        System.out.println("This code is unreachable");

        // List with raw types
        List list = new ArrayList();

        // Deprecated method
        int result = Math.abs(-5);

        // Division by zero
        int denominator = 0;
        int resultDivisionByZero = 42 / denominator;
    }
}
