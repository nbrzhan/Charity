public class Charity {

    public Charity() {}

    public Charity(String charityId, String name, int sumOfDonations) {
        this.charityId = charityId;
        this.name = name;
        this.donations = new Donation[sumOfDonations];
    }

    private String charityId;
    private String name;
    private Donation[] donations;
    private int count = 0;

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
            donations[count] = donation;
            count++;
        } else {
            System.out.println("Donation list is full for charity " + name);
        }
    }

    public void displayDonations() {
        System.out.println("Donations received by " + name + ":");
        for (int i = 0; i < count; i++) {
            donations[i].displayInfo();
        }
    }
}