import javax.swing.*;

public class window {

    public static void main(String[] args) {
        // Create a JFrame (the window)
        JFrame frame = new JFrame("luigi");

        // Set the window size (width, height)
        frame.setSize(400, 300);

        // Set the default close operation (when you click the 'X' button)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel (a text label)
        JLabel label = new JLabel("Hello, this is my first Java window!", SwingConstants.CENTER);

        // Add the label to the JFrame
        frame.add(label);

        // Set the frame layout (default is BorderLayout, but this one centers the text)
        frame.setLayout(new java.awt.BorderLayout());

        // Center the window on the screen
        frame.setLocationRelativeTo(null);

        // Make the window visible
        frame.setVisible(true);
    }
}
