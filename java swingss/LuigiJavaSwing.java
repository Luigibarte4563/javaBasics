import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LuigiJavaSwing extends JFrame {

    public static void main(String []args){

        JFrame frame = new JFrame("Student Information System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.setBackground(Color.BLUE);
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Submit");
        inputPanel.add(label);
        inputPanel.add(textField);
        inputPanel.add(button);

        frame.add(inputPanel);
        frame.setVisible(true);

        JTextArea textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JPanel searchPanel = new JPanel(new FlowLayout());
        searchPanel.setBackground(Color.YELLOW);
        JLabel searchLabel = new JLabel("search name:");
        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        ArrayList<String> names = new ArrayList<>();

        button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e){
            String inputName = textField.getText();
            if(!inputName.isEmpty()){
                names.add(inputName);
                textArea.append(inputName + " ");
                JOptionPane.showMessageDialog(frame, "Information added");
            }else{
                JOptionPane.showMessageDialog(frame, "NO RECOD FOUND");
            }
           } 
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String searchName = searchField.getText();
                if(names.contains(searchName)){
                    JOptionPane.showMessageDialog(frame, "Name Found" + searchName);
                }else{
                    JOptionPane.showMessageDialog(frame, "NO RECORD FOUND");
                }
            }

        });

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(searchPanel, BorderLayout.SOUTH);

        frame.setVisible(true);


    }
    
}
