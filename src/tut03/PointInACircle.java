package tut03;

import java.util.Scanner;

public class PointInACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a point
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Check whether the point is within the circle
        boolean withinCircle =
                (Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5) <= 10);

        // Display results
        System.out.println("Point (" + x + ", "+ y + ") is " +
                ((withinCircle) ? "in " : "not in ") + "the circle");
    }
}
