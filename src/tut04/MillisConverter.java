package tut04;

public class MillisConverter {
    public static void main(String[] args) {
        System.out.println(convertMillis(1000));          // 00:00:01
        System.out.println(convertMillis(3601000));       // 01:00:01
        System.out.println(convertMillis(-92233));         // Invalid parameter: millis should not be negative
        System.out.println(convertMillis(555550000));      // 154:19:10
    }

    public static String convertMillis(long millis) {
        // Check for negative input
        if (millis < 0) {
            return "Invalid parameter: millis should not be negative";
        }

        // Calculate hours, minutes, and seconds
        long hours = millis / 3600000;
        long minutes = (millis % 3600000) / 60000;
        long seconds = (millis % 60000) / 1000;

        // Format the result with leading zeros
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
