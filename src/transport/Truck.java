package transport;

public class Truck extends Transport implements Competing {

    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String truckName() {
        return "Грузовой автомобиль";
    }

    @Override
    public String toString() {
        return truckName() + "\n" + super.toString() + getLoadCapacity();
    }

    @Override
    public void start() {
        System.out.println(truckName() + " " + getFullName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println(truckName() + " " + getFullName() + " остановился");
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно" + "\n");
        } else {
            System.out.println(loadCapacity);
        }
    }

    @Override
    public void pitStop() {
        System.out.println(truckName() + " " + getFullName() +
                " прошел техническую остановку машины во время гонки");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 12);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 120);
    }
}
