import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    
    private JFrame window;

    public MainWindow() {
        window = new JFrame();
        window.setTitle("hello world");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(1000, 500);
        window.setLocationRelativeTo(null);

        JLabel label = new JLabel("hello mother", SwingConstants.CENTER);
        label.setFont(new Font("arial", Font.BOLD, 100));
        window.add(label);
        
        
    }

    public void show(){
        window.setVisible(true);
    }
}
