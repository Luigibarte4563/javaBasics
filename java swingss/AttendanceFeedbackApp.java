import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AttendanceFeedbackApp {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Attendance Feedback System");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 500, 400);
        panel.setLayout(null);
        panel.setBackground(new Color(255, 182, 193)); 
        frame.add(panel);
        
        
        JLabel nameLabel = new JLabel("Student Name:");
        nameLabel.setBounds(20, 20, 100 , 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(130, 20, 330, 25);
        
        JLabel idLabel = new JLabel("Student ID:");
        idLabel.setBounds(20, 60, 100, 25);
        JTextField idField = new JTextField();
        idField.setBounds(130, 60, 330, 25);
        
        JLabel feedbackLabel = new JLabel("Feedback:");
        feedbackLabel.setBounds(20, 100, 100, 25);
        JTextArea feedbackField = new JTextArea();
        feedbackField.setLineWrap(true);
        feedbackField.setWrapStyleWord(true);
        JScrollPane feedbackScroll = new JScrollPane(feedbackField);
        feedbackScroll.setBounds(130, 100, 330, 75);
        
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(223, 190, 150, 30);
        
        
        JTextArea displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane displayScroll = new JScrollPane(displayArea);
        displayScroll.setBounds(20, 230, 440, 120);
        displayArea.setBackground(new Color(211, 211, 211)); 
        
        
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String id = idField.getText().trim();
                String feedback = feedbackField.getText().trim();
                
                if (!name.isEmpty() && !id.isEmpty() && !feedback.isEmpty()) {
                    displayArea.append("Name: " + name + "\n");
                    displayArea.append("ID: " + id + "\n");
                    displayArea.append("Feedback: " + feedback + "\n\n");
                    
                    
                    nameField.setText("");
                    idField.setText("");
                    feedbackField.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(idLabel);
        panel.add(idField);
        panel.add(feedbackLabel);
        panel.add(feedbackScroll);
        panel.add(submitButton);
        panel.add(displayScroll);
        
        
        frame.setVisible(true);
    }
}