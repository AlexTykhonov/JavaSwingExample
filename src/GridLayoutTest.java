import javax.swing.*;
import java.awt.*;

public class GridLayoutTest extends JFrame
{
    public GridLayoutTest()
    {
        super("GridLayoutTest");
        setSize(320, 320);
        setLocation(100, 100);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        // Вспомогательная панель
        JPanel grid = new JPanel();
        /*
         * Первые два параметра конструктора GridLayout определяют количество
         * строк и столбцов в таблице. Вторые 2 параметра - расстояние между
         * ячейками по горизонтали и вертикали
         */
        GridLayout layout = new GridLayout(5, 5, 5, 12);
        grid.setLayout(layout);
        // Создаем 8 кнопок
        String[] fields  = new String[] {"Winter", "Spring", "Summer", "Autumn","wow", "Bump","Rest", "Read"};


        for (int i = 0; i < 8; i++) {
            if (i%2==0)
            {grid.add(new JButton("Cохранить " + i));} else
            grid.add(new Label(fields[i]));
        }
        // Размещаем нашу панель в панели содержимого
        getContentPane().add(grid);
        // Устанавливаем оптимальный размер окна
        pack();
        // Открываем окно
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutTest();
    }
}