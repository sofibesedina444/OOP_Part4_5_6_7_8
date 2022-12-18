package transport.driver;

import transport.category.Category;

import java.util.Objects;

public abstract class Driver<C extends Category> {
    private final String driverName;
    private boolean driverLicense;
    private int experience;
    private C typeCategory;

    public Driver(String driverName, boolean driverLicense, int experience, C typeCategory) {
        if (driverName != null && !driverName.isEmpty()) {
            this.driverName = driverName;
        } else {
            this.driverName = "driver";
        }
        this.driverLicense = driverLicense;
        setExperience(experience);
        setTypeCategory(typeCategory);
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

    public C getTypeCategory() {
        return typeCategory;
    }

    public void setTypeCategory(C typeCategory) {
        if (typeCategory == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        } else {
            this.typeCategory = typeCategory;
        }
    }

    @Override
    public String toString() {
        return "ФИО водителя: " + driverName + "," + "\n" +
                "Наличие прав: " + driverLicense + "," + "\n" +
                "Стаж вождения: " + experience + "," + "\n" +
                "Категория прав: " + typeCategory + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver<?> driver = (Driver<?>) o;
        return driverLicense == driver.driverLicense && experience == driver.experience
                && Objects.equals(driverName, driver.driverName) && Objects.equals(typeCategory, driver.typeCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverName, driverLicense, experience, typeCategory);
    }

    public abstract void start();

    public abstract void stop();

    public abstract void refill();
}
