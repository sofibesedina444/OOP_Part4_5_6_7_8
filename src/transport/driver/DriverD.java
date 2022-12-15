package transport.driver;

import transport.category.D;

public class DriverD extends Driver<D> {

    public DriverD(String driverName, boolean driverLicense, int experience, D typeCategory) {
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
