// File: Example.java

import java.util.ArrayList;
import java.util.List;

public class Example {


    private String unusedField;


    public void criticalIssueExample() {
        try {
  
            throw new RuntimeException("Critical issue: Unhandled exception");
        } catch (Exception e) {

        }
    }


    public void minorIssueExample(int unusedParameter) {
        System.out.println("Minor issue: Unused method parameter");
    }


    public void blockerIssueExample() {
        while (true) {
            System.out.println("Blocker issue: Infinite loop");
        }
    }

    public void infoIssueExample() {
        System.out.println("Info issue: This is an informative message.");
    }

    public double divideByZero() {
        int numerator = 10;
        int denominator = 0; 
        return numerator / denominator;
    }

  
    public void nullPointerDereference() {
        String str = null;
        System.out.println(str.length()); 
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.criticalIssueExample();
        example.minorIssueExample(42);
        example.blockerIssueExample();
        example.infoIssueExample();

    
        example.divideByZero();
        example.nullPointerDereference();
    }
}
