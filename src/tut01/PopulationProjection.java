package tut01;

public class PopulationProjection {
    public static void main(String[] args) {
        System.out.println("Population after 1 year: " + (312032486 + (365 * 24 * 60 * 60) / 7 - (365 * 24 * 60 * 60) / 13 + (365 * 24 * 60 * 60) / 45));
        System.out.println("Population after 2 years: " + (312032486 + 2 * ((365 * 24 * 60 * 60) / 7 - (365 * 24 * 60 * 60) / 13 + (365 * 24 * 60 * 60) / 45)));
        System.out.println("Population after 3 years: " + (312032486 + 3 * ((365 * 24 * 60 * 60) / 7 - (365 * 24 * 60 * 60) / 13 + (365 * 24 * 60 * 60) / 45)));
        System.out.println("Population after 4 years: " + (312032486 + 4 * ((365 * 24 * 60 * 60) / 7 - (365 * 24 * 60 * 60) / 13 + (365 * 24 * 60 * 60) / 45)));
        System.out.println("Population after 5 years: " + (312032486 + 5 * ((365 * 24 * 60 * 60) / 7 - (365 * 24 * 60 * 60) / 13 + (365 * 24 * 60 * 60) / 45)));
    }
}
