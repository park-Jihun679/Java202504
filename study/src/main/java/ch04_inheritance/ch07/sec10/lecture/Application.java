package ch04_inheritance.ch07.sec10.lecture;

public class Application {

    public static void main(String[] args) {
        /*
        * 추상클래스
        * - 추상메서드를 보유한 클래스
        * - abstract 키워드를 사용해서 선언
        * - 직접 인스턴스를 생성 불가 (new로 객체 생성 불가)
        * - 하위 클래스가 상속받아 구현해야 사용 가능
        * -> 다형성을 활용할 수 있다.
        *
        * 추상메서드
        * - 메서드 선언부만 있고 구현부는 없는 메서드
        * - 반드시 abstract 키워드를 붙여야함
        * - ex) public abstract void method();
        * -> 하위(자식) 클래스는 반드시 오버라이딩 해야한다.
         */

//        Product product = new Product();  // 추상클래스는 인스턴스 생성 불가
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.abstMethod();

        // instance of -> 타입이 맞는지 확인
        System.out.println(smartPhone instanceof SmartPhone);   // 타입이 맞는지 확인
        System.out.println(smartPhone instanceof Product);
    }
}
