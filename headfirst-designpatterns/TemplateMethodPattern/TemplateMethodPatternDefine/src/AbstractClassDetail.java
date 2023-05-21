public abstract class AbstractClassDetail {

    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook(); // templateMethod()를 조금 고쳐서 메소드를 하나 더 호출하게 만들었다.
    }

    abstract void primitiveOperation1();
    // 기본 단계 가운데 2개를 구상 서브클래스에서 구현하게 만듬

    abstract void primitiveOperation2();
    // 기본 단계 가운데 2개를 구상 서브클래스에서 구현하게 만듬

    final void concreteOperation() {
        // 구상 단계는 추상 클래스 내에서 정의된다.
        // 이 메소드는 final로 선언되었으므로 서브클래스에서 오버라이드 할 수 었다.
        // 이 메소드는 템플릿 메소드에서 직접 호출할 수도 있고,
        // 서브클래스에서 호출해서 사용할 수도 있다.

        // concreteOperation() 메소드 코드
    }

    void hook() {}
    // 구상 메소드이지만 아무것도 하지 않는다.
    // 기본적으로 아무것도 하지 않는 메소드를 정의할 수도 있다.
    // 이런 메소드를 후크(hook)라고 부른다. 서브클래스에서 오버라이드할 수도 있지만,
    // 반드시 그래야하 하는건 아니다.
}
