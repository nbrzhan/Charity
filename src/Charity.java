import java.util.Arrays;
import java.util.Objects;

public class Charity {
    private String charityId;
    private String name;
    private Donation[] donations;
    private int count = 0;

    public Charity() {}

    public Charity(String charityId, String name, int sumOfDonations) {
        this.charityId = charityId;
        this.name = name;
        this.donations = new Donation[sumOfDonations];
    }

    public String getCharityId() {
        return charityId;
    }

    public void setCharityId(String charityId) {
        this.charityId = charityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDonation(Donation donation) {
        if (count < donations.length) {
            donations[count++] = donation;
        } else {
            System.out.println("Donation list is full for charity " + name);
        }
    }

    @Override
    public String toString() {
        return "Charity ID: " + charityId + ", Name: " + name + ", Donations: " + Arrays.toString(donations);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Charity)) return false;
        Charity other = (Charity) obj;
        return Objects.equals(charityId, other.charityId) && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(charityId, name);
    }
}