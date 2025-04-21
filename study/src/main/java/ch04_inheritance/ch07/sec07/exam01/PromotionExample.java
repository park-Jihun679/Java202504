package ch04_inheritance.ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        /*
        * 다형성
        * - 하나의 인스턴스가 여러가지 타입을 가질 수 있는 것을 의미
        * - 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있게 한다.
        * - 하나의 메소드 호출로 각기 다른 방법으로 동작하게 할 수 있다.
         */

        /*
            A
           / \
          B   C
         /     \
        D       E
        * */
        A a = new A();
        B b = new B();  // A
        C c = new C();  // A
        D d = new D();  // A - B
        E e = new E();  // A - C

        // 업캐스팅
        // 자식 -> 부모로 대입시 자동 타입 형변환이 발생
        // (안전해서 자바에서 자동으로 해줌)
        A a1 = b;
        // (-> 동일) A a1 = new B();
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        // E는 C의 자식 -> B와 관계 x
        // B b3 = new E();

        // D는 B의 자식 -> C와 관계 x
        // C c2 = new D();

        // 다운 캐스팅
        // 부모 -> 자식
        B b6 = (B)a;
    }

}
