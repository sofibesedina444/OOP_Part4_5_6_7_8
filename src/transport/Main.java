package transport;

import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        System.out.print(audi);
        audi.pitStop();
        System.out.println("Лучшее время круга (мин): " + audi.bestLoopTime());
        System.out.println("Максимальная скорость: " + audi.maxSpeed() + " км.ч");
        System.out.println();

        Car bmw = new Car("BMW", "Z8", 3.0);
        System.out.print(bmw);
        bmw.pitStop();
        System.out.println("Лучшее время круга (мин): " + bmw.bestLoopTime());
        System.out.println("Максимальная скорость: " + bmw.maxSpeed() + " км.ч");
        System.out.println();

        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4);
        System.out.print(kia);
        kia.pitStop();
        System.out.println("Лучшее время круга (мин): " + kia.bestLoopTime());
        System.out.println("Максимальная скорость: " + kia.maxSpeed() + " км.ч");
        System.out.println();

        Car hyundai = new Car("Hyundai", "Avante", 1.6);
        System.out.print(hyundai);
        hyundai.pitStop();
        System.out.println("Лучшее время круга (мин): " + hyundai.bestLoopTime());
        System.out.println("Максимальная скорость: " + hyundai.maxSpeed() + " км.ч");
        System.out.println();


        Truck kamaz = new Truck("КамАЗ", "54901", 12);
        System.out.print(kamaz);
        kamaz.pitStop();
        System.out.println("Лучшее время круга (мин): " + kamaz.bestLoopTime());
        System.out.println("Максимальная скорость: " + kamaz.maxSpeed() + " км.ч");
        System.out.println();

        Truck jac = new Truck("JAC", "N25/35", 2);
        System.out.print(jac);
        jac.pitStop();
        System.out.println("Лучшее время круга (мин): " + jac.bestLoopTime());
        System.out.println("Максимальная скорость: " + jac.maxSpeed() + " км.ч");
        System.out.println();

        Truck fotonAuman = new Truck("Foton Auman", "H5 BJ4189", 11.8);
        System.out.print(fotonAuman);
        fotonAuman.pitStop();
        System.out.println("Лучшее время круга (мин): " + fotonAuman.bestLoopTime());
        System.out.println("Максимальная скорость: " + fotonAuman.maxSpeed() + " км.ч");
        System.out.println();

        Truck man = new Truck("MAN", "TGX", 10.5);
        System.out.print(man);
        man.pitStop();
        System.out.println("Лучшее время круга (мин): " + man.bestLoopTime());
        System.out.println("Максимальная скорость: " + man.maxSpeed() + " км.ч");
        System.out.println();


        Bus liaz = new Bus("ЛиАз", "5292", 6.6);
        System.out.print(liaz);
        liaz.pitStop();
        System.out.println("Лучшее время круга (мин): " + liaz.bestLoopTime());
        System.out.println("Максимальная скорость: " + liaz.maxSpeed() + " км.ч");
        System.out.println();

        Bus paz = new Bus("ПАЗ", "4230", 4.6);
        System.out.print(paz);
        paz.pitStop();
        System.out.println("Лучшее время круга (мин): " + paz.bestLoopTime());
        System.out.println("Максимальная скорость: " + paz.maxSpeed() + " км.ч");
        System.out.println();

        Bus volvo = new Bus("Volvo", "7900", 2.4);
        System.out.print(volvo);
        volvo.pitStop();
        System.out.println("Лучшее время круга (мин): " + volvo.bestLoopTime());
        System.out.println("Максимальная скорость: " + volvo.maxSpeed() + " км.ч");
        System.out.println();

        Bus volgaBus = new Bus("VolgaBus", "5270GH", 7.8);
        System.out.print(volgaBus);
        volgaBus.pitStop();
        System.out.println("Лучшее время круга (мин): " + volgaBus.bestLoopTime());
        System.out.println("Максимальная скорость: " + volgaBus.maxSpeed() + " км.ч");
        System.out.println();

        DriverB ivanov = new DriverB("Иванов Иван Иванович", true, 15);
        System.out.println(ivanov);
        ivanov.printInfo(audi);
        ivanov.start(audi);
        ivanov.stop(audi);
        ivanov.refill(audi);
        System.out.println();

        DriverC petrov = new DriverC("Петров Петр Петрович", true, 5);
        System.out.println(petrov);
        petrov.printInfo(jac);
        petrov.start(jac);
        petrov.stop(jac);
        petrov.refill(jac);
        System.out.println();

        DriverD sidorov = new DriverD("Сидоров Иван Петрович", true, 2);
        System.out.println(sidorov);
        sidorov.printInfo(volgaBus);
        sidorov.start(volgaBus);
        sidorov.stop(volgaBus);
        sidorov.refill(volgaBus);
    }
}