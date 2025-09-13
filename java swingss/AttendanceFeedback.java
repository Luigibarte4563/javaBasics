import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AttendanceFeedback extends JFrame {

    // Components for the feedback form
    private JTextField nameField;
    private JTextField idField;
    private JTextArea feedbackArea;
    private JTextArea displayArea;
    private JButton submitButton;

    public AttendanceFeedback() {
        // Set the title of the JFrame
        setTitle("Attendance Feedback System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new BorderLayout());

        // Create a JPanel for the input form
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2, 10, 10));

        // Add components for Student Name input
        inputPanel.add(new JLabel("Student Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        // Add components for Student ID input
        inputPanel.add(new JLabel("Student ID:"));
        idField = new JTextField();
        inputPanel.add(idField);

        // Add components for Feedback input
        inputPanel.add(new JLabel("Feedback:"));
        feedbackArea = new JTextArea(3, 20);
        JScrollPane feedbackScrollPane = new JScrollPane(feedbackArea);
        inputPanel.add(feedbackScrollPane);

        // Add the input panel to the frame
        add(inputPanel, BorderLayout.NORTH);

        // Create the Submit button with default size
        submitButton = new JButton("Submit Feedback");
        submitButton.addActionListener(new SubmitFeedbackListener());
        add(submitButton, BorderLayout.CENTER);

        // Create the display area for submitted feedback
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setBorder(BorderFactory.createTitledBorder("Submitted Feedback"));
        JScrollPane displayScrollPane = new JScrollPane(displayArea);
        add(displayScrollPane, BorderLayout.SOUTH);

        setVisible(true);
    }

    private class SubmitFeedbackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Retrieve the input values
            String studentName = nameField.getText().trim();
            String studentID = idField.getText().trim();
            String feedback = feedbackArea.getText().trim();

            // Validate input
            if (studentName.isEmpty() || studentID.isEmpty() || feedback.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill out all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Append the details to the display area
            displayArea.append("\nAttendance Feedback System\n");
            displayArea.append("Student Name: " + studentName + "\n");
            displayArea.append("Student ID: " + studentID + "\n");
            displayArea.append("Feedback: " + feedback + "\n");
            displayArea.append("------------------------------\n");

            // Clear the input fields for new entries
            nameField.setText("");
            idField.setText("");
            feedbackArea.setText("");
        }
    }

    public static void main(String[] args) {
        // Launch the application
        new AttendanceFeedback();
    }
}