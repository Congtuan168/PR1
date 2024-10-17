package tut06;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int[] testCases = { 0, 1, 10, 15, 16, 32, 255, 256, 4095, 2048, 8192, 1048575, Integer.MAX_VALUE, -1 };

        for (int number : testCases) {
            String hex = dec2Hex(number);
            System.out.println("Decimal: " + number + " -> Hex: " + hex);
        }
    }

    public static String dec2Hex(int number) {
        // Handle negative numbers
        if (number < 0) {
            return "Negative number";
        }

        // Base case for 0
        if (number == 0) {
            return "0";
        }

        // Start the recursive conversion
        return convertToHex(number);
    }

    private static String convertToHex(int number) {
        // Base case: if number is 0, return an empty string (handled in dec2Hex)
        if (number == 0) {
            return "";
        }

        // Recursive case: divide by 16 and get the hex representation of the quotient
        String hexDigits = "0123456789ABCDEF";
        return convertToHex(number / 16) + hexDigits.charAt(number % 16);
    }
}
