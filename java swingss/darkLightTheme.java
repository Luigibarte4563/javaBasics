import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class darkLightTheme {
    public static void main(String[]args){

        JFrame mainFrame = new JFrame("theme");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 500);
        mainFrame.setLayout(null);

        JButton dark = new JButton("dark");
        dark.setBounds(10, 10, 100, 30);
        mainFrame.add(dark);

        JButton light = new JButton("light");
        light.setBounds(110, 10, 100, 30);
        mainFrame.add(light);

        dark.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                mainFrame.setBackground(Color.BLACK);
            }
        });

        mainFrame.setVisible(true);
    }    
}
