import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class studentManagementApp {
    private JFrame frame;
    private JTextField nameField;
    private JTextField ageField;
    private JButton addButton;
    private JTable studentTable;
    private StudentTableModel model;

    public studentManagementApp() {
        frame = new JFrame("Student Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Set background color to pastel pink
        frame.getContentPane().setBackground(new Color(255, 182, 193));

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        inputPanel.setBackground(new Color(255, 182, 193)); // Set background color for input panel

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField(10);
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Age:"));
        ageField = new JTextField(5);
        inputPanel.add(ageField);

        addButton = new JButton("Add Student");
        inputPanel.add(addButton);

        frame.add(inputPanel, BorderLayout.NORTH);

        model = new StudentTableModel();
        studentTable = new JTable(model);
        studentTable.setBackground(new Color(245, 245, 220)); // Set background color for table (beige)
        studentTable.getTableHeader().setBackground(new Color(245, 245, 220)); // Set background color for table header (beige)
        frame.add(new JScrollPane(studentTable), BorderLayout.CENTER);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int age;
                try {
                    age = Integer.parseInt(ageField.getText());
                    model.addStudent(new Student(name, age));
                    nameField.setText("");
                    ageField.setText("");
                    animateRowAddition(model.getRowCount() - 1);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid age entered.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }

    private void animateRowAddition(int rowIndex) {
        Timer timer = new Timer(100, new ActionListener() {
            private int count = 0;
            private boolean highlight = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (count < 6) {
                    studentTable.repaint();
                    studentTable.setRowSelectionInterval(rowIndex, rowIndex);
                    studentTable.setSelectionBackground(highlight ? Color.YELLOW : studentTable.getBackground());
                    highlight = !highlight;
                    count++;
                } else {
                    ((Timer) e.getSource()).stop();
                    studentTable.clearSelection();
                }
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        new studentManagementApp();
    }

    class StudentTableModel extends AbstractTableModel {
        private List<Student> students;
        private String[] columnNames = {"Name", "Age"};

        public StudentTableModel() {
            students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
            fireTableRowsInserted(students.size() - 1, students.size() - 1);
        }

        @Override
        public int getRowCount() {
            return students.size();
        }

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Student student = students.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return student.getName();
                case 1:
                    return student.getAge();
                default:
                    return null;
            }
        }

        @Override
        public String getColumnName(int column) {
            return columnNames[column];
        }
    }

    class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}