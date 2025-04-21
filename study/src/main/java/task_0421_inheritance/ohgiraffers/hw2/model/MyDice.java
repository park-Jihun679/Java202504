package task_0421_inheritance.ohgiraffers.hw2.model;

public class MyDice extends Dice {

    @Override
    public int getNumber() {
        super.setNumber(7);
        return super.getNumber();
    }
}
