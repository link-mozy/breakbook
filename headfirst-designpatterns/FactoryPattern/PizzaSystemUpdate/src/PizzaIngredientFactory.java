public interface PizzaIngredientFactory {
    // 인터페이스에 각 재료별 생성 메소드를 정의
    // 여러 가지 새로운 클래스가 도입되었다.
    // 재료마다 하나씩 클래스를 만들어야 한다.
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
