import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create donations
        Donation donation1 = new Donation("N001", 100.0);
        Donation donation2 = new Donation("N002", 200.0);
        Donation donation3 = new Donation("N003", 110.0);
        Donation donation4 = new Donation("N004", 120.0);
        Donation donation5 = new Donation("N005", 130.0);
        Donation donation6 = new Donation("N006", 140.0);

        // Create donors and add donations
        Donor donor1 = new Donor("A001", "Nurzhan", 3);
        donor1.addDonation(donation1);
        donor1.addDonation(donation2);
        donor1.addDonation(donation3);

        Donor donor2 = new Donor("A002", "Mike Tyson", 4);
        donor2.addDonation(donation4);
        donor2.addDonation(donation5);
        donor2.addDonation(donation6);

        // Display sorted donations for a donor
        System.out.println("\nSorted Donations for Donor 1:");
        donor1.displaySortedDonations();

        // Search for a specific donation in a donor
        System.out.println("\nSearching for donation N002:");
        System.out.println(donor1.searchDonation("N002"));

        // Create a charity
        Charity charity = new Charity("C001", "Januia", 5);
        charity.addDonation(donation1);
        charity.addDonation(donation2);
        charity.addDonation(donation3);

        // Display charity donations
        System.out.println("\nCharity Information:");
        System.out.println(charity);

        // Override demo: equals and hashCode
        System.out.println("\nCharity Equality Check:");
        Charity charity2 = new Charity("C001", "Januia", 5);
        System.out.println("Charity 1 equals Charity 2? " + charity.equals(charity2));
    }
}