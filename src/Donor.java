import java.util.Arrays;

public class Donor {
    private String donorId;
    private String fullName;
    private Donation[] donations;
    private int donationCount = 0;

    public Donor() {}

    public Donor(String donorId, String fullName, int count) {
        this.donorId = donorId;
        this.fullName = fullName;
        this.donations = new Donation[count];
    }

    public String getDonorId() {
        return donorId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void addDonation(Donation donation) {
        if (donationCount < donations.length) {
            donations[donationCount++] = donation;
        } else {
            System.out.println("No more donations can be added for " + fullName);
        }
    }

    public Donation searchDonation(String donationId) {
        for (Donation donation : donations) {
            if (donation != null && donation.getDonationId().equals(donationId)) {
                return donation;
            }
        }
        return null;
    }

    public void displaySortedDonations() {
        Donation[] sorted = Arrays.copyOf(donations, donationCount);
        Arrays.sort(sorted, (d1, d2) -> Double.compare(d1.getAmount(), d2.getAmount()));
        for (Donation donation : sorted) {
            if (donation != null) {
                System.out.println(donation);
            }
        }
    }

    @Override
    public String toString() {
        return "Donor ID: " + donorId + ", Name: " + fullName;
    }
}