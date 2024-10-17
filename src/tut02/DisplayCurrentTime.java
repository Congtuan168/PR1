package tut02;


public class DisplayCurrentTime {
    public static void main(String[] args) {
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
