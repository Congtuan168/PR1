package tut02;

import java.util.Scanner;

public class FinancialCompoundValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = scanner.nextDouble();

        double monthlyInterestRate = 0.05 / 12;
        double accountValue = monthlySaving;

        for (int month = 2; month <= 6; month++) {
            accountValue = (accountValue + monthlySaving) * (1 + monthlyInterestRate);
        }

        // Format the output to two decimal places
        String formattedValue = String.format("%,.2f", accountValue);
        System.out.println("The account value after the sixth month is: " + formattedValue + " VND");
    }
}
