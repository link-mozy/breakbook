public class Car {
    Engine engine; // 이 클래스의 구성요소, 이 구성 요소의 메소드는 호출해도 된다.
    // 기타 인스턴스 변수


    public Car() {
        // 엔진 초기화 등을 처리
    }

    public void start(Key key) {
        // 매개 변수로 전달된 객체의 메소드는 호출해도 된다.
        Doors doors = new Doors(); // 새로운 객체를 생성한다.
        boolean authorized = key.turns(); // 매개변수로 전달된 메소드 호출
        if (authorized) {
            engine.start(); // 이 객체의 구성 요소를 대상으로 메소드를 해출?
            updateDashboardDisplay(); // 객체 내에 있는 메소든느 호출해도 된다.
            doors.lock(); // 직접 생성하거나 인스턴스를 만든 객체의 메소드는 호출해도 된다.
        }
    }

    public void updateDashboardDisplay() {
        // 디스플레이 갱신
    }
}
