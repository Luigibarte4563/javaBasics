import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InventoryManager2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Inventory Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2, 5, 15));

        JTextField nameField = new JTextField();
        JTextField priceField = new JTextField();
        JTextField quantityField = new JTextField();
        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        ArrayList<String[]> inventory = new ArrayList<>();

        inputPanel.add(new JLabel("Product Name:"));
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Price:"));
        inputPanel.add(priceField);

        inputPanel.add(new JLabel("Quantity:"));
        inputPanel.add(quantityField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));
        JButton addButton = new JButton("Add Product");
        JButton searchButton = new JButton("Search Product");
        JButton displayButton = new JButton("Display Inventory");

        buttonPanel.add(addButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(displayButton);

        frame.add(inputPanel, BorderLayout.NORTH);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(0, 50));
        mainPanel.add(buttonPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        frame.add(mainPanel, BorderLayout.CENTER);
        
        

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String priceText = priceField.getText().trim();
                String quantityText = quantityField.getText().trim();

                if (name.isEmpty() || priceText.isEmpty() || quantityText.isEmpty()) {
                    outputArea.setText("All fields must be filled!");
                    return;
                }

                try {
                    double price = Double.parseDouble(priceText);
                    int quantity = Integer.parseInt(quantityText);
                    inventory.add(new String[]{name, String.valueOf(price), String.valueOf(quantity)});
                    outputArea.setText("Product added successfully!");
                } catch (NumberFormatException ex) {
                    outputArea.setText("Invalid price or quantity!");
                }
            }
        });

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                if (name.isEmpty()) {
                    outputArea.setText("Enter a product name to search.");
                    return;
                }
                for (String[] product : inventory) {
                    if (product[0].equalsIgnoreCase(name)) {
                        outputArea.setText("Product found:\nName: " + product[0] + ", Price: " + product[1] + ", Quantity: " + product[2]);
                        return;
                    }
                }
                outputArea.setText("Product not found.");
            }
        });

        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (inventory.isEmpty()) {
                    outputArea.setText("Inventory is empty.");
                    return;
                }
                StringBuilder sb = new StringBuilder("Inventory:\n");
                for (String[] product : inventory) {
                    sb.append("Name: ").append(product[0]).append(", Price: ").append(product[1]).append(", Quantity: ").append(product[2]).append("\n");
                }
                outputArea.setText(sb.toString());
            }
        });

        frame.setVisible(true);
    }
}
