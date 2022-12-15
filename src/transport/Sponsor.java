package transport;

public class Sponsor {
    private final String sponsorName;
    private final int amoutDonation;

    public Sponsor(String sponsorName, int amoutDonation) {
        this.sponsorName = sponsorName;
        this.amoutDonation = amoutDonation;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public int getAmoutDonation() {
        return amoutDonation;
    }

    public void sponsorRace() {
        System.out.println("Спонсор " + sponsorName + " проспонсировал заезд на " + amoutDonation);
    }

    @Override
    public String toString() {
        return sponsorName + " сумма поддержки: " + amoutDonation;
    }
}
