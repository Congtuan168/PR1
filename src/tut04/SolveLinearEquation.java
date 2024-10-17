package tut04;

public class SolveLinearEquation {
    public static String solveLinearEquation(double a, double b) {
        // Handle cases where a = 0
        if (a == 0) {
            if (b == 0) {
                return "The equation has infinitely many solutions.";
            } else {
                return "The equation has no solution.";
            }
        } else {
            // Calculate and display the unique solution
            double solution = -b / a;
            return "The solution is x = " + solution;
        }
    }

    public static void main(String[] args) {
        System.out.println(solveLinearEquation(5, -10)); // The solution is x = 2.0
        System.out.println(solveLinearEquation(0, 0)); // The equation has infinitely many solutions.
        System.out.println(solveLinearEquation(0, 7)); // The equation has no solution.
        System.out.println(solveLinearEquation(-3, 9)); // The solution is x = 3.0
    }
}
