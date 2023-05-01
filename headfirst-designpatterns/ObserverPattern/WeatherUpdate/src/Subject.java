public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    // 위 2가지 메소드는 Observer를 인자로 받는다.
    // 각각 옵저버를 등록하고 제거하는 역할을 한다.
    public void notifyObserver();
    // 주제의 상태가 변경되었을 때 모든 옵저버에게
    // 변경 내용을 알리려고 호출되는 메소드이다.
}
