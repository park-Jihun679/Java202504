package task_0421_inheritance.ohgiraffers.hw2.model;

import java.util.Random;

public class SuperDice extends Dice {

    private int min;
    private int max;

    public SuperDice() {
        this.min = 1;
        this.max = 10;
    }

    @Override
    public int getNumber() {
        Random random = new Random();
        super.setNumber(random.nextInt(max) + min);
        return super.getNumber();
    }
}

