package task_0421_inheritance.ohgiraffers.hw2.model;

public class HellDice extends Dice {

    @Override
    public int getNumber() {
        super.setNumber(4);
        return super.getNumber();
    }
}
