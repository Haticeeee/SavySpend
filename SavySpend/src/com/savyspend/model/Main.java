package com.savyspend.model;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create a JFrame (window) object
            JFrame frame = new JFrame("SavySpend");

            // Set the size of the window
            frame.setSize(400, 300);

            // Set the default operation when the window is closed
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a JLabel (text label) to display a message
            JLabel label = new JLabel("Welcome to SavySpend!");

            // Add the label to the content pane of the window
            frame.getContentPane().add(label);

            // Make the window visible
            frame.setVisible(true);
        });
    }
}
