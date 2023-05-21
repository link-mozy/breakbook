public abstract class CaffeineBeverage {
    
    final void prepareRecipe() {
        // 커피와 차를 만들 때 prepareRecipe() 메소드를 사용한다.
        // 서브클래스가 이 메소드를 아무렇게나 오버라이드하지 못하도록
        // final로 선언한다. 두 번째와 네번째 단계는 brew()와
        // addcondiments()라는 일반화된 메소드로 바꿨다.
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void brew();
    abstract void addCondiments();
    // Coffee와 Team에서 이 두 메소드를 서로 다른 방식으로
    // 처리하므로 추상 메소드로 선언해야 한다.
    // 이 두 메소드는 서브클래스가 알아서 처리하게 둔다.

    private void boilWater() {
        System.out.println("물 끓이는 중");
    }

    private void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
