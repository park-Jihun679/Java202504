package task_0421_inheritance.ohgiraffers.hw2.model;

import java.util.Random;

public class Dice {

    private int number;

    public Dice() {
        Random random = new Random();
        number = random.nextInt(6) + 1;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
