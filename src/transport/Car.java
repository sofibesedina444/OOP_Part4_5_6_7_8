package transport;

public class Car extends Transport implements Competing {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public String carName() {
        return "Легковой автомобиль";
    }

    @Override
    public String toString() {
        return carName() + "\n" + super.toString();
    }

    @Override
    public void start() {
        System.out.println(carName() + " " + getFullName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println(carName() + " " + getFullName() + " остановился");
    }

    @Override
    public void pitStop() {
        System.out.println(carName() + " " + getFullName() +
                " прошел техническую остановку машины во время гонки");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random() * 7);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 200);
    }
}
