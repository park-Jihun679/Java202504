package ch05_interface.advanced.ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();
        Tire kumhoTire = new KumhoTire();
        myCar.tire1 = kumhoTire;
        myCar.tire2 = kumhoTire;

        myCar.run();
    }
}
