package transport;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public String truckName() {
        return "Грузовой автомобиль";
    }

    @Override
    public String toString() {
        return truckName() + "\n" + super.toString();
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
