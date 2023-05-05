public abstract class CondimentDecorator extends Beverage {
    // 각 데코레이터가 감싼 음료를 나타내는 Beverage 객체를
    // 여기서 지정한다. 음료를 지정할 때는 데코레이터에서
    // 어떤 음료든 감쌀 수 있도록 Beverage 슈퍼클래스 유형을 사용한다.
    Beverage beverage;

    // 모든 첨가물 데코레이터에  getDescription() 메소드를
    // 새로 구현하도록 마들 계획이다.
    // 그래서 추상 메소드를 선언했다.
    public abstract String getDescription();

}
