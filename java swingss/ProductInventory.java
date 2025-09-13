import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ProductInventory {
    public static void main(String[] args) {
        
        /*
        CODE BY: CHARLES KENNETH P. OCAMPO
        11-ITE-04
        Programming 2
        PreLim Lab Exam
        Submitted in 2/20/25
        */

        JFrame f = new JFrame("Product Invetory");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 450);
        f.setLayout(new BorderLayout(10, 10));
        f.setResizable(false);
        
        JPanel p = new JPanel();
        p.setBackground(Color.PINK);
        p.setSize(500, 450);

        JLabel  pn = new JLabel("Product Name:");
        pn.setBounds(50, 10, 100, 30);
        JTextField pnt = new JTextField(20);
        pnt.setBounds(200, 10, 225, 30);
        
        JLabel  pr = new JLabel("Price:");
        pr.setBounds(50, 60, 100, 30);
        JTextField prt = new JTextField(20);
        prt.setBounds(200, 60, 225, 30);

        JLabel  qt = new JLabel("Quantity:");
        qt.setBounds(50, 110, 100, 30);
        JTextField qtt = new JTextField(20);
        qtt.setBounds(200, 110, 225, 30);
        
        JButton apb = new JButton("Add Product");
        apb.setFont(new Font("Arial", Font.BOLD, 10));
        apb.setBounds(50, 170, 120, 30);
        JButton spb = new JButton("Search Product");
        spb.setFont(new Font("Arial", Font.BOLD, 10));
        spb.setBounds(175, 170, 120, 30);
        JButton dib = new JButton("Display Product");
        dib.setFont(new Font("Arial", Font.BOLD, 10));
        dib.setBounds(300, 170, 120, 30);

        JTextArea ta = new JTextArea();
        ta.setEditable(false);
        JScrollPane sp = new JScrollPane(ta);
        sp.setBounds(0, 225, 500, 190);


        ArrayList<String> pns = new ArrayList<>();
        ArrayList<String> prs = new ArrayList<>();
        ArrayList<String> qts = new ArrayList<>();
        
        apb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pn = pnt.getText();
                String pr = prt.getText();
                String qt = qtt.getText();
                if (!pn.isEmpty() && pr.matches("\\d+(\\.\\d+)?") && qt.matches("\\d+")) {
                    pns.add(pn);
                    prs.add(pr);
                    qts.add(qt);
                    pnt.setText("");
                    prt.setText("");
                    qtt.setText("");
                    ta.append("Name: " + pn + "\n");
                    ta.append("Price: " + pr + "\n");
                    ta.append("Quantity: " + qt + "\n\n");
                    JOptionPane.showMessageDialog(f, "Information has been added");
                } else {
                    JOptionPane.showMessageDialog(f, "Invalid Input!", "ERROR", JOptionPane.ERROR_MESSAGE );
                }
            }
        });

        spb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pn = pnt.getText();
                String pr = prt.getText();
                String qt = qtt.getText();
                pnt.setText("");
                prt.setText("");
                qtt.setText("");
                ta.setText("");
                boolean found = false;
                for (int i = 0; i < pns.size(); i++) {
                    if (pns.get(i).equals(pn) || prs.get(i).equals(pr) || qts.get(i).equals(qt)) {
                        ta.append("Product Found\n");
                        ta.append("Name: " + pns.get(i) + "\n");
                        ta.append("Price: " + prs.get(i) + "\n");
                        ta.append("Quantity: " + qts.get(i) + "\n\n");
                        found = true;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(f, "Product not found!", "ERROR", JOptionPane.ERROR_MESSAGE );

                }
            }
        });

        dib.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("");
                for (int i = 0; i < pns.size(); i++) {
                    ta.append("Inventory :\n\n");
                    ta.append("Name: " + pns.get(i) + "\n");
                    ta.append("Price: " + prs.get(i) + "\n");
                    ta.append("Quantity: " + qts.get(i) + "\n\n");
                }
            }
        });
            
        f.add(pn);
        f.add(pnt);
        f.add(pr);
        f.add(prt);
        f.add(qt);
        f.add(qtt);
        f.add(apb);
        f.add(spb);
        f.add(dib);
        f.add(sp);
        f.add(p);
        f.setVisible(true);
    }
}