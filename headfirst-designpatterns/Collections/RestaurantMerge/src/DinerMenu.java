public class DinerMenu {
    // 멜이 구현한 객체마을 식당 메뉴
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem [] menuItems;
    // 멜은 다른 방식으로 메뉴를 구현했다.
    // 배열을 사용하고 있기에 메뉴의 크기를 정해 놓았고, 객체를 캐스팅할 필요 없이 바로 꺼내서 쓸 수 있다.

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("채식주의자용 BLT",
                "통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴",
                true,
                2.99);

        addItem("BLT",
                "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴",
                false,
                2.99);

        addItem("오늘의 스프y",
                "감자 샐러드를 곁들인 오늘의 스프",
                false,
                3.29);

        addItem("핫도그",
                "사위크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그",
                false,
                3.05);
        // 기타 메뉴 항목이 추가되는 부분
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("죄송합니다. 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    // 기타 메뉴 관련 메소드
}
