import javax.swing.*;

public class FLAMESCalculator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("FLAMES: A Fun Relationship Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel titleLabel = new JLabel("FLAMES Relationship Calculator", SwingConstants.CENTER);
        titleLabel.setBounds(50, 10, 300, 30);

        JLabel name1Label = new JLabel("Enter Name 1:");
        name1Label.setBounds(50, 50, 100, 25);

        JLabel name2Label = new JLabel("Enter Name 2:");
        name2Label.setBounds(50, 90, 100, 25);

        JTextField name1Field = new JTextField();
        name1Field.setBounds(160, 50, 180, 25);

        JTextField name2Field = new JTextField();
        name2Field.setBounds(160, 90, 180, 25);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(50, 130, 290, 30);

        JLabel resultLabel = new JLabel("Result: ", SwingConstants.CENTER);
        resultLabel.setBounds(50, 170, 300, 30);

        frame.add(titleLabel);
        frame.add(name1Label);
        frame.add(name1Field);
        frame.add(name2Label);
        frame.add(name2Field);
        frame.add(calculateButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}