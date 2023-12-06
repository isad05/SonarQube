public class Example {
    private static int staticField = 10;

    public static void staticMethod() {
        int value = $this.staticField; // This will result in a compilation error
        System.out.println(value);
    }

    public static void main(String[] args) {
        staticMethod();
    }
}
