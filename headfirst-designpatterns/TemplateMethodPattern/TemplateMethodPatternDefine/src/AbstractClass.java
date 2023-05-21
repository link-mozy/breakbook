public abstract class AbstractClass {

    final void templateMethod() {
        // 템플릿 메소드이다. 서브클래스가 알고리즘의 각 단계를 마음대로 건드리지 못하게 final로 선언한다.
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
    }

    abstract void primitiveOperation1();
    // 기본 단계 가운데 2개를 구상 서브클래스에서 구현하게 만듬

    abstract void primitiveOperation2();
    // 기본 단계 가운데 2개를 구상 서브클래스에서 구현하게 만듬

    private void concreteOperation() {
        // 추상 클래스 내에
        // concreteOperation() 메소드 코드
    }
}
