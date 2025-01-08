import java.util.Objects;

public class Donation {
    private String donationId;
    private double amount;

    public Donation() {}

    public Donation(String donationId, double amount) {
        this.donationId = donationId;
        this.amount = amount;
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

    @Override
    public String toString() {
        return "Donation ID: " + donationId + ", Amount: " + amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Donation)) return false;
        Donation other = (Donation) obj;
        return Objects.equals(donationId, other.donationId) && Double.compare(amount, other.amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(donationId, amount);
    }
}