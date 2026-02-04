public class EvenOddMethod {

    static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        checkEvenOdd(7);
    }
}
