import transport.*;
import transport.category.B;
import transport.category.C;
import transport.category.D;
import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Механики
        Mechanic<Car> robert = new Mechanic<Car>("Robert Stensland", "Trand Motors");
        Mechanic<Truck> goncharov = new Mechanic<>("Гончаров Станислав Евгеньевич", "SportCar");
        Mechanic<Transport> houdini = new Mechanic<>("Harry Houdini", "Raceonepro");

        //Спонсоры
        Sponsor averyMcKernon = new Sponsor("Avery McKernon", 150_000_000);
        Sponsor zaineConstraction = new Sponsor("Zaine Constraction", 90_000_000);
        Sponsor spector = new Sponsor("Spector", 500_000_000);

        //Транспортные средства
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, BodyType.CROSSOVER);
        audi.addDriver(new DriverB("Иванов Иван Иванович", true, 15,
                new B("B")));
        audi.addMechanic(robert);
        audi.addSponsor(averyMcKernon, zaineConstraction);
        System.out.print(audi);
        audi.pitStop();
        System.out.println("Лучшее время круга (мин): " + audi.bestLoopTime());
        System.out.println("Максимальная скорость: " + audi.maxSpeed() + " км.ч");
        audi.printType();

        Car bmw = new Car("BMW", "Z8", 3.0, BodyType.CROSSOVER);
        System.out.print(bmw);
        bmw.pitStop();
        System.out.println("Лучшее время круга (мин): " + bmw.bestLoopTime());
        System.out.println("Максимальная скорость: " + bmw.maxSpeed() + " км.ч");
        bmw.printType();

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, BodyType.SEDAN);
        System.out.print(kia);
        kia.pitStop();
        System.out.println("Лучшее время круга (мин): " + kia.bestLoopTime());
        System.out.println("Максимальная скорость: " + kia.maxSpeed() + " км.ч");
        kia.printType();

        Car hyundai = new Car("Hyundai", "Avante", 1.6, BodyType.HATCHBACK);
        System.out.print(hyundai);
        hyundai.pitStop();
        System.out.println("Лучшее время круга (мин): " + hyundai.bestLoopTime());
        System.out.println("Максимальная скорость: " + hyundai.maxSpeed() + " км.ч");
        hyundai.printType();


        Truck kamaz = new Truck("КамАЗ", "54901", 12, LoadCapacity.N3);
        kamaz.addDriver(new DriverC("Петров Петр Петрович", true, 5,
                new C("C")));
        kamaz.addMechanic(goncharov);
        kamaz.addSponsor(spector);
        System.out.print(kamaz);
        kamaz.pitStop();
        System.out.println("Лучшее время круга (мин): " + kamaz.bestLoopTime());
        System.out.println("Максимальная скорость: " + kamaz.maxSpeed() + " км.ч");
        kamaz.printType();

        Truck jac = new Truck("JAC", "N25/35", 2, LoadCapacity.N1);
        System.out.print(jac);
        jac.pitStop();
        System.out.println("Лучшее время круга (мин): " + jac.bestLoopTime());
        System.out.println("Максимальная скорость: " + jac.maxSpeed() + " км.ч");
        jac.printType();

        Truck fotonAuman = new Truck("Foton Auman", "H5 BJ4189", 11.8, LoadCapacity.N2);
        System.out.print(fotonAuman);
        fotonAuman.pitStop();
        System.out.println("Лучшее время круга (мин): " + fotonAuman.bestLoopTime());
        System.out.println("Максимальная скорость: " + fotonAuman.maxSpeed() + " км.ч");
        fotonAuman.printType();

        Truck man = new Truck("MAN", "TGX", 10.5, LoadCapacity.N1);
        System.out.print(man);
        man.pitStop();
        System.out.println("Лучшее время круга (мин): " + man.bestLoopTime());
        System.out.println("Максимальная скорость: " + man.maxSpeed() + " км.ч");
        man.printType();


        Bus liaz = new Bus("ЛиАз", "5292", 6.6, Capacity.BIG);
        liaz.addDriver(new DriverD("Сидоров Иван Петрович", true, 2,
                new D("D")));
        liaz.addMechanic(houdini);
        liaz.addSponsor(spector, averyMcKernon);
        System.out.print(liaz);
        liaz.pitStop();
        System.out.println("Лучшее время круга (мин): " + liaz.bestLoopTime());
        System.out.println("Максимальная скорость: " + liaz.maxSpeed() + " км.ч");
        liaz.printType();

        Bus paz = new Bus("ПАЗ", "4230", 4.6, Capacity.AVERAGE);
        System.out.print(paz);
        paz.pitStop();
        System.out.println("Лучшее время круга (мин): " + paz.bestLoopTime());
        System.out.println("Максимальная скорость: " + paz.maxSpeed() + " км.ч");
        paz.printType();

        Bus volvo = new Bus("Volvo", "7900", 2.4, Capacity.EXTRA_LARGE);
        System.out.print(volvo);
        volvo.pitStop();
        System.out.println("Лучшее время круга (мин): " + volvo.bestLoopTime());
        System.out.println("Максимальная скорость: " + volvo.maxSpeed() + " км.ч");
        volvo.printType();

        Bus volgaBus = new Bus("VolgaBus", "5270GH", 7.8, Capacity.BIG);
        System.out.print(volgaBus);
        volgaBus.pitStop();
        System.out.println("Лучшее время круга (мин): " + volgaBus.bestLoopTime());
        System.out.println("Максимальная скорость: " + volgaBus.maxSpeed() + " км.ч");
        volgaBus.printType();

        checkDiagnostics(audi, bmw, kia, hyundai, kamaz, jac, fotonAuman, man, liaz, paz, volvo, volgaBus);


        //Водители
        //DriverB ivanov = new DriverB("Иванов Иван Иванович", true, 15, new B("B"));
        //System.out.println(ivanov);
        //printInfo(ivanov, audi);

        //DriverC petrov = new DriverC("Петров Петр Петрович", true, 5, new C("C"));
        //System.out.println(petrov);
        //printInfo(petrov, jac);

        //DriverD sidorov = new DriverD("Сидоров Иван Петрович", true, 2, new D("D"));
        //System.out.println(sidorov);
        //printInfo(sidorov, volgaBus);

        List<Transport> transports = List.of(audi, kamaz, liaz);
        for (Transport transport : transports) {
            getInformation(transport);
        }
    }

    public static void getInformation(Transport transport) {
        System.out.println("Информация об автомобиле: " + transport.getFullName());
        System.out.println("Информация об участнике гонки: " + transport.getDrivers());
        System.out.println("Информация о технических специалистах команды: " + transport.getMechanics());
        System.out.println("Информация о спонсорах: " + transport.getSponsors());
        System.out.println();
    }

    public static void checkDiagnostics(Transport... transports) {
        for (Transport transport : transports) {
            try {
                if (!transport.getDiagnosed()) {
                    throw new RuntimeException("Транспортное средство " + transport.getFullName() + " не прошло диагностику");
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void printInfo(Driver<?> driver, Transport transport) {
        System.out.println("Водитель " + driver.getDriverName() + " управляет автомобилем " +
                transport.getFullName() + " и будет участвовать в заезде");
        transport.printType();
    }
}