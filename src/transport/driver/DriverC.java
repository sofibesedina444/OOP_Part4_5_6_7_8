package transport.driver;

import transport.category.C;

public class DriverC extends Driver<C> {

    public DriverC(String driverName, boolean driverLicense, int experience, C typeCategory) {
        super(driverName, driverLicense, experience, typeCategory);
    }

    @Override
    public void start() {
        System.out.println("Водитель " + getDriverName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель " + getDriverName() + " остановился");
    }

    @Override
    public void refill() {
        System.out.println("Водитель " + getDriverName() + " заправляет автомобиль");
    }
}
