import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompoundInterestCalculator extends JFrame {
    // Components for the GUI
    private JTextField principalAmountField, interestRateField, timeField, totalAmountField, interestAmountField;
    private JButton calculateButton, clearButton, closeButton;

    public CompoundInterestCalculator() {
        // Set up the frame
        setTitle("Compound Interest Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1));

        // Panel for principal amount
        JPanel principalPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        principalPanel.add(new JLabel("Principal Amount:"));
        principalAmountField = new JTextField(15);
        principalPanel.add(principalAmountField);

        // Panel for interest rate and time
        JPanel rateTimePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rateTimePanel.add(new JLabel("Interest Rate (%):"));
        interestRateField = new JTextField(5);
        rateTimePanel.add(interestRateField);
        rateTimePanel.add(new JLabel("Time (Yrs):"));
        timeField = new JTextField(5);
        rateTimePanel.add(timeField);

        // Panel for total amount
        JPanel totalPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        totalPanel.add(new JLabel("Total Amount:"));
        totalAmountField = new JTextField(15);
        totalAmountField.setEditable(false); // Make this field non-editable
        totalPanel.add(totalAmountField);

        // Panel for interest amount
        JPanel interestPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        interestPanel.add(new JLabel("Interest Amount:"));
        interestAmountField = new JTextField(15);
        interestAmountField.setEditable(false); // Make this field non-editable
        interestPanel.add(interestAmountField);

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        calculateButton = new JButton("Calculate");
        clearButton = new JButton("Clear");
        closeButton = new JButton("Close");
        buttonPanel.add(calculateButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(closeButton);

        // Add panels to the frame
        add(principalPanel);
        add(rateTimePanel);
        add(totalPanel);
        add(interestPanel);
        add(buttonPanel);

        // Action listeners for buttons
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateInterest();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    // Method to calculate the compound interest
    private void calculateInterest() {
        try {
            double principal = Double.parseDouble(principalAmountField.getText());
            double rate = Double.parseDouble(interestRateField.getText()) / 100;
            double time = Double.parseDouble(timeField.getText());

            // Compound Interest formula: A = P(1 + r)^t
            double totalAmount = principal * Math.pow((1 + rate), time);
            double interestAmount = totalAmount - principal;

            // Set the calculated values to the text fields
            totalAmountField.setText(String.format("%.2f", totalAmount));
            interestAmountField.setText(String.format("%.2f", interestAmount));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to clear all input fields
    private void clearFields() {
        principalAmountField.setText("");
        interestRateField.setText("");
        timeField.setText("");
        totalAmountField.setText("");
        interestAmountField.setText("");
    }

    public static void main(String[] args) {
        // Create the GUI and make it visible
        SwingUtilities.invokeLater(() -> {
            new CompoundInterestCalculator().setVisible(true);
        });
    }
}

