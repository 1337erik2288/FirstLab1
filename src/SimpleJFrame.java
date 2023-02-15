import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
        JTextField t1 = new JTextField();
        t1.setBackground(Color.pink);
        add(t1);
        JButton b1 = new JButton();
        b1.setText("Hello World1");
        add(b1);

        setVisible(true);

        class TextListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText(t1.getText());
            }
        }

        class TextListener1 implements MouseListener{

            @Override
            public void mouseClicked(MouseEvent e) { }

            @Override
            public void mousePressed(MouseEvent e) { }

            @Override
            public void mouseReleased(MouseEvent e) { }

            @Override
            public void mouseEntered(MouseEvent e) {
                l1.setText("*****");
            }

            @Override
            public void mouseExited(MouseEvent e) { }
        }

        TextListener textListener = new TextListener();
        b1.addActionListener(textListener);
    }





}
