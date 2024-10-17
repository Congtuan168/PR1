package tut06;

public class DecimalToBinary {
    public static void main(String[] args) {
        int[] testCases = { 0, 1, 2, 3, 4, 5, 10, 15, 16, 255, 1023, 2048, Integer.MAX_VALUE, -1 };

        for (int number : testCases) {
            String binary = dec2Bin(number);
            System.out.println("Decimal: " + number + " -> Binary: " + binary);
        }
    }

    public static String dec2Bin(int number) {
        // Handle negative numbers
        if (number < 0) {
            return "Negative number";
        }

        // Base case for 0
        if (number == 0) {
            return "0";
        }

        // Start the recursive conversion
        return convertToBinary(number);
    }

    private static String convertToBinary(int number) {
        // Base case: if number is 0, return an empty string (handled in dec2Bin)
        if (number == 0) {
            return "";
        }

        // Recursive case: divide by 2 and get the binary representation of the quotient
        return convertToBinary(number / 2) + (number % 2);
    }
}
