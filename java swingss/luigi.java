import javax.swing.*;
import  java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class luigi {
    public static void main(String[]args){

        JFrame  thisFrame = new JFrame();
        thisFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thisFrame.setLayout(null);
        thisFrame.setSize(400, 400);

        JButton thisIsButton = new JButton("clicme");
        thisIsButton.setBounds(150, 150, 100, 40);
        thisFrame.add(thisIsButton);

        JMenuBar menuBer = new JMenuBar();
        JMenu thisMenu = new JMenu("file");
        JMenuItem open = new JMenuItem("open");
        JMenuItem saveUs = new JMenuItem("save us");
        menuBer.add(thisMenu);
        thisMenu.add(open);
        thisMenu.add(saveUs);
        menuBer.setBounds(10, 10, 600, 50);

        thisIsButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(thisFrame, "hi");
            }
        });
        
        thisFrame.add(menuBer);

        thisFrame.setVisible(true);
    }
}
