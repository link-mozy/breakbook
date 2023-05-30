public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        // MenuItem은 이름, 설명, 체식주의 메뉴 여부, 가격으로 구성되어 있다.
        // MenuItem을 초기화할 때는 생성자에 이 값들을 모두 매개변수로 전달해야 한다.
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public  String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
}
