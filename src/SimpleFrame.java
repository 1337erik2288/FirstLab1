import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleFrame extends Frame {
    SimpleFrame(String s){
        super(s);
        setSize(400, 200);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev){
                System.exit(0);
            }
        });
        setLayout(null);
        Label text = new Label("Stroka");
        text.setLocation(50, 50);
        text.setSize(150, 20);
        add(text);
        Button del = new Button("Delete text");
        del.setLocation(50, 100);
        del.setSize(100, 20);
        add(del);
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
            }
        });
        setVisible(true);
    }

}
