public class LightOnCommand implements Command{
    Light light;

    // 생성자에 이 커맨드 객체로 제어할 특정 조명
    // ('거실 조명' 이런식으로 어떤 조명인지를 알려 줘야 한다.)의 정보가 전달된다.
    // 그 객체는 light라는 인스턴스 변수에 저장이 된다.
    // execute() 메소드가 호출되면 light 객체가 바로 그 요청의 리시버가 된다.
    public LightOnCommand(Light light) {
        this.light = light;
        // execute() 메소드는 리시버 객체
        // (light 객체)에 있는 on() 메소드를 호출한다.
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.on();
    }
}
