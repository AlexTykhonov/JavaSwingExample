import javax.swing.*;
import java.awt.*;

public class MyWin extends JFrame {
    // серийный номер класса
    private static final long serialVersionUID = 1L;

    public MyWin() {
        Container c = getContentPane(); // клиентская область окна
        c.setLayout(new BorderLayout()); // выбираем компоновщик
        // добавляем какие-нибудь дочерние элементы
//        Lesson.MyComponent child = new Lesson.MyComponent();
        MyPanel child = new MyPanel();
        c.add(child);
        // -------------------------------------------
        // настройка окна
        setTitle("Онлайн калькулятор по кредиту. Разумное планирование расходов."); // заголовок окна
        // желательные размеры окна
        Dimension dimension = getToolkit().getScreenSize();

        setPreferredSize(new Dimension(dimension.width / 2, dimension.height / 2));
        // завершить приложение при закрытии окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); // устанавливаем желательные размеры
        setVisible(true); // отображаем окно
        setLocationRelativeTo(null);  // *** this will center your app ***

    }

    // запуск оконного приложения
    public static void main(String args[]) {
        new MyWin();
    }
}
