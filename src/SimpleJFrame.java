import java.awt.*;
import javax.swing.*;
public class SimpleJFrame extends JFrame{
    SimpleJFrame(String s){
        super(s);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridLayout(4,1));
        JLabel l1 = new JLabel();
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
        add(l1);
        JButton b1 = new JButton();
        b1.setText("Start");
        add(b1);

        setVisible(true);
    }


}
