package tut04;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(-9));
        System.out.println(sumDigits(10001));
        System.out.println(sumDigits(234));
        System.out.println(sumDigits(10000));
    }

    public static String sumDigits(int num) {
        // Input validation
        if (num < 0) {
            return "Invalid Argument: num should not be negative";
        }
        else if (num > 10000) {
            return "Input Mismatch: num should be an integer between 0 and 10000";
        }

        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add the last digit to the sum
            num /= 10; // Remove the last digit from the number
        }
        return String.valueOf(sum);
    }
}
