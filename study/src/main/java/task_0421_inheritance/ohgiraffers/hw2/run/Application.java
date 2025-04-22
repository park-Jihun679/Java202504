package task_0421_inheritance.ohgiraffers.hw2.run;

import task_0421_inheritance.ohgiraffers.hw2.model.Dice;
import task_0421_inheritance.ohgiraffers.hw2.model.Dicer;
import task_0421_inheritance.ohgiraffers.hw2.model.HellDice;
import task_0421_inheritance.ohgiraffers.hw2.model.MyDice;
import task_0421_inheritance.ohgiraffers.hw2.model.SuperDice;

public class Application {
    public static void main(String[] args) {
        Dicer dicer = new Dicer();

        // Dice 타입으로 다형성 적용
        Dice dice1 = new HellDice();
        Dice dice2 = new SuperDice();
        Dice dice3 = new MyDice();

        int diceResult;

        System.out.println("🎲 HellDice로 주사위 던지기:");
        diceResult =  dicer.throwDice(dice1); // 항상 4 출력
        System.out.println("주사위 숫자: " + diceResult);

        System.out.println("\n🎲 SuperDice로 주사위 던지기:");
        diceResult = dicer.throwDice(dice2); // 1~10 사이의 랜덤 값 출력
        System.out.println("주사위 숫자: " + diceResult);

        System.out.println("\n🎲 (나만의주사위)로 주사위 던지기:");
        diceResult = dicer.throwDice(dice3);
        System.out.println("주사위 숫자: " + diceResult);
    }
}
