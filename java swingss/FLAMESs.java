import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FLAMESs {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FLAMES Relationship Test");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(240, 248, 255));

        JLabel titleLabel = new JLabel("FLAMES Relationship Test", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setForeground(new Color(50, 50, 150));
        titleLabel.setBounds(100, 20, 300, 30);
        frame.add(titleLabel);

        JLabel name1Label = new JLabel("Enter first name:");
        name1Label.setFont(new Font("Arial", Font.PLAIN, 16));
        name1Label.setBounds(50, 80, 150, 25);
        frame.add(name1Label);

        JTextField name1Field = new JTextField();
        name1Field.setBounds(200, 80, 200, 25);
        frame.add(name1Field);

        JLabel name2Label = new JLabel("Enter second name:");
        name2Label.setFont(new Font("Arial", Font.PLAIN, 16));
        name2Label.setBounds(50, 120, 150, 25);
        frame.add(name2Label);

        JTextField name2Field = new JTextField();
        name2Field.setBounds(200, 120, 200, 25);
        frame.add(name2Field);

        JButton calculateButton = new JButton("MATCH");
        calculateButton.setFont(new Font("Arial", Font.BOLD, 16));
        calculateButton.setBackground(new Color(60, 179, 113));
        calculateButton.setForeground(Color.WHITE);
        calculateButton.setBounds(150, 180, 200, 40);
        frame.add(calculateButton);

        JButton replayButton = new JButton("Replay");
        replayButton.setFont(new Font("Arial", Font.BOLD, 16));
        replayButton.setBackground(new Color(255, 99, 71));
        replayButton.setForeground(Color.WHITE);
        replayButton.setBounds(150, 240, 200, 40);
        frame.add(replayButton);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name1 = name1Field.getText().toLowerCase().replaceAll("[^a-z]", "");
                String name2 = name2Field.getText().toLowerCase().replaceAll("[^a-z]", "");

                if (name1.isEmpty() || name2.isEmpty()) {
                    showResultDialog(frame, "Please enter both names.");
                } else {
                    int commonCount = countCommonLetters(name1, name2);
                    String flamesResult = findFlamesResult(commonCount);
                    showResultDialog(frame, "Result: " + flamesResult);
                }
            }
        });

        replayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name1Field.setText("");
                name2Field.setText("");
            }
        });

        frame.setVisible(true);
    }

    public static int countCommonLetters(String name1, String name2) {
        int count = 0;
        char[] name1Chars = name1.toCharArray();
        char[] name2Chars = name2.toCharArray();

        for (char c1 : name1Chars) {
            for (int i = 0; i < name2Chars.length; i++) {
                if (c1 == name2Chars[i]) {
                    count++;
                    name2Chars[i] = 0;
                    break;
                }
            }
        }
        return (name1.length() + name2.length() - 2 * count);
    }

    public static String findFlamesResult(int count) {
        String flames = "FLAMES";
        char[] flamesArray = flames.toCharArray();

        int index = 0;
        while (flamesArray.length > 1) {
            index = (index + count - 1) % flamesArray.length;
            flamesArray = removeCharacterAt(flamesArray, index);
        }

        switch (flamesArray[0]) {
            case 'F': return "Friendship";
            case 'L': return "Love";
            case 'A': return "Affection";
            case 'M': return "Marriage";
            case 'E': return "Enemy";
            case 'S': return "Sibling";
            default: return "Unknown";
        }
    }

    public static char[] removeCharacterAt(char[] array, int index) {
        char[] newArray = new char[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }

    public static void showResultDialog(JFrame parent, String message) {
        JDialog resultDialog = new JDialog(parent, "FLAMES Result", true);
        resultDialog.setSize(300, 200);
        resultDialog.setLayout(new BorderLayout());

        JLabel resultLabel = new JLabel(message, SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 18));
        resultLabel.setForeground(new Color(75, 0, 130)); 
        resultDialog.add(resultLabel, BorderLayout.CENTER);

        JButton okButton = new JButton("OK");
        okButton.setFont(new Font("Arial", Font.BOLD, 14));
        okButton.setBackground(new Color(70, 130, 180));
        okButton.setForeground(Color.WHITE);
        okButton.addActionListener(e -> resultDialog.dispose());

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        resultDialog.add(buttonPanel, BorderLayout.SOUTH);

        resultDialog.setLocationRelativeTo(parent);
        resultDialog.setVisible(true);
    }
}