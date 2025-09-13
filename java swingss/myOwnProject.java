import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class myOwnProject{
    public static void main(String[] ars){

        JFrame frame = new JFrame("login gui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2, 10, 10));
        panel.setBounds(0, 30, 600, 225);
        JLabel email = new JLabel("email");
        email.setBounds(0, 10, 100, 10);
        JTextField emailTextField = new JTextField(30);
        emailTextField.setBounds(110,  50, 330, 25);
        panel.add(email);
        panel.add(emailTextField);

        JLabel password = new JLabel("password");
        email.setBounds(50, 100, 100, 100);
        JTextField passwordTextField = new JTextField(30);
        emailTextField.setBounds(110,  500, 330, 25);
        panel.add(password);
        panel.add(passwordTextField);;
        
        frame.add(panel);
        frame.setVisible(true);
    }
}