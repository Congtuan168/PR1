package tut06;

public class SumSeries {
    public static void main(String[] args) {
        System.out.println("Sum of the series with i = 10 is: " + String.format("%.2f", sumSeriesWithRecursion(10)));
        System.out.println("Sum of the series with i = 11 is: " + String.format("%.2f", sumSeriesWithRecursion(11)));
        System.out.println("Sum of the series with i = 0 is: " + String.format("%.2f", sumSeriesWithRecursion(0)));
        System.out.println("Sum of the series with i = -4 is: " + String.format("%.2f", sumSeriesWithRecursion(-4)));
    }

    public static double sumSeriesWithRecursion(int i) {
        // Return 0 for i <= 0 to handle edge cases
        if (i == 0) {
            return 0.0;
        }
        // Return -1 if i > 10
        if (i > 10 || i < 0) {
            return -1;
        }
        // Base case: when i = 1
        if (i == 1) {
            return 1.0 / 2; // m(1) = 1/2
        }
        // Recursive case: m(i) = m(i-1) + i/(i+1)
        return sumSeriesWithRecursion(i - 1) + (double) i / (i + 1);
    }
}
