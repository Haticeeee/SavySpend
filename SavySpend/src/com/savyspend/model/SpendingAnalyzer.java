package com.savyspend.model;

public class SpendingAnalyzer {
    public double calculateTotalExpenses(User user) {
        return user.getExpenses();
    }

    public double calculateSavingsPotential(User user) {
        return user.getIncome() - user.getExpenses();
    }

    public double identifyUnnecessaryExpenses(User user) {
        double totalExpenses = user.getExpenses();
        double necessaryExpenses = calculateNecessaryExpenses(user);

        return totalExpenses - necessaryExpenses;
    }

    private double calculateNecessaryExpenses(User user) {
        // Your logic to calculate necessary expenses goes here
        // This could involve considering fixed expenses, essential living costs, etc.
        // For simplicity, let's assume 70% of the income is necessary expenses
        return user.getIncome() * 0.7;
    }
}
