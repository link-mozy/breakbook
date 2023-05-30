import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    // update() 메소드가 들어있는 JFrame을 확장한다. update() 메소드는
    // 화면 갱신 알고리즘을 제어한다. paint() 후크 메소드를 오버라이드하면
    // 그 알고리즘에 끼어들 수 있다.
    public MyFrame(String title){
        // 그냥 몇 가지를 초기화하는 부분이다.
        // 별로 신경 쓸 필요는 없다.
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        // JFrame의 update() 알고리즘은 paint()를 호출한다.
        // 기본적으로 paint()는 아무 일도 하지 않는다.
        // 그냥 후크 메소드다. 여기에서는 paint()를 오버라이드해서 윈도우에 메시지를 그리겠다.
        super.paint(graphics);
        String msg = "내가 최고!!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
