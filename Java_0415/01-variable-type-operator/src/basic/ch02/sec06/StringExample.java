package basic.ch02.sec06;

public class StringExample {

    public static void main(String[] args) {
        // 이스케이프문
        // \ 를 사용
        String name = "홍길동";
        String job = "프로그래머";

        // \" : 큰 따옴표
        // \' : 작은 따옴표
        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println("str = " + str);

        // \t : 탭
        str = "나는 \t자바\t를 배웁니다.";
        System.out.println("str = " + str);

        // \n : 줄 바꿈
        str = "나는 \n자바를\n 배웁니다.";
        System.out.println("str = " + str);
    }
}
