package chap09_polymorphism_practice_question.ohgiraffers.hw1.view;

import chap09_polymorphism_practice_question.ohgiraffers.hw1.controller.LibraryManager;
import chap09_polymorphism_practice_question.ohgiraffers.hw1.model.dto.Book;
import chap09_polymorphism_practice_question.ohgiraffers.hw1.model.dto.Member;
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
    }

    public void selectAll() {
        Book[] bookArray = lm.selectAll();
        for (int i = 0; i < bookArray.length; i++) {
            System.out.println(i + "번도서 : " + bookArray[i].toString());
        }
    }

    public void searchBook() {
        System.out.println("검색 키워드: ");
        String keyword = sc.next();

        Book[] searchedBookArray = lm.searchBook(keyword);
        for (Book book : searchedBookArray) {
            System.out.println(book.toString());
        }
    }

    public void rentBoot() {
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
