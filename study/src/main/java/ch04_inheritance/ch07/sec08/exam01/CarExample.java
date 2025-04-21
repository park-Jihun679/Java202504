package ch04_inheritance.ch07.sec08.exam01;

public class CarExample {

    public static void main(String[] args) {
        Car myCar = new Car();
        // Trie 타입의 tire 속성이 정의 되지 않음
//        myCar.tire = new Tire();
        myCar.tire = new HankookTire(); // 다형성 - 업캐스팅

        myCar.run();
    }

}
