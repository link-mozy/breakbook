import javax.swing.*;
import java.awt.*;

public class SwingObserverExampleWithLambda {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExampleWithLambda example = new SwingObserverExampleWithLambda();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("할까? 말까?");
        button.addActionListener(e -> System.out.println("하지 마! 아마 후회할 걸?"));
        button.addActionListener(e -> System.out.println("그냥 저질러 버렷!!!"));

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
