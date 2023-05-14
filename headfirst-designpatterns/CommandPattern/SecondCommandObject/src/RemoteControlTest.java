public class RemoteControlTest { // 커맨드 패턴에서 클라이언트에 해당된다.
    public static void main(String[] args) {
        // remote 변수가 인보커(invoker) 역할을 한다.
        // 필요한 작업을 요청할 때 사용할 커맨드 객체를
        // 인자로 전달받는다.
        SimpleRemoteControl remote = new SimpleRemoteControl();
        // 요청을 받아서 처리할 리시버(Receiver)인 Light 객체를 생성한다.
        Light light = new Light();
        // 커맨드 객체를 생성한다.
        // 이때 리시버를 전달해 준다.
        LightOnCommand lightOn = new LightOnCommand(light);

        // 커맨드 객체를 인보커에게 전달해준다.
        remote.setCommand(lightOn);
        // 이제 버튼을 누른다.
        remote.buttonWasPressed();
    }
}
