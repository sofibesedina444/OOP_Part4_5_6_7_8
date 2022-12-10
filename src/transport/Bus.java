package transport;

public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public String busName() {
        return "Автобус";
    }

    @Override
    public String toString() {
        return busName() + "\n" + super.toString();
    }

    @Override
    public void start() {
        System.out.println(busName() + " " + getFullName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println(busName() + " " + getFullName() + " остановился");
    }

    @Override
    public void pitStop() {
        System.out.println(busName() + " " + getFullName() +
                " прошел техническую остановку машины во время гонки");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 15);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 100);
    }
}
