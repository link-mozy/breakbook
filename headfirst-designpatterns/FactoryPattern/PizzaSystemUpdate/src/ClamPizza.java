public class ClamPizza extends Pizza{

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("준비 중:" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        // prepare() 메소드는 조개 피자를 만들 때 필요한 재료를
        // 자기 지역의 팩토리로부터 가져온다.
        clam = ingredientFactory.createClam();
        // 뉴욕 피자라면 신선한 조개를, 시카고 공장이라면 냉동 조개를 쓸 거다.
    }
}
