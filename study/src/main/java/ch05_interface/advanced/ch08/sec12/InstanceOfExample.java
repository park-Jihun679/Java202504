package ch05_interface.advanced.ch08.sec12;

public class InstanceOfExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();
        ride(taxi);
        System.out.println();
        ride(bus);
    }

    static void ride(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            ((Bus) vehicle).checkFare();
        }
        vehicle.run();
    }

}
