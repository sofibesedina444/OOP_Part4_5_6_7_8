package transport.driver;

import transport.Transport;

public abstract class Driver<T extends Transport> {
    private final String driverName;
    private boolean driverLicense;
    private int experience;

    public Driver(String driverName, boolean driverLicense, int experience) {
        if (driverName != null && !driverName.isEmpty()) {
            this.driverName = driverName;
        } else {
            this.driverName = "driver";
        }
        this.driverLicense = driverLicense;
        setExperience(experience);
    }

    public String getDriverName() {
        return driverName;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience > 0) {
            this.experience = experience;
        } else {
            this.experience = 0;
        }
    }

    @Override
    public String toString() {
        return "ФИО водителя: " + driverName + "," + "\n" +
                "Наличие прав: " + driverLicense + "," + "\n" +
                "Стаж вождения: " + experience;
    }

    public abstract void start(T transport);

    public abstract void stop(T transport);

    public abstract void refill(T transport);

    public void printInfo(T transport) {
        System.out.println("Водитель " + driverName + " управляет автомобилем " +
                transport.getFullName() + " и будет участвовать в заезде");
        transport.printType();
    }
}
