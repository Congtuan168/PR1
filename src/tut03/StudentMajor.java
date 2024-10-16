package tut03;

import java.util.Scanner;

public class StudentMajor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter two characters (e.g., M1 for Mathematics freshman): ");
        String input = scanner.nextLine();

        // Validate the input
        if (input.length() != 2) {
            System.out.println("Invalid input. Please enter exactly two characters.");
            return;
        }

        char majorChar = input.charAt(0);
        char statusChar = input.charAt(1);

        // Determine the major
        String major;
        switch (majorChar) {
            case 'M':
                major = "Mathematics";
                break;
            case 'C':
                major = "Computer Science";
                break;
            case 'I':
                major = "Information Technology";
                break;
            default:
                major = "Invalid major";
                break;
        }

        // Determine the status
        String status;
        switch (statusChar) {
            case '1':
                status = "Freshman";
                break;
            case '2':
                status = "Sophomore";
                break;
            case '3':
                status = "Junior";
                break;
            case '4':
                status = "Senior";
                break;
            default:
                status = "Invalid status";
                break;
        }

        // Display the results
        if (!major.equals("Invalid major") && !status.equals("Invalid status")) {
            System.out.printf("%s %s%n", major, status);
        } else {
            if (major.equals("Invalid major")) {
                System.out.println("Invalid major character.");
            }
            if (status.equals("Invalid status")) {
                System.out.println("Invalid status character.");
            }
        }

        scanner.close();
    }
}
