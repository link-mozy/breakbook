public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        // MallardDuck에서 상속받은 performQuack() 메소드가 호출
        // 이 메소드에서는 객체의 quackBehavior에서 할 일을 위임함
        // (즉 quackBehavior 레퍼런스의 quack() 메소드가 호출된다.)
        mallard.performFly();
        // performFly() 메소드가 호출

        Duck model = new ModelDuck();
        model.performFly();
        // performFly()를 처음 호출하면 ModelDuck 생성자에서 설정되었던
        // flyBehavior, 즉 FlyNoWay 인스턴스의 fly() 메소드가 호출된다.
        model.setFlyBehavior(new FlyRocketPowered());
        // 이러면 상속받은 행동 세터 메소드가 호출된다. 이제 모형 오리에 로켓
        // 추진력으로 날 수 있다.
        model.performFly();
        // 제대로 돌아간다면 모형 오리는 동적으로 나는 행동을 바꿀 수 있게되었다.
        // 구현 코드가 Duck 클래스 안에 들어있다면 그렇게 할 수 없었을거다.
    }
}
