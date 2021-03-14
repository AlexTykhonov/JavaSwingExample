import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class MyPaneltwo extends JPanel
        implements DocumentListener {
    private static final long serialVersionUID = 1L;
    private JTextArea jta = new JTextArea();
    private String newstr;

    public MyPaneltwo() {
        setLayout(new BorderLayout());
        add(new JScrollPane(jta));
        jta.getDocument().addDocumentListener(this);
    }


    public static void main(String[] args) {
        MyPaneltwo myPaneltwo = new MyPaneltwo();
    }
    // поиск начала слова в обратном порядке
// от указанной позиции
    private int getBackWord(String str, int pos) {
        int ret = pos - 1;
        if (!Character.isLetter(str.charAt(pos))) {
            while (ret >= 0 && Character.isLetterOrDigit(str.charAt(ret))) {
                --ret;
            }
            return ret + 1;
        }
        return -1;
    }

    @Override
    public void changedUpdate(DocumentEvent arg0) {
    }

    @Override
// вставка символа в текстовом поле
    public void insertUpdate(DocumentEvent arg0) {
        newstr = jta.getText();
        String word = null;
        int wpos = getBackWord(newstr, arg0.getOffset());
// выделяем текущее слово
        if (wpos != -1 && wpos < arg0.getOffset() - 1) {
            word = newstr.substring(wpos, arg0.getOffset());
            // если оно равно o4 заменяем на oooo
            if ("o4".equals(word)) {
                newstr = newstr.substring(0, wpos) + "oooo"
                        + newstr.substring(arg0.getOffset(), newstr.length());
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        jta.setText(newstr);
                    }
                });
            }
        }
    }

    @Override
    public void removeUpdate(DocumentEvent arg0) {
    }
}
