package transport.driver;

import transport.category.B;

public class DriverB extends Driver<B> {

    public DriverB(String driverName, boolean driverLicense, int experience, B typeCategory) {
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
