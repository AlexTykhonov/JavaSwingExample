import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TextFieldTest extends JFrame {
    // Текстовые поля
    JTextField smallField, bigField;

    public TextFieldTest() {
        super("Кредитный калькулятор");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Создание текстовых полей
        smallField = new JTextField(15);
        smallField.setToolTipText("Короткое поле");
        bigField = new JTextField("Текст поля", 25);
        bigField.setToolTipText("Длиное поле");
        // Настройка шрифта
        bigField.setFont(new Font("Dialog", Font.PLAIN, 14));
        bigField.setHorizontalAlignment(JTextField.LEFT);
        // Слушатель окончания ввода
        smallField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение введенного текста
                JOptionPane.showMessageDialog(TextFieldTest.this,
                        "Ваше слово: " + smallField.getText());
            }
        });
        // Поле с вводом чисел

//        SpinnerModel model = new SpinnerNumberModel(9.9, 1, 15, 0.1);
//        JSpinner spinner = new JSpinner(model);
        // Поле с паролем

//        JPasswordField password = new JPasswordField(12);
//        password.setEchoChar('*');



        NumberFormat number = new DecimalFormat("##0.###");
        JFormattedTextField numberField = new JFormattedTextField(
                new NumberFormatter(number));
        numberField.setColumns(10);
        numberField.setValue(new Float(123.45));


        // Создание панели с текстовыми полями
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(smallField);
        contents.add(bigField);
//        contents.add(password);
    //    contents.add(spinner);
        contents.add(numberField);
        setContentPane(contents);
        // Определяем размер окна и выводим его на экран
        setSize(400, 130);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldTest();
    }
}