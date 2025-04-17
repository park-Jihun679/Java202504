public class Monster {

    /*
    * 접근제어자
    * - 클래스 혹은 클래스의 맴버에 참조연산자로 접근 할 수 있는 범위를 제한하기 위한 키워드
    * 1. public : 모든 패키지에서 접근 가능
    * 2. protected : 동일 패키지에서 접근 가능(상속관계에 있으면 다른 패키지에서도 접근 가능)
    * 3. default : 동일 패키지에서만 접근 허용 (작성안하면 default)
    * 4. private : 해당 클래스 내부에서만 접근 허용
    *
    * 예외
    * 클래스 선언 시 사용하는 접근제어자는 public /default 두가지만 사용
     */

    private String name;
    private int hp;

    public Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}
