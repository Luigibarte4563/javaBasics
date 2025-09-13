import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class LuigisProject {
    public static void main(String[] args){

        //LUIGI OWN PROJECT ROCK IN ROLL
        
        JFrame frame = new JFrame("this is my own frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        JLabel name  = new JLabel("Name");
        name.setBounds(100, 40, 100, 30);
        mainPanel.add(name);
        JTextField nameField = new JTextField();
        nameField.setBounds(200, 40, 200, 30);
        mainPanel.add(nameField);

        JLabel middleName = new JLabel("LastName");
        middleName.setBounds(100, 80, 100, 30);
        mainPanel.add(middleName);
        JTextField middleNameField = new  JTextField();
        middleNameField.setBounds(200, 80, 200, 30);
        mainPanel.add(middleNameField);

        JButton ADD = new JButton("ADD");
        ADD.setBounds(200, 120, 200, 30);
        mainPanel.add(ADD);

        ArrayList<String[]> nameList = new ArrayList<>();

        JTextArea textArea = new JTextArea();
        textArea.setBounds(0, 300, 500, 150);
        mainPanel.add(textArea);
        textArea.setEditable(true);

        
        ADD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String nameString = nameField.getText();
                String middleNameString = middleName.getText();
                if(!nameString.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "please enter your name");
                }else if(!middleNameString.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "please enter your last name");
                }else if(nameString.isEmpty() && middleNameString.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Success you add your name & last name");
                    nameField.setText("");
                    middleNameField.setText("");
                    textArea.append("you're name is " + nameString + "and you're last name is " + middleNameString + "\n");
                }    
            }
        });

        frame.add(mainPanel);
        frame.setVisible(true);
    }    
}
