import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaYoutube {
    public static void main(String []args){

        JFrame jFrame = new JFrame("Login");
        jFrame.setDefaultCloseOperation(3);
        jFrame.setBounds(440, 200, 400, 300);

        JPanel jPanelInput = new JPanel(new FlowLayout());
        JTextField jTextFieldUserNameInput = new JTextField(20);
        JTextField jTextFieldPasswordInput = new JTextField(20);
        JLabel jLabelUserNamLabel = new JLabel("username");
        jLabelUserNamLabel.setToolTipText("this is user name input");
        JLabel jLabelPasswordLabel = new JLabel("password");
        JButton jButtonEnter = new JButton("Enter");
        JButton jButtonCancel = new JButton("Cancel");

        jPanelInput.add(jTextFieldUserNameInput);
        jPanelInput.add(jTextFieldPasswordInput);
        jPanelInput.add(jLabelUserNamLabel);
        jPanelInput.add(jLabelPasswordLabel);
        jPanelInput.add(jButtonEnter);
        jPanelInput.add(jButtonCancel);

        jFrame.add(jPanelInput);


        jFrame.setVisible(true);
        

    }
}
