

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example {


    private String unusedField;

 
    public void uncheckedExceptionExample() {
        try {
          
            throw new RuntimeException("Unchecked exception: High Severity");
        } catch (Exception e) {
  
        }
    }


    public void resourceLeakExample() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("example.txt");
         
        } catch (IOException e) {
            
        } finally {
            
        }
    }


    public void deprecatedMethodExample() {
        String deprecatedValue = "Deprecated method: High Severity";
        System.out.println(deprecatedValue);
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.uncheckedExceptionExample();
        example.resourceLeakExample();
        example.deprecatedMethodExample();
    }
}
