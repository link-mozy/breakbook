public interface Observer {

    // Observer 인터페이스는 모든 옵저버 클래스에서 구현해야 한다.
    // 따라서 모든 옵저버는 update() 메소드를 구현해야 한다. 여기에서 메리와 수가 얘기했던 대로
    // 옵저버에게 측정한 값들을 전달한다.

    // temp, humidity, pressure: 가상 정보가 변경되었을 때 옵저버에게 전달되는 상태값들이다.
    public void update(float temp, float humidity, float pressure);
}
