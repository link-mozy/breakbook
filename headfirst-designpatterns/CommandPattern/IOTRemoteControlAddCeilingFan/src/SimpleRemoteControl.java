public class SimpleRemoteControl {
    // 커맨드를 저장할 슬롯이 1개 있다.
    // 이 슬롯으로 1개의 기기를 제어한다.
    Command slot;

    public SimpleRemoteControl() {
    }

    // 슬롯을 가지고 제어할 명령을 설정하는 메소드
    // 리모컨 버튼의 기능을 바꾸고 싶다면
    // 이 메소드를 사용해서 얼마든지 바꿀 수 있다.
    public void setCommand(Command command) {
        slot = command;
    }

    // 버튼을 누르면 이 메소드가 호출된다.
    // 지금 슬롯에 연결된 커맨드 객체의 execute() 메소드만 호출하면 된다.
    public void buttonWasPressed() {
        slot.execute();
    }
}
