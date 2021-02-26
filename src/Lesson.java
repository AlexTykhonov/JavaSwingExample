import javax.swing.*;
import javax.swing.plaf.MenuBarUI;
import java.awt.*;

public class Lesson {

    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        Font font = new Font("Arial Narrow", Font.BOLD, 20);
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String s : fonts) {
            System.out.println(s);
        }

        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {

    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300);
        jFrame.setTitle("Frame is here!!");

        return jFrame;
    }
}
