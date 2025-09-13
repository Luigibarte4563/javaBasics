import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlameCalcu {
    public static void main(String []args){

        JFrame frame = new JFrame("FLAME Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.YELLOW);
        panel.setBounds(40, 60, 400, 200);
        JLabel name1 = new JLabel("Enter a name 1 here");
        name1.setBounds(60, 80, 50, 50);
        panel.add(name1);

        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(Color.BLACK);
        panel2.setBounds(40, 300, 400, 100);

        frame.add(panel);
        frame.add(panel2);
        frame.setVisible(true);
    }    
}
