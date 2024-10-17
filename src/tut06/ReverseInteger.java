package tut06;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.print("Reversed integer: ");
        displayReversed(-345);

        System.out.print("Reversed integer: ");
        displayReversed(4);

        System.out.print("Reversed integer: ");
        displayReversed(24);

        System.out.print("Reversed integer: ");
        displayReversed(1000);
    }

    public static void displayReversed(int number) {
        // Check for negative input
        if (number < 0) {
            System.out.println("Input value cannot be negative!");
            return;
        }

        // Call the recursive method
        displayReversedHelper(number);
        System.out.println(); // For newline after the reversed number
    }

    private static void displayReversedHelper(int number) {
        // Base case: if number is 0, stop recursion
        if (number == 0) {
            return;
        }

        // Recursive case: print last digit and call method with number divided by 10
        System.out.print(number % 10);
        displayReversedHelper(number / 10);
    }
}
