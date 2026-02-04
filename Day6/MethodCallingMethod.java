public class MethodCallingMethod {

    static void greet() {
        System.out.println("Hello");
    }

    static void welcome() {
        greet();   // method calling another method
        System.out.println("Welcome to Java");
    }

    public static void main(String[] args) {
        welcome();
    }
}
