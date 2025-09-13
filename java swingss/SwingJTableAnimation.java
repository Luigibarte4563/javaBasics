import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJTableAnimation {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel tableModel;
    private JButton addButton, deleteButton, animateButton;
    private JPanel animationPanel;
    private JLabel animateLabel;

    private int labelX = 0;
    private Timer animationTimer;

    public SwingJTableAnimation() {
        frame = new JFrame("Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 400); 
        frame.setLayout(new BorderLayout());

        String[] columnNames = {"ID", "Name", "Age"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        addButton = new JButton("Add Row");
        deleteButton = new JButton("Delete Row");
        animateButton = new JButton("Start Animation");

        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(animateButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        animationPanel = new JPanel();
        animationPanel.setPreferredSize(new Dimension(800, 30)); 
        animationPanel.setLayout(null);
        animationPanel.setBackground(Color.BLUE);

        animateLabel = new JLabel("Animate Me", SwingConstants.CENTER);
        animateLabel.setFont(new Font("Arial", Font.BOLD, 15)); 
        animateLabel.setForeground(Color.WHITE);

        int initialX = (animationPanel.getWidth() - 100) / 2;
        animateLabel.setBounds(initialX, (animationPanel.getHeight() - 30) / 2, 100, 30); 

        animationPanel.add(animateLabel);

        frame.add(animationPanel, BorderLayout.NORTH);

        addButton.addActionListener(e -> tableModel.addRow(new Object[]{tableModel.getRowCount() + 1, "User", 20}));

        deleteButton.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                tableModel.removeRow(selectedRow);
            }
        });

        animateButton.addActionListener(e -> {
            if (animateButton.getText().equals("Start Animation")) {
                startAnimation();
                animateButton.setText("Reset Animation");
            } else {
                resetAnimation();
                animateButton.setText("Start Animation");
            }
        });

        frame.setVisible(true);
    }

    private void startAnimation() {
        animationTimer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (labelX < animationPanel.getWidth() - animateLabel.getWidth()) {
                    labelX += 2;
                    animateLabel.setBounds(labelX, (animationPanel.getHeight() - 30) / 2, 100, 30); 
                } else {
                    animationTimer.stop(); 
                }
            }
        });
        animationTimer.start();
    }

    private void resetAnimation() {
        labelX = (animationPanel.getWidth() - 100) / 2; 
        animateLabel.setBounds(labelX, (animationPanel.getHeight() - 30) / 2, 100, 30); 
        if (animationTimer != null) {
            animationTimer.stop();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingJTableAnimation::new);
    }
}
