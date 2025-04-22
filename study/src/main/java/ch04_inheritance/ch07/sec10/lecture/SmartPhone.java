package ch04_inheritance.ch07.sec10.lecture;

public class SmartPhone extends Product{


    @Override
    public void abstMethod() {
        System.out.println("Product 클래스의 abstMethod 오버라이딩한 메서드 호출");
    }
}
