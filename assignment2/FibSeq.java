import java.util.Arrays;
/**
 *  The FibSeq class generates and prints out the first 10 values of the fibonacci sequence.
 */
public class FibSeq {
    public static int n0 = 0, n1 = 1;

    /**
     * The fibNthValue method returns the Nth value from the fibonacci sequence
     *
     * @param n - position of the fibonacci sequence value to return
     * @return Nth value from the fibonacci sequence
     */
    static int fibNthValue(int n){
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (n<0) return -1;

        // Initialize variables to store the last two values
        int previous = n0;
        int current = n1;

        // Calculate and store the Nth value
        for (int i = 2; i <= n; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }

        return current;
    }


    public static void main(String[] args){
        int nthValue = fibNthValue(10);
        System.out.println("The 10th value of the Fibonacci sequence is: " + nthValue);
    }
}
