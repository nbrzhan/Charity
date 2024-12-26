public class Donor {
    Donor() {
    }

    Donor(String donorId, String fullName, int count) {
        this.donorId = donorId;
        setFullName(fullName);
        this.donations = new Donation[count];
    }

    private String donorId;
    private String fullName;
    private Donation[] donations;
    private int donationCount = 0;

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
        if(donationCount < donations.length) {
            donations[donationCount] = donation;
            donationCount++;
        } else {
            System.out.println("No more donations can be added for " + fullName);
        }
    }

    public void displayDonations() {
        System.out.println("Donations made by " + fullName + ":");
        for (int i = 0; i < donationCount; i++) {
            donations[i].displayInfo();
        }
    }
}