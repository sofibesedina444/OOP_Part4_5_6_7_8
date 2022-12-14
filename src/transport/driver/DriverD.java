package transport.driver;

import transport.Bus;

public class DriverD extends Driver<Bus> {

    public DriverD(String driverName, boolean driverLicense, int experience, Bus transportCategory) {
        super(driverName, driverLicense, experience, transportCategory);
    }

    @Override
    public void start(Bus transport) {
        transport.start();
    }

    @Override
    public void stop(Bus transport) {
        transport.stop();
    }

    @Override
    public void refill(Bus transport) {
        System.out.println("Водитель " + getDriverName() + " заправляет автомобиль " + transport.getFullName());
    }
}
