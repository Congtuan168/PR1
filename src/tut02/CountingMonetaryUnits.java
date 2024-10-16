package tut02;

import java.util.Scanner;

public class CountingMonetaryUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount (e.g., 11.56): ");
        double amount = scanner.nextDouble();

        int cents = (int) (amount * 100);

        int dollars = cents / 100;
        int remainingCents = cents % 100;

        int quarters = remainingCents / 25;
        remainingCents = remainingCents % 25;

        int dimes = remainingCents / 10;
        remainingCents = remainingCents % 10;

        int nickels = remainingCents / 5;
        remainingCents = remainingCents % 5;

        int pennies = remainingCents;

        System.out.println("The monetary equivalent is:");
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}
