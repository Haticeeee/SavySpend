package com.savyspend.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SavySpendApp extends JFrame {

    private JLabel balanceLabel;
    private JLabel categoryLabel;
    private JLabel limitLabel;

    public SavySpendApp() {
        setTitle("SavySpend App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Create the login panel
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(4, 2, 10, 10));
        loginPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel idNumberLabel = new JLabel("ID Number:");
        JTextField idNumberField = new JTextField();
        JLabel cardDigitsLabel = new JLabel("Last 4 Digits of Bank Card:");
        JTextField cardDigitsField = new JTextField();
        JLabel securityCodeLabel = new JLabel("Security Code:");
        JTextField securityCodeField = new JTextField();
        JButton loginButton = new JButton("Login");

        loginPanel.add(idNumberLabel);
        loginPanel.add(idNumberField);
        loginPanel.add(cardDigitsLabel);
        loginPanel.add(cardDigitsField);
        loginPanel.add(securityCodeLabel);
        loginPanel.add(securityCodeField);
        loginPanel.add(new JLabel());
        loginPanel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idNumber = idNumberField.getText();
                String cardDigits = cardDigitsField.getText();
                String securityCode = securityCodeField.getText();

                // Perform validation or verification logic here

                // If validation is successful, proceed to the main screen
                openMainScreen();
            }
        });

        getContentPane().add(loginPanel);
        setVisible(true);
    }

    private void openMainScreen() {
        getContentPane().removeAll();
        repaint();

        // Create the main panel for the main screen
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create and add components for balance, category, and limit information
        balanceLabel = new JLabel("Balance: $1000.00");
        categoryLabel = new JLabel("Category: Groceries");
        limitLabel = new JLabel("Limit: $200.00");

        mainPanel.add(balanceLabel, BorderLayout.NORTH);
        mainPanel.add(categoryLabel, BorderLayout.CENTER);
        mainPanel.add(limitLabel, BorderLayout.SOUTH);

        // Create and add button to customize the screen
        JButton customizeButton = new JButton("Customize");
        customizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCustomizeScreen();
            }
        });

        mainPanel.add(customizeButton, BorderLayout.EAST);

        getContentPane().add(mainPanel);
        revalidate();
    }

    private void openCustomizeScreen() {
        getContentPane().removeAll();
        repaint();

        // Create the customize panel for the customize screen
        JPanel customizePanel = new JPanel();
        customizePanel.setLayout(new BorderLayout());
        customizePanel.setBackground(Color.WHITE);
        customizePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create and add components for customization options
        JLabel customizeLabel = new JLabel("Customize the Screen");
        JButton backButton = new JButton("Back");

        customizePanel.add(customizeLabel, BorderLayout.NORTH);
        customizePanel.add(backButton, BorderLayout.SOUTH);

        // Add action listener to go back to the main screen
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openMainScreen();
            }
        });

        getContentPane().add(customizePanel);
        revalidate();
    }

    public static void main(String[] args) {
        new SavySpendApp();
    }
}

