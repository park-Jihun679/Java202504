package chap09_polymorphism_practice_question.ohgiraffers.hw1.view;

import chap09_polymorphism_practice_question.ohgiraffers.hw1.controller.LibraryManager;
import chap09_polymorphism_practice_question.ohgiraffers.hw1.model.dto.Book;
import chap09_polymorphism_practice_question.ohgiraffers.hw1.model.dto.Member;
import java.util.Arrays;
import java.util.Scanner;

public class LibraryMenu {

    LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("이름: ");
        String name = sc.next();

        System.out.println("나이: ");
        int age = Integer.parseInt(sc.next());

        System.out.println("성별: (w 또는 m 한 글자만 입력하세요.)");
        char gender = sc.next().charAt(0);

        Member newMember = new Member(name, age, gender);
        lm.insertMember(newMember);

        while (true) {
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");

            int programCode = Integer.parseInt(sc.next());
            switch (programCode) {
                case 1:
                    System.out.println(lm.myInfo());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBoot();
                    break;
                case 0:
                    sc.close();
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("입력 가능한 숫자가 아닙니다.");
            }
        }
    }

    public void selectAll() {
        Book[] bookArray = lm.selectAll();
        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(i + "번도서 : " + bookArray[i].toString());
        }
    }

    public void searchBook() {
        System.out.println("검색할 제목 키워드 :  ");
        String keyword = sc.next();
        Book[] searchedBooks = lm.searchBook(keyword);
        for (Book book : searchedBooks) {
            if(book != null) {
                System.out.println(book);
            }
        }
    }

    public void rentBoot() {
        selectAll();
        System.out.println("대여할 도서 번호: ");
        int index = Integer.parseInt(sc.next());

        int result = lm.rentBook(index);
        if (result == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        } else if (result == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        } else if (result == 2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. \n마이페이지를 통해 확인하세요.");

        }
    }
}
