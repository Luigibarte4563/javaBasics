import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui {
    public static void main(String[]args){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("FILE");
        JMenu menu2 = new JMenu("Help");
        menuBar.add(menu1);
        menuBar.add(menu2);
        JMenuItem menuItem1 = new JMenuItem("save as");
        JMenuItem menuItem2 = new JMenuItem("gggg");
        menu1.add(menuItem1);
        menu1.add(menuItem2);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter a text");
        JTextField textField = new JTextField(10);
        JButton sendButton = new JButton("send");
        JButton resetButton = new JButton("reset");
        panel.add(label);
        panel.add(textField);
        panel.add(sendButton);
        panel.add(resetButton);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        sendButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e){
            String text = textField.getText();
            if(!text.isEmpty()){
                textArea.append(text + "\n");
                textField.setText("");
            }else{
                JOptionPane.showMessageDialog(frame,"no input");
            }
           } 
        });

        resetButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e){
            textArea.setText("");
            textField.setText("");
           } 
        });


        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, textArea);
        frame.setVisible(true);
    }
}
