import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JFrameOne {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Information System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Welcome Label
        JLabel welcomeLabel = new JLabel("Welcome to the Student Information System!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(welcomeLabel, BorderLayout.NORTH);

        // Input Panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        inputPanel.setBackground(Color.BLUE);
        JLabel nameLabel = new JLabel("Student Name:");
        JTextField nameField = new JTextField(15);
        nameField.setToolTipText("Enter the student's name here.");
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(5);
        ageField.setToolTipText("Enter the student's age here.");
        JButton addButton = new JButton("Add Student");

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(ageLabel);
        inputPanel.add(ageField);
        inputPanel.add(addButton);
        
        frame.add(inputPanel, BorderLayout.NORTH);

        // Student List Display
        JTextArea studentListArea = new JTextArea(10, 20);
        studentListArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(studentListArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Search Panel
        JPanel searchPanel = new JPanel(new FlowLayout());
        searchPanel.setBackground(Color.BLUE);
        JLabel searchLabel = new JLabel("Search Name:");
        JTextField searchField = new JTextField(15);
        JButton searchButton = new JButton("Search");
        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        frame.add(searchPanel, BorderLayout.SOUTH);

        // Student Data Storage
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<String> studentAges = new ArrayList<>();

        // Add Student Button Action Listener
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String age = ageField.getText().trim();
                if (!name.isEmpty() && !age.isEmpty()) {
                    studentNames.add(name);
                    studentAges.add(age);
                    studentListArea.append(name + " (Age: " + age + ")\n");
                    JOptionPane.showMessageDialog(frame, "Student added successfully!");
                    nameField.setText("");
                    ageField.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Please enter both name and age.");
                }
            }
        });

        // Search Button Action Listener
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchName = searchField.getText().trim();
                if (!searchName.isEmpty()) {
                    int index = studentNames.indexOf(searchName);
                    if (index != -1) {
                        JOptionPane.showMessageDialog(frame, "Student found: " + searchName + ", Age: " + studentAges.get(index));
                    } else {
                        JOptionPane.showMessageDialog(frame, "Student not found");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please enter a name to search.");
                }
            }
        });

        frame.setVisible(true);
    }
}
