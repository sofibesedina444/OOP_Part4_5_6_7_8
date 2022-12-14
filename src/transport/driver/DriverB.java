package transport.driver;

import transport.Car;

public class DriverB extends Driver<Car> {

    public DriverB(String driverName, boolean driverLicense, int experience, Car transportCategory) {
        super(driverName, driverLicense, experience, transportCategory);
    }

    @Override
    public void start(Car transport) {
        transport.start();
    }

    @Override
    public void stop(Car transport) {
        transport.stop();
    }

    @Override
    public void refill(Car transport) {
        System.out.println("Водитель " + getDriverName() + " заправляет автомобиль " + transport.getFullName());
    }
}
