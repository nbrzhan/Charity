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
        Donor donor1 = new Donor("A001", "Nurzhan ", 3);
        donor1.addDonation(donation1);
        donor1.addDonation(donation2);
        donor1.addDonation(donation3);

        Donor donor2 = new Donor("A002","Mike TysonBaby", 4);
        donor2.addDonation(donation4);
        donor2.addDonation(donation5);
        donor2.addDonation(donation6);

        // Display donor information
        System.out.println("Donor Information:");
        System.out.println("Donor ID: " + donor1.getDonorId());
        System.out.println("Full Name: " + donor1.getFullName());
        donor1.displayDonations();

        System.out.println("\nDonors Information:");
        System.out.println("Donor ID: " + donor2.getDonorId());
        System.out.println("Full Name: " + donor2.getFullName());
        donor2.displayDonations();

        // Create a charity
        Charity charity = new Charity("C001", "Januia", 5);

        // Add donations to charity
        charity.addDonation(donation1);
        charity.addDonation(donation2);
        charity.addDonation(donation3);

        // Display charity information
        System.out.println("\nCharity Information:");
        System.out.println("Charity ID: " + charity.getCharityId());
        System.out.println("Charity Name: " + charity.getName());
        charity.displayDonations();
    }
}