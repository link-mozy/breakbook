public class CheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    // 피자의 원재료를 제공하는 팩토리가 필요하다.
    // 각 피자 클래스는 생성로부터
    // 팩토리를 전달받고 그 팩토리를
    // 인스턴스 변수에 저장한다.
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("준비 중:" + name);
        // prepare() 메소드에서 치즈 피자를 만드는
        // 각 단계를 처리한다. 재료가 필요할 때마다
        // 팩토리에 있는 메소드를 호출해서 만든다.
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
