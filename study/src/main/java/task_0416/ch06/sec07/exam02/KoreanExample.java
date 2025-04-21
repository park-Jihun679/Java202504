package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args ) {
        //Korean 객체 생성
        Korean kr1 = new Korean("박자바", "011225-1234567");

        // 또 다른 Korean 객체 생성
        Korean kr2 = new Korean("김자바", "930525-0654321");

        System.out.println("kr1.nation : " + kr1.nation);
        System.out.println("kr1.name : " + kr1.name);
        System.out.println("kr1.ssn : " + kr1.ssn);
        System.out.println(" ");
        System.out.println("kr2.nation : " + kr2.nation);
        System.out.println("kr2.name : " + kr2.name);
        System.out.println("kr2.ssn : " + kr2.ssn);
    }
}
