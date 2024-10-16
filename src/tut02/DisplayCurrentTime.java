package tut02;

import java.util.Calendar;
import java.util.TimeZone;

public class DisplayCurrentTime {
    public static void main(String[] args) {
        /**
//         * Cách 1: Dùng thư viện Calender lấy GMT+7
//         */
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+7"));
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        // Print the current time in GMT format
        System.out.printf("%02d:%02d:%02d GMT%n", hour, minute, second);

        /**
         * Cách 2: Dùng System.currentTimeMillis();
         */

        // Obtain the total milliseconds since the UNIX epoch
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since the UNIX epoch
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Display results
        System.out.println("Current time in GMT is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }

}
