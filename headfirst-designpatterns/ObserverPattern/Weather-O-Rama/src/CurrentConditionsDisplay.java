public class CurrentConditionsDisplay implements Observer, DisplayElement {
    // Observer : WeatherData 객체로부터 변경 사항을 받으려면 Observer를 구현해야 한다.
    // API 구조상 모든 디스플레이 항목에서 DisplayElement를 구현하기로 했기에 이 인터페이스도 구현한다.
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("현재 상태: 온도 " + temperature + "F, 습도 " + humidity + "%");
    }
}
