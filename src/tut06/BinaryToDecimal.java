package tut06;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String[] testCases = { "0", "1", "10", "11", "100", "0000", "0001", "",
                "1010", "1111", "10000", "101010", "102", "1A" };

        for (String binary : testCases) {
            try {
                int decimal = bin2Dec(binary);
                System.out.println("Binary: " + binary + " -> Decimal: " + decimal);
            } catch (Exception e) {
                System.out.println("An error occurred with binary " + binary + ": " + e.getMessage());
            }
        }
    }

    public static int bin2Dec(String binary) throws IllegalArgumentException {
        // Check for empty string
        if (binary.isEmpty()) {
            throw new IllegalArgumentException("Empty string");
        }

        // Check for invalid characters
        for (char c : binary.toCharArray()) {
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("Invalid binary string");
            }
        }

        // Start the recursive conversion
        return convert(binary, 0);
    }

    private static int convert(String binary, int index) {
        if (index == binary.length()) {
            return 0;
        }

        int currentBit = binary.charAt(index) - '0';
        int powerOfTwo = (int) Math.pow(2, (binary.length() - 1 - index));
        int currentValue = currentBit * powerOfTwo;

        return currentValue + convert(binary, index + 1);
    }
}
