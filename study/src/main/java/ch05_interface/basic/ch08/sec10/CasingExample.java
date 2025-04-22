package ch05_interface.basic.ch08.sec10;

public class CasingExample {

    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
//        vehicle.checkFare();  Vehicle 에는 checkFare() 메서드가 없다

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
