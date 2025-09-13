import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class newMe extends JFrame {
    public static void main(String []args){


        JFrame frame = new JFrame("Student Information System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel welcomePanel = new JPanel();
        welcomePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        welcomePanel.setPreferredSize(new Dimension(400,40));

        JLabel welcomeLabel = new JLabel("Welcome to the Information System!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16)); 
        welcomePanel.add(welcomeLabel);

        frame.add(welcomePanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.setBackground(Color.GREEN);
        JLabel nameLabel = new JLabel("Student Name:");
        JTextField nameField = new JTextField(10);
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

        centerPanel.add(inputPanel);

        centerPanel.add(Box.createVerticalStrut(10));

        JTextArea studentListArea = new JTextArea(5, 10);
        studentListArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(studentListArea);

        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel searchPanel = new JPanel(new FlowLayout());
        searchPanel.setBackground(Color.GREEN);
        JLabel searchLabel = new JLabel("Search name:");
        JTextField searchField = new JTextField(10);
        JButton searchButton = new JButton("Search");

        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        frame.add(searchPanel, BorderLayout.SOUTH);

        // -------- Logic for Adding and Searching Students --------
        ArrayList<String> studentNamesList = new ArrayList<>();
        ArrayList<String> studentAgesList = new ArrayList<>();

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String name = nameField.getText();
                String age = ageField.getText();
                if(!name.isEmpty() && !age.isEmpty()){
                    studentNamesList.add(name);
                    studentAgesList.add(age);
                    studentListArea.append(name + " (Age: " + age + ") \n" );
                    JOptionPane.showMessageDialog(frame, "Student added successfully.");
                    nameField.setText("");
                    ageField.setText("");
                }else{
                    JOptionPane.showMessageDialog(frame, "Please enter both name and age.");
                }
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String searchName = searchField.getText();
                if(!searchName.isEmpty()){
                    int index = studentNamesList.indexOf(searchName);
                    if(index != -1){
                        JOptionPane.showMessageDialog(frame, "Student found: " + searchName + ", Age: " + studentAgesList.get(index));
                        searchField.setText("");
                    }else{
                        JOptionPane.showMessageDialog(frame, "Student not found");
                        searchField.setText("");
                    }
                }else{
                    JOptionPane.showMessageDialog(frame, "Please enter a name to search.");
                }
            }
        });

        frame.setVisible(true);
        
    }
}
