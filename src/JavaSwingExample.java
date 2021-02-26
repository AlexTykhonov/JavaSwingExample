import javax.swing.*;
import java.awt.*;

public class JavaSwingExample {

    public static void main(String[] args) {
        JFrame jFrame = getFrame();
    }

    static JFrame getFrame () {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-250,dimension.height/2 -150,500,300);
        jFrame.setTitle("Frame is here!!");
        return  jFrame;
    }
}
