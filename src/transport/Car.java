package transport;

public class Car extends Transport implements Competing {

    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public String carName() {
        return "Легковой автомобиль";
    }

    @Override
    public String toString() {
        return carName() + "\n" + super.toString() + getBodyType();
    }

    @Override
    public void startMove() {
        System.out.println(carName() + " " + getFullName() + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println(carName() + " " + getFullName() + " остановился");
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно" + "\n");
        } else {
            System.out.println(bodyType);
        }
    }

    @Override
    public boolean getDiagnosed() {
        return false;
    }

    @Override
    public void fixTransport() {
        System.out.println(carName() + " " + getFullName() + " починен");
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
