public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    // 행동 인터페이스 형식의 레퍼런스 변수 2개를 선언.
    // 같은 패키지에 속하는 모든 서브클래스에서 이 변수를 상속 받는다.

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly(); // 행동 클래스에 위임
    }

    public void performQuack() {
        quackBehavior.quack(); // 행동 클래스에 위임
    }

    // 동적으로 행동을 지정하기 위한 메소드 (setter)
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
    }
}
