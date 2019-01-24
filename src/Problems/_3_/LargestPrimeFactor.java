package Problems._3_;

/*
    --- Largest Prime Number ---
    What is the largest prime factor of the number 600851475143 ?
 */

public class LargestPrimeFactor {
    public static void main(String[] args) {
        long num = 600_851_475_143l;
        long maxPrimeFactor = 1;

        // number is a power of 2 or will be odd after this
        while (num % 2 == 0) {
            num >>= 1;
            maxPrimeFactor = 2;
        }

        // iterate only for odd factors
        // if factor was found that it's clearly prime
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                num /= i;
                maxPrimeFactor = i;
            }
        }

        if (num > 1) {
            maxPrimeFactor = num;
        }

        System.out.println("Max prime factor: " + maxPrimeFactor);    // = 6857
    }
}