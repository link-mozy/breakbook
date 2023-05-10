public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    // 재료군에 들어있는 재료를 뉴욕 지점에 알맞게 만든다.
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    // 최고 품질의 슬라이스 페퍼로니 시카고와 뉴욕에서 같은 페페로니를 쓴다.
    // 여러분이 시카고 펙토리를 직접 만들어 볼 탠데, 그래도 이재료를 쓴다.
    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
