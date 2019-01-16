package Problems._2_;

/*
    --- Even Fibonacci Numbers ---
    By considering the terms in the Fibonacci sequence
    whose values do not exceed four million,
    find the sum of the even-valued terms.
 */

public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        final int N = 4_000_000;
        long sum = 0;

        int prev = 0;
        int current = 2;
        int next;

        while (current < N) {
            // recurrence for even Fibonacci sequence
            next = 4 * current + prev;

            sum += current;

            prev = current;
            current = next;
        }

        System.out.println(sum);        // = 4_613_732 (sum of 11 even numbers)
    }
}