public class HighSeverityExample {


    public void unhandledException() {
        try {

            throw new RuntimeException("High Severity: Unhandled exception");
        } catch (Exception e) {

        }
    }

    // High Severity Issue: Hardcoded password
    public String getPassword() {
        return "HighSeverity@123";
    }


    public void deprecatedMethod() {
        String deprecatedValue = "Deprecated method: High Severity";
        System.out.println(deprecatedValue);
    }

    public void infiniteLoop() {
        while (true) {
            System.out.println("High Severity: Infinite loop");
        }
    }

    public void sqlInjectionVulnerability(String userInput) {
        String query = "SELECT * FROM users WHERE username = '" + userInput + "'";

    }

    public static void main(String[] args) {
        HighSeverityExample example = new HighSeverityExample();
        example.unhandledException();
        example.getPassword();
        example.deprecatedMethod();
        example.infiniteLoop();
        example.sqlInjectionVulnerability("user'); DROP TABLE users; --");
    }
}
