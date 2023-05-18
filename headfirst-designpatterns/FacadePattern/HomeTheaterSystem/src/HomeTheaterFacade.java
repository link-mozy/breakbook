public class HomeTheaterFacade {
    // 구성 부분, 우리가 사용하고자 하는 서브시스템의 모든 구성 요소가 인스턴스 변수 형태로 저장
    Amplifier amp;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, StreamingPlayer player, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        // 퍼사드의 생성자에는 서브시스템 구성 요소의 레퍼런스가 전달된다.
        // 퍼사드는 각 레퍼런스를 인스턴스 변수에 저장한다.
        this.amp = amp;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    // 기타 메소드
    public void watchMovie(String movie) {
        // watchMovie() 메소드는 앞에서 일일이 수동으로 했던
        // 작업을 순서대로 처리한다. 꽤 복잡한 일을 하나의 메소드로
        // 간단하게 처리할 수 있다. 각 작업을 서비시스템에 들어있는
        // 구성 요소에 위인된다.
        System.out.println("영화 볼 준비 중");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        // endMovie() 메소드는 모든 구성 요소를 끄는 기능을 제공한다.
        // 이 베소드에서 각 작업을 서비스시틈에 있는 구성 요소에게 위임된다.
        System.out.println("홈시어터를 끄는 중");
        popper.off();
        lights.off();
        screen.up();
        amp.off();
        player.stop();
        player.off();
    }
}
