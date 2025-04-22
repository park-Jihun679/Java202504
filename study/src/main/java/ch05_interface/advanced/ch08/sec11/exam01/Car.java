package ch05_interface.advanced.ch08.sec11.exam01;

public class Car {
    Tire tire1;
    Tire tire2;

    public void run() {
        tire1.roll();
        tire2.roll();
    }

    public Car() {
        Tire hankookTrie = new HankookTire();
        tire1 = hankookTrie;
        tire2 = hankookTrie;
    }

}
