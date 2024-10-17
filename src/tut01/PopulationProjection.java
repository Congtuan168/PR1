package tut01;

public class PopulationProjection {
    public static void main(String[] args) {
        // Current population
        int currentPopulation = 312032486;

        // Constants for calculations
        int secondsInYear = 365 * 24 * 60 * 60; // Total seconds in a year
        int birthsPerYear = secondsInYear / 7;  // Births in a year
        int deathsPerYear = secondsInYear / 13; // Deaths in a year
        int immigrantsPerYear = secondsInYear / 45; // Immigrants in a year

        // Calculate population for the next 5 years
        System.out.println("Year\tProjected Population");
        for (int year = 1; year <= 5; year++) {
            // Update population
            currentPopulation += birthsPerYear - deathsPerYear + immigrantsPerYear;
            System.out.println(year + "\t \t" + currentPopulation);
        }
    }
}
