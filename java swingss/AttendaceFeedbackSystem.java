import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class AttendaceFeedbackSystem {
    public static void main(String[] args) {

        /*
        CODE BY: CHARLES KENNETH P. OCAMPO
        11-ITE-04
        Programming 2
        Lab Activity 2
        Submitted in 2/7/25
        */

        //Frame
    JFrame frm = new JFrame("Attendace Feedback System");
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setSize(600,400);
    frm.setLayout(null);
    frm.setResizable(false);
        //PinkPanel
    JPanel pnkPanel = new JPanel();     
    pnkPanel.setBackground(Color.PINK);
    pnkPanel.setBounds(0, 0, 600, 225);
    pnkPanel.setLayout(new GridLayout(4, 2, 10, 10));
        //Student
    JLabel name = new JLabel("Student Name: ");
    name.setBounds(60, 30, 100, 20);
    JTextField tField1 = new JTextField();
    tField1.setBounds(225, 30, 300, 30);
        //ID
    JLabel id = new JLabel("Student ID: "); 
    id.setBounds(60, 80, 100, 30);
    JTextField tField2 = new JTextField(20);
    tField2.setBounds(225, 80, 300, 30);
        //Feedback
    JLabel Feedback = new JLabel("Feedback: "); 
    Feedback.setBounds(60, 130, 100, 30);
    JTextArea tArea1 = new JTextArea(1, 20);
    tArea1.setBounds(225, 130, 300, 60);
        //Submit
    JButton SBttn = new JButton("Submit");
    SBttn.setBounds(225, 210, 150, 30);
    frm.add(SBttn);
        //TextArea
    JTextArea textAr = new JTextArea();
    textAr.setBounds(60, 250, 460, 100);
    textAr.setEditable(false);
    textAr.setBackground(Color.LIGHT_GRAY);
    JScrollPane scrollPn = new JScrollPane(textAr);
        //Store Data 
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> ids = new ArrayList<>();
    ArrayList<String> FBs = new ArrayList<>();
        //Button ActionListener
    SBttn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String inputNm = tField1.getText();
            String inputID = tField2.getText();
            String inputFB = tArea1.getText();
            names.add(inputNm);
            ids.add(inputID);
            FBs.add(inputFB);
            if(!inputFB.isEmpty() && !inputID.isEmpty() && !inputNm.isEmpty()){
                textAr.append("Student name: " + inputNm + "\n" + "Student ID: " + inputID + "\n" + "Feedback: " + inputFB + "\n" + "\n");
                JOptionPane.showMessageDialog(frm,"Information has been added");
            }else{
                JOptionPane.showMessageDialog(frm, "no input");
            }
        }
    });
        //Components
    frm.add(name); frm.add(tField1);
    frm.add(id); frm.add(tField2);
    frm.add(Feedback); frm.add(tArea1);
    frm.add(scrollPn, BorderLayout.SOUTH);
    frm.add(textAr);
    frm.add(pnkPanel);
    frm.setVisible(true);
    
}
}
