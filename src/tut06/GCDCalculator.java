package tut06;

public class GCDCalculator {
    public static void main(String[] args) {
        System.out.println("GCD of 8 and 4 is: " + gcd(8, 4));
        System.out.println("GCD of 17 and 3 is: " + gcd(17, 3));
        System.out.println("GCD of 7 and 0 is: " + gcd(7, 0));
        System.out.println("GCD of -24 and 18 is: " + gcd(-24, 18));
        System.out.println("GCD of -42 and -56 is: " + gcd(-42, -56));
    }

    public static int gcd(int m, int n) {
        // Handle the case where n is 0
        if (n == 0) {
            System.out.println("Error: / by zero");
            return -1; // Return -1 as per your requirement
        }

        // Use absolute values to handle negative numbers
        m = Math.abs(m);
        n = Math.abs(n);

        // Recursive case
        if (m % n == 0) {
            return n; // GCD is n
        } else {
            return gcd(n, m % n); // Recursive call
        }
    }
}
