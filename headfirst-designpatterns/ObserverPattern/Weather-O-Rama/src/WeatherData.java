import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{ // 이제 weatherData에서 Subject 인터페이스를 구현한다.
    private List<Observer> observers; // Observer 객체들을 저장하는 ArrayList를 추가한다. 그리고 생성자가 그 객체를 생성한다.
    // 인스턴스 변수 선언
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        // 옵저버가 등록을 요청하면 목록 맨 뒤에 추가하기만 하면 된다.
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        // 마찬가지로 옵저버가 탈퇴를 요청하면 목록에 빼기만 하면 된다.
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        // 정말 중요한 부분이다.
        // 모든 옵저버에게 상ㄷ태 변화를 알려 주는 부분이다.
        // 모두 Observer 인터페이스를 구현하는, 즉 update() 메소드가
        // 있는 객체들이므로 손쉽게 상태 변화를 알려 줄 수 있다.
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 기상 관측값이 갱신될 때마다 이 메소드가 호출된다.
     */
    public void measurementsChanged() {
        // 기상 스테이션으로부터 갱신될 측정값을 받으면 옵저버들에게 알린다.
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
        // 기상 스테이션을 책에 수록하고 싶었지만, 출판사에서 그렇게 하지 말라고 한다.
        // 어쩔 수 업싱 실제 장비로부터 진짜 기상 데이터를 가져오는 대신
        // 이 메소드를 써서 디스플레이 항목을 테스트해야 한다.
        // 여러분이 직접 웹에서 측정값을 가져오는 코드를 만드는 것도 재밌을 거다.
    }

    // 기타 WeatherData 메소드
}
