package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;

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

    @Override
    public String toString() {
        return "Бренд и модель: " + getFullName() + "," + "\n" +
                "Объем двигателя: " + getEngineVolume() + " л." + "\n";
    }

    public abstract void start();

    public abstract void stop();
}
