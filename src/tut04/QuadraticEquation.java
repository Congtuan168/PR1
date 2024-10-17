package tut04;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get coefficients from the user
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Call the method to solve the equation
        solveQuadraticEquation(a, b, c);
    }

    public static void solveLinearEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinitely many solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double solution = -b / a;
            System.out.printf("The solution of the linear equation %.2fx + %.2f = 0 is: x = %.2f%n", a, b, solution);
        }
    }

    public static void solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            // Treat as linear equation
            System.out.println("The equation is linear.");
            solveLinearEquation(b, c);
        } else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("The quadratic equation has two real roots: x1 = %.2f and x2 = %.2f%n", root1, root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.printf("The quadratic equation has one real root: x = %.2f%n", root);
            } else {
                System.out.println("The quadratic equation has no real roots.");
            }
        }
    }
}
