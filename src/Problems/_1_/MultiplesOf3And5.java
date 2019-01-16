package Problems._1_;

/*
    --- Multiples of 3 and 5 ---
    Find the sum of all the multiples of 3 or 5 below 1000
 */

public class MultiplesOf3And5 {
    public static void main(String[] args) {
        final int N = 1000;
        int sum = 0;

        // sum of arithmetic progression
        // sum of numbers multiples of 3
        int totalElements = N / 3;
        sum += totalElements * (3 + totalElements * 3) / 2;

        // sum of numbers multiples of 5
        totalElements = (N - 1) / 5;
        sum += totalElements * (5 + totalElements * 5) / 2;

        // sum of numbers multiples of 15
        // must be subtracted from the total sum to remove duplicate
        totalElements = N / 15;
        sum -= totalElements * (15 + totalElements * 15) / 2;

        System.out.println(sum);        // = 233168
    }
}