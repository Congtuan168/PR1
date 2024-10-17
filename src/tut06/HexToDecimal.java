package tut06;

public class HexToDecimal {
    public static void main(String[] args) {
        String[] testCases = { "0", "1", "A", "F", "10", "1A", "0000", "0001", "", "2A", "FF", "100", "1F4", "1G", "Z" };

        for (String hex : testCases) {
            try {
                int decimal = hex2Dec(hex);
                System.out.println("Hex: " + hex + " -> Decimal: " + decimal);
            } catch (Exception e) {
                System.out.println("An error occurred with hex " + hex + ": " + e.getMessage());
            }
        }
    }

    public static int hex2Dec(String hex) throws IllegalArgumentException {
        // Check for empty string
        if (hex.isEmpty()) {
            throw new IllegalArgumentException("Empty hexadecimal string");
        }

        // Check for invalid characters
        for (char c : hex.toCharArray()) {
            if (!isValidHexChar(c)) {
                throw new IllegalArgumentException("Invalid hexadecimal string");
            }
        }

        // Start the recursive conversion
        return convert(hex.toUpperCase(), hex.length() - 1);
    }

    private static int convert(String hex, int index) {
        // Base case: if index is less than 0, return 0
        if (index < 0) {
            return 0;
        }

        // Get the current character
        char currentChar = hex.charAt(index);
        int currentValue = hexCharToDecimal(currentChar);

        // Calculate the decimal value recursively
        return currentValue * (int) Math.pow(16, hex.length() - 1 - index) + convert(hex, index - 1);
    }

    private static boolean isValidHexChar(char c) {
        return (c >= '0' && c <= '9') || (c >= 'A' && c <= 'F');
    }

    private static int hexCharToDecimal(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0'; // Convert '0'-'9' to 0-9
        } else if (c >= 'A' && c <= 'F') {
            return 10 + (c - 'A'); // Convert 'A'-'F' to 10-15
        }
        throw new IllegalArgumentException("Invalid hex character: " + c);
    }
}
