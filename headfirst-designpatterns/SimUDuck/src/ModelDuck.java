public class ModelDuck extends Duck {
    public ModelDuck() {
        // 이 오리는 바닥에서 삶을 시작합니다. 날지 못하죠.
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
