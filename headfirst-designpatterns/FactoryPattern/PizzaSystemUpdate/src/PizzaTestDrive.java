public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        // nyPizzaStore.orderPizza("cheese");

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("에단이 주문한 " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문한 " + pizza.getName() + "\n");

        pizza = nyPizzaStore.orderPizza("clam");
        System.out.println("에단이 주문한 " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("조엘이 주문한 " + pizza.getName() + "\n");

        pizza = nyPizzaStore.orderPizza("pepperoni");
        System.out.println("에단이 주문한 " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("조엘이 주문한 " + pizza.getName() + "\n");

        pizza = nyPizzaStore.orderPizza("veggie");
        System.out.println("에단이 주문한 " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("조엘이 주문한 " + pizza.getName() + "\n");

    }
}
