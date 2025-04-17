import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        // 드라큘라(200), 프랑켄슈타인(300), 미이라(400)

        Monster mon1 = new Monster("드라큘라", 200);
        Monster mon2 = new Monster("프랑켄슈타인", 300);
        Monster mon3 = new Monster("미이라", 400);

        System.out.println("mon1.name = " + mon1.getName());
        System.out.println("mon1.hp = " + mon1.getHp());

        System.out.println("mon2.name = " + mon2.getName());
        System.out.println("mon2.hp = " + mon2.getHp());

        System.out.println("mon3.name = " + mon3.getName());
        System.out.println("mon3.hp = " + mon3.getHp());
    }
}
