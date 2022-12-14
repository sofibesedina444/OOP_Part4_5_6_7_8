package transport.driver;

import transport.Truck;

public class DriverC extends Driver<Truck> {

    public DriverC(String driverName, boolean driverLicense, int experience, Truck transportCategory) {
        super(driverName, driverLicense, experience, transportCategory);
    }

    @Override
    public void start(Truck transport) {
        transport.start();
    }

    @Override
    public void stop(Truck transport) {
        transport.stop();
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель " + getDriverName() + " заправляет автомобиль " + transport.getFullName());
    }
}
