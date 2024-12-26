public class Donation {
    private String donationId;
    private double amount;

    Donation() {}

    public Donation(String donationId, double amount) {

        setDonationId(donationId);
        setAmount(amount);
    }

    public String getDonationId() {
        return donationId;
    }

    public void setDonationId(String donationId) {
        this.donationId = donationId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void displayInfo() {
        System.out.println("Donation ID: " + donationId + ", Amount: " + amount);
    }
}