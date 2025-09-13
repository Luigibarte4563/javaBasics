import javax.swing.*;
import java.awt.*;

public class gridLayout{
    public static void main(String[]args){

        JFrame frame = new JFrame("free styles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 5, 10));
        JLabel name = new JLabel("name");
        JTextField nameField = new JTextField();
        JLabel middleName = new JLabel("name");
        JTextField middleNameField = new JTextField();
        JLabel lastName = new JLabel("name");
        JTextField lastNameField = new JTextField();
        panel.add(name, nameField);
        panel.add(middleName, middleNameField);
        panel.add(lastName, lastNameField);

        frame.add(panel);

        frame.setVisible(true);
    }
}
