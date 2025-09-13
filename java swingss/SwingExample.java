import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample {
    public static void main(String[] args) {


        // Create a new window (JFrame)
        JFrame frame = new JFrame("Swing Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button
        JButton button = new JButton("Click Me");

        ImageIcon image = new ImageIcon("C:\\Users\\T460s\\java swingss\\prog.png");

        JLabel label = new JLabel(image);

        // Add an action listener to handle button clicks
        button.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
                JOptionPane.showMessageDialog(label, "hello");
            }
        });

        // Add button to the frame
        frame.add(button);
        frame.add(label);

        // Set layout and make the frame visible
        frame.setLayout(null);
        button.setBounds(600, 315, 100, 30); // x, y, width, height
        frame.setVisible(true);
    }
}
