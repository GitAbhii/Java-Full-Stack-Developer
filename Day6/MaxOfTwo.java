public class MaxOfTwo {

    static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int max = findMax(10, 20);
        System.out.println("Max = " + max);
    }
}
