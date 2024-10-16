package tut03;

import java.util.Scanner;

public class PointInARectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a point (x, y)
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Check whether the point is within the rectangle
        // centered at (0, 0) with width 10 and height 5
        boolean withinRectangle = (Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 ) ||
                (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2);

        // Display results
        System.out.println("Point (" + x + ", " + y + ") is " +
                ((withinRectangle) ? "in " : "not in ") + "the rectangle");
    }

}
