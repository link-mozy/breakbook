public class WeatherData {

    // 인스턴스 변수 선언

    /**
     * 기상 관측값이
     * 갱신될 때마다
     * 이 메소드가 호출된다.
     */
    public void measurementsChanged() {
        // 코드가 들어갈 자리
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }
}
