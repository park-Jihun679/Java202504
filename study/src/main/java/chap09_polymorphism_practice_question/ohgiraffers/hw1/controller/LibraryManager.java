package chap09_polymorphism_practice_question.ohgiraffers.hw1.controller;

import chap09_polymorphism_practice_question.ohgiraffers.hw1.model.dto.Book;
import chap09_polymorphism_practice_question.ohgiraffers.hw1.model.dto.Member;
import java.util.Arrays;

public class LibraryManager {

    Member mem = new Member();
    Book[] bList = new Book[5];

    public void insertMember(Member mem) {
        this.mem = mem;
    }

    public Member myInfo() {
        return null;
    }

    public Book[] selectAll() {
        return bList;
    }

    public Book[] searchBook(String keyword) {
        return null;
    }

    public int rentBook(int index) {
        return 0;
    }
}
