public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            // customerWantsCondiments 메소드로
            // 실행 여부가 결정되는 조건을 추가했다.
            // 고객이 첨가물을 넣어 달라고 했을 때만,
            // 즉 customerWantsCondiments에서 ture가
            // 리턴되면 addCondiments()를 호출한다.
            addCondiments();
        }
    }

    boolean customerWantsCondiments() {
        // 별 내용이 없는 기본 메소드를 구현해 놓았다.
        // 이 메소드는 그냥 true만 리턴할 뿐 다른 작업은 하지 않는다.
        // 이 메소든느 서브 클래스에서 필요할 때 오버라이드할 수 있는 후크이다.
        return true;
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
