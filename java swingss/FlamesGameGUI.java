import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlamesGameGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FLAMES Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 1));

        JLabel label1 = new JLabel("Enter First Name:");
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel("Enter Second Name:");
        JTextField textField2 = new JTextField();
        JButton calculateButton = new JButton("Calculate");
        JLabel resultLabel = new JLabel("Result: ", SwingConstants.CENTER);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name1 = textField1.getText().toLowerCase().replaceAll("\\s", "");
                String name2 = textField2.getText().toLowerCase().replaceAll("\\s", "");
                
                StringBuilder n1 = new StringBuilder(name1);
                StringBuilder n2 = new StringBuilder(name2);
                
                for (int i = 0; i < n1.length(); i++) {
                    for (int j = 0; j < n2.length(); j++) {
                        if (n1.charAt(i) == n2.charAt(j)) {
                            n1.deleteCharAt(i);
                            n2.deleteCharAt(j);
                            i--; // Adjust index after removal
                            break;
                        }
                    }
                }
                
                int count = n1.length() + n2.length();
                
                String flames = "FLAMES";
                String[] results = {"Friendship", "Love", "Affection", "Marriage", "Enemy", "Sibling"};
                
                int index = 0;
                for (int i = 6; i > 1; i--) {
                    index = (index + count - 1) % i;
                    flames = flames.substring(0, index) + flames.substring(index + 1);
                }
                
                resultLabel.setText("Result: " + results["FLAMES".indexOf(flames)]);
            }
        });

        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(calculateButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}