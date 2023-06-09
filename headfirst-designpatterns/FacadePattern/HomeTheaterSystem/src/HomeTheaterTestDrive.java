public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM Tuner", amp);
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
        Projector projector = new Projector("Projector", player);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");
        // 구성 요소 초기화

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popper);

        homeTheaterFacade.watchMovie("인디아나 존스:레이더스");
        homeTheaterFacade.endMovie();
    }
}
