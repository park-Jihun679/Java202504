package ch06.sec08.exam01;

public class Calculator {

    public void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    public void powerOff() {
        System.out.println("전원을 끕니다.");
    }
    

    public int plus(int x, int y) {
        return x + y;
    }

    public double divide(int x, int y) {
        return (double) x / y;
    }
}
