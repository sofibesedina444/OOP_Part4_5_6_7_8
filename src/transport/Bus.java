package transport;

public class Bus extends Transport implements Competing {

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public String busName() {
        return "Автобус";
    }

    @Override
    public String toString() {
        return busName() + "\n" + super.toString() + getCapacity();
    }

    @Override
    public void startMove() {
        System.out.println(busName() + " " + getFullName() + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println(busName() + " " + getFullName() + " остановился");
    }

    @Override
    public void printType() {
            if (capacity == null) {
                System.out.println("Данных по транспортному средству недостаточно" + "\n");
            } else {
                System.out.println(capacity);
            }
        }

    @Override
    public boolean getDiagnosed() {
        System.out.println(busName() + " " + getFullName() + " в диагностике не требуется");
        return true;
    }

    @Override
    public void fixTransport() {
        System.out.println(busName() + " " + getFullName() + " починен");
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
