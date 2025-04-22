package ch05_interface.basic.ch08.lecture;

public interface InterProduct {

    /*
    인터페이스는 상수 필드만 작성 가능
    public static final -> 조합을 상수 필드 -> 선언과 동시에 초기화해야함
    int a = 0; 이렇게만 적어도 앞에 (public static final) 이 생략되어 들어간다
     */

//    public static final int a = 0;

    // public static final 이 숨어있음
    int MIN_NUM = 10;
    int MAX_NUM = 100;
    
    // 생성자를 가질 수 없다
//    public InterProduct() {}
    
    // 인터페이스는 구현부가 있는 메서드를 가질 수 없다.
//    public void nonStaticMethod() {}
    
    // static 메서드는 가질 수 있음 (java 8버전)
    public static void staticMethod() {
        System.out.println("InterProduct 인터페이스에서 staticMethod 호출됨...");
    }
    
    // 추상메서드만 작성 가능
    public abstract void nonStaticMethod();
    
    /*
    인터페이스 안에 작성한 메서드는 public abstract의 의미를 가진다
    인터페이스를 상속받는 클래스는 메서드를 구현할때 접근제어자를 public 로 고정
     */
    void abstMethod();
    
    // 인터페이스에서 일반 메서드를 만들기 위해서는 default 키워드를 붙여야한다
    // 인터페이스를 상속받을 때 구현이 필수가 아님
    public default void defaultMethod() {
        System.out.println("InterProduct 클래스의 defaultMethod 호출됨");
    }
}
