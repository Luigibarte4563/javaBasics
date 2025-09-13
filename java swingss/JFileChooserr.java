import javax.swing.*;

public class JFileChooserr {
    public static void main(String[]args){
        
        JButton button = new JButton();
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new java.io.File("C:/Downloads"));
        fc.setDialogTitle("hello");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    }
}