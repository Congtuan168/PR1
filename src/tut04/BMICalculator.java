package tut04;

public class BMICalculator {
    public static void main(String[] args) {
        System.out.println("Your BMI is: " + calculateBMI(70, 1.75));  // Valid input
        System.out.println("Your BMI is: " + calculateBMI(-70, 1.75)); // Invalid weight
        System.out.println("Your BMI is: " + calculateBMI(70, 175));   // Invalid height
    }

    public static double calculateBMI(double weight, double height) {
        // Input validation
        if (weight <= 0 || height <= 0) {
            return -1.0; // Return -1.0 for invalid input
        }
        if (weight >= 300 || height >= 3) {
            return -1.0; // Return -1.0 for invalid input
        }

        // BMI calculation
        double bmi = weight / (height * height);
        return Math.round(bmi * 100.0) / 100.0; // Round to two decimal places
    }
}
