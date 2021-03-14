import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//пример отсюда https://itproger.com/course/java/23

public class SimpleGui extends JFrame {

    private JButton jButton = new JButton("Submit");
    private JTextField input = new JTextField("5");
    private JLabel label = new JLabel("Input");
    private JRadioButton button1 = new JRadioButton("Select this");
    private JRadioButton button2 = new JRadioButton("Select that");
    private JCheckBox checkbox = new JCheckBox("Check", false);

    public SimpleGui() {
        super("Simple example");
        this.setBounds(120, 120, 320, 120);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);
        container.add(button1);
        button1.setSelected(true);
        container.add(button2);
        container.add(checkbox);
        jButton.addActionListener(new ButtonEventListener());
        container.add(jButton);
    }

    class ButtonEventListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String message = "";
            message += "Button was pressed \n";
            message += "Text is " + input.getText() + " \n";
            message += (button1.isSelected() ? "Button 1" : "Button 2") + " is selected.\n";
            message += "Checkbox is " + (checkbox.isSelected() ? "selected!\n " : "not selected! \n");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);

        }
    }

    public static void main(String[] args) {
        SimpleGui app = new SimpleGui();
        app.setVisible(true);
    }
}
