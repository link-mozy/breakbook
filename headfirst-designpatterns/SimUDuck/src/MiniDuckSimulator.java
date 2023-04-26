public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        // MallardDuck에서 상속받은 performQuack() 메소드가 호출
        // 이 메소드에서는 객체의 quackBehavior에서 할 일을 위임함
        // (즉 quackBehavior 레퍼런스의 quack() 메소드가 호출된다.)
        mallard.performFly();
        // performFly() 메소드가 호출
    }
}
