package transport;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sponsor)) return false;
        Sponsor sponsor = (Sponsor) o;
        return amoutDonation == sponsor.amoutDonation && Objects.equals(sponsorName, sponsor.sponsorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sponsorName, amoutDonation);
    }

    @Override
    public String toString() {
        return sponsorName + " сумма поддержки: " + amoutDonation;
    }
}
