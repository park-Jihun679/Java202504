package ch04_inheritance.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();  //
        Parent parent = child;  // 다형성
        parent.method1();   // Parent-method1()
        parent.method2();   // Child-method2()
//        parent.method3();
//        부모 타입으로 업캐스팅했는데 자식에만 있는 메서드를 호출함
    }
}
