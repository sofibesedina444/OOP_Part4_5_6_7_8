package transport;

import transport.driver.Driver;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();
    private final Set<Driver<?>> drivers = new HashSet<>();


    public Transport(String brand, String model, double engineVolume) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getFullName() {
        String separator = " ";
        return (getBrand() + separator + getModel());
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanics.addAll(Arrays.asList(mechanics));
    }

    public void addSponsor(Sponsor... sponsors) {
        this.sponsors.addAll(Arrays.asList(sponsors));
    }

    public void addDriver(Driver<?>... drivers) {
        this.drivers.addAll(Arrays.asList(drivers));
    }

    @Override
    public String toString() {
        return "Бренд и модель: " + getFullName() + "\n" +
                "Объем двигателя: " + getEngineVolume() + " л." + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transport)) return false;
        Transport transport = (Transport) o;
        return Objects.equals(mechanics, transport.mechanics) && Objects.equals(sponsors, transport.sponsors)
                && Objects.equals(drivers, transport.drivers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mechanics, sponsors, drivers);
    }

    public abstract void startMove();

    public abstract void stopMove();

    public abstract void printType();

    public abstract boolean getDiagnosed();

    public abstract void fixTransport();
}
