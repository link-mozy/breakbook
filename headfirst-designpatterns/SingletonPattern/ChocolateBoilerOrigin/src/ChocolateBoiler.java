public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false; // 보일러가 비어있을때만 돌아간다.
    }

    public void fill() {
        // 보일러가 비어 있을 때만 재료를 넣는다.
        // 원룔를 가득 채우고 나면 empty와
        // boiled 플래그를 false 로 설정한다.
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // 보일러에 우유와 초콜릿을 혼합한 재료를 넣는다.
        }
    }

    public void drain() {
        // 보일러가 가득 차 있고(비어 있지 않고),
        // 다 끓어진 상태에서만 보일러에 들어있는 재료를
        // 다음 단계로 넘긴다. 보일러를 다 비우고 나면
        // empty 플래그를 다시 true로 설정한다.
        if(!isEmpty() && isBoiled()) {
            // 끓인 재료를 다음 단계로 넘김
            empty = true;
        }
    }

    public void boil() {
        // 보일러가 가득 차 있고 아직 끓지 않은 상태에서만
        // 초콜릿과 우유가 혼합된 재료를 끓인다.
        // 재룔를 다 끓이면 boiled 플래그를 true 로 설정한다.
        if (!isEmpty() && !isBoiled()) {
            // 재룔를 끓임
            boiled = true;
        }
    }

    private boolean isBoiled() {
        return boiled;
    }

    private boolean isEmpty() {
        return empty;
    }
}
