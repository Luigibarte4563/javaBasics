import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class InventoryManager {
    public static void main(String[] args) {
        JFrame thisIsTheMainFrame = new JFrame("Inventory Manager");
        thisIsTheMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thisIsTheMainFrame.setSize(500, 400);

        JPanel inputPanelForNamePriceQuantity = new JPanel();
        inputPanelForNamePriceQuantity.setLayout(new GridLayout(3, 2, 5, 10));

        JTextField forNameField = new JTextField();
        JTextField priceField = new JTextField();
        JTextField forQuantityField = new JTextField();
        JTextArea forOutputArea = new JTextArea();
        forOutputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(forOutputArea);

        ArrayList<String[]> inventory = new ArrayList<>();

        inputPanelForNamePriceQuantity.add(new JLabel("Product Name:"));
        inputPanelForNamePriceQuantity.add(forNameField);

        inputPanelForNamePriceQuantity.add(new JLabel("Price:"));
        inputPanelForNamePriceQuantity.add(priceField);

        inputPanelForNamePriceQuantity.add(new JLabel("Quantity:"));
        inputPanelForNamePriceQuantity.add(forQuantityField);

        JPanel buttonPanelForAddSearchDisplay = new JPanel();
        buttonPanelForAddSearchDisplay.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 30));
        JButton addButton = new JButton("Add Product");
        JButton searchButton = new JButton("Search Product");
        JButton displayButton = new JButton("Display Inventory");

        buttonPanelForAddSearchDisplay.add(addButton);
        buttonPanelForAddSearchDisplay.add(searchButton);
        buttonPanelForAddSearchDisplay.add(displayButton);

        thisIsTheMainFrame.add(inputPanelForNamePriceQuantity, BorderLayout.NORTH);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(0, 20));
        mainPanel.add(buttonPanelForAddSearchDisplay, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        thisIsTheMainFrame.add(mainPanel, BorderLayout.CENTER);
        
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = forNameField .getText().trim();
                String priceText = priceField.getText().trim();
                String quantityText = forQuantityField.getText().trim();
                if (name.isEmpty() || priceText.isEmpty() || quantityText.isEmpty()) {
                    JOptionPane.showMessageDialog(thisIsTheMainFrame, "All fields must be filled!");
                } else if (!priceText.matches("\\d+(\\.\\d+)?") || !quantityText.matches("\\d+")) {
                    JOptionPane.showMessageDialog(thisIsTheMainFrame, "Invalid price or quantity!");
                } else {
                    double price = Double.parseDouble(priceText);
                    int quantity = Integer.parseInt(quantityText);
                    inventory.add(new String[]{name, String.valueOf(price), String.valueOf(quantity)});
                    JOptionPane.showMessageDialog(thisIsTheMainFrame, "Product added successfully!");
                    forNameField .setText("");
                    priceField.setText("");
                    forQuantityField.setText("");
                }
                
            }
        });

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = forNameField .getText().trim();
                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(thisIsTheMainFrame, "Enter a product name to search.");
                }
                for (String[] product : inventory) {
                    if (product[0].equalsIgnoreCase(name)) {
                        forOutputArea.setText("Product found:\nName: " + product[0] + ", Price: " + product[1] + ", Quantity: " + product[2]);
                    }
                }
                JOptionPane.showMessageDialog(thisIsTheMainFrame, "Product not found.");

            }
        });

        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (inventory.isEmpty()) {
                    JOptionPane.showMessageDialog(thisIsTheMainFrame, "Inventory is empty.");
                }
                StringBuilder sb = new StringBuilder("Inventory:\n");
                for (int i = 0; i < inventory.size(); i++) {
                    String[] product = inventory.get(i);
                    sb.append("Name: ").append(product[0])
                      .append(", Price: ").append(product[1])
                      .append(", Quantity: ").append(product[2])
                      .append("\n");
                }
                
                forOutputArea.setText(sb.toString());
            }
        });

        thisIsTheMainFrame.setVisible(true);
    }
}
